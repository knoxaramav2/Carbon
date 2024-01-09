grammar Carbon;
import Lexer;

options{
	language = Cpp;
}

carbon              : (
                    (preproc | statement)
) + EOF;

symbol_id		: IDENTIFIER (G_DOT IDENTIFIER)*?;
preproc         : (pp_import | pp_define) + SEMI;
pp_import       : PP_IMPORT symbol_id (COMMA symbol_id)*?;
pp_define       : PP_DEFINE IDENTIFIER PRIMITIVE;

statement            : (
    expr + SEMI?         |
    classExpr | interfaceExpr
);

expr                :(

    bodyExpr                |
    groupExpr               |
    indexExpr               |

    fncDeclExpr             |
    varDeclExpr             |

    procCallExpr            |

    ctrlCndExpr             |
    ctrlForExpr             |
    ctrlWhileExpr           |

    setExpr                 |
    mathUnExpr              |
    mathBinExpr             |

    compValExpr             |

    logicBinExpr            |
    logicUnExpr             |

    ctrlKwExpr              |
    gotoExpr                |

    valueExpr
);


classExpr           : CLASS IDENTIFIER inheritListExpr? bodyExpr;
interfaceExpr       : INTERFACE IDENTIFIER bodyExpr;
inheritListExpr     : (L_PARANTH symbol_id (COMMA symbol_id)*? R_PARANTH);

procCallExpr        : symbol_id groupExpr;
bodyExpr            : L_BRACE (statement)*? R_BRACE;
groupExpr           : (L_PARANTH (expr|) R_PARANTH);
fncGroupExpr        : L_PARANTH (varDeclExpr (COMMA varDeclExpr)*?)? R_PARANTH;
forGroupExpr        : L_PARANTH varDeclExpr? SEMI expr? SEMI expr? R_PARANTH;
whileGroupExpr      : L_PARANTH expr R_PARANTH;
indexExpr           : L_BRACKET expr R_BRACKET;

gotoExpr            : C_GOTO IDENTIFIER;

varDeclExpr         : PROTECT? IDENTIFIER IDENTIFIER propDefExpr? (SET expr)?;
propDefExpr         : L_BRACE (propSetExpr|propGetExpr)*? R_BRACE ;
propGetExpr         : PROP_GET L_BRACE (expr SEMI)*? RETURN expr? SEMI R_BRACE;
propSetExpr         : PROP_SET L_BRACE REF_VAL SET (expr) SEMI R_BRACE;
fncDeclExpr         : PROTECT? IDENTIFIER IDENTIFIER fncGroupExpr bodyExpr;

ctrlCndExpr         : CTRL_CND (groupExpr|expr) (bodyExpr|expr);
ctrlWhileExpr       : C_WHILE whileGroupExpr (bodyExpr|expr);
ctrlForExpr         : C_FOR forGroupExpr (bodyExpr|expr);

setExpr             : symbol_id SET expr;
mathUnExpr          : mathUnLeftExpr | mathUnRightExpr;
mathBinExpr         : valueExpr (BIN_MATH|AMB_MATH) valueExpr;

compValExpr         : valueExpr CMP valueExpr;

logicBinExpr        : valueExpr BIN_LG_OP valueExpr;
logicUnExpr         : UNARY_LG_OP valueExpr;

valueExpr           : (AMB_MATH)?(symbol_id|boolValsExpr|PRIMITIVE|REF_VAL|groupExpr);
mathUnLeftExpr      : (UNARY_MATH symbol_id);
mathUnRightExpr     : (symbol_id UNARY_MATH);

boolValsExpr        : BOOL_VAL;
ctrlKwExpr          : CTRL_KW;
