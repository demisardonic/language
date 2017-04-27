// Generated from ComS319Language.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ComS319LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, If=5, Else=6, Do=7, End=8, Print=9, While=10, 
		For=11, Func=12, Return=13, OR=14, AND=15, EQ=16, NEQ=17, GTE=18, LTE=19, 
		Pow=20, NOT=21, GT=22, LT=23, ADD=24, SUB=25, MULT=26, DIV=27, MOD=28, 
		INC=29, DEC=30, INCEQ=31, DECEQ=32, Bool=33, Number=34, Variable=35, String=36, 
		Comment=37, Space=38;
	public static final int
		RULE_program = 0, RULE_code = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_varInc = 4, RULE_varDec = 5, RULE_ifPartement = 6, RULE_ifPart = 7, 
		RULE_elseIfPart = 8, RULE_elsePart = 9, RULE_expr = 10, RULE_boolExpr = 11, 
		RULE_relationExpr = 12, RULE_stringExpr = 13, RULE_print = 14, RULE_whileLoop = 15, 
		RULE_forLoop = 16, RULE_funcDef = 17, RULE_funcApply = 18, RULE_param = 19, 
		RULE_funcReturn = 20, RULE_funcBody = 21, RULE_funcStatement = 22;
	public static final String[] ruleNames = {
		"program", "code", "statement", "assignment", "varInc", "varDec", "ifPartement", 
		"ifPart", "elseIfPart", "elsePart", "expr", "boolExpr", "relationExpr", 
		"stringExpr", "print", "whileLoop", "forLoop", "funcDef", "funcApply", 
		"param", "funcReturn", "funcBody", "funcStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='", "'('", "')'", "'if'", "'else'", "'do'", "'end'", "'print'", 
		"'while'", "'for'", "'func'", "'return'", "'||'", "'&&'", "'=='", "'!='", 
		"'>='", "'<='", "'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'++'", "'--'", "'+='", "'-='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "If", "Else", "Do", "End", "Print", "While", 
		"For", "Func", "Return", "OR", "AND", "EQ", "NEQ", "GTE", "LTE", "Pow", 
		"NOT", "GT", "LT", "ADD", "SUB", "MULT", "DIV", "MOD", "INC", "DEC", "INCEQ", 
		"DECEQ", "Bool", "Number", "Variable", "String", "Comment", "Space"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ComS319Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ComS319LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Print) | (1L << While) | (1L << For) | (1L << Func) | (1L << Return) | (1L << Variable))) != 0)) {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public FuncReturnContext funcReturn() {
			return getRuleContext(FuncReturnContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public FuncApplyContext funcApply() {
			return getRuleContext(FuncApplyContext.class,0);
		}
		public VarIncContext varInc() {
			return getRuleContext(VarIncContext.class,0);
		}
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public IfPartementContext ifPartement() {
			return getRuleContext(IfPartementContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				assignment();
				setState(55);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				funcReturn();
				setState(58);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				funcDef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				funcApply();
				setState(62);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				varInc();
				setState(65);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				varDec();
				setState(68);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				ifPartement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				print();
				setState(72);
				match(T__0);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(74);
				whileLoop();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(75);
				forLoop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(ComS319LanguageParser.Variable, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(Variable);
				setState(79);
				match(T__1);
				setState(80);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(Variable);
				setState(82);
				match(T__1);
				setState(83);
				stringExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(Variable);
				setState(85);
				match(T__1);
				setState(86);
				boolExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarIncContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(ComS319LanguageParser.Variable, 0); }
		public TerminalNode INC() { return getToken(ComS319LanguageParser.INC, 0); }
		public VarIncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varInc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterVarInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitVarInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitVarInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIncContext varInc() throws RecognitionException {
		VarIncContext _localctx = new VarIncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varInc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(Variable);
			setState(90);
			match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDecContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(ComS319LanguageParser.Variable, 0); }
		public TerminalNode DEC() { return getToken(ComS319LanguageParser.DEC, 0); }
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(Variable);
			setState(93);
			match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfPartementContext extends ParserRuleContext {
		public IfPartContext ifPart() {
			return getRuleContext(IfPartContext.class,0);
		}
		public TerminalNode End() { return getToken(ComS319LanguageParser.End, 0); }
		public List<ElseIfPartContext> elseIfPart() {
			return getRuleContexts(ElseIfPartContext.class);
		}
		public ElseIfPartContext elseIfPart(int i) {
			return getRuleContext(ElseIfPartContext.class,i);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public IfPartementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifPartement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterIfPartement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitIfPartement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitIfPartement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfPartementContext ifPartement() throws RecognitionException {
		IfPartementContext _localctx = new IfPartementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifPartement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			ifPart();
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(96);
					elseIfPart();
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(102);
				elsePart();
				}
			}

			setState(105);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfPartContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ComS319LanguageParser.If, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode Do() { return getToken(ComS319LanguageParser.Do, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public IfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterIfPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitIfPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitIfPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfPartContext ifPart() throws RecognitionException {
		IfPartContext _localctx = new IfPartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(If);
			setState(108);
			boolExpr(0);
			setState(109);
			match(Do);
			setState(110);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseIfPartContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(ComS319LanguageParser.Else, 0); }
		public TerminalNode If() { return getToken(ComS319LanguageParser.If, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode Do() { return getToken(ComS319LanguageParser.Do, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ElseIfPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterElseIfPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitElseIfPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitElseIfPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfPartContext elseIfPart() throws RecognitionException {
		ElseIfPartContext _localctx = new ElseIfPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseIfPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Else);
			setState(113);
			match(If);
			setState(114);
			boolExpr(0);
			setState(115);
			match(Do);
			setState(116);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElsePartContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(ComS319LanguageParser.Else, 0); }
		public TerminalNode Do() { return getToken(ComS319LanguageParser.Do, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterElsePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitElsePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(Else);
			setState(119);
			match(Do);
			setState(120);
			code();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(ComS319LanguageParser.MOD, 0); }
		public ModExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitModExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INC() { return getToken(ComS319LanguageParser.INC, 0); }
		public IncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterIncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitIncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitIncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InnerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterInnerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitInnerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitInnerExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEC() { return getToken(ComS319LanguageParser.DEC, 0); }
		public DecExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitDecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(ComS319LanguageParser.SUB, 0); }
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(ComS319LanguageParser.MULT, 0); }
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumExprContext extends ExprContext {
		public TerminalNode Number() { return getToken(ComS319LanguageParser.Number, 0); }
		public NumExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterNumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitNumExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitNumExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExprContext extends ExprContext {
		public TerminalNode Variable() { return getToken(ComS319LanguageParser.Variable, 0); }
		public VarExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterVarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitVarExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitVarExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIncExprContext extends ExprContext {
		public VarIncContext varInc() {
			return getRuleContext(VarIncContext.class,0);
		}
		public VarIncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterVarIncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitVarIncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitVarIncExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDecExprContext extends ExprContext {
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public VarDecExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterVarDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitVarDecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitVarDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyFuncContext extends ExprContext {
		public FuncApplyContext funcApply() {
			return getRuleContext(FuncApplyContext.class,0);
		}
		public ApplyFuncContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterApplyFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitApplyFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitApplyFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ComS319LanguageParser.ADD, 0); }
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExprContext extends ExprContext {
		public TerminalNode SUB() { return getToken(ComS319LanguageParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterNegExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitNegExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitNegExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ComS319LanguageParser.DIV, 0); }
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(123);
				match(SUB);
				setState(124);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new VarIncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				varInc();
				}
				break;
			case 3:
				{
				_localctx = new VarDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				varDec();
				}
				break;
			case 4:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(Number);
				}
				break;
			case 5:
				{
				_localctx = new InnerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(T__2);
				setState(129);
				expr(0);
				setState(130);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(Variable);
				}
				break;
			case 7:
				{
				_localctx = new ApplyFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				funcApply();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(137);
						match(MULT);
						setState(138);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(140);
						match(DIV);
						setState(141);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(143);
						match(MOD);
						setState(144);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(146);
						match(ADD);
						setState(147);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(149);
						match(SUB);
						setState(150);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new IncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(152);
						match(INC);
						}
						break;
					case 7:
						{
						_localctx = new DecExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(154);
						match(DEC);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
		public void copyFrom(BoolExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApplyBoolFuncContext extends BoolExprContext {
		public FuncApplyContext funcApply() {
			return getRuleContext(FuncApplyContext.class,0);
		}
		public ApplyBoolFuncContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterApplyBoolFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitApplyBoolFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitApplyBoolFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarBoolExprContext extends BoolExprContext {
		public TerminalNode Variable() { return getToken(ComS319LanguageParser.Variable, 0); }
		public VarBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterVarBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitVarBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitVarBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolBoolExprContext extends BoolExprContext {
		public TerminalNode Bool() { return getToken(ComS319LanguageParser.Bool, 0); }
		public BoolBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterBoolBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitBoolBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitBoolBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelBoolExprContext extends BoolExprContext {
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public RelBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterRelBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitRelBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitRelBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqBoolExprContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ComS319LanguageParser.EQ, 0); }
		public EqBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterEqBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitEqBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitEqBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeqBoolExprContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(ComS319LanguageParser.NEQ, 0); }
		public NeqBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterNeqBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitNeqBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitNeqBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndBoolExprContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ComS319LanguageParser.AND, 0); }
		public AndBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterAndBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitAndBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitAndBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerBoolExprContext extends BoolExprContext {
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public InnerBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterInnerBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitInnerBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitInnerBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrBoolExprContext extends BoolExprContext {
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(ComS319LanguageParser.OR, 0); }
		public OrBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterOrBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitOrBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitOrBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotBoolExprContext extends BoolExprContext {
		public TerminalNode NOT() { return getToken(ComS319LanguageParser.NOT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NotBoolExprContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterNotBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitNotBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitNotBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new BoolBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(161);
				match(Bool);
				}
				break;
			case 2:
				{
				_localctx = new NotBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(NOT);
				setState(163);
				boolExpr(5);
				}
				break;
			case 3:
				{
				_localctx = new InnerBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(T__2);
				setState(165);
				boolExpr(0);
				setState(166);
				match(T__3);
				}
				break;
			case 4:
				{
				_localctx = new RelBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				relationExpr();
				}
				break;
			case 5:
				{
				_localctx = new VarBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(Variable);
				}
				break;
			case 6:
				{
				_localctx = new ApplyBoolFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				funcApply();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new EqBoolExprContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(173);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(174);
						match(EQ);
						setState(175);
						boolExpr(10);
						}
						break;
					case 2:
						{
						_localctx = new NeqBoolExprContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(176);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(177);
						match(NEQ);
						setState(178);
						boolExpr(9);
						}
						break;
					case 3:
						{
						_localctx = new AndBoolExprContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(179);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(180);
						match(AND);
						setState(181);
						boolExpr(8);
						}
						break;
					case 4:
						{
						_localctx = new OrBoolExprContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(182);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(183);
						match(OR);
						setState(184);
						boolExpr(7);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationExprContext extends ParserRuleContext {
		public RelationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpr; }
	 
		public RelationExprContext() { }
		public void copyFrom(RelationExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LteExprContext extends RelationExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTE() { return getToken(ComS319LanguageParser.LTE, 0); }
		public LteExprContext(RelationExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterLteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitLteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitLteExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtExprContext extends RelationExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(ComS319LanguageParser.LT, 0); }
		public LtExprContext(RelationExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends RelationExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ComS319LanguageParser.EQ, 0); }
		public EqExprContext(RelationExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtExprContext extends RelationExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(ComS319LanguageParser.GT, 0); }
		public GtExprContext(RelationExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GteExprContext extends RelationExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GTE() { return getToken(ComS319LanguageParser.GTE, 0); }
		public GteExprContext(RelationExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterGteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitGteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitGteExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InnerRelationContext extends RelationExprContext {
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public InnerRelationContext(RelationExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterInnerRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitInnerRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitInnerRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NeqExprContext extends RelationExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(ComS319LanguageParser.NEQ, 0); }
		public NeqExprContext(RelationExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterNeqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitNeqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitNeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExprContext relationExpr() throws RecognitionException {
		RelationExprContext _localctx = new RelationExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationExpr);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new GteExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				expr(0);
				setState(191);
				match(GTE);
				setState(192);
				expr(0);
				}
				break;
			case 2:
				_localctx = new LteExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				expr(0);
				setState(195);
				match(LTE);
				setState(196);
				expr(0);
				}
				break;
			case 3:
				_localctx = new GtExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				expr(0);
				setState(199);
				match(GT);
				setState(200);
				expr(0);
				}
				break;
			case 4:
				_localctx = new LtExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				expr(0);
				setState(203);
				match(LT);
				setState(204);
				expr(0);
				}
				break;
			case 5:
				_localctx = new EqExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				expr(0);
				setState(207);
				match(EQ);
				setState(208);
				expr(0);
				}
				break;
			case 6:
				_localctx = new NeqExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				expr(0);
				setState(211);
				match(NEQ);
				setState(212);
				expr(0);
				}
				break;
			case 7:
				_localctx = new InnerRelationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				match(T__2);
				setState(215);
				relationExpr();
				setState(216);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringExprContext extends ParserRuleContext {
		public StringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExpr; }
	 
		public StringExprContext() { }
		public void copyFrom(StringExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ApplyStringFuncContext extends StringExprContext {
		public FuncApplyContext funcApply() {
			return getRuleContext(FuncApplyContext.class,0);
		}
		public ApplyStringFuncContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterApplyStringFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitApplyStringFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitApplyStringFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends StringExprContext {
		public TerminalNode String() { return getToken(ComS319LanguageParser.String, 0); }
		public StringContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAddContext extends StringExprContext {
		public List<StringExprContext> stringExpr() {
			return getRuleContexts(StringExprContext.class);
		}
		public StringExprContext stringExpr(int i) {
			return getRuleContext(StringExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ComS319LanguageParser.ADD, 0); }
		public StringAddContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterStringAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitStringAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitStringAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarStringExprContext extends StringExprContext {
		public TerminalNode Variable() { return getToken(ComS319LanguageParser.Variable, 0); }
		public VarStringExprContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterVarStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitVarStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitVarStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringAddExprContext extends StringExprContext {
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ComS319LanguageParser.ADD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringAddExprContext(StringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterStringAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitStringAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitStringAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringExprContext stringExpr() throws RecognitionException {
		return stringExpr(0);
	}

	private StringExprContext stringExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringExprContext _localctx = new StringExprContext(_ctx, _parentState);
		StringExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_stringExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(221);
				match(String);
				}
				break;
			case 2:
				{
				_localctx = new VarStringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(222);
				match(Variable);
				}
				break;
			case 3:
				{
				_localctx = new ApplyStringFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				funcApply();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(232);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new StringAddContext(new StringExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
						setState(226);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(227);
						match(ADD);
						setState(228);
						stringExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new StringAddExprContext(new StringExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
						setState(229);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(230);
						match(ADD);
						setState(231);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(ComS319LanguageParser.Print, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(Print);
				setState(238);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(Print);
				setState(240);
				boolExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(Print);
				setState(242);
				stringExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(ComS319LanguageParser.While, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode Do() { return getToken(ComS319LanguageParser.Do, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode End() { return getToken(ComS319LanguageParser.End, 0); }
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(While);
			setState(246);
			boolExpr(0);
			setState(247);
			match(Do);
			setState(248);
			code();
			setState(249);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(ComS319LanguageParser.For, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Do() { return getToken(ComS319LanguageParser.Do, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public TerminalNode End() { return getToken(ComS319LanguageParser.End, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forLoop);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(For);
				setState(252);
				assignment();
				setState(253);
				match(T__0);
				setState(254);
				boolExpr(0);
				setState(255);
				match(T__0);
				setState(256);
				expr(0);
				setState(257);
				match(Do);
				setState(258);
				code();
				setState(259);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(For);
				setState(262);
				assignment();
				setState(263);
				match(T__0);
				setState(264);
				boolExpr(0);
				setState(265);
				match(T__0);
				setState(266);
				assignment();
				setState(267);
				match(Do);
				setState(268);
				code();
				setState(269);
				match(End);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode Func() { return getToken(ComS319LanguageParser.Func, 0); }
		public TerminalNode Variable() { return getToken(ComS319LanguageParser.Variable, 0); }
		public TerminalNode Do() { return getToken(ComS319LanguageParser.Do, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public TerminalNode End() { return getToken(ComS319LanguageParser.End, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_funcDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(Func);
			setState(274);
			match(Variable);
			setState(275);
			match(T__2);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NOT) | (1L << SUB) | (1L << Bool) | (1L << Number) | (1L << Variable) | (1L << String))) != 0)) {
				{
				{
				setState(276);
				param();
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(T__3);
			setState(283);
			match(Do);
			setState(284);
			funcBody();
			setState(285);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncApplyContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(ComS319LanguageParser.Variable, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public FuncApplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcApply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterFuncApply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitFuncApply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitFuncApply(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncApplyContext funcApply() throws RecognitionException {
		FuncApplyContext _localctx = new FuncApplyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funcApply);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(Variable);
			setState(288);
			match(T__2);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NOT) | (1L << SUB) | (1L << Bool) | (1L << Number) | (1L << Variable) | (1L << String))) != 0)) {
				{
				{
				setState(289);
				param();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public FuncApplyContext funcApply() {
			return getRuleContext(FuncApplyContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_param);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				funcApply();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				boolExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				stringExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ComS319LanguageParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public StringExprContext stringExpr() {
			return getRuleContext(StringExprContext.class,0);
		}
		public FuncReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterFuncReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitFuncReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitFuncReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncReturnContext funcReturn() throws RecognitionException {
		FuncReturnContext _localctx = new FuncReturnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcReturn);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(Return);
				setState(304);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(Return);
				setState(306);
				boolExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(307);
				match(Return);
				setState(308);
				stringExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncBodyContext extends ParserRuleContext {
		public List<FuncStatementContext> funcStatement() {
			return getRuleContexts(FuncStatementContext.class);
		}
		public FuncStatementContext funcStatement(int i) {
			return getRuleContext(FuncStatementContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Print) | (1L << While) | (1L << For) | (1L << Func) | (1L << Return) | (1L << Variable))) != 0)) {
				{
				{
				setState(311);
				funcStatement();
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FuncReturnContext funcReturn() {
			return getRuleContext(FuncReturnContext.class,0);
		}
		public FuncStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).enterFuncStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComS319LanguageListener ) ((ComS319LanguageListener)listener).exitFuncStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ComS319LanguageVisitor ) return ((ComS319LanguageVisitor<? extends T>)visitor).visitFuncStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncStatementContext funcStatement() throws RecognitionException {
		FuncStatementContext _localctx = new FuncStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcStatement);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				funcReturn();
				setState(319);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 11:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 13:
			return stringExpr_sempred((StringExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 8);
		case 9:
			return precpred(_ctx, 7);
		case 10:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean stringExpr_sempred(StringExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\b"+
		"d\n\b\f\b\16\bg\13\b\3\b\5\bj\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0089\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ae\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bc\n\r\f\r\16\r\u00bf\13\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u00dd\n\16\3\17\3\17\3\17\3\17\5\17\u00e3\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u00eb\n\17\f\17\16\17\u00ee\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00f6\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0112\n\22\3\23\3\23\3\23\3\23\7\23\u0118\n\23\f"+
		"\23\16\23\u011b\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u0125"+
		"\n\24\f\24\16\24\u0128\13\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0130"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0138\n\26\3\27\7\27\u013b\n"+
		"\27\f\27\16\27\u013e\13\27\3\30\3\30\3\30\3\30\5\30\u0144\n\30\3\30\2"+
		"\5\26\30\34\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\u0168"+
		"\2\60\3\2\2\2\4\65\3\2\2\2\6N\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2\f^\3\2\2\2"+
		"\16a\3\2\2\2\20m\3\2\2\2\22r\3\2\2\2\24x\3\2\2\2\26\u0088\3\2\2\2\30\u00ad"+
		"\3\2\2\2\32\u00dc\3\2\2\2\34\u00e2\3\2\2\2\36\u00f5\3\2\2\2 \u00f7\3\2"+
		"\2\2\"\u0111\3\2\2\2$\u0113\3\2\2\2&\u0121\3\2\2\2(\u012f\3\2\2\2*\u0137"+
		"\3\2\2\2,\u013c\3\2\2\2.\u0143\3\2\2\2\60\61\5\4\3\2\61\3\3\2\2\2\62\64"+
		"\5\6\4\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5"+
		"\3\2\2\2\67\65\3\2\2\289\5\b\5\29:\7\3\2\2:O\3\2\2\2;<\5*\26\2<=\7\3\2"+
		"\2=O\3\2\2\2>O\5$\23\2?@\5&\24\2@A\7\3\2\2AO\3\2\2\2BC\5\n\6\2CD\7\3\2"+
		"\2DO\3\2\2\2EF\5\f\7\2FG\7\3\2\2GO\3\2\2\2HO\5\16\b\2IJ\5\36\20\2JK\7"+
		"\3\2\2KO\3\2\2\2LO\5 \21\2MO\5\"\22\2N8\3\2\2\2N;\3\2\2\2N>\3\2\2\2N?"+
		"\3\2\2\2NB\3\2\2\2NE\3\2\2\2NH\3\2\2\2NI\3\2\2\2NL\3\2\2\2NM\3\2\2\2O"+
		"\7\3\2\2\2PQ\7%\2\2QR\7\4\2\2RZ\5\26\f\2ST\7%\2\2TU\7\4\2\2UZ\5\34\17"+
		"\2VW\7%\2\2WX\7\4\2\2XZ\5\30\r\2YP\3\2\2\2YS\3\2\2\2YV\3\2\2\2Z\t\3\2"+
		"\2\2[\\\7%\2\2\\]\7\37\2\2]\13\3\2\2\2^_\7%\2\2_`\7 \2\2`\r\3\2\2\2ae"+
		"\5\20\t\2bd\5\22\n\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2hj\5\24\13\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\n\2\2l\17\3\2"+
		"\2\2mn\7\7\2\2no\5\30\r\2op\7\t\2\2pq\5\4\3\2q\21\3\2\2\2rs\7\b\2\2st"+
		"\7\7\2\2tu\5\30\r\2uv\7\t\2\2vw\5\4\3\2w\23\3\2\2\2xy\7\b\2\2yz\7\t\2"+
		"\2z{\5\4\3\2{\25\3\2\2\2|}\b\f\1\2}~\7\33\2\2~\u0089\5\26\f\20\177\u0089"+
		"\5\n\6\2\u0080\u0089\5\f\7\2\u0081\u0089\7$\2\2\u0082\u0083\7\5\2\2\u0083"+
		"\u0084\5\26\f\2\u0084\u0085\7\6\2\2\u0085\u0089\3\2\2\2\u0086\u0089\7"+
		"%\2\2\u0087\u0089\5&\24\2\u0088|\3\2\2\2\u0088\177\3\2\2\2\u0088\u0080"+
		"\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u009f\3\2\2\2\u008a\u008b\f\17\2\2\u008b\u008c\7"+
		"\34\2\2\u008c\u009e\5\26\f\20\u008d\u008e\f\16\2\2\u008e\u008f\7\35\2"+
		"\2\u008f\u009e\5\26\f\17\u0090\u0091\f\r\2\2\u0091\u0092\7\36\2\2\u0092"+
		"\u009e\5\26\f\16\u0093\u0094\f\f\2\2\u0094\u0095\7\32\2\2\u0095\u009e"+
		"\5\26\f\r\u0096\u0097\f\13\2\2\u0097\u0098\7\33\2\2\u0098\u009e\5\26\f"+
		"\f\u0099\u009a\f\b\2\2\u009a\u009e\7\37\2\2\u009b\u009c\f\7\2\2\u009c"+
		"\u009e\7 \2\2\u009d\u008a\3\2\2\2\u009d\u008d\3\2\2\2\u009d\u0090\3\2"+
		"\2\2\u009d\u0093\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0099\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\27\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\b\r\1\2\u00a3\u00ae"+
		"\7#\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00ae\5\30\r\7\u00a6\u00a7\7\5\2\2"+
		"\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7\6\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00ae"+
		"\5\32\16\2\u00ab\u00ae\7%\2\2\u00ac\u00ae\5&\24\2\u00ad\u00a2\3\2\2\2"+
		"\u00ad\u00a4\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00bd\3\2\2\2\u00af\u00b0\f\13\2\2"+
		"\u00b0\u00b1\7\22\2\2\u00b1\u00bc\5\30\r\f\u00b2\u00b3\f\n\2\2\u00b3\u00b4"+
		"\7\23\2\2\u00b4\u00bc\5\30\r\13\u00b5\u00b6\f\t\2\2\u00b6\u00b7\7\21\2"+
		"\2\u00b7\u00bc\5\30\r\n\u00b8\u00b9\f\b\2\2\u00b9\u00ba\7\20\2\2\u00ba"+
		"\u00bc\5\30\r\t\u00bb\u00af\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b5\3"+
		"\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\5\26\f"+
		"\2\u00c1\u00c2\7\24\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00dd\3\2\2\2\u00c4"+
		"\u00c5\5\26\f\2\u00c5\u00c6\7\25\2\2\u00c6\u00c7\5\26\f\2\u00c7\u00dd"+
		"\3\2\2\2\u00c8\u00c9\5\26\f\2\u00c9\u00ca\7\30\2\2\u00ca\u00cb\5\26\f"+
		"\2\u00cb\u00dd\3\2\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00ce\7\31\2\2\u00ce"+
		"\u00cf\5\26\f\2\u00cf\u00dd\3\2\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\7"+
		"\22\2\2\u00d2\u00d3\5\26\f\2\u00d3\u00dd\3\2\2\2\u00d4\u00d5\5\26\f\2"+
		"\u00d5\u00d6\7\23\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9"+
		"\7\5\2\2\u00d9\u00da\5\32\16\2\u00da\u00db\7\6\2\2\u00db\u00dd\3\2\2\2"+
		"\u00dc\u00c0\3\2\2\2\u00dc\u00c4\3\2\2\2\u00dc\u00c8\3\2\2\2\u00dc\u00cc"+
		"\3\2\2\2\u00dc\u00d0\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd"+
		"\33\3\2\2\2\u00de\u00df\b\17\1\2\u00df\u00e3\7&\2\2\u00e0\u00e3\7%\2\2"+
		"\u00e1\u00e3\5&\24\2\u00e2\u00de\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\u00ec\3\2\2\2\u00e4\u00e5\f\6\2\2\u00e5\u00e6\7\32\2\2"+
		"\u00e6\u00eb\5\34\17\7\u00e7\u00e8\f\5\2\2\u00e8\u00e9\7\32\2\2\u00e9"+
		"\u00eb\5\26\f\2\u00ea\u00e4\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\35\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f0\7\13\2\2\u00f0\u00f6\5\26\f\2\u00f1\u00f2\7"+
		"\13\2\2\u00f2\u00f6\5\30\r\2\u00f3\u00f4\7\13\2\2\u00f4\u00f6\5\34\17"+
		"\2\u00f5\u00ef\3\2\2\2\u00f5\u00f1\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\37"+
		"\3\2\2\2\u00f7\u00f8\7\f\2\2\u00f8\u00f9\5\30\r\2\u00f9\u00fa\7\t\2\2"+
		"\u00fa\u00fb\5\4\3\2\u00fb\u00fc\7\n\2\2\u00fc!\3\2\2\2\u00fd\u00fe\7"+
		"\r\2\2\u00fe\u00ff\5\b\5\2\u00ff\u0100\7\3\2\2\u0100\u0101\5\30\r\2\u0101"+
		"\u0102\7\3\2\2\u0102\u0103\5\26\f\2\u0103\u0104\7\t\2\2\u0104\u0105\5"+
		"\4\3\2\u0105\u0106\7\n\2\2\u0106\u0112\3\2\2\2\u0107\u0108\7\r\2\2\u0108"+
		"\u0109\5\b\5\2\u0109\u010a\7\3\2\2\u010a\u010b\5\30\r\2\u010b\u010c\7"+
		"\3\2\2\u010c\u010d\5\b\5\2\u010d\u010e\7\t\2\2\u010e\u010f\5\4\3\2\u010f"+
		"\u0110\7\n\2\2\u0110\u0112\3\2\2\2\u0111\u00fd\3\2\2\2\u0111\u0107\3\2"+
		"\2\2\u0112#\3\2\2\2\u0113\u0114\7\16\2\2\u0114\u0115\7%\2\2\u0115\u0119"+
		"\7\5\2\2\u0116\u0118\5(\25\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011c\u011d\7\6\2\2\u011d\u011e\7\t\2\2\u011e\u011f\5,\27\2\u011f"+
		"\u0120\7\n\2\2\u0120%\3\2\2\2\u0121\u0122\7%\2\2\u0122\u0126\7\5\2\2\u0123"+
		"\u0125\5(\25\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129"+
		"\u012a\7\6\2\2\u012a\'\3\2\2\2\u012b\u0130\5&\24\2\u012c\u0130\5\26\f"+
		"\2\u012d\u0130\5\30\r\2\u012e\u0130\5\34\17\2\u012f\u012b\3\2\2\2\u012f"+
		"\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130)\3\2\2\2"+
		"\u0131\u0132\7\17\2\2\u0132\u0138\5\26\f\2\u0133\u0134\7\17\2\2\u0134"+
		"\u0138\5\30\r\2\u0135\u0136\7\17\2\2\u0136\u0138\5\34\17\2\u0137\u0131"+
		"\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0135\3\2\2\2\u0138+\3\2\2\2\u0139"+
		"\u013b\5.\30\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d-\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0144"+
		"\5\6\4\2\u0140\u0141\5*\26\2\u0141\u0142\7\3\2\2\u0142\u0144\3\2\2\2\u0143"+
		"\u013f\3\2\2\2\u0143\u0140\3\2\2\2\u0144/\3\2\2\2\31\65NYei\u0088\u009d"+
		"\u009f\u00ad\u00bb\u00bd\u00dc\u00e2\u00ea\u00ec\u00f5\u0111\u0119\u0126"+
		"\u012f\u0137\u013c\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}