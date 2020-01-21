// Generated from C:/Users/acer/Google Drive/CESAR/3. UNAL/2. MATERIAS/28. LENGUAJES DE PROGRAMACIÓN/StructFile Languaje/src/Languaje/Grammar\StructFileGrammar.g4 by ANTLR 4.7.2
package Languaje.Grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StructFileGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ONELINECOMMENT=1, MULTILINECOMMENT=2, SPACES=3, TK_NUMBER=4, TK_TEXT=5, 
		TK_BOOLEAN=6, TK_FILE=7, TK_LIST=8, TK_TREE=9, TK_GROUP=10, TK_IF=11, 
		TK_ELSE=12, TK_SWITCH=13, TK_BREAK=14, TK_CONTINUE=15, TK_WHILE=16, TK_DO=17, 
		TK_FOR=18, TK_RETURN=19, TK_DOUBLE_QUOTES=20, TK_SIMPLE_QUOTE=21, TK_DOT=22, 
		TK_COLON=23, TK_SEMICOLON=24, TK_COMMA=25, TK_OPEN_BRACKED=26, TK_CLOSE_BRACKED=27, 
		TK_OPEN_BRACES=28, TK_CLOSE_BRACES=29, TK_OPEN_SQUARE_BRACKED=30, TK_CLOSE_SQUARE_BRACKED=31, 
		TK_AND=32, TK_OR=33, TK_NOT=34, TK_GREAT_THAN=35, TK_GREAT_EQUAL_THAN=36, 
		TK_LESS_THAN=37, TK_LESS_EQUAL_THAN=38, TK_EQUAL=39, TK_NOT_EQUAL=40, 
		TK_SUM=41, TK_HIPHEN=42, TK_MULT=43, TK_DIVR=44, TK_DIVI=45, TK_MOD=46, 
		TK_EXP=47, TK_ASIGN=48, TK_DOLLAR=49, TK_DOUBLE_DOLLAR=50, TRUE_VAL=51, 
		FALSE_VAL=52, NUMBER_VAL=53, TEXT_VAL=54, FILE_VAL=55, ID=56, ID_DIR=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ONELINECOMMENT", "MULTILINECOMMENT", "SPACES", "TK_NUMBER", "TK_TEXT", 
			"TK_BOOLEAN", "TK_FILE", "TK_LIST", "TK_TREE", "TK_GROUP", "TK_IF", "TK_ELSE", 
			"TK_SWITCH", "TK_BREAK", "TK_CONTINUE", "TK_WHILE", "TK_DO", "TK_FOR", 
			"TK_RETURN", "TK_DOUBLE_QUOTES", "TK_SIMPLE_QUOTE", "TK_DOT", "TK_COLON", 
			"TK_SEMICOLON", "TK_COMMA", "TK_OPEN_BRACKED", "TK_CLOSE_BRACKED", "TK_OPEN_BRACES", 
			"TK_CLOSE_BRACES", "TK_OPEN_SQUARE_BRACKED", "TK_CLOSE_SQUARE_BRACKED", 
			"TK_AND", "TK_OR", "TK_NOT", "TK_GREAT_THAN", "TK_GREAT_EQUAL_THAN", 
			"TK_LESS_THAN", "TK_LESS_EQUAL_THAN", "TK_EQUAL", "TK_NOT_EQUAL", "TK_SUM", 
			"TK_HIPHEN", "TK_MULT", "TK_DIVR", "TK_DIVI", "TK_MOD", "TK_EXP", "TK_ASIGN", 
			"TK_DOLLAR", "TK_DOUBLE_DOLLAR", "TRUE_VAL", "FALSE_VAL", "NUMBER_VAL", 
			"TEXT_VAL", "FILE_VAL", "ID", "ID_DIR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'num'", "'tex'", "'bol'", "'fil'", "'lis'", 
			"'dir'", "'gro'", "'if'", "'else'", "'switch'", "'break'", "'continue'", 
			"'while'", "'do'", "'for'", "'return'", "'\"'", "'''", "'.'", "':'", 
			"';'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'and'", "'or'", 
			"'not'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'+'", "'-'", 
			"'*'", "'/'", "'//'", "'%'", "'**'", "'='", "'$'", "'$$'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ONELINECOMMENT", "MULTILINECOMMENT", "SPACES", "TK_NUMBER", "TK_TEXT", 
			"TK_BOOLEAN", "TK_FILE", "TK_LIST", "TK_TREE", "TK_GROUP", "TK_IF", "TK_ELSE", 
			"TK_SWITCH", "TK_BREAK", "TK_CONTINUE", "TK_WHILE", "TK_DO", "TK_FOR", 
			"TK_RETURN", "TK_DOUBLE_QUOTES", "TK_SIMPLE_QUOTE", "TK_DOT", "TK_COLON", 
			"TK_SEMICOLON", "TK_COMMA", "TK_OPEN_BRACKED", "TK_CLOSE_BRACKED", "TK_OPEN_BRACES", 
			"TK_CLOSE_BRACES", "TK_OPEN_SQUARE_BRACKED", "TK_CLOSE_SQUARE_BRACKED", 
			"TK_AND", "TK_OR", "TK_NOT", "TK_GREAT_THAN", "TK_GREAT_EQUAL_THAN", 
			"TK_LESS_THAN", "TK_LESS_EQUAL_THAN", "TK_EQUAL", "TK_NOT_EQUAL", "TK_SUM", 
			"TK_HIPHEN", "TK_MULT", "TK_DIVR", "TK_DIVI", "TK_MOD", "TK_EXP", "TK_ASIGN", 
			"TK_DOLLAR", "TK_DOUBLE_DOLLAR", "TRUE_VAL", "FALSE_VAL", "NUMBER_VAL", 
			"TEXT_VAL", "FILE_VAL", "ID", "ID_DIR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public StructFileGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "StructFileGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u017c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\6\2x\n\2\r"+
		"\2\16\2y\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\u0088\n\4"+
		"\r\4\16\4\u0089\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\5\66\u0132\n\66\3\66\3\66\3\66\7\66"+
		"\u0137\n\66\f\66\16\66\u013a\13\66\3\66\6\66\u013d\n\66\r\66\16\66\u013e"+
		"\3\66\3\66\6\66\u0143\n\66\r\66\16\66\u0144\5\66\u0147\n\66\3\67\3\67"+
		"\3\67\3\67\7\67\u014d\n\67\f\67\16\67\u0150\13\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\7\67\u0158\n\67\f\67\16\67\u015b\13\67\3\67\3\67\5\67\u015f"+
		"\n\67\38\38\38\38\38\38\58\u0167\n8\58\u0169\n8\39\39\79\u016d\n9\f9\16"+
		"9\u0170\139\3:\3:\6:\u0174\n:\r:\16:\u0175\3:\3:\3:\5:\u017b\n:\2\2;\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;\3\2\16\3\2\f\f\5\2\13\f\17\17\"\"\3\2\62\62\3\2\63;\3\2\62;\3\2\60"+
		"\60\3\2$$\b\2$$ddhhppttvv\3\2))\b\2))ddhhppttvv\5\2C\\aac|\6\2\62;C\\"+
		"aac|\2\u018d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5}\3\2\2\2\7"+
		"\u0087\3\2\2\2\t\u008d\3\2\2\2\13\u0091\3\2\2\2\r\u0095\3\2\2\2\17\u0099"+
		"\3\2\2\2\21\u009d\3\2\2\2\23\u00a1\3\2\2\2\25\u00a5\3\2\2\2\27\u00a9\3"+
		"\2\2\2\31\u00ac\3\2\2\2\33\u00b1\3\2\2\2\35\u00b8\3\2\2\2\37\u00be\3\2"+
		"\2\2!\u00c7\3\2\2\2#\u00cd\3\2\2\2%\u00d0\3\2\2\2\'\u00d4\3\2\2\2)\u00db"+
		"\3\2\2\2+\u00dd\3\2\2\2-\u00df\3\2\2\2/\u00e1\3\2\2\2\61\u00e3\3\2\2\2"+
		"\63\u00e5\3\2\2\2\65\u00e7\3\2\2\2\67\u00e9\3\2\2\29\u00eb\3\2\2\2;\u00ed"+
		"\3\2\2\2=\u00ef\3\2\2\2?\u00f1\3\2\2\2A\u00f3\3\2\2\2C\u00f7\3\2\2\2E"+
		"\u00fa\3\2\2\2G\u00fe\3\2\2\2I\u0100\3\2\2\2K\u0103\3\2\2\2M\u0105\3\2"+
		"\2\2O\u0108\3\2\2\2Q\u010b\3\2\2\2S\u010e\3\2\2\2U\u0110\3\2\2\2W\u0112"+
		"\3\2\2\2Y\u0114\3\2\2\2[\u0116\3\2\2\2]\u0119\3\2\2\2_\u011b\3\2\2\2a"+
		"\u011e\3\2\2\2c\u0120\3\2\2\2e\u0122\3\2\2\2g\u0125\3\2\2\2i\u012a\3\2"+
		"\2\2k\u0146\3\2\2\2m\u015e\3\2\2\2o\u0160\3\2\2\2q\u016a\3\2\2\2s\u017a"+
		"\3\2\2\2uw\7%\2\2vx\n\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{"+
		"\3\2\2\2{|\b\2\2\2|\4\3\2\2\2}~\7\61\2\2~\177\7,\2\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\n\2\2\2\u0081\u0082\7,\2\2\u0082\u0083\7\61\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\b\3\2\2\u0085\6\3\2\2\2\u0086\u0088\t\3\2\2\u0087"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\4\2\2\u008c\b\3\2\2\2\u008d\u008e"+
		"\7p\2\2\u008e\u008f\7w\2\2\u008f\u0090\7o\2\2\u0090\n\3\2\2\2\u0091\u0092"+
		"\7v\2\2\u0092\u0093\7g\2\2\u0093\u0094\7z\2\2\u0094\f\3\2\2\2\u0095\u0096"+
		"\7d\2\2\u0096\u0097\7q\2\2\u0097\u0098\7n\2\2\u0098\16\3\2\2\2\u0099\u009a"+
		"\7h\2\2\u009a\u009b\7k\2\2\u009b\u009c\7n\2\2\u009c\20\3\2\2\2\u009d\u009e"+
		"\7n\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7u\2\2\u00a0\22\3\2\2\2\u00a1\u00a2"+
		"\7f\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7t\2\2\u00a4\24\3\2\2\2\u00a5\u00a6"+
		"\7i\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7q\2\2\u00a8\26\3\2\2\2\u00a9\u00aa"+
		"\7k\2\2\u00aa\u00ab\7h\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7g\2\2\u00b0\32\3\2\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7v\2\2\u00b5"+
		"\u00b6\7e\2\2\u00b6\u00b7\7j\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7d\2\2\u00b9"+
		"\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7m\2\2"+
		"\u00bd\36\3\2\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7"+
		"p\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5"+
		"\7w\2\2\u00c5\u00c6\7g\2\2\u00c6 \3\2\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9"+
		"\7j\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\"\3\2\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7q\2\2\u00cf$\3\2\2\2\u00d0"+
		"\u00d1\7h\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7t\2\2\u00d3&\3\2\2\2\u00d4"+
		"\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7w\2\2"+
		"\u00d8\u00d9\7t\2\2\u00d9\u00da\7p\2\2\u00da(\3\2\2\2\u00db\u00dc\7$\2"+
		"\2\u00dc*\3\2\2\2\u00dd\u00de\7)\2\2\u00de,\3\2\2\2\u00df\u00e0\7\60\2"+
		"\2\u00e0.\3\2\2\2\u00e1\u00e2\7<\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\7=\2"+
		"\2\u00e4\62\3\2\2\2\u00e5\u00e6\7.\2\2\u00e6\64\3\2\2\2\u00e7\u00e8\7"+
		"*\2\2\u00e8\66\3\2\2\2\u00e9\u00ea\7+\2\2\u00ea8\3\2\2\2\u00eb\u00ec\7"+
		"}\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7\177\2\2\u00ee<\3\2\2\2\u00ef\u00f0"+
		"\7]\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7_\2\2\u00f2@\3\2\2\2\u00f3\u00f4\7"+
		"c\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7f\2\2\u00f6B\3\2\2\2\u00f7\u00f8"+
		"\7q\2\2\u00f8\u00f9\7t\2\2\u00f9D\3\2\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7v\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7@\2\2\u00ffH\3"+
		"\2\2\2\u0100\u0101\7@\2\2\u0101\u0102\7?\2\2\u0102J\3\2\2\2\u0103\u0104"+
		"\7>\2\2\u0104L\3\2\2\2\u0105\u0106\7>\2\2\u0106\u0107\7?\2\2\u0107N\3"+
		"\2\2\2\u0108\u0109\7?\2\2\u0109\u010a\7?\2\2\u010aP\3\2\2\2\u010b\u010c"+
		"\7#\2\2\u010c\u010d\7?\2\2\u010dR\3\2\2\2\u010e\u010f\7-\2\2\u010fT\3"+
		"\2\2\2\u0110\u0111\7/\2\2\u0111V\3\2\2\2\u0112\u0113\7,\2\2\u0113X\3\2"+
		"\2\2\u0114\u0115\7\61\2\2\u0115Z\3\2\2\2\u0116\u0117\7\61\2\2\u0117\u0118"+
		"\7\61\2\2\u0118\\\3\2\2\2\u0119\u011a\7\'\2\2\u011a^\3\2\2\2\u011b\u011c"+
		"\7,\2\2\u011c\u011d\7,\2\2\u011d`\3\2\2\2\u011e\u011f\7?\2\2\u011fb\3"+
		"\2\2\2\u0120\u0121\7&\2\2\u0121d\3\2\2\2\u0122\u0123\7&\2\2\u0123\u0124"+
		"\7&\2\2\u0124f\3\2\2\2\u0125\u0126\7v\2\2\u0126\u0127\7t\2\2\u0127\u0128"+
		"\7w\2\2\u0128\u0129\7g\2\2\u0129h\3\2\2\2\u012a\u012b\7h\2\2\u012b\u012c"+
		"\7c\2\2\u012c\u012d\7n\2\2\u012d\u012e\7u\2\2\u012e\u012f\7g\2\2\u012f"+
		"j\3\2\2\2\u0130\u0132\5U+\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0147\t\4\2\2\u0134\u0138\t\5\2\2\u0135\u0137\t\6"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u0147\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013d\t\6"+
		"\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\t\7\2\2\u0141\u0143\t\6"+
		"\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0131\3\2\2\2\u0146\u0134\3\2"+
		"\2\2\u0146\u013c\3\2\2\2\u0147l\3\2\2\2\u0148\u014e\5)\25\2\u0149\u014d"+
		"\n\b\2\2\u014a\u014b\7^\2\2\u014b\u014d\t\t\2\2\u014c\u0149\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\5)\25\2\u0152"+
		"\u015f\3\2\2\2\u0153\u0159\5+\26\2\u0154\u0158\n\n\2\2\u0155\u0156\7^"+
		"\2\2\u0156\u0158\t\13\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015c\u015d\5+\26\2\u015d\u015f\3\2\2\2\u015e"+
		"\u0148\3\2\2\2\u015e\u0153\3\2\2\2\u015fn\3\2\2\2\u0160\u0161\5-\27\2"+
		"\u0161\u0168\5s:\2\u0162\u0166\5s:\2\u0163\u0164\5-\27\2\u0164\u0165\5"+
		"m\67\2\u0165\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0169\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0169\3\2\2\2\u0169p\3\2\2\2"+
		"\u016a\u016e\t\f\2\2\u016b\u016d\t\r\2\2\u016c\u016b\3\2\2\2\u016d\u0170"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016fr\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0173\5-\27\2\u0172\u0174\t\r\2\2\u0173\u0172\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u017b\3\2\2\2\u0177\u0178\5-\27\2\u0178\u0179\5m\67\2\u0179\u017b\3\2"+
		"\2\2\u017a\u0171\3\2\2\2\u017a\u0177\3\2\2\2\u017bt\3\2\2\2\24\2y\u0089"+
		"\u0131\u0138\u013e\u0144\u0146\u014c\u014e\u0157\u0159\u015e\u0166\u0168"+
		"\u016e\u0175\u017a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}