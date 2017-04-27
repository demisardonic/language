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
		RULE_funcReturn = 20;
	public static final String[] ruleNames = {
		"program", "code", "statement", "assignment", "varInc", "varDec", "ifPartement", 
		"ifPart", "elseIfPart", "elsePart", "expr", "boolExpr", "relationExpr", 
		"stringExpr", "print", "whileLoop", "forLoop", "funcDef", "funcApply", 
		"param", "funcReturn"
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
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				funcDef();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Func );
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
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << Print) | (1L << While) | (1L << For) | (1L << Return) | (1L << Variable))) != 0)) {
				{
				{
				setState(47);
				statement();
				}
				}
				setState(52);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				assignment();
				setState(54);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				funcReturn();
				setState(57);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				funcApply();
				setState(60);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				varInc();
				setState(63);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				varDec();
				setState(66);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				ifPartement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				print();
				setState(70);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(72);
				whileLoop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(73);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(Variable);
				setState(77);
				match(T__1);
				setState(78);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(Variable);
				setState(80);
				match(T__1);
				setState(81);
				stringExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(Variable);
				setState(83);
				match(T__1);
				setState(84);
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
			setState(87);
			match(Variable);
			setState(88);
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
			setState(90);
			match(Variable);
			setState(91);
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
			setState(93);
			ifPart();
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					elseIfPart();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(100);
				elsePart();
				}
			}

			setState(103);
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
			setState(105);
			match(If);
			setState(106);
			boolExpr(0);
			setState(107);
			match(Do);
			setState(108);
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
			setState(110);
			match(Else);
			setState(111);
			match(If);
			setState(112);
			boolExpr(0);
			setState(113);
			match(Do);
			setState(114);
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
			setState(116);
			match(Else);
			setState(117);
			match(Do);
			setState(118);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				match(SUB);
				setState(122);
				expr(14);
				}
				break;
			case 2:
				{
				_localctx = new VarIncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				varInc();
				}
				break;
			case 3:
				{
				_localctx = new VarDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				varDec();
				}
				break;
			case 4:
				{
				_localctx = new NumExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(Number);
				}
				break;
			case 5:
				{
				_localctx = new InnerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(T__2);
				setState(127);
				expr(0);
				setState(128);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new VarExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(Variable);
				}
				break;
			case 7:
				{
				_localctx = new ApplyFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				funcApply();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(135);
						match(MULT);
						setState(136);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(138);
						match(DIV);
						setState(139);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ModExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(141);
						match(MOD);
						setState(142);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(144);
						match(ADD);
						setState(145);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(147);
						match(SUB);
						setState(148);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new IncExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(150);
						match(INC);
						}
						break;
					case 7:
						{
						_localctx = new DecExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(152);
						match(DEC);
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new BoolBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(159);
				match(Bool);
				}
				break;
			case 2:
				{
				_localctx = new NotBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(NOT);
				setState(161);
				boolExpr(5);
				}
				break;
			case 3:
				{
				_localctx = new InnerBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(T__2);
				setState(163);
				boolExpr(0);
				setState(164);
				match(T__3);
				}
				break;
			case 4:
				{
				_localctx = new RelBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				relationExpr();
				}
				break;
			case 5:
				{
				_localctx = new VarBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(Variable);
				}
				break;
			case 6:
				{
				_localctx = new ApplyBoolFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				funcApply();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new EqBoolExprContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(171);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(172);
						match(EQ);
						setState(173);
						boolExpr(10);
						}
						break;
					case 2:
						{
						_localctx = new NeqBoolExprContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(174);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(175);
						match(NEQ);
						setState(176);
						boolExpr(9);
						}
						break;
					case 3:
						{
						_localctx = new AndBoolExprContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(177);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(178);
						match(AND);
						setState(179);
						boolExpr(8);
						}
						break;
					case 4:
						{
						_localctx = new OrBoolExprContext(new BoolExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
						setState(180);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(181);
						match(OR);
						setState(182);
						boolExpr(7);
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new GteExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				expr(0);
				setState(189);
				match(GTE);
				setState(190);
				expr(0);
				}
				break;
			case 2:
				_localctx = new LteExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				expr(0);
				setState(193);
				match(LTE);
				setState(194);
				expr(0);
				}
				break;
			case 3:
				_localctx = new GtExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				expr(0);
				setState(197);
				match(GT);
				setState(198);
				expr(0);
				}
				break;
			case 4:
				_localctx = new LtExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				expr(0);
				setState(201);
				match(LT);
				setState(202);
				expr(0);
				}
				break;
			case 5:
				_localctx = new EqExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				expr(0);
				setState(205);
				match(EQ);
				setState(206);
				expr(0);
				}
				break;
			case 6:
				_localctx = new NeqExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				expr(0);
				setState(209);
				match(NEQ);
				setState(210);
				expr(0);
				}
				break;
			case 7:
				_localctx = new InnerRelationContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				match(T__2);
				setState(213);
				relationExpr();
				setState(214);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(219);
				match(String);
				}
				break;
			case 2:
				{
				_localctx = new VarStringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(220);
				match(Variable);
				}
				break;
			case 3:
				{
				_localctx = new ApplyStringFuncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(221);
				funcApply();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new StringAddContext(new StringExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
						setState(224);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(225);
						match(ADD);
						setState(226);
						stringExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new StringAddExprContext(new StringExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stringExpr);
						setState(227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(228);
						match(ADD);
						setState(229);
						expr(0);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(Print);
				setState(236);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(Print);
				setState(238);
				boolExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(Print);
				setState(240);
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
			setState(243);
			match(While);
			setState(244);
			boolExpr(0);
			setState(245);
			match(Do);
			setState(246);
			code();
			setState(247);
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
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(For);
				setState(250);
				assignment();
				setState(251);
				match(T__0);
				setState(252);
				boolExpr(0);
				setState(253);
				match(T__0);
				setState(254);
				expr(0);
				setState(255);
				match(Do);
				setState(256);
				code();
				setState(257);
				match(End);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(For);
				setState(260);
				assignment();
				setState(261);
				match(T__0);
				setState(262);
				boolExpr(0);
				setState(263);
				match(T__0);
				setState(264);
				assignment();
				setState(265);
				match(Do);
				setState(266);
				code();
				setState(267);
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
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
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
			setState(271);
			match(Func);
			setState(272);
			match(Variable);
			setState(273);
			match(T__2);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NOT) | (1L << SUB) | (1L << Bool) | (1L << Number) | (1L << Variable) | (1L << String))) != 0)) {
				{
				{
				setState(274);
				param();
				}
				}
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(280);
			match(T__3);
			setState(281);
			match(Do);
			setState(282);
			code();
			setState(283);
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
			setState(285);
			match(Variable);
			setState(286);
			match(T__2);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NOT) | (1L << SUB) | (1L << Bool) | (1L << Number) | (1L << Variable) | (1L << String))) != 0)) {
				{
				{
				setState(287);
				param();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
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
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				funcApply();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				boolExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(Return);
				setState(302);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				match(Return);
				setState(304);
				boolExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(Return);
				setState(306);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\3\7"+
		"\3\63\n\3\f\3\16\3\66\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\bb\n\b\f\b"+
		"\16\be\13\b\3\b\5\bh\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u0087\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u009c\n\f\f\f\16\f\u009f\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ac\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00db"+
		"\n\16\3\17\3\17\3\17\3\17\5\17\u00e1\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00e9\n\17\f\17\16\17\u00ec\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00f4\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0110\n\22\3\23\3\23\3\23\3\23\7\23\u0116\n\23\f\23\16\23\u0119"+
		"\13\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u0123\n\24\f\24\16"+
		"\24\u0126\13\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u012e\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u0136\n\26\3\26\2\5\26\30\34\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\u015a\2-\3\2\2\2\4\64\3\2\2\2\6"+
		"L\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2\f\\\3\2\2\2\16_\3\2\2\2\20k\3\2\2\2\22"+
		"p\3\2\2\2\24v\3\2\2\2\26\u0086\3\2\2\2\30\u00ab\3\2\2\2\32\u00da\3\2\2"+
		"\2\34\u00e0\3\2\2\2\36\u00f3\3\2\2\2 \u00f5\3\2\2\2\"\u010f\3\2\2\2$\u0111"+
		"\3\2\2\2&\u011f\3\2\2\2(\u012d\3\2\2\2*\u0135\3\2\2\2,.\5$\23\2-,\3\2"+
		"\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\63\5\6\4\2\62\61"+
		"\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\5\3\2\2\2\66\64"+
		"\3\2\2\2\678\5\b\5\289\7\3\2\29M\3\2\2\2:;\5*\26\2;<\7\3\2\2<M\3\2\2\2"+
		"=>\5&\24\2>?\7\3\2\2?M\3\2\2\2@A\5\n\6\2AB\7\3\2\2BM\3\2\2\2CD\5\f\7\2"+
		"DE\7\3\2\2EM\3\2\2\2FM\5\16\b\2GH\5\36\20\2HI\7\3\2\2IM\3\2\2\2JM\5 \21"+
		"\2KM\5\"\22\2L\67\3\2\2\2L:\3\2\2\2L=\3\2\2\2L@\3\2\2\2LC\3\2\2\2LF\3"+
		"\2\2\2LG\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\7%\2\2OP\7\4\2\2PX\5"+
		"\26\f\2QR\7%\2\2RS\7\4\2\2SX\5\34\17\2TU\7%\2\2UV\7\4\2\2VX\5\30\r\2W"+
		"N\3\2\2\2WQ\3\2\2\2WT\3\2\2\2X\t\3\2\2\2YZ\7%\2\2Z[\7\37\2\2[\13\3\2\2"+
		"\2\\]\7%\2\2]^\7 \2\2^\r\3\2\2\2_c\5\20\t\2`b\5\22\n\2a`\3\2\2\2be\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fh\5\24\13\2gf\3\2\2\2gh\3"+
		"\2\2\2hi\3\2\2\2ij\7\n\2\2j\17\3\2\2\2kl\7\7\2\2lm\5\30\r\2mn\7\t\2\2"+
		"no\5\4\3\2o\21\3\2\2\2pq\7\b\2\2qr\7\7\2\2rs\5\30\r\2st\7\t\2\2tu\5\4"+
		"\3\2u\23\3\2\2\2vw\7\b\2\2wx\7\t\2\2xy\5\4\3\2y\25\3\2\2\2z{\b\f\1\2{"+
		"|\7\33\2\2|\u0087\5\26\f\20}\u0087\5\n\6\2~\u0087\5\f\7\2\177\u0087\7"+
		"$\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5\26\f\2\u0082\u0083\7\6\2\2\u0083"+
		"\u0087\3\2\2\2\u0084\u0087\7%\2\2\u0085\u0087\5&\24\2\u0086z\3\2\2\2\u0086"+
		"}\3\2\2\2\u0086~\3\2\2\2\u0086\177\3\2\2\2\u0086\u0080\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u009d\3\2\2\2\u0088\u0089\f\17\2\2"+
		"\u0089\u008a\7\34\2\2\u008a\u009c\5\26\f\20\u008b\u008c\f\16\2\2\u008c"+
		"\u008d\7\35\2\2\u008d\u009c\5\26\f\17\u008e\u008f\f\r\2\2\u008f\u0090"+
		"\7\36\2\2\u0090\u009c\5\26\f\16\u0091\u0092\f\f\2\2\u0092\u0093\7\32\2"+
		"\2\u0093\u009c\5\26\f\r\u0094\u0095\f\13\2\2\u0095\u0096\7\33\2\2\u0096"+
		"\u009c\5\26\f\f\u0097\u0098\f\b\2\2\u0098\u009c\7\37\2\2\u0099\u009a\f"+
		"\7\2\2\u009a\u009c\7 \2\2\u009b\u0088\3\2\2\2\u009b\u008b\3\2\2\2\u009b"+
		"\u008e\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u0094\3\2\2\2\u009b\u0097\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\27\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\b\r\1"+
		"\2\u00a1\u00ac\7#\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00ac\5\30\r\7\u00a4"+
		"\u00a5\7\5\2\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7\7\6\2\2\u00a7\u00ac\3"+
		"\2\2\2\u00a8\u00ac\5\32\16\2\u00a9\u00ac\7%\2\2\u00aa\u00ac\5&\24\2\u00ab"+
		"\u00a0\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a8\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00bb\3\2\2\2\u00ad"+
		"\u00ae\f\13\2\2\u00ae\u00af\7\22\2\2\u00af\u00ba\5\30\r\f\u00b0\u00b1"+
		"\f\n\2\2\u00b1\u00b2\7\23\2\2\u00b2\u00ba\5\30\r\13\u00b3\u00b4\f\t\2"+
		"\2\u00b4\u00b5\7\21\2\2\u00b5\u00ba\5\30\r\n\u00b6\u00b7\f\b\2\2\u00b7"+
		"\u00b8\7\20\2\2\u00b8\u00ba\5\30\r\t\u00b9\u00ad\3\2\2\2\u00b9\u00b0\3"+
		"\2\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00bb\3\2\2"+
		"\2\u00be\u00bf\5\26\f\2\u00bf\u00c0\7\24\2\2\u00c0\u00c1\5\26\f\2\u00c1"+
		"\u00db\3\2\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7\25\2\2\u00c4\u00c5\5"+
		"\26\f\2\u00c5\u00db\3\2\2\2\u00c6\u00c7\5\26\f\2\u00c7\u00c8\7\30\2\2"+
		"\u00c8\u00c9\5\26\f\2\u00c9\u00db\3\2\2\2\u00ca\u00cb\5\26\f\2\u00cb\u00cc"+
		"\7\31\2\2\u00cc\u00cd\5\26\f\2\u00cd\u00db\3\2\2\2\u00ce\u00cf\5\26\f"+
		"\2\u00cf\u00d0\7\22\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00db\3\2\2\2\u00d2"+
		"\u00d3\5\26\f\2\u00d3\u00d4\7\23\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00db"+
		"\3\2\2\2\u00d6\u00d7\7\5\2\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9\7\6\2\2"+
		"\u00d9\u00db\3\2\2\2\u00da\u00be\3\2\2\2\u00da\u00c2\3\2\2\2\u00da\u00c6"+
		"\3\2\2\2\u00da\u00ca\3\2\2\2\u00da\u00ce\3\2\2\2\u00da\u00d2\3\2\2\2\u00da"+
		"\u00d6\3\2\2\2\u00db\33\3\2\2\2\u00dc\u00dd\b\17\1\2\u00dd\u00e1\7&\2"+
		"\2\u00de\u00e1\7%\2\2\u00df\u00e1\5&\24\2\u00e0\u00dc\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00ea\3\2\2\2\u00e2\u00e3\f\6\2\2\u00e3"+
		"\u00e4\7\32\2\2\u00e4\u00e9\5\34\17\7\u00e5\u00e6\f\5\2\2\u00e6\u00e7"+
		"\7\32\2\2\u00e7\u00e9\5\26\f\2\u00e8\u00e2\3\2\2\2\u00e8\u00e5\3\2\2\2"+
		"\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\35"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\13\2\2\u00ee\u00f4\5\26\f\2"+
		"\u00ef\u00f0\7\13\2\2\u00f0\u00f4\5\30\r\2\u00f1\u00f2\7\13\2\2\u00f2"+
		"\u00f4\5\34\17\2\u00f3\u00ed\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f4\37\3\2\2\2\u00f5\u00f6\7\f\2\2\u00f6\u00f7\5\30\r\2\u00f7"+
		"\u00f8\7\t\2\2\u00f8\u00f9\5\4\3\2\u00f9\u00fa\7\n\2\2\u00fa!\3\2\2\2"+
		"\u00fb\u00fc\7\r\2\2\u00fc\u00fd\5\b\5\2\u00fd\u00fe\7\3\2\2\u00fe\u00ff"+
		"\5\30\r\2\u00ff\u0100\7\3\2\2\u0100\u0101\5\26\f\2\u0101\u0102\7\t\2\2"+
		"\u0102\u0103\5\4\3\2\u0103\u0104\7\n\2\2\u0104\u0110\3\2\2\2\u0105\u0106"+
		"\7\r\2\2\u0106\u0107\5\b\5\2\u0107\u0108\7\3\2\2\u0108\u0109\5\30\r\2"+
		"\u0109\u010a\7\3\2\2\u010a\u010b\5\b\5\2\u010b\u010c\7\t\2\2\u010c\u010d"+
		"\5\4\3\2\u010d\u010e\7\n\2\2\u010e\u0110\3\2\2\2\u010f\u00fb\3\2\2\2\u010f"+
		"\u0105\3\2\2\2\u0110#\3\2\2\2\u0111\u0112\7\16\2\2\u0112\u0113\7%\2\2"+
		"\u0113\u0117\7\5\2\2\u0114\u0116\5(\25\2\u0115\u0114\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u011b\7\6\2\2\u011b\u011c\7\t\2\2\u011c\u011d\5\4"+
		"\3\2\u011d\u011e\7\n\2\2\u011e%\3\2\2\2\u011f\u0120\7%\2\2\u0120\u0124"+
		"\7\5\2\2\u0121\u0123\5(\25\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0128\7\6\2\2\u0128\'\3\2\2\2\u0129\u012e\5&\24\2\u012a\u012e"+
		"\5\26\f\2\u012b\u012e\5\30\r\2\u012c\u012e\5\34\17\2\u012d\u0129\3\2\2"+
		"\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e)"+
		"\3\2\2\2\u012f\u0130\7\17\2\2\u0130\u0136\5\26\f\2\u0131\u0132\7\17\2"+
		"\2\u0132\u0136\5\30\r\2\u0133\u0134\7\17\2\2\u0134\u0136\5\34\17\2\u0135"+
		"\u012f\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0133\3\2\2\2\u0136+\3\2\2\2"+
		"\30/\64LWcg\u0086\u009b\u009d\u00ab\u00b9\u00bb\u00da\u00e0\u00e8\u00ea"+
		"\u00f3\u010f\u0117\u0124\u012d\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}