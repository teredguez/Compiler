grammar TSmm;	

program: (REAL_CONSTANT | INT_CONSTANT)+
       ;

WHITES : [ \n\t\r]+ ->skip
       ;
INT_CONSTANT: [1-9][0-9]*
            | '0'
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