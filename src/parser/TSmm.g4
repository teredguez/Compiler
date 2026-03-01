grammar TSmm;	
@header{
import ast.definitions.*;
import ast.expressions.*;
import ast.locatables.*;
import ast.statements.*;
import ast.types.*;
import ast.*;
}

program returns [Program ast] locals [Program p = new Program()]:
    (definition { $p.addDefinitions($definition.ast); })*

    mainDefinition{$p.addDefinition($mainDefinition.ast);}

    EOF { $ast = $p; }
    ;

//Syntax analysis
definition returns [List<Definition> ast = new ArrayList<Definition>()]:
     varDefinition { $ast.addAll($varDefinition.ast); }
   | funcDefinition { $ast.add($funcDefinition.ast); }
    ;

varDefinition returns [List<Definition> ast = new ArrayList<Definition>()]:
'let' ID variables ':' t=type ';'{
        $ast.add(new VarDefinition($ID.getLine(),$ID.getCharPositionInLine()+1,$t.ast, $ID.text));
         for(Token id : $variables.ast) {
               $ast.add(new VarDefinition(
                           id.getLine(),
                           id.getCharPositionInLine()+1,
                           $t.ast,
                           id.getText() ));}}
         ;

variables returns[List<Token> ast = new ArrayList<>()] : (',' ID { $ast.add($ID); })*
        ;

funcDefinition returns[Definition ast] locals [Type returnType,
                                               List<Definition> vars = new ArrayList<>(),
                                               List<Statement> stmts = new ArrayList<>(),
                                               List<Definition> params = new ArrayList<>()]:

 'function' ID '(' (parameters {$params.addAll($parameters.ast);})? ')' ':'
                   (t=simple_type{$returnType=$t.ast;}|'void'{$returnType= VoidType.getInstance();}) '{'
                   (varDefinition{$vars.addAll($varDefinition.ast);})*
                   (statement{$stmts.addAll($statement.ast);})* '}' {
                        $ast = new FuncDefinition(
                            $ID.getLine(),
                            $ID.getCharPositionInLine()+1,
                            new FunctionType(
                                $returnType,
                                $params
                            ),
                            $ID.text,
                            $vars,
                            $stmts
                        );
                    }
              ;

parameters returns [List<Definition> ast = new ArrayList<>()]:
            ID ':' simple_type
            {$ast.add(new VarDefinition(
                 $ID.getLine(),
                 $ID.getCharPositionInLine()+1,
                 $simple_type.ast,
                 $ID.text
                 ));
            } (',' ID ':' simple_type
            {$ast.add(new VarDefinition(
                  $ID.getLine(),
                  $ID.getCharPositionInLine()+1,
                  $simple_type.ast,
                  $ID.text
                  ));
            })*
            ;

functionInvocation returns [Expression ast]:
            ID '(' arguments ')' {
            $ast = new FunctionInvocation(
                $ID.getLine(),
                $ID.getCharPositionInLine()+1,
                new Variable(
                    $ID.getLine(),
                    $ID.getCharPositionInLine()+1,
                    $ID.text),
                $arguments.ast);
            }
            ;

statementFunctionInvocation returns [Statement ast]:
            ID '(' arguments ')' {
                $ast = new FunctionInvocation(
                    $ID.getLine(),
                    $ID.getCharPositionInLine()+1,
                    new Variable(
                        $ID.getLine(),
                        $ID.getCharPositionInLine()+1,
                        $ID.text),
                    $arguments.ast
                );
            }
            ;

arguments returns[List<Expression>ast = new ArrayList<>()]:
           (e1=expression {$ast.add($e1.ast);}
           (',' e2=expression{$ast.add($e2.ast);})*)?
          ;

statement returns [List<Statement> ast = new ArrayList<>()]:
          'log' arguments ';'{
            for(Expression e : $arguments.ast){ $ast.add( new LogStatement(
                        e.getLine(),
                        e.getColumn(),
                        e));
            }
          }
         | 'input' arguments ';'{
           for(Expression e : $arguments.ast){ $ast.add( new InputStatement(
                      e.getLine(),
                      e.getColumn(),
                      e));
           }
         }
         | e1=expression '=' e2=expression ';'{
            $ast.add(new Assignment(
                        $e1.ast.getLine(),
                        $e1.ast.getColumn(),
                        $e1.ast,
                        $e2.ast));
         }
         | 'while' '(' expression ')' block{
            $ast.add(new WhileStatement(
                    $expression.ast.getLine(),
                    $expression.ast.getColumn(),
                    $expression.ast,
                    $block.ast));
         }
         | 'if' '(' expression ')' b1=block {
                       $ast.add( new IfElseStatement(
                               $expression.ast.getLine(),
                               $expression.ast.getColumn(),
                               $expression.ast,
                               $b1.ast));
                    }
         | 'if' '(' expression ')' b1=block ('else' b2=block)?{
            $ast.add( new IfElseStatement(
                    $expression.ast.getLine(),
                    $expression.ast.getColumn(),
                    $expression.ast,
                    $b1.ast,
                    $b2.ast));
         }
         | 'return' expression ';'{
            $ast.add( new ReturnStatement(
                    $expression.ast.getLine(),
                    $expression.ast.getLine(),
                    $expression.ast));
         }
         | statementFunctionInvocation ';'{
            $ast.add($statementFunctionInvocation.ast);
         }
        ;

block returns[List<Statement>ast = new ArrayList<>()]:
        statement {$ast.addAll($statement.ast);}
       | '{' (statement {$ast.addAll($statement.ast); })* '}'
       ;

expression returns [Expression ast]:
         '(' expression ')'  { $ast = $expression.ast;}
         | e1=expression '[' e2=expression ']' {
                      $ast = new ArrayAccess(
                          $e1.ast.getLine(),
                          $e1.ast.getColumn(),
                          $e1.ast,
                          $e2.ast
                          );
         }
        | e=expression '.' ID {
                    $ast = new FieldAccess(
                      $e.ast.getLine(),
                      $e.ast.getColumn(),
                      $e.ast,
                      $ID.text
                    );
                }
        | '(' expression 'as' simple_type ')'{
                     $ast = new Cast(
                         $expression.ast.getLine(),
                         $expression.ast.getColumn(),
                         $expression.ast,
                         $simple_type.ast
                     );
        }
        | '-' expression {
                        $ast = new UnaryMinus(
                            $expression.ast.getLine(),
                            $expression.ast.getColumn(),
                            $expression.ast
                        );
        }
        | '!' expression {
                        $ast = new UnaryNot(
                            $expression.ast.getLine(),
                            $expression.ast.getColumn(),
                            $expression.ast
                        );
        }
        | e1=expression OP=('*' | '%' | '/') e2=expression {
                                $ast = new ArithmeticOperation(
                                    $e1.ast.getLine(),
                                    $e1.ast.getColumn(),
                                    $e1.ast,
                                    $e2.ast,
                                    $OP.text
                                );
        }
        | e1=expression OP=('+' | '-') e2=expression{
                                $ast = new ArithmeticOperation(
                                    $e1.ast.getLine(),
                                    $e1.ast.getColumn(),
                                    $e1.ast,
                                    $e2.ast,
                                    $OP.text
                                );
        }
        | e1=expression OP=('>' | '>=' | '<' | '<=' | '!=' | '==') e2=expression{
                                $ast = new CompareOperation(
                                    $e1.ast.getLine(),
                                    $e1.ast.getColumn(),
                                    $e1.ast,
                                    $e2.ast,
                                    $OP.text
                                );
        }
        | e1=expression OP=('&&' | '||') e2=expression {
                                $ast = new LogicOperation(
                                    $e1.ast.getLine(),
                                    $e1.ast.getColumn(),
                                    $e1.ast,
                                    $e2.ast,
                                    $OP.text
                                );
        }
        | functionInvocation  { $ast = $functionInvocation.ast; }
        |ID {
                $ast = new Variable(
                  $ID.getLine(),
                  $ID.getCharPositionInLine()+1,
                  $ID.text
                );}
        | INT_CONSTANT {
                $ast = new IntLiteral(
                  $INT_CONSTANT.getLine(),
                  $INT_CONSTANT.getCharPositionInLine()+1,
                  LexerHelper.lexemeToInt($INT_CONSTANT.text)
                );}
        | CHAR_CONSTANT {
                $ast = new CharLiteral(
                  $CHAR_CONSTANT.getLine(),
                  $CHAR_CONSTANT.getCharPositionInLine()+1,
                  LexerHelper.lexemeToChar($CHAR_CONSTANT.text)
                );}
        | REAL_CONSTANT {
                $ast = new NumberLiteral(
                  $REAL_CONSTANT.getLine(),
                  $REAL_CONSTANT.getCharPositionInLine()+1,
                  LexerHelper.lexemeToReal($REAL_CONSTANT.text)
                );}
        ;
simple_type returns [Type ast]:
    'char' { $ast = CharType.getInstance(); }
    | 'int' { $ast = IntType.getInstance(); }
    | 'number' { $ast = NumberType.getInstance(); }
    ;

type returns [Type ast] locals [List<RecordField> recordsList = new ArrayList<>()]:
    simple_type {$ast = $simple_type.ast;}
    | '[' INT_CONSTANT ']' type {
            $ast = new ArrayType(LexerHelper.lexemeToInt($INT_CONSTANT.text),$type.ast);}
    |  '[' ('let' ID variables ':' type ';' { $recordsList.add( new RecordField( $ID.getLine(),
           $ID.getCharPositionInLine()+1,$ID.text,$type.ast));
           for(Token id : $variables.ast) {
              $recordsList.add(
                  new RecordField(
                      id.getLine(),
                      id.getCharPositionInLine()+1,
                      id.getText(),
                      $type.ast
                  )
              );}
           } )+ ']' {$ast = new RecordType($recordsList);}
    ;

mainDefinition returns[Definition ast]locals [Type returnType, List<Definition> vars = new ArrayList<>(),
                                              List<Definition> params = new ArrayList<>(),
                                              List<Statement> stmts = new ArrayList<>()]:
  'function' id='main' '('  ')' ':' 'void'{$returnType= VoidType.getInstance();} '{'
  (varDefinition{$vars.addAll($varDefinition.ast);})* (statement{$stmts.addAll($statement.ast);})* '}' {
         $ast = new FuncDefinition($id.getLine(),$id.getCharPositionInLine()+1,
             new FunctionType(
                 $returnType,
                 $params),
             $id.text,$vars,$stmts
         );}
    ;

//Lexical analysis
WHITES : [ \n\t\r]+ ->skip
       ;

COMMENT: ('/*' .*? '*/'
       | '//' ~ [\r\n]*) -> skip
       ;

INT_CONSTANT: [1-9][0-9]*
            | '0'
            ;


CHAR_CONSTANT: '\'' . '\''
               | '\'' '\\'[nt]'\''
               | '\'' '\\' [0-9]* '\''
               ;


REAL_CONSTANT: MANTISSA
               | MANTISSA EXPONENT INT_CONSTANT
               ;
fragment
MANTISSA: INT_CONSTANT
        | INT_CONSTANT '.' INT_CONSTANT*
        | INT_CONSTANT* '.' INT_CONSTANT
        ;

fragment
EXPONENT: [Ee] ('+' | '-')?
        ;

ID: [a-zA-Z_][a-zA-Z_0-9]*
    ;

