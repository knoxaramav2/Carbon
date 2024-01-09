lexer grammar Lexer;

/**** Lexer rules ***/

/**** Pre processor */
//PREPROC: PP_IMPORT | PP_DEFINE;
PP_IMPORT       : 'import';
PP_DEFINE       : 'define';

/**** Data structures */
CLASS			: 'class';
INTERFACE       : 'interface';

/**** Protection levels */
PROTECT         :
    PUBLIC      |
    PRIVATE     |
    INTERNAL    ;
PUBLIC          : 'public';     //Available to all expose
PRIVATE         : 'private';    //available only to owning structure
INTERNAL        : 'internal';   //Availble to assembly members

/**** General     ***/
G_ASSEMBLY		: '__asm__';
G_DOT			: '.';
G_ENTRY         : 'entry';
G_ELLIPSE       : '...';

/*** Decl Mod ***/
PROP_GET        : 'get';
PROP_SET        : 'set';

/*** Comparison  ***/
CMP    :
    CM_GTR      |
    CM_LSS      |
    CM_GTR_EQU  |
    CM_LSS_EQU  |
    CM_EQU
    ;
CM_GTR          : '>';
CM_LSS          : '<';
CM_EQU          : '==';
CM_GTR_EQU      : '>=';
CM_LSS_EQU      : '<=';

/**** Arithmetic  ***/
UNARY_MATH: A_INCREMENT | A_DECRIMENT;
SET:
    A_SET       |
    A_SET_SUM   |
    A_SET_DIFF  |
    A_SET_MULT  |
    A_SET_QUOTIENT
;
AMB_MATH : A_SUB;
BIN_MATH:
    A_ADD       |
    AMB_MATH    |
    A_DIV       |
    A_MULT      |
    A_MOD       |
    A_EXP
;

A_SET           : '=';
A_ADD           : '+';
A_SUB           : '-';
A_MULT          : '*';
A_DIV           : '/';
A_EXP           : '**';
A_MOD           : '%' ;
A_SET_SUM       : '+=';
A_SET_DIFF      : '-=';
A_SET_MULT      : '*=';
A_SET_QUOTIENT  : '/=';
A_INCREMENT     : '++';
A_DECRIMENT     : '--';

/**** Logical Ops ***/
UNARY_LG_OP: L_NOT;
BIN_LG_OP:
    L_AND       |
    L_OR        |
    L_NAND      |
    L_NOR       |
    L_XOR       |
    L_XNOR
;
L_OR			: '||';
L_AND			: '&&';
L_NAND			: '!&';
L_NOR			: '!|';
L_XOR			: '^|';
L_XNOR			: '^!|';
L_NOT			: '!';

/**** Bitwise Ops ***/
UNARY_BW_OP: BL_INV;
BIN_BW_OP:
    BL_AND      |
    BL_OR       |
    BL_LEFT     |
    BL_RIGHT
    ;
BL_AND			: '&';
BL_OR			: '|';
BL_INV			: '~';
BL_LEFT			: '<<';
BL_RIGHT		: '>>';

/**** Control     ****/
CTRL_CND        :
    C_IF        |
    C_ELSE
    ;
CTRL_KW         :
    C_BREAK     |
    C_CONT;

C_IF			: 'if';
C_ELSE			: 'else';
C_WHILE			: 'while';
C_FOR			: 'for';
C_GOTO			: 'goto';
C_BREAK			: 'break';
C_CONT			: 'continue';
C_IN            : 'in';

/**** Enclosures  ****/
L_BRACKET       : '[';
R_BRACKET       : ']';
L_PARANTH       : '(';
R_PARANTH       : ')';
L_BRACE         : '{';
R_BRACE         : '}';

/**** Whitespace  ****/

LINE_COMMENT    : '#' ~[\r\n]* ->channel(HIDDEN);
BLOCK_COMMENT   : '#*' .*? '*#'->channel(HIDDEN);

fragment ESCAPE     : '\\' ('o'|'b'|'x');
fragment ALPHANUM   : ALPHA|NUMBER;
fragment ALPHA      : [a-zA-Z_];

//reserved value keywords
BOOL_VAL        : TRUE|FALSE;
REF_VAL         : THIS|VALUE;

VALUE           : 'value';
THIS            : 'this';
TRUE            : 'true';
FALSE           : 'false';

//reserved method keywords
RETURN          : 'return';

//general identifiers
PRIMITIVE       : NUMBER | CHAR | STRING | BOOL_VAL;
NUMBER          : DECIMAL | INTEGER;
STRING          : '"'(ESCAPE|~('\\'|'"'))*'"';
CHAR            : '\''(ESCAPE|~('\\'|'\''))'\'';
COMMA			: ',';
INTEGER			: [0-9]+;
DECIMAL         : [0-9]+('.'[0-9])?;
IDENTIFIER      : ALPHA+ (DECIMAL+)?;//[a-zA-Z_]([a-zA-Z_0-9])+;
SEMI            : ';';
WS              : [ \r\t\u000C\n]+ -> skip ;