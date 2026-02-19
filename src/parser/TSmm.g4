grammar TSmm;	

program: expression EOF
       ;

expression : '(' expression ')'
        | expression '.' ID
        | expression '[' expression ']'
        | '(' expression 'as' simple_type ')'
        | '-' expression
        | '!' expression
        | expression ('*' | '%' | '/') expression
        | expression ('+' | '-') expression
        | expression ('>' | '>=' | '<' | '<=' | '!=' | '==') expression
        | expression ('&&' | '||') expression
        | ID
        | CHAR_CONSTANT
        | INT_CONSTANT
        | REAL_CONSTANT
        ;

definition: varDefinition
           | funcDefinition
           ;

varDefinition: 'let' ID (',' ID)* ':' type
              ;

funcDefinition: 'function' ID '(' parameters ')' ':' (simple_type || 'void')
              ;

parameters: (ID ':' simple_type) (',' ID ':' simple_type)*
            |
            ;
statement: 'log' (',' expression)* ';'
         | 'input' (',' expression) * ';'
         | expression '=' expression
         |
        ;

simple_type: 'char'
    | 'int'
    | 'number'
    ;

type: simple_type
    |
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