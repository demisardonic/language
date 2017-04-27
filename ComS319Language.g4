grammar ComS319Language;

program
 : code
 ;

code
 : statement*
 ;

statement
	: assignment ';'
	| funcReturn ';'
	| funcDef
	| funcApply ';'
	| varInc ';'
	| varDec ';'
	| ifPartement
	| print ';'
	| whileLoop
	| forLoop
	;

assignment
	: Variable '=' expr
	| Variable '=' stringExpr
	| Variable '=' boolExpr
	;
	
varInc:
	Variable INC
	;
	
varDec:
	Variable DEC
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
	: SUB expr #negExpr
	| expr MULT expr #multExpr
	| expr DIV expr #divExpr
	| expr MOD expr #modExpr
	| expr ADD expr #addExpr
	| expr SUB expr #subExpr
	| varInc #varIncExpr
	| varDec #varDecExpr
	| expr INC #incExpr
	| expr DEC # decExpr
	| Number #numExpr
	| '('expr')' #innerExpr
	| Variable #varExpr
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
	| Variable #varBoolExpr
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
	| Variable #varStringExpr
	| funcApply #applyStringFunc
	;
	
print:
	Print expr 
	| Print boolExpr 
	| Print stringExpr 
	;
	
whileLoop:
	While boolExpr Do code End
	;
	
forLoop:
	For assignment ';' boolExpr ';' expr Do code End
	| For assignment ';' boolExpr ';' assignment Do code End
	;
	
funcDef:
	Func Variable '(' param* ')' Do funcBody End
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
	
funcBody
 : funcStatement*
 ;

funcStatement
	: statement
	| funcReturn ';'
	;
	
If : 'if';
Else : 'else';
Do : 'do';
End : 'end';
Print : 'print';
While : 'while';
For : 'for';
Func : 'func';
Return : 'return';

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