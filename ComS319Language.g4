grammar ComS319Language;

program
 : importStatment* funcDef+
 ;

code:
	statement*
	;

statement
	: assignment ';'
	| print ';'
	| funcReturn ';'
	| funcApply ';'
	| varInc ';'
	| varDec ';'
	| ifPartement
	| whileLoop
	| forLoop
	;

assignment
	:  Variable '=' arrayDec
	| Variable '=' expr
	| Variable '=' stringExpr
	| Variable '=' boolExpr
	;
	
varInc:
	Variable arrayIndex? INC
	;
	
varDec:
	Variable arrayIndex? DEC
	;

ifPartement
	: ifPart elseIfPart* elsePart? End
	;

ifPart
	: If boolExpr Do code
	;

elseIfPart
	: Else If boolExpr Do code
	;

elsePart
	: Else Do code
	;

expr
	: length #arrayLength
	| 'floor' '(' expr ')' #floorExpr
	| SUB expr #negExpr
	| expr MULT expr #multExpr
	| expr DIV expr #divExpr
	| expr MOD expr #modExpr
	| expr ADD expr #addExpr
	| expr SUB expr #subExpr
	| varInc #varIncExpr
	| varDec #varDecExpr
	| expr INC #incExpr
	| expr DEC # decExpr
	| arrayDec #arrayExpr
	| Number #numExpr
	| '('expr')' #innerExpr
	| Variable arrayIndex? #varExpr
	| funcApply #applyFunc
	;

boolExpr :
	Bool	#boolBoolExpr
	| boolExpr EQ boolExpr #eqBoolExpr
	| boolExpr NEQ boolExpr #neqBoolExpr
	| boolExpr AND boolExpr #andBoolExpr
	| boolExpr OR boolExpr #orBoolExpr
	| NOT boolExpr #notBoolExpr
	| '(' boolExpr ')' #innerBoolExpr
	| relationExpr #relBoolExpr
	| Variable arrayIndex? #varBoolExpr
	| funcApply #applyBoolFunc
	;

relationExpr:
	expr GTE expr #gteExpr
	| expr LTE expr #lteExpr
	| expr GT expr #gtExpr
	| expr LT expr #ltExpr
	| expr EQ expr #eqExpr
	| expr NEQ expr #neqExpr
	| '(' relationExpr ')' #innerRelation
	;
	
stringExpr :
	String #string
	| stringExpr ADD stringExpr #stringAdd
	| stringExpr ADD expr #stringAddExpr
	| Variable arrayIndex? #varStringExpr
	| funcApply #applyStringFunc
	;
	
print:
	Print expr 
	| Print boolExpr 
	| Print stringExpr 
	;
	
length:
	Length '(' Variable ')'
	;
	
whileLoop:
	While boolExpr Do code End
	;
	
forLoop:
	For assignment ';' boolExpr ';' expr Do code End
	| For assignment ';' boolExpr ';' assignment Do code End
	;
	
funcDef:
	Func Variable '(' param* ')' Do code End
	;

funcApply:
	Variable '(' param* ')'
	;

param:
	funcApply
	| expr
	| boolExpr
	| stringExpr

	;
	
funcReturn:
	Return expr
	| Return boolExpr
	| Return stringExpr
	;
	
importStatment:
	Import Path ';'
	;
	
arrayDec:
	'[' (((expr|boolExpr|stringExpr) ',')* (expr|boolExpr|stringExpr) )? ']'
	;
	
arrayIndex:
	'[' expr ']'
	;
	
If : 'if';
Else : 'else';
Do : 'do';
End : 'end';
Print : 'print';
Length : 'length';
While : 'while';
For : 'for';
Func : 'func';
Return : 'return';
Import : 'import';

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GTE : '>=';
LTE : '<=';
Pow : '^';
NOT : '!';
GT : '>';
LT : '<';
ADD : '+';
SUB : '-';
MULT : '*';
DIV : '/';
MOD : '%';
INC : '++';
DEC : '--';
INCEQ: '+=';
DECEQ : '-=';

Bool
 : 'true' 
 | 'false'
 ;

Number
 : Int ('.' Digit*)?
 ;

Variable
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;
 
PathPart
	: Variable | ('/'PathPart)
	;
 
Path
 : '"' Variable ('/'PathPart)* '.319' '"'
 ;

String
 : ["] (~["\r\n] | '\\\\' | '\\"')* ["]
 ;

Comment
 : '#' ~[\r\n]*  -> skip
 ;

Space
 : [ \t\r\n\u000C] -> skip
 ;

fragment Int
 : [1-9] Digit*
 | '0'
 ;
 
fragment Digit 
 : [0-9]
 ;