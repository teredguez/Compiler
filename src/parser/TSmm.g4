grammar TSmm;	

program: (REAL_CONSTANT | INT_CONSTANT | CHAR_CONSTANT | ID )+
       ;

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