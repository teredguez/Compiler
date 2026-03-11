grammar TSmm;	
@header{
import ast.definitions.*;
import ast.expressions.*;
import ast.locatables.*;
import ast.statements.*;
import ast.types.*;
import ast.*;
}

program returns [Program ast = new Program()]:
    (definition { $ast.addDefinitions($definition.ast); })*

    mainDefinition{$ast.addDefinition($mainDefinition.ast);}

    EOF
    ;

//Syntax analysis
definition returns [List<Definition> ast = new ArrayList<Definition>()]:
     varDefinition { $ast.addAll($varDefinition.ast); }
   | funcDefinition { $ast.add($funcDefinition.ast); }
    ;

varDefinition returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]:
'let' ID variables ':' type ';'{
        $ast.add(new VarDefinition($ID.getLine(),$ID.getCharPositionInLine()+1,$type.ast, $ID.text));
         for(Token id : $variables.ast) {
               $ast.add(new VarDefinition(
                           id.getLine(),
                           id.getCharPositionInLine()+1,
                           $type.ast,
                           id.getText() ));}}
         ;

variables returns[List<Token> ast = new ArrayList<>()] : (',' ID { $ast.add($ID); })*
        ;

funcDefinition returns[Definition ast] locals [Type returnType,List<VarDefinition> vars = new ArrayList<>(),
                                               List<Statement> stmts = new ArrayList<>(),
                                               List<VarDefinition> params = new ArrayList<>()]:

 'function' ID '(' (parameters {$params.addAll($parameters.ast);})? ')' ':'
                   (t=simple_type{$returnType=$t.ast;}|'void'{$returnType= VoidType.getInstance();}) '{'
                   (varDefinition{$vars.addAll($varDefinition.ast);})*
                   (statement{$stmts.addAll($statement.ast);})* '}' {
                        $ast = new FuncDefinition(
                            $ID.getLine(),
                            $ID.getCharPositionInLine()+1,
                            new FunctionType($returnType,$params),
                            $ID.text,
                            $vars,
                            $stmts
                        );
                    }
              ;

parameters returns [List<VarDefinition> ast = new ArrayList<>()]:
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

expressionFunctionInvocation returns [Expression ast]:
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

statement returns [List<Statement> ast = new ArrayList<>()] locals [List<Statement> elseStmts = new ArrayList<>()]:
          'log' arguments ';'{
            for(Expression e : $arguments.ast){
                $ast.add( new LogStatement(
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
         | 'if' '(' expression ')' b1=block ('else' b2=block {$elseStmts = $b2.ast;})?
         {
            $ast.add( new IfElseStatement(
                    $expression.ast.getLine(),
                    $expression.ast.getColumn(),
                    $expression.ast,
                    $b1.ast,
                    $elseStmts));
         }
         | 'return' expression ';'{
            $ast.add( new ReturnStatement(
                    $expression.ast.getLine(),
                    $expression.ast.getLine(),
                    $expression.ast));
         }
         | statementFunctionInvocation ';'{$ast.add($statementFunctionInvocation.ast);
         }
        ;

block returns[List<Statement>ast = new ArrayList<>()]:
        statement {$ast.addAll($statement.ast);}
       | '{' (statement {$ast.addAll($statement.ast); } )*'}'
       ;

expression returns [Expression ast]:
         '(' expression ')'  { $ast = $expression.ast;}
         | e1=expression '[' e2=expression ']' {
                        $ast = new ArrayAccess(
                           $e1.ast.getLine(),
                           $e1.ast.getColumn(),
                           $e1.ast,
                           $e2.ast
                        );}
        | e=expression '.' ID {
                        $ast = new FieldAccess(
                           $e.ast.getLine(),
                           $e.ast.getColumn(),
                           $e.ast,
                           $ID.text
                        );}
        | '(' expression 'as' simple_type ')'{
                        $ast = new Cast(
                            $expression.ast.getLine(),
                            $expression.ast.getColumn(),
                            $expression.ast,
                            $simple_type.ast
                        );}
        | '-' expression {
                        $ast = new UnaryMinus(
                            $expression.ast.getLine(),
                            $expression.ast.getColumn(),
                            $expression.ast
                        );}
        | '!' expression {
                        $ast = new UnaryNot(
                            $expression.ast.getLine(),
                            $expression.ast.getColumn(),
                            $expression.ast
                        );}
        | e1=expression OP=('*' | '%' | '/') e2=expression {
                        $ast = new ArithmeticOperation(
                            $e1.ast.getLine(),
                            $e1.ast.getColumn(),
                            $e1.ast,
                            $e2.ast,
                            $OP.text
                        );}
        | e1=expression OP=('+' | '-') e2=expression{
                        $ast = new ArithmeticOperation(
                            $e1.ast.getLine(),
                            $e1.ast.getColumn(),
                            $e1.ast,
                            $e2.ast,
                            $OP.text
                        );}
        | e1=expression OP=('>' | '>=' | '<' | '<=' | '!=' | '==') e2=expression{
                        $ast = new CompareOperation(
                            $e1.ast.getLine(),
                            $e1.ast.getColumn(),
                            $e1.ast,
                            $e2.ast,
                            $OP.text
                        );}
        | e1=expression OP=('&&' | '||') e2=expression {
                        $ast = new LogicOperation(
                            $e1.ast.getLine(),
                            $e1.ast.getColumn(),
                            $e1.ast,
                            $e2.ast,
                            $OP.text
                        );}
        | expressionFunctionInvocation  { $ast = $expressionFunctionInvocation.ast; }
        | ID {$ast = new Variable($ID.getLine(),$ID.getCharPositionInLine()+1,$ID.text);}
        | INT_CONSTANT {
                $ast = new IntLiteral($INT_CONSTANT.getLine(),$INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt($INT_CONSTANT.text));}
        | CHAR_CONSTANT {
                $ast = new CharLiteral($CHAR_CONSTANT.getLine(),$CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar($CHAR_CONSTANT.text));}
        | REAL_CONSTANT {
                $ast = new NumberLiteral($REAL_CONSTANT.getLine(),$REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal($REAL_CONSTANT.text));}
        ;
simple_type returns [Type ast]:
     'char' { $ast = CharType.getInstance(); }
    | 'int' { $ast = IntType.getInstance(); }
    | 'number' { $ast = NumberType.getInstance(); }
    ;

type returns [Type ast]
locals [List<RecordField> recordsList = new ArrayList<RecordField>()]
    : simple_type{ $ast = $simple_type.ast; }
    | '[' n=INT_CONSTANT ']' t=type { $ast = new ArrayType(LexerHelper.lexemeToInt($n.getText()), $t.ast); }
    | '['
        (
          'let' ID vars=variables ':' t=type ';'
          {
              boolean duplicated = false;

              for (RecordField rf : $recordsList) {
                  if (rf.getName().equals($ID.getText())) {
                      duplicated = true;
                      ErrorHandler.getInstance().addError(
                          new ErrorType(
                              $ID.text + " is already defined in this scope",
                              new AbstractLocatable($ID.getLine(), $ID.getCharPositionInLine()+1) {}
                          )
                      );
                      break;
                  }
              }

              if (!duplicated) {
                  $recordsList.add(
                      new RecordField(
                          $ID.getLine(),
                          $ID.getCharPositionInLine()+1,
                          $ID.getText(),
                          $t.ast
                      )
                  );
              }

              for (Token id : $vars.ast) {
                  duplicated = false;

                  for (RecordField rf : $recordsList) {
                      if (rf.getName().equals(id.getText())) {
                          duplicated = true;
                         ErrorHandler.getInstance().addError(
                             new ErrorType(
                                 $ID.getText() + " is already defined in this scope",
                                 new AbstractLocatable($ID.getLine(), $ID.getCharPositionInLine()+1) {}
                             )
                         );
                          break;
                      }
                  }

                  if (!duplicated) {
                      $recordsList.add(
                          new RecordField(
                              id.getLine(),
                              id.getCharPositionInLine()+1,
                              id.getText(),
                              $t.ast
                          )
                      );
                  }
              }
          }
        )+
      ']'
      { $ast = new RecordType($recordsList); }
    ;

mainDefinition returns[Definition ast]locals [Type returnType, List<VarDefinition> vars = new ArrayList<>(),
                                              List<VarDefinition> params = new ArrayList<>(),
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

