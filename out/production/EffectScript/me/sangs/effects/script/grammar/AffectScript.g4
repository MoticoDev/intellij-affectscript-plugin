/**
 *  A teapot language for use with this teapot language support.
 *  Project. Teapot (Language)
 *  Author - MR.LEE(leeshoon1344@gmail.com)
 *  Description - Affect Script Grammar
 */

grammar AffectScript;

affectscript
    :   (usescript | annotation | create | set | setprop | add | setvalues | open | msgbox | move | applyeffect | importfile | function | new_b)+ EOF
    ;

usescript
    :   'use' 'script' ID                                   # ImportScript
    ;

annotation
    :   ANNO '('annotation_args')'                          # Annotations
    ;

create
    :   ID '=' 'create' createkeywords                      # CreateLayer
    ;

set
    :   'set' ID setexpr 'to' ID                            # SetProperty
    ;

setprop
    :   'set' 'parameters' STRING 'to' ID
            '{' allstatement '}'                            # SetParameters
    ;

add
    :   'add' ID 'to' ID                                    # AddLayerToLayer
    ;

setvalues
    :   'setValues' ID setvalblock                          # SetValue
    ;

open
    :   'open' ID                                           # OpenLayer
    ;

msgbox
    :   'show' 'messagebox' STRING                          # ShowMessageBox
    |   'show' 'messagebox' STRING
            'select' msgblock                               # ShowMessageBoxYesOrNo
    ;

move
    :   'move' ID 'to' ID                                   # MoveReference
    ;

new_b
    :   ID '=' NEW_                                         # NewReference
    ;

applyeffect
    :   'apply' 'effect' STRING 'to' ID                     # ApplyEffect
    ;

returnfunction
    :   'question' ID block                                 # NormalFunction
    |   'question' ID 'params' param_args block             # ParameterizedFunction
    ;

function
	:	'func' ID '(' formal_args? ')' (':' type)? block
	;

formal_args : formal_arg (',' formal_arg)* ;
param_args : param_arg (',' param_arg)* ;

annotation_args : annotation_arg (',' annotation_arg)* | STRING ;

formal_arg : ID ':' type ;
param_arg : ID ;
annotation_arg : ID'='expr ;

createkeywords
    :   'composition'
    |   'shape'
    |   'rectangle'
    |   'oval'
    |   'text'
    |   'solid'
    |   'folder'
    ;

type:	'int'                                               # IntTypeSpec
	|	'float'                                             # FloatTypeSpec
	|	'string'                                            # StringTypeSpec
	|	'boolean'											# BooleanTypeSpec
	|	'[' ']'                                             # VectorTypeSpec
	;

block
	:  '{' (statement|vardef)* '}';

moduleblock
    :  '{' (modulestatement|vardef)* '}';

setvalblock
    :  '{' setvalstatement '}' ;

msgblock
    :  '{' 'yes' ':' '{' allstatement '}' ',' 'no' ':' '{' allstatement '}' '}'
    ;

importfile
    :   ID '=' 'import' 'file'
    ;

allstatement
    :   annotation
    |   create
    |   set
    |   add
    |   setvalues
    |   open
    |   move
    |   msgbox
    |   importfile
    |   setvalstatement
    ;

statement
	:	'if' '(' expr ')' statement ('else' statement)?		# If
	|	'while' '(' expr ')' statement						# While
	|	ID '=' expr											# SimpleAssign
	|   type ID '=' expr                                    # TypeAssign
	|   ID ID '=' expr                                      # TypeAssign
	|   ID ID '=' 'new' expr                                # TypeAssignFornewInstance
	|	ID '[' expr ']' '=' expr							# ElementAssign
	|   ID '=' expr multivariable                           # ElementAssignForParams
	|	call_expr											# CallStatement
	|	'>>>' '(' expr? ')'								    # Print
	|	'answer' expr										# Return
	|   'answer' ID multivariable                           # ReturnInStatement
	|	block				 								# BlockStatement
	;

setvalstatement
    :   setvalexpr (',' setvalexpr)*
    ;

setvalexpr
    :   ID ':' setexpr                                      # SetValueStatementByID
    |   STRING ':' setexpr                                  # SetValueStatementByKey
    ;

multivariable
    :   ('->' expr)*
    ;

modulestatement
    :   statement
    |   returnfunction
    ;

//vardef : 'var' ID '=' expr ;
vardef : ID '=' expr ;

expr
	:	expr operator expr									# Op
	|	'-' expr											# Negate
	|	'!' expr											# Not
	|	call_expr											# Call
	|	ID '[' expr ']'										# Index
	|	'(' expr ')'										# Parens
	|	primary												# Atom
	;

setexpr
    :   INT                                                 # SetParameterINT
    |   '['INT','INT','INT']'                               # SetParameterMultipleNum
    |   '['INT','INT']'                                     # SetParameterMultipleNum
    |   'rgb''['INT','INT','INT']'                          # SetParameterRGB
    |   STRING                                              # SetParameterString
    |   ID('.'setexpr)*                                     # SetParameterInValue
    ;

operator  : MUL|DIV|ADD|SUB|GT|GE|LT|LE|EQUAL_EQUAL|NOT_EQUAL|OR|AND|DOT ; // no implicit precedence

call_expr
	: ID '(' expr_list? ')' ;

expr_list : expr (',' expr)* ;

primary
	:	ID													# ReferenceDefinition
	|	INT													# Integer
	|	FLOAT												# Float
	|	STRING												# String
	|	'[' expr_list ']'									# Vector
	|	'true'												# TrueLiteral
	|	'false'												# FalseLiteral
	;

USE_K : 'use';
SCRIPT_k : 'script';
CREATE_K : 'create';
COMPOSITION_K: 'composition';
SHAPE_K: 'shape';
SET_K : 'set';
TO_K : 'to';
ADD_K : 'add';
TEXT_K : 'text';
OPEN_K : 'open';
SHOW_K : 'show';
MSGBOX_K : 'messagebox';
IMPORT_K : 'import';
FILE_K : 'file';
SELECT: 'select';
SOLID_K : 'solid';
APPLY_K : 'apply';
EFFECT_K : 'effect';
PARAMS_K : 'parameters';
NEW_K : 'new';
FOLDER_K : 'folder';
ANNOTATION_MARK : '@';
MOVE_K : 'move';

NEW_ : 'new' ' ' ID;

RECTANGLE_K : 'rectangle';

SETVALUES_FUNC : 'setValues';

LPAREN : '(' ;
RPAREN : ')' ;
COLON : ':' ;
COMMA : ',' ;
LBRACK : '[' ;
RBRACK : ']' ;
LBRACE : '{' ;
RBRACE : '}' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
VAR : 'var' ;
EQUAL : '=' ;
RETURN : 'return' ;
PRINT : 'print' ;
FUNC : 'func' ;

TYPEINT : 'int' ;
TYPEFLOAT : 'float' ;
TYPESTRING : 'string' ;
TYPEBOOLEAN : 'boolean' ;

TRUE : 'true' ;
FALSE : 'false' ;
SUB : '-' ;
BANG : '!' ;
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
LT : '<' ;
LE : '<=' ;
EQUAL_EQUAL : '==' ;
NOT_EQUAL : '!=' ;
GT : '>' ;
GE : '>=' ;
OR : '||' ;
AND : '&&' ;
DOT : ' . ' ;

LINE_COMMENT : '//' .*? ('\n'|EOF)	-> channel(HIDDEN) ;
COMMENT      : '/*' .*? '*/'    	-> channel(HIDDEN) ;

ID  : [a-zA-Z_] [a-zA-Z0-9_]* ;
ANNO : '@' ID;

INT : [0-9]+ ;
FLOAT
	:   '-'? INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
	|   '-'? INT EXP            // 1e10 -3e4
	;

fragment EXP :   [Ee] [+\-]? INT ;

STRING :  '"' (ESC | ~["\\])* '"' ;
fragment ESC :   '\\' ["\bfnrt] ;

WS : [ \t\n\r]+ -> channel(HIDDEN) ;

/** "catch all" rule for any char not matche in a token rule of your
 *  grammar. Lexers in Intellij must return all tokens good and bad.
 *  There must be a token to cover all characters, which makes sense, for
 *  an IDE. The parser however should not see these bad tokens because
 *  it just confuses the issue. Hence, the hidden channel.
 */
ERRCHAR
	:	.	-> channel(HIDDEN)
	;
