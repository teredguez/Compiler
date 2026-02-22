grammar TSmm;	

program: definition+ EOF
       ;

//Syntax analysis
definition: varDefinition
           | funcDefinition
           ;

varDefinition: 'let' ID (',' ID)* ':' type ';'
              ;

funcDefinition: 'function' ID '(' parameters? ')' ':' (simple_type | 'void') '{' varDefinition* statement* '}'
              ;

parameters: (ID ':' simple_type) (',' ID ':' simple_type)*
           ;

functionInvocation: ID '(' arguments? ')'
                   ;

arguments : expression (',' expression)*
          ;

statement: 'log' expression (',' expression)* ';'
         | 'input' expression (',' expression) * ';'
         | expression '=' expression ';'
         | 'while' '(' expression ')' block
         | 'if' '(' expression ')' block ('else' block)?
         | 'return' expression ';'
         | functionInvocation ';'
        ;
block: statement
       | '{' statement* '}'
       ;

expression : '(' expression ')'
        | expression '[' expression ']'
        | expression '.' ID
        | '(' expression 'as' type ')'
        | '-' expression
        | '!' expression
        | expression ('*' | '%' | '/') expression
        | expression ('+' | '-') expression
        | expression ('>' | '>=' | '<' | '<=' | '!=' | '==') expression
        | expression ('&&' | '||') expression
        | functionInvocation
        | ID
        | CHAR_CONSTANT
        | INT_CONSTANT
        | REAL_CONSTANT
        ;

simple_type: 'char'
    | 'int'
    | 'number'
    ;

type: simple_type
    | '[' INT_CONSTANT ']' type
    | '[' varDefinition* ']'
    ;

//poner lo del main y al final de program antes de EOF

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