// Generated from ComS319Language.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ComS319LanguageLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "If", "Else", "Do", "End", "Print", "While", 
		"For", "Func", "Return", "OR", "AND", "EQ", "NEQ", "GTE", "LTE", "Pow", 
		"NOT", "GT", "LT", "ADD", "SUB", "MULT", "DIV", "MOD", "INC", "DEC", "INCEQ", 
		"DECEQ", "Bool", "Number", "Variable", "String", "Comment", "Space", "Int", 
		"Digit"
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


	public ComS319LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ComS319Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00c0\n\"\3#\3#\3"+
		"#\7#\u00c5\n#\f#\16#\u00c8\13#\5#\u00ca\n#\3$\3$\7$\u00ce\n$\f$\16$\u00d1"+
		"\13$\3%\3%\3%\3%\3%\3%\7%\u00d9\n%\f%\16%\u00dc\13%\3%\3%\3&\3&\7&\u00e2"+
		"\n&\f&\16&\u00e5\13&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\7(\u00ef\n(\f(\16(\u00f2"+
		"\13(\3(\5(\u00f5\n(\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O\2Q\2\3\2\n\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\3\2$$\5\2\f\f\17\17$$\4\2\f\f\17\17\5\2\13\f\16\17"+
		"\"\"\3\2\63;\3\2\62;\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3S\3\2\2\2"+
		"\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r^\3\2\2\2\17c\3\2\2\2\21"+
		"f\3\2\2\2\23j\3\2\2\2\25p\3\2\2\2\27v\3\2\2\2\31z\3\2\2\2\33\177\3\2\2"+
		"\2\35\u0086\3\2\2\2\37\u0089\3\2\2\2!\u008c\3\2\2\2#\u008f\3\2\2\2%\u0092"+
		"\3\2\2\2\'\u0095\3\2\2\2)\u0098\3\2\2\2+\u009a\3\2\2\2-\u009c\3\2\2\2"+
		"/\u009e\3\2\2\2\61\u00a0\3\2\2\2\63\u00a2\3\2\2\2\65\u00a4\3\2\2\2\67"+
		"\u00a6\3\2\2\29\u00a8\3\2\2\2;\u00aa\3\2\2\2=\u00ad\3\2\2\2?\u00b0\3\2"+
		"\2\2A\u00b3\3\2\2\2C\u00bf\3\2\2\2E\u00c1\3\2\2\2G\u00cb\3\2\2\2I\u00d2"+
		"\3\2\2\2K\u00df\3\2\2\2M\u00e8\3\2\2\2O\u00f4\3\2\2\2Q\u00f6\3\2\2\2S"+
		"T\7=\2\2T\4\3\2\2\2UV\7?\2\2V\6\3\2\2\2WX\7*\2\2X\b\3\2\2\2YZ\7+\2\2Z"+
		"\n\3\2\2\2[\\\7k\2\2\\]\7h\2\2]\f\3\2\2\2^_\7g\2\2_`\7n\2\2`a\7u\2\2a"+
		"b\7g\2\2b\16\3\2\2\2cd\7f\2\2de\7q\2\2e\20\3\2\2\2fg\7g\2\2gh\7p\2\2h"+
		"i\7f\2\2i\22\3\2\2\2jk\7r\2\2kl\7t\2\2lm\7k\2\2mn\7p\2\2no\7v\2\2o\24"+
		"\3\2\2\2pq\7y\2\2qr\7j\2\2rs\7k\2\2st\7n\2\2tu\7g\2\2u\26\3\2\2\2vw\7"+
		"h\2\2wx\7q\2\2xy\7t\2\2y\30\3\2\2\2z{\7h\2\2{|\7w\2\2|}\7p\2\2}~\7e\2"+
		"\2~\32\3\2\2\2\177\u0080\7t\2\2\u0080\u0081\7g\2\2\u0081\u0082\7v\2\2"+
		"\u0082\u0083\7w\2\2\u0083\u0084\7t\2\2\u0084\u0085\7p\2\2\u0085\34\3\2"+
		"\2\2\u0086\u0087\7~\2\2\u0087\u0088\7~\2\2\u0088\36\3\2\2\2\u0089\u008a"+
		"\7(\2\2\u008a\u008b\7(\2\2\u008b \3\2\2\2\u008c\u008d\7?\2\2\u008d\u008e"+
		"\7?\2\2\u008e\"\3\2\2\2\u008f\u0090\7#\2\2\u0090\u0091\7?\2\2\u0091$\3"+
		"\2\2\2\u0092\u0093\7@\2\2\u0093\u0094\7?\2\2\u0094&\3\2\2\2\u0095\u0096"+
		"\7>\2\2\u0096\u0097\7?\2\2\u0097(\3\2\2\2\u0098\u0099\7`\2\2\u0099*\3"+
		"\2\2\2\u009a\u009b\7#\2\2\u009b,\3\2\2\2\u009c\u009d\7@\2\2\u009d.\3\2"+
		"\2\2\u009e\u009f\7>\2\2\u009f\60\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1\62\3"+
		"\2\2\2\u00a2\u00a3\7/\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7,\2\2\u00a5\66"+
		"\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a78\3\2\2\2\u00a8\u00a9\7\'\2\2\u00a9"+
		":\3\2\2\2\u00aa\u00ab\7-\2\2\u00ab\u00ac\7-\2\2\u00ac<\3\2\2\2\u00ad\u00ae"+
		"\7/\2\2\u00ae\u00af\7/\2\2\u00af>\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\u00b2"+
		"\7?\2\2\u00b2@\3\2\2\2\u00b3\u00b4\7/\2\2\u00b4\u00b5\7?\2\2\u00b5B\3"+
		"\2\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7w\2\2\u00b9"+
		"\u00c0\7g\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7n\2\2"+
		"\u00bd\u00be\7u\2\2\u00be\u00c0\7g\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00ba"+
		"\3\2\2\2\u00c0D\3\2\2\2\u00c1\u00c9\5O(\2\u00c2\u00c6\7\60\2\2\u00c3\u00c5"+
		"\5Q)\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c2\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00caF\3\2\2\2\u00cb\u00cf\t\2\2\2\u00cc\u00ce"+
		"\t\3\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0H\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00da\t\4\2\2"+
		"\u00d3\u00d9\n\5\2\2\u00d4\u00d5\7^\2\2\u00d5\u00d9\7^\2\2\u00d6\u00d7"+
		"\7^\2\2\u00d7\u00d9\7$\2\2\u00d8\u00d3\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\t\4\2\2\u00de"+
		"J\3\2\2\2\u00df\u00e3\7%\2\2\u00e0\u00e2\n\6\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\b&\2\2\u00e7L\3\2\2\2\u00e8\u00e9"+
		"\t\7\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\'\2\2\u00ebN\3\2\2\2\u00ec"+
		"\u00f0\t\b\2\2\u00ed\u00ef\5Q)\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2\2"+
		"\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5\3\2\2\2\u00f2\u00f0"+
		"\3\2\2\2\u00f3\u00f5\7\62\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00f3\3\2\2\2"+
		"\u00f5P\3\2\2\2\u00f6\u00f7\t\t\2\2\u00f7R\3\2\2\2\f\2\u00bf\u00c6\u00c9"+
		"\u00cf\u00d8\u00da\u00e3\u00f0\u00f4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}