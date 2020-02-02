// Generated from C:/Users/acer/Google Drive/CESAR/6. PORTAFOLIO/StructFile/StructFile/src/Languaje/Grammar\StructFileGrammar.g4 by ANTLR 4.7.2
package Languaje.Grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StructFileGrammarParser extends Parser {
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
		TK_SUM=41, TK_HIPHEN=42, TK_MULT=43, TK_DIVR=44, TK_MOD=45, TK_EXP=46, 
		TK_DIVI=47, TK_ASIGN=48, TK_DOLLAR=49, TK_DOUBLE_DOLLAR=50, TRUE_VAL=51, 
		FALSE_VAL=52, NUMBER_VAL=53, TEXT_VAL=54, FILE_VAL=55, ID=56, ID_DIR=57;
	public static final int
		RULE_init = 0, RULE_content = 1, RULE_tk_semicolon = 2, RULE_variableDef = 3, 
		RULE_type = 4, RULE_number = 5, RULE_boolean_ = 6, RULE_text_ = 7, RULE_file = 8, 
		RULE_list = 9, RULE_tree_ = 10, RULE_group = 11, RULE_id_variable = 12, 
		RULE_variableAsign = 13, RULE_tk_asign = 14, RULE_functionDef = 15, RULE_return_ = 16, 
		RULE_id_function = 17, RULE_tk_open_bracked = 18, RULE_parameters = 19, 
		RULE_add_variableDef = 20, RULE_tk_close_bracked = 21, RULE_tk_open_braces = 22, 
		RULE_functionContent = 23, RULE_add_functionContent = 24, RULE_tk_close_braces = 25, 
		RULE_functionCall = 26, RULE_call_parameters = 27, RULE_add_expression = 28, 
		RULE_structures = 29, RULE_if_ = 30, RULE_tk_if = 31, RULE_ifContent = 32, 
		RULE_add_ifContent = 33, RULE_else_ = 34, RULE_tk_else = 35, RULE_else_ifContent = 36, 
		RULE_add_else_ifContent = 37, RULE_switch_ = 38, RULE_tk_switch = 39, 
		RULE_caseContent = 40, RULE_add_caseContent = 41, RULE_case_ = 42, RULE_switchContent = 43, 
		RULE_add_switchContent = 44, RULE_default_ = 45, RULE_while_ = 46, RULE_tk_while = 47, 
		RULE_whileContent = 48, RULE_add_whileContent = 49, RULE_do_while = 50, 
		RULE_tk_do = 51, RULE_do_whileContent = 52, RULE_add_do_whileContent = 53, 
		RULE_for_ = 54, RULE_tk_for = 55, RULE_for_rules = 56, RULE_forContent = 57, 
		RULE_add_forContent = 58, RULE_return_call = 59, RULE_add_content = 60, 
		RULE_end = 61, RULE_value = 62, RULE_number_val = 63, RULE_text_val = 64, 
		RULE_boolean_val = 65, RULE_expression = 66, RULE_tk_and = 67, RULE_tk_or = 68, 
		RULE_tk_not = 69, RULE_tk_comparator = 70, RULE_tk_great_than = 71, RULE_tk_great_equal_than = 72, 
		RULE_tk_less_than = 73, RULE_tk_less_equal_than = 74, RULE_tk_equal = 75, 
		RULE_tk_not_equal = 76, RULE_tk_operator = 77, RULE_tk_sum = 78, RULE_tk_minus = 79, 
		RULE_tk_mult = 80, RULE_tk_divr = 81, RULE_tk_divi = 82, RULE_tk_mod = 83, 
		RULE_tk_exp = 84, RULE_tree_val = 85, RULE_id_dir = 86, RULE_tk_colon = 87, 
		RULE_direction = 88, RULE_file_or_division = 89, RULE_division = 90, RULE_tk_open_square_bracked = 91, 
		RULE_add_directions = 92, RULE_tk_comma = 93, RULE_tk_close_square_bracked = 94, 
		RULE_file_val = 95, RULE_group_val = 96, RULE_set_group = 97, RULE_add_group_vals = 98, 
		RULE_list_val = 99, RULE_add_expressions = 100, RULE_value_extras = 101, 
		RULE_method_reference = 102, RULE_separator = 103, RULE_tk_dollar = 104, 
		RULE_tk_double_dollar = 105, RULE_default_call = 106, RULE_id_function2 = 107, 
		RULE_call_default_parameters = 108, RULE_add_default_expression = 109;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "content", "tk_semicolon", "variableDef", "type", "number", "boolean_", 
			"text_", "file", "list", "tree_", "group", "id_variable", "variableAsign", 
			"tk_asign", "functionDef", "return_", "id_function", "tk_open_bracked", 
			"parameters", "add_variableDef", "tk_close_bracked", "tk_open_braces", 
			"functionContent", "add_functionContent", "tk_close_braces", "functionCall", 
			"call_parameters", "add_expression", "structures", "if_", "tk_if", "ifContent", 
			"add_ifContent", "else_", "tk_else", "else_ifContent", "add_else_ifContent", 
			"switch_", "tk_switch", "caseContent", "add_caseContent", "case_", "switchContent", 
			"add_switchContent", "default_", "while_", "tk_while", "whileContent", 
			"add_whileContent", "do_while", "tk_do", "do_whileContent", "add_do_whileContent", 
			"for_", "tk_for", "for_rules", "forContent", "add_forContent", "return_call", 
			"add_content", "end", "value", "number_val", "text_val", "boolean_val", 
			"expression", "tk_and", "tk_or", "tk_not", "tk_comparator", "tk_great_than", 
			"tk_great_equal_than", "tk_less_than", "tk_less_equal_than", "tk_equal", 
			"tk_not_equal", "tk_operator", "tk_sum", "tk_minus", "tk_mult", "tk_divr", 
			"tk_divi", "tk_mod", "tk_exp", "tree_val", "id_dir", "tk_colon", "direction", 
			"file_or_division", "division", "tk_open_square_bracked", "add_directions", 
			"tk_comma", "tk_close_square_bracked", "file_val", "group_val", "set_group", 
			"add_group_vals", "list_val", "add_expressions", "value_extras", "method_reference", 
			"separator", "tk_dollar", "tk_double_dollar", "default_call", "id_function2", 
			"call_default_parameters", "add_default_expression"
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
			"'*'", "'/'", "'%'", "'^'", "'/_'", "'='", "'$'", "'$$'", "'true'", "'false'"
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
			"TK_HIPHEN", "TK_MULT", "TK_DIVR", "TK_MOD", "TK_EXP", "TK_DIVI", "TK_ASIGN", 
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

	@Override
	public String getGrammarFileName() { return "StructFileGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StructFileGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_contentContext add_content() {
			return getRuleContext(Add_contentContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_NUMBER) | (1L << TK_TEXT) | (1L << TK_BOOLEAN) | (1L << TK_FILE) | (1L << TK_LIST) | (1L << TK_TREE) | (1L << TK_GROUP) | (1L << TK_IF) | (1L << TK_SWITCH) | (1L << TK_WHILE) | (1L << TK_DO) | (1L << TK_FOR) | (1L << TK_RETURN) | (1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(220);
				content();
				setState(221);
				add_content();
				}
			}

			setState(225);
			end();
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

	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Content7Context extends ContentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public Content7Context(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterContent7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitContent7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitContent7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Content6Context extends ContentContext {
		public Return_callContext return_call() {
			return getRuleContext(Return_callContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public Content6Context(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterContent6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitContent6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitContent6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Content5Context extends ContentContext {
		public StructuresContext structures() {
			return getRuleContext(StructuresContext.class,0);
		}
		public Content5Context(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterContent5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitContent5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitContent5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Content4Context extends ContentContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public Content4Context(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterContent4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitContent4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitContent4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Content3Context extends ContentContext {
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public Content3Context(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterContent3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitContent3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitContent3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Content2Context extends ContentContext {
		public VariableAsignContext variableAsign() {
			return getRuleContext(VariableAsignContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public Content2Context(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterContent2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitContent2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitContent2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Content1Context extends ContentContext {
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public Tk_semicolonContext tk_semicolon() {
			return getRuleContext(Tk_semicolonContext.class,0);
		}
		public Content1Context(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterContent1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitContent1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitContent1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_content);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Content1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				variableDef();
				setState(228);
				tk_semicolon();
				}
				break;
			case 2:
				_localctx = new Content2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				variableAsign();
				setState(231);
				tk_semicolon();
				}
				break;
			case 3:
				_localctx = new Content3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				functionDef();
				}
				break;
			case 4:
				_localctx = new Content4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				functionCall();
				setState(235);
				tk_semicolon();
				}
				break;
			case 5:
				_localctx = new Content5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(237);
				structures();
				}
				break;
			case 6:
				_localctx = new Content6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				return_call();
				setState(239);
				tk_semicolon();
				}
				break;
			case 7:
				_localctx = new Content7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(241);
				expression(0);
				setState(242);
				tk_semicolon();
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

	public static class Tk_semicolonContext extends ParserRuleContext {
		public TerminalNode TK_SEMICOLON() { return getToken(StructFileGrammarParser.TK_SEMICOLON, 0); }
		public Tk_semicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_semicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_semicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_semicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_semicolonContext tk_semicolon() throws RecognitionException {
		Tk_semicolonContext _localctx = new Tk_semicolonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tk_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(TK_SEMICOLON);
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

	public static class VariableDefContext extends ParserRuleContext {
		public VariableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDef; }
	 
		public VariableDefContext() { }
		public void copyFrom(VariableDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDef2Context extends VariableDefContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableAsignContext variableAsign() {
			return getRuleContext(VariableAsignContext.class,0);
		}
		public VariableDef2Context(VariableDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterVariableDef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitVariableDef2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitVariableDef2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableDef1Context extends VariableDefContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_variableContext id_variable() {
			return getRuleContext(Id_variableContext.class,0);
		}
		public VariableDef1Context(VariableDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterVariableDef1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitVariableDef1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitVariableDef1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefContext variableDef() throws RecognitionException {
		VariableDefContext _localctx = new VariableDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDef);
		try {
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VariableDef1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				type();
				setState(249);
				id_variable();
				}
				break;
			case 2:
				_localctx = new VariableDef2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				type();
				setState(252);
				variableAsign();
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

	public static class TypeContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Boolean_Context boolean_() {
			return getRuleContext(Boolean_Context.class,0);
		}
		public Text_Context text_() {
			return getRuleContext(Text_Context.class,0);
		}
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Tree_Context tree_() {
			return getRuleContext(Tree_Context.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				boolean_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				text_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				file();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(261);
				tree_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				group();
				setState(263);
				number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				group();
				setState(266);
				boolean_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(268);
				group();
				setState(269);
				text_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				group();
				setState(272);
				file();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(274);
				group();
				setState(275);
				list();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(277);
				group();
				setState(278);
				tree_();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode TK_NUMBER() { return getToken(StructFileGrammarParser.TK_NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(TK_NUMBER);
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

	public static class Boolean_Context extends ParserRuleContext {
		public TerminalNode TK_BOOLEAN() { return getToken(StructFileGrammarParser.TK_BOOLEAN, 0); }
		public Boolean_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterBoolean_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitBoolean_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitBoolean_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_Context boolean_() throws RecognitionException {
		Boolean_Context _localctx = new Boolean_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_boolean_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(TK_BOOLEAN);
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

	public static class Text_Context extends ParserRuleContext {
		public TerminalNode TK_TEXT() { return getToken(StructFileGrammarParser.TK_TEXT, 0); }
		public Text_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterText_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitText_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitText_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_Context text_() throws RecognitionException {
		Text_Context _localctx = new Text_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_text_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(TK_TEXT);
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode TK_FILE() { return getToken(StructFileGrammarParser.TK_FILE, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(TK_FILE);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode TK_LIST() { return getToken(StructFileGrammarParser.TK_LIST, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(TK_LIST);
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

	public static class Tree_Context extends ParserRuleContext {
		public TerminalNode TK_TREE() { return getToken(StructFileGrammarParser.TK_TREE, 0); }
		public Tree_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTree_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTree_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTree_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tree_Context tree_() throws RecognitionException {
		Tree_Context _localctx = new Tree_Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_tree_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(TK_TREE);
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

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode TK_GROUP() { return getToken(StructFileGrammarParser.TK_GROUP, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(TK_GROUP);
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

	public static class Id_variableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StructFileGrammarParser.ID, 0); }
		public Id_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterId_variable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitId_variable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitId_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_variableContext id_variable() throws RecognitionException {
		Id_variableContext _localctx = new Id_variableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_id_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
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

	public static class VariableAsignContext extends ParserRuleContext {
		public Id_variableContext id_variable() {
			return getRuleContext(Id_variableContext.class,0);
		}
		public Tk_asignContext tk_asign() {
			return getRuleContext(Tk_asignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAsign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterVariableAsign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitVariableAsign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitVariableAsign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAsignContext variableAsign() throws RecognitionException {
		VariableAsignContext _localctx = new VariableAsignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableAsign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			id_variable();
			setState(299);
			tk_asign();
			setState(300);
			expression(0);
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

	public static class Tk_asignContext extends ParserRuleContext {
		public TerminalNode TK_ASIGN() { return getToken(StructFileGrammarParser.TK_ASIGN, 0); }
		public Tk_asignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_asign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_asign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_asign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_asign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_asignContext tk_asign() throws RecognitionException {
		Tk_asignContext _localctx = new Tk_asignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tk_asign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(TK_ASIGN);
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

	public static class FunctionDefContext extends ParserRuleContext {
		public Id_functionContext id_function;
		public Return_Context return_() {
			return getRuleContext(Return_Context.class,0);
		}
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public Tk_open_brackedContext tk_open_bracked() {
			return getRuleContext(Tk_open_brackedContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Tk_close_brackedContext tk_close_bracked() {
			return getRuleContext(Tk_close_brackedContext.class,0);
		}
		public Tk_open_bracesContext tk_open_braces() {
			return getRuleContext(Tk_open_bracesContext.class,0);
		}
		public FunctionContentContext functionContent() {
			return getRuleContext(FunctionContentContext.class,0);
		}
		public Tk_close_bracesContext tk_close_braces() {
			return getRuleContext(Tk_close_bracesContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			return_();
			setState(305);
			((FunctionDefContext)_localctx).id_function = id_function();
			setState(306);
			tk_open_bracked();
			setState(307);
			parameters((((FunctionDefContext)_localctx).id_function!=null?_input.getText(((FunctionDefContext)_localctx).id_function.start,((FunctionDefContext)_localctx).id_function.stop):null));
			setState(308);
			tk_close_bracked();
			setState(309);
			tk_open_braces();
			setState(310);
			functionContent();
			setState(311);
			tk_close_braces();
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

	public static class Return_Context extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Return_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterReturn_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitReturn_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitReturn_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_Context return_() throws RecognitionException {
		Return_Context _localctx = new Return_Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_return_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			type();
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

	public static class Id_functionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StructFileGrammarParser.ID, 0); }
		public Id_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterId_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitId_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitId_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_functionContext id_function() throws RecognitionException {
		Id_functionContext _localctx = new Id_functionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_id_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
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

	public static class Tk_open_brackedContext extends ParserRuleContext {
		public TerminalNode TK_OPEN_BRACKED() { return getToken(StructFileGrammarParser.TK_OPEN_BRACKED, 0); }
		public Tk_open_brackedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_open_bracked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_open_bracked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_open_bracked(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_open_bracked(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_open_brackedContext tk_open_bracked() throws RecognitionException {
		Tk_open_brackedContext _localctx = new Tk_open_brackedContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tk_open_bracked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(TK_OPEN_BRACKED);
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

	public static class ParametersContext extends ParserRuleContext {
		public String id_function_;
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public Add_variableDefContext add_variableDef() {
			return getRuleContext(Add_variableDefContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ParametersContext(ParserRuleContext parent, int invokingState, String id_function_) {
			super(parent, invokingState);
			this.id_function_ = id_function_;
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters(String id_function_) throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState(), id_function_);
		enterRule(_localctx, 38, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_NUMBER) | (1L << TK_TEXT) | (1L << TK_BOOLEAN) | (1L << TK_FILE) | (1L << TK_LIST) | (1L << TK_TREE) | (1L << TK_GROUP))) != 0)) {
				{
				setState(319);
				variableDef();
				setState(320);
				add_variableDef(_localctx.id_function_, 1);
				}
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

	public static class Add_variableDefContext extends ParserRuleContext {
		public String id_function_;
		public int cont;
		public TerminalNode TK_COMMA() { return getToken(StructFileGrammarParser.TK_COMMA, 0); }
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public Add_variableDefContext add_variableDef() {
			return getRuleContext(Add_variableDefContext.class,0);
		}
		public Add_variableDefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Add_variableDefContext(ParserRuleContext parent, int invokingState, String id_function_, int cont) {
			super(parent, invokingState);
			this.id_function_ = id_function_;
			this.cont = cont;
		}
		@Override public int getRuleIndex() { return RULE_add_variableDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_variableDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_variableDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_variableDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_variableDefContext add_variableDef(String id_function_,int cont) throws RecognitionException {
		Add_variableDefContext _localctx = new Add_variableDefContext(_ctx, getState(), id_function_, cont);
		enterRule(_localctx, 40, RULE_add_variableDef);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(TK_COMMA);
				setState(325);
				variableDef();
				setState(326);
				add_variableDef(_localctx.id_function_, _localctx.cont + 1);
				}
				break;
			case TK_CLOSE_BRACKED:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tk_close_brackedContext extends ParserRuleContext {
		public TerminalNode TK_CLOSE_BRACKED() { return getToken(StructFileGrammarParser.TK_CLOSE_BRACKED, 0); }
		public Tk_close_brackedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_close_bracked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_close_bracked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_close_bracked(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_close_bracked(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_close_brackedContext tk_close_bracked() throws RecognitionException {
		Tk_close_brackedContext _localctx = new Tk_close_brackedContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tk_close_bracked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(TK_CLOSE_BRACKED);
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

	public static class Tk_open_bracesContext extends ParserRuleContext {
		public TerminalNode TK_OPEN_BRACES() { return getToken(StructFileGrammarParser.TK_OPEN_BRACES, 0); }
		public Tk_open_bracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_open_braces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_open_braces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_open_braces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_open_braces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_open_bracesContext tk_open_braces() throws RecognitionException {
		Tk_open_bracesContext _localctx = new Tk_open_bracesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tk_open_braces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(TK_OPEN_BRACES);
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

	public static class FunctionContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_functionContentContext add_functionContent() {
			return getRuleContext(Add_functionContentContext.class,0);
		}
		public FunctionContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterFunctionContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitFunctionContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitFunctionContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContentContext functionContent() throws RecognitionException {
		FunctionContentContext _localctx = new FunctionContentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_NUMBER) | (1L << TK_TEXT) | (1L << TK_BOOLEAN) | (1L << TK_FILE) | (1L << TK_LIST) | (1L << TK_TREE) | (1L << TK_GROUP) | (1L << TK_IF) | (1L << TK_SWITCH) | (1L << TK_WHILE) | (1L << TK_DO) | (1L << TK_FOR) | (1L << TK_RETURN) | (1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(335);
				content();
				setState(336);
				add_functionContent();
				}
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

	public static class Add_functionContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_functionContentContext add_functionContent() {
			return getRuleContext(Add_functionContentContext.class,0);
		}
		public Add_functionContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_functionContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_functionContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_functionContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_functionContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_functionContentContext add_functionContent() throws RecognitionException {
		Add_functionContentContext _localctx = new Add_functionContentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_add_functionContent);
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMBER:
			case TK_TEXT:
			case TK_BOOLEAN:
			case TK_FILE:
			case TK_LIST:
			case TK_TREE:
			case TK_GROUP:
			case TK_IF:
			case TK_SWITCH:
			case TK_WHILE:
			case TK_DO:
			case TK_FOR:
			case TK_RETURN:
			case TK_OPEN_BRACKED:
			case TK_OPEN_BRACES:
			case TK_OPEN_SQUARE_BRACKED:
			case TK_NOT:
			case TRUE_VAL:
			case FALSE_VAL:
			case NUMBER_VAL:
			case TEXT_VAL:
			case FILE_VAL:
			case ID:
			case ID_DIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				content();
				setState(341);
				add_functionContent();
				}
				break;
			case TK_CLOSE_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tk_close_bracesContext extends ParserRuleContext {
		public TerminalNode TK_CLOSE_BRACES() { return getToken(StructFileGrammarParser.TK_CLOSE_BRACES, 0); }
		public Tk_close_bracesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_close_braces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_close_braces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_close_braces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_close_braces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_close_bracesContext tk_close_braces() throws RecognitionException {
		Tk_close_bracesContext _localctx = new Tk_close_bracesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tk_close_braces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(TK_CLOSE_BRACES);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public Id_functionContext id_function;
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public Tk_open_brackedContext tk_open_bracked() {
			return getRuleContext(Tk_open_brackedContext.class,0);
		}
		public Call_parametersContext call_parameters() {
			return getRuleContext(Call_parametersContext.class,0);
		}
		public Tk_close_brackedContext tk_close_bracked() {
			return getRuleContext(Tk_close_brackedContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			((FunctionCallContext)_localctx).id_function = id_function();
			setState(349);
			tk_open_bracked();
			setState(350);
			call_parameters((((FunctionCallContext)_localctx).id_function!=null?_input.getText(((FunctionCallContext)_localctx).id_function.start,((FunctionCallContext)_localctx).id_function.stop):null));
			setState(351);
			tk_close_bracked();
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

	public static class Call_parametersContext extends ParserRuleContext {
		public String id_function_;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Add_expressionContext add_expression() {
			return getRuleContext(Add_expressionContext.class,0);
		}
		public Call_parametersContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Call_parametersContext(ParserRuleContext parent, int invokingState, String id_function_) {
			super(parent, invokingState);
			this.id_function_ = id_function_;
		}
		@Override public int getRuleIndex() { return RULE_call_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterCall_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitCall_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitCall_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_parametersContext call_parameters(String id_function_) throws RecognitionException {
		Call_parametersContext _localctx = new Call_parametersContext(_ctx, getState(), id_function_);
		enterRule(_localctx, 54, RULE_call_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(353);
				expression(0);
				setState(354);
				add_expression(_localctx.id_function_, 1);
				}
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

	public static class Add_expressionContext extends ParserRuleContext {
		public String id_function_;
		public int cont;
		public TerminalNode TK_COMMA() { return getToken(StructFileGrammarParser.TK_COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Add_expressionContext add_expression() {
			return getRuleContext(Add_expressionContext.class,0);
		}
		public Add_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Add_expressionContext(ParserRuleContext parent, int invokingState, String id_function_, int cont) {
			super(parent, invokingState);
			this.id_function_ = id_function_;
			this.cont = cont;
		}
		@Override public int getRuleIndex() { return RULE_add_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_expressionContext add_expression(String id_function_,int cont) throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState(), id_function_, cont);
		enterRule(_localctx, 56, RULE_add_expression);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(TK_COMMA);
				setState(359);
				expression(0);
				setState(360);
				add_expression(_localctx.id_function_, _localctx.cont + 1);
				}
				break;
			case TK_CLOSE_BRACKED:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StructuresContext extends ParserRuleContext {
		public StructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structures; }
	 
		public StructuresContext() { }
		public void copyFrom(StructuresContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Structures5Context extends StructuresContext {
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public Structures5Context(StructuresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterStructures5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitStructures5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitStructures5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Structures4Context extends StructuresContext {
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public Structures4Context(StructuresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterStructures4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitStructures4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitStructures4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Structures3Context extends StructuresContext {
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public Structures3Context(StructuresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterStructures3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitStructures3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitStructures3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Structures2Context extends StructuresContext {
		public Switch_Context switch_() {
			return getRuleContext(Switch_Context.class,0);
		}
		public Structures2Context(StructuresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterStructures2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitStructures2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitStructures2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Structures1Context extends StructuresContext {
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public Structures1Context(StructuresContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterStructures1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitStructures1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitStructures1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuresContext structures() throws RecognitionException {
		StructuresContext _localctx = new StructuresContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_structures);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_IF:
				_localctx = new Structures1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				if_();
				}
				break;
			case TK_SWITCH:
				_localctx = new Structures2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				switch_();
				}
				break;
			case TK_WHILE:
				_localctx = new Structures3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				while_();
				}
				break;
			case TK_DO:
				_localctx = new Structures4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				do_while();
				}
				break;
			case TK_FOR:
				_localctx = new Structures5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
				for_();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class If_Context extends ParserRuleContext {
		public Tk_ifContext tk_if() {
			return getRuleContext(Tk_ifContext.class,0);
		}
		public Tk_open_brackedContext tk_open_bracked() {
			return getRuleContext(Tk_open_brackedContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_close_brackedContext tk_close_bracked() {
			return getRuleContext(Tk_close_brackedContext.class,0);
		}
		public Tk_open_bracesContext tk_open_braces() {
			return getRuleContext(Tk_open_bracesContext.class,0);
		}
		public IfContentContext ifContent() {
			return getRuleContext(IfContentContext.class,0);
		}
		public Tk_close_bracesContext tk_close_braces() {
			return getRuleContext(Tk_close_bracesContext.class,0);
		}
		public Else_Context else_() {
			return getRuleContext(Else_Context.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitIf_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitIf_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			tk_if();
			setState(373);
			tk_open_bracked();
			setState(374);
			expression(0);
			setState(375);
			tk_close_bracked();
			setState(376);
			tk_open_braces();
			setState(377);
			ifContent();
			setState(378);
			tk_close_braces();
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(379);
				else_();
				}
				break;
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

	public static class Tk_ifContext extends ParserRuleContext {
		public TerminalNode TK_IF() { return getToken(StructFileGrammarParser.TK_IF, 0); }
		public Tk_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_ifContext tk_if() throws RecognitionException {
		Tk_ifContext _localctx = new Tk_ifContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tk_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(TK_IF);
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

	public static class IfContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_ifContentContext add_ifContent() {
			return getRuleContext(Add_ifContentContext.class,0);
		}
		public IfContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterIfContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitIfContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitIfContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContentContext ifContent() throws RecognitionException {
		IfContentContext _localctx = new IfContentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ifContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_NUMBER) | (1L << TK_TEXT) | (1L << TK_BOOLEAN) | (1L << TK_FILE) | (1L << TK_LIST) | (1L << TK_TREE) | (1L << TK_GROUP) | (1L << TK_IF) | (1L << TK_SWITCH) | (1L << TK_WHILE) | (1L << TK_DO) | (1L << TK_FOR) | (1L << TK_RETURN) | (1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(384);
				content();
				setState(385);
				add_ifContent();
				}
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

	public static class Add_ifContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_ifContentContext add_ifContent() {
			return getRuleContext(Add_ifContentContext.class,0);
		}
		public Add_ifContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_ifContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_ifContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_ifContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_ifContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_ifContentContext add_ifContent() throws RecognitionException {
		Add_ifContentContext _localctx = new Add_ifContentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_add_ifContent);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMBER:
			case TK_TEXT:
			case TK_BOOLEAN:
			case TK_FILE:
			case TK_LIST:
			case TK_TREE:
			case TK_GROUP:
			case TK_IF:
			case TK_SWITCH:
			case TK_WHILE:
			case TK_DO:
			case TK_FOR:
			case TK_RETURN:
			case TK_OPEN_BRACKED:
			case TK_OPEN_BRACES:
			case TK_OPEN_SQUARE_BRACKED:
			case TK_NOT:
			case TRUE_VAL:
			case FALSE_VAL:
			case NUMBER_VAL:
			case TEXT_VAL:
			case FILE_VAL:
			case ID:
			case ID_DIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				content();
				setState(390);
				add_ifContent();
				}
				break;
			case TK_CLOSE_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Else_Context extends ParserRuleContext {
		public Else_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_; }
	 
		public Else_Context() { }
		public void copyFrom(Else_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Else_1Context extends Else_Context {
		public Tk_elseContext tk_else() {
			return getRuleContext(Tk_elseContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public Else_1Context(Else_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterElse_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitElse_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitElse_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Else_2Context extends Else_Context {
		public Tk_elseContext tk_else() {
			return getRuleContext(Tk_elseContext.class,0);
		}
		public Tk_open_bracesContext tk_open_braces() {
			return getRuleContext(Tk_open_bracesContext.class,0);
		}
		public Else_ifContentContext else_ifContent() {
			return getRuleContext(Else_ifContentContext.class,0);
		}
		public Tk_close_bracesContext tk_close_braces() {
			return getRuleContext(Tk_close_bracesContext.class,0);
		}
		public Else_2Context(Else_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterElse_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitElse_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitElse_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_Context else_() throws RecognitionException {
		Else_Context _localctx = new Else_Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_else_);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Else_1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				tk_else();
				setState(396);
				if_();
				}
				break;
			case 2:
				_localctx = new Else_2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				tk_else();
				setState(399);
				tk_open_braces();
				setState(400);
				else_ifContent();
				setState(401);
				tk_close_braces();
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

	public static class Tk_elseContext extends ParserRuleContext {
		public TerminalNode TK_ELSE() { return getToken(StructFileGrammarParser.TK_ELSE, 0); }
		public Tk_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_elseContext tk_else() throws RecognitionException {
		Tk_elseContext _localctx = new Tk_elseContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tk_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(TK_ELSE);
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

	public static class Else_ifContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_else_ifContentContext add_else_ifContent() {
			return getRuleContext(Add_else_ifContentContext.class,0);
		}
		public Else_ifContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_ifContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterElse_ifContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitElse_ifContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitElse_ifContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContentContext else_ifContent() throws RecognitionException {
		Else_ifContentContext _localctx = new Else_ifContentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_else_ifContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_NUMBER) | (1L << TK_TEXT) | (1L << TK_BOOLEAN) | (1L << TK_FILE) | (1L << TK_LIST) | (1L << TK_TREE) | (1L << TK_GROUP) | (1L << TK_IF) | (1L << TK_SWITCH) | (1L << TK_WHILE) | (1L << TK_DO) | (1L << TK_FOR) | (1L << TK_RETURN) | (1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(407);
				content();
				setState(408);
				add_else_ifContent();
				}
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

	public static class Add_else_ifContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_else_ifContentContext add_else_ifContent() {
			return getRuleContext(Add_else_ifContentContext.class,0);
		}
		public Add_else_ifContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_else_ifContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_else_ifContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_else_ifContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_else_ifContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_else_ifContentContext add_else_ifContent() throws RecognitionException {
		Add_else_ifContentContext _localctx = new Add_else_ifContentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_add_else_ifContent);
		try {
			setState(416);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMBER:
			case TK_TEXT:
			case TK_BOOLEAN:
			case TK_FILE:
			case TK_LIST:
			case TK_TREE:
			case TK_GROUP:
			case TK_IF:
			case TK_SWITCH:
			case TK_WHILE:
			case TK_DO:
			case TK_FOR:
			case TK_RETURN:
			case TK_OPEN_BRACKED:
			case TK_OPEN_BRACES:
			case TK_OPEN_SQUARE_BRACKED:
			case TK_NOT:
			case TRUE_VAL:
			case FALSE_VAL:
			case NUMBER_VAL:
			case TEXT_VAL:
			case FILE_VAL:
			case ID:
			case ID_DIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				content();
				setState(413);
				add_else_ifContent();
				}
				break;
			case TK_CLOSE_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Switch_Context extends ParserRuleContext {
		public ExpressionContext expression;
		public Tk_switchContext tk_switch() {
			return getRuleContext(Tk_switchContext.class,0);
		}
		public Tk_open_brackedContext tk_open_bracked() {
			return getRuleContext(Tk_open_brackedContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_close_brackedContext tk_close_bracked() {
			return getRuleContext(Tk_close_brackedContext.class,0);
		}
		public Tk_open_bracesContext tk_open_braces() {
			return getRuleContext(Tk_open_bracesContext.class,0);
		}
		public CaseContentContext caseContent() {
			return getRuleContext(CaseContentContext.class,0);
		}
		public Default_Context default_() {
			return getRuleContext(Default_Context.class,0);
		}
		public Tk_close_bracesContext tk_close_braces() {
			return getRuleContext(Tk_close_bracesContext.class,0);
		}
		public Switch_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterSwitch_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitSwitch_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitSwitch_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_Context switch_() throws RecognitionException {
		Switch_Context _localctx = new Switch_Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_switch_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			tk_switch();
			setState(419);
			tk_open_bracked();
			setState(420);
			((Switch_Context)_localctx).expression = expression(0);
			setState(421);
			tk_close_bracked();
			setState(422);
			tk_open_braces();
			setState(423);
			caseContent(((Switch_Context)_localctx).expression);
			setState(424);
			default_();
			setState(425);
			tk_close_braces();
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

	public static class Tk_switchContext extends ParserRuleContext {
		public TerminalNode TK_SWITCH() { return getToken(StructFileGrammarParser.TK_SWITCH, 0); }
		public Tk_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_switchContext tk_switch() throws RecognitionException {
		Tk_switchContext _localctx = new Tk_switchContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_tk_switch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(TK_SWITCH);
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

	public static class CaseContentContext extends ParserRuleContext {
		public ExpressionContext expr;
		public Case_Context case_() {
			return getRuleContext(Case_Context.class,0);
		}
		public Add_caseContentContext add_caseContent() {
			return getRuleContext(Add_caseContentContext.class,0);
		}
		public CaseContentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CaseContentContext(ParserRuleContext parent, int invokingState, ExpressionContext expr) {
			super(parent, invokingState);
			this.expr = expr;
		}
		@Override public int getRuleIndex() { return RULE_caseContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterCaseContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitCaseContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitCaseContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseContentContext caseContent(ExpressionContext expr) throws RecognitionException {
		CaseContentContext _localctx = new CaseContentContext(_ctx, getState(), expr);
		enterRule(_localctx, 80, RULE_caseContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(429);
				case_();
				setState(430);
				add_caseContent(_localctx.expr);
				}
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

	public static class Add_caseContentContext extends ParserRuleContext {
		public ExpressionContext expr;
		public Case_Context case_() {
			return getRuleContext(Case_Context.class,0);
		}
		public Add_caseContentContext add_caseContent() {
			return getRuleContext(Add_caseContentContext.class,0);
		}
		public Add_caseContentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Add_caseContentContext(ParserRuleContext parent, int invokingState, ExpressionContext expr) {
			super(parent, invokingState);
			this.expr = expr;
		}
		@Override public int getRuleIndex() { return RULE_add_caseContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_caseContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_caseContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_caseContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_caseContentContext add_caseContent(ExpressionContext expr) throws RecognitionException {
		Add_caseContentContext _localctx = new Add_caseContentContext(_ctx, getState(), expr);
		enterRule(_localctx, 82, RULE_add_caseContent);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OPEN_BRACKED:
			case TK_OPEN_BRACES:
			case TK_OPEN_SQUARE_BRACKED:
			case TK_NOT:
			case TRUE_VAL:
			case FALSE_VAL:
			case NUMBER_VAL:
			case TEXT_VAL:
			case FILE_VAL:
			case ID:
			case ID_DIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				case_();
				setState(435);
				add_caseContent(_localctx.expr);
				}
				break;
			case TK_ELSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Case_Context extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_colonContext tk_colon() {
			return getRuleContext(Tk_colonContext.class,0);
		}
		public SwitchContentContext switchContent() {
			return getRuleContext(SwitchContentContext.class,0);
		}
		public Case_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterCase_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitCase_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitCase_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_Context case_() throws RecognitionException {
		Case_Context _localctx = new Case_Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_case_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			expression(0);
			setState(441);
			tk_colon();
			setState(442);
			switchContent();
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

	public static class SwitchContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_switchContentContext add_switchContent() {
			return getRuleContext(Add_switchContentContext.class,0);
		}
		public SwitchContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterSwitchContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitSwitchContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitSwitchContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContentContext switchContent() throws RecognitionException {
		SwitchContentContext _localctx = new SwitchContentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_switchContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(444);
				content();
				setState(445);
				add_switchContent();
				}
				break;
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

	public static class Add_switchContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_switchContentContext add_switchContent() {
			return getRuleContext(Add_switchContentContext.class,0);
		}
		public Add_switchContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_switchContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_switchContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_switchContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_switchContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_switchContentContext add_switchContent() throws RecognitionException {
		Add_switchContentContext _localctx = new Add_switchContentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_add_switchContent);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				content();
				setState(450);
				add_switchContent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Default_Context extends ParserRuleContext {
		public Tk_elseContext tk_else() {
			return getRuleContext(Tk_elseContext.class,0);
		}
		public Tk_colonContext tk_colon() {
			return getRuleContext(Tk_colonContext.class,0);
		}
		public SwitchContentContext switchContent() {
			return getRuleContext(SwitchContentContext.class,0);
		}
		public Default_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterDefault_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitDefault_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitDefault_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_Context default_() throws RecognitionException {
		Default_Context _localctx = new Default_Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_default_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			tk_else();
			setState(456);
			tk_colon();
			setState(457);
			switchContent();
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

	public static class While_Context extends ParserRuleContext {
		public Tk_whileContext tk_while() {
			return getRuleContext(Tk_whileContext.class,0);
		}
		public Tk_open_brackedContext tk_open_bracked() {
			return getRuleContext(Tk_open_brackedContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_close_brackedContext tk_close_bracked() {
			return getRuleContext(Tk_close_brackedContext.class,0);
		}
		public Tk_open_bracesContext tk_open_braces() {
			return getRuleContext(Tk_open_bracesContext.class,0);
		}
		public WhileContentContext whileContent() {
			return getRuleContext(WhileContentContext.class,0);
		}
		public Tk_close_bracesContext tk_close_braces() {
			return getRuleContext(Tk_close_bracesContext.class,0);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitWhile_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitWhile_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 92, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			tk_while();
			setState(460);
			tk_open_bracked();
			setState(461);
			expression(0);
			setState(462);
			tk_close_bracked();
			setState(463);
			tk_open_braces();
			setState(464);
			whileContent();
			setState(465);
			tk_close_braces();
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

	public static class Tk_whileContext extends ParserRuleContext {
		public TerminalNode TK_WHILE() { return getToken(StructFileGrammarParser.TK_WHILE, 0); }
		public Tk_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_whileContext tk_while() throws RecognitionException {
		Tk_whileContext _localctx = new Tk_whileContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_tk_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(TK_WHILE);
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

	public static class WhileContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_whileContentContext add_whileContent() {
			return getRuleContext(Add_whileContentContext.class,0);
		}
		public WhileContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterWhileContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitWhileContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitWhileContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContentContext whileContent() throws RecognitionException {
		WhileContentContext _localctx = new WhileContentContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_whileContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_NUMBER) | (1L << TK_TEXT) | (1L << TK_BOOLEAN) | (1L << TK_FILE) | (1L << TK_LIST) | (1L << TK_TREE) | (1L << TK_GROUP) | (1L << TK_IF) | (1L << TK_SWITCH) | (1L << TK_WHILE) | (1L << TK_DO) | (1L << TK_FOR) | (1L << TK_RETURN) | (1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(469);
				content();
				setState(470);
				add_whileContent();
				}
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

	public static class Add_whileContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_whileContentContext add_whileContent() {
			return getRuleContext(Add_whileContentContext.class,0);
		}
		public Add_whileContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_whileContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_whileContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_whileContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_whileContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_whileContentContext add_whileContent() throws RecognitionException {
		Add_whileContentContext _localctx = new Add_whileContentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_add_whileContent);
		try {
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMBER:
			case TK_TEXT:
			case TK_BOOLEAN:
			case TK_FILE:
			case TK_LIST:
			case TK_TREE:
			case TK_GROUP:
			case TK_IF:
			case TK_SWITCH:
			case TK_WHILE:
			case TK_DO:
			case TK_FOR:
			case TK_RETURN:
			case TK_OPEN_BRACKED:
			case TK_OPEN_BRACES:
			case TK_OPEN_SQUARE_BRACKED:
			case TK_NOT:
			case TRUE_VAL:
			case FALSE_VAL:
			case NUMBER_VAL:
			case TEXT_VAL:
			case FILE_VAL:
			case ID:
			case ID_DIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(474);
				content();
				setState(475);
				add_whileContent();
				}
				break;
			case TK_CLOSE_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Do_whileContext extends ParserRuleContext {
		public Tk_doContext tk_do() {
			return getRuleContext(Tk_doContext.class,0);
		}
		public Tk_open_bracesContext tk_open_braces() {
			return getRuleContext(Tk_open_bracesContext.class,0);
		}
		public Do_whileContentContext do_whileContent() {
			return getRuleContext(Do_whileContentContext.class,0);
		}
		public Tk_close_bracesContext tk_close_braces() {
			return getRuleContext(Tk_close_bracesContext.class,0);
		}
		public Tk_open_brackedContext tk_open_bracked() {
			return getRuleContext(Tk_open_brackedContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_close_brackedContext tk_close_bracked() {
			return getRuleContext(Tk_close_brackedContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			tk_do();
			setState(481);
			tk_open_braces();
			setState(482);
			do_whileContent();
			setState(483);
			tk_close_braces();
			setState(484);
			tk_open_bracked();
			setState(485);
			expression(0);
			setState(486);
			tk_close_bracked();
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

	public static class Tk_doContext extends ParserRuleContext {
		public TerminalNode TK_DO() { return getToken(StructFileGrammarParser.TK_DO, 0); }
		public Tk_doContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_do(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_do(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_do(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_doContext tk_do() throws RecognitionException {
		Tk_doContext _localctx = new Tk_doContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_tk_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(TK_DO);
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

	public static class Do_whileContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_do_whileContentContext add_do_whileContent() {
			return getRuleContext(Add_do_whileContentContext.class,0);
		}
		public Do_whileContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_whileContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterDo_whileContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitDo_whileContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitDo_whileContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContentContext do_whileContent() throws RecognitionException {
		Do_whileContentContext _localctx = new Do_whileContentContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_do_whileContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_NUMBER) | (1L << TK_TEXT) | (1L << TK_BOOLEAN) | (1L << TK_FILE) | (1L << TK_LIST) | (1L << TK_TREE) | (1L << TK_GROUP) | (1L << TK_IF) | (1L << TK_SWITCH) | (1L << TK_WHILE) | (1L << TK_DO) | (1L << TK_FOR) | (1L << TK_RETURN) | (1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(490);
				content();
				setState(491);
				add_do_whileContent();
				}
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

	public static class Add_do_whileContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_do_whileContentContext add_do_whileContent() {
			return getRuleContext(Add_do_whileContentContext.class,0);
		}
		public Add_do_whileContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_do_whileContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_do_whileContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_do_whileContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_do_whileContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_do_whileContentContext add_do_whileContent() throws RecognitionException {
		Add_do_whileContentContext _localctx = new Add_do_whileContentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_add_do_whileContent);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMBER:
			case TK_TEXT:
			case TK_BOOLEAN:
			case TK_FILE:
			case TK_LIST:
			case TK_TREE:
			case TK_GROUP:
			case TK_IF:
			case TK_SWITCH:
			case TK_WHILE:
			case TK_DO:
			case TK_FOR:
			case TK_RETURN:
			case TK_OPEN_BRACKED:
			case TK_OPEN_BRACES:
			case TK_OPEN_SQUARE_BRACKED:
			case TK_NOT:
			case TRUE_VAL:
			case FALSE_VAL:
			case NUMBER_VAL:
			case TEXT_VAL:
			case FILE_VAL:
			case ID:
			case ID_DIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				content();
				setState(496);
				add_do_whileContent();
				}
				break;
			case TK_CLOSE_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class For_Context extends ParserRuleContext {
		public Tk_forContext tk_for() {
			return getRuleContext(Tk_forContext.class,0);
		}
		public Tk_open_brackedContext tk_open_bracked() {
			return getRuleContext(Tk_open_brackedContext.class,0);
		}
		public For_rulesContext for_rules() {
			return getRuleContext(For_rulesContext.class,0);
		}
		public Tk_close_brackedContext tk_close_bracked() {
			return getRuleContext(Tk_close_brackedContext.class,0);
		}
		public Tk_open_bracesContext tk_open_braces() {
			return getRuleContext(Tk_open_bracesContext.class,0);
		}
		public ForContentContext forContent() {
			return getRuleContext(ForContentContext.class,0);
		}
		public Tk_close_bracesContext tk_close_braces() {
			return getRuleContext(Tk_close_bracesContext.class,0);
		}
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitFor_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitFor_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			tk_for();
			setState(502);
			tk_open_bracked();
			setState(503);
			for_rules();
			setState(504);
			tk_close_bracked();
			setState(505);
			tk_open_braces();
			setState(506);
			forContent();
			setState(507);
			tk_close_braces();
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

	public static class Tk_forContext extends ParserRuleContext {
		public TerminalNode TK_FOR() { return getToken(StructFileGrammarParser.TK_FOR, 0); }
		public Tk_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_forContext tk_for() throws RecognitionException {
		Tk_forContext _localctx = new Tk_forContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tk_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(TK_FOR);
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

	public static class For_rulesContext extends ParserRuleContext {
		public VariableDefContext variableDef() {
			return getRuleContext(VariableDefContext.class,0);
		}
		public List<Tk_semicolonContext> tk_semicolon() {
			return getRuleContexts(Tk_semicolonContext.class);
		}
		public Tk_semicolonContext tk_semicolon(int i) {
			return getRuleContext(Tk_semicolonContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAsignContext variableAsign() {
			return getRuleContext(VariableAsignContext.class,0);
		}
		public For_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterFor_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitFor_rules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitFor_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_rulesContext for_rules() throws RecognitionException {
		For_rulesContext _localctx = new For_rulesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_for_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			variableDef();
			setState(512);
			tk_semicolon();
			setState(513);
			expression(0);
			setState(514);
			tk_semicolon();
			setState(515);
			variableAsign();
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

	public static class ForContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_forContentContext add_forContent() {
			return getRuleContext(Add_forContentContext.class,0);
		}
		public ForContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterForContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitForContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitForContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContentContext forContent() throws RecognitionException {
		ForContentContext _localctx = new ForContentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_forContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_NUMBER) | (1L << TK_TEXT) | (1L << TK_BOOLEAN) | (1L << TK_FILE) | (1L << TK_LIST) | (1L << TK_TREE) | (1L << TK_GROUP) | (1L << TK_IF) | (1L << TK_SWITCH) | (1L << TK_WHILE) | (1L << TK_DO) | (1L << TK_FOR) | (1L << TK_RETURN) | (1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(517);
				content();
				setState(518);
				add_forContent();
				}
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

	public static class Add_forContentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_forContentContext add_forContent() {
			return getRuleContext(Add_forContentContext.class,0);
		}
		public Add_forContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_forContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_forContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_forContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_forContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_forContentContext add_forContent() throws RecognitionException {
		Add_forContentContext _localctx = new Add_forContentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_add_forContent);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMBER:
			case TK_TEXT:
			case TK_BOOLEAN:
			case TK_FILE:
			case TK_LIST:
			case TK_TREE:
			case TK_GROUP:
			case TK_IF:
			case TK_SWITCH:
			case TK_WHILE:
			case TK_DO:
			case TK_FOR:
			case TK_RETURN:
			case TK_OPEN_BRACKED:
			case TK_OPEN_BRACES:
			case TK_OPEN_SQUARE_BRACKED:
			case TK_NOT:
			case TRUE_VAL:
			case FALSE_VAL:
			case NUMBER_VAL:
			case TEXT_VAL:
			case FILE_VAL:
			case ID:
			case ID_DIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				content();
				setState(523);
				add_forContent();
				}
				break;
			case TK_CLOSE_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Return_callContext extends ParserRuleContext {
		public TerminalNode TK_RETURN() { return getToken(StructFileGrammarParser.TK_RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterReturn_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitReturn_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitReturn_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_callContext return_call() throws RecognitionException {
		Return_callContext _localctx = new Return_callContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_return_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			match(TK_RETURN);
			setState(529);
			expression(0);
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

	public static class Add_contentContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public Add_contentContext add_content() {
			return getRuleContext(Add_contentContext.class,0);
		}
		public Add_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_contentContext add_content() throws RecognitionException {
		Add_contentContext _localctx = new Add_contentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_add_content);
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_NUMBER:
			case TK_TEXT:
			case TK_BOOLEAN:
			case TK_FILE:
			case TK_LIST:
			case TK_TREE:
			case TK_GROUP:
			case TK_IF:
			case TK_SWITCH:
			case TK_WHILE:
			case TK_DO:
			case TK_FOR:
			case TK_RETURN:
			case TK_OPEN_BRACKED:
			case TK_OPEN_BRACES:
			case TK_OPEN_SQUARE_BRACKED:
			case TK_NOT:
			case TRUE_VAL:
			case FALSE_VAL:
			case NUMBER_VAL:
			case TEXT_VAL:
			case FILE_VAL:
			case ID:
			case ID_DIR:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				content();
				setState(532);
				add_content();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(StructFileGrammarParser.EOF, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(EOF);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Value6Context extends ValueContext {
		public Group_valContext group_val() {
			return getRuleContext(Group_valContext.class,0);
		}
		public Value6Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value5Context extends ValueContext {
		public Tree_valContext tree_val() {
			return getRuleContext(Tree_valContext.class,0);
		}
		public Value5Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value8Context extends ValueContext {
		public Id_variableContext id_variable() {
			return getRuleContext(Id_variableContext.class,0);
		}
		public Value8Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value7Context extends ValueContext {
		public List_valContext list_val() {
			return getRuleContext(List_valContext.class,0);
		}
		public Value7Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value2Context extends ValueContext {
		public Boolean_valContext boolean_val() {
			return getRuleContext(Boolean_valContext.class,0);
		}
		public Value2Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value1Context extends ValueContext {
		public Number_valContext number_val() {
			return getRuleContext(Number_valContext.class,0);
		}
		public Value1Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value4Context extends ValueContext {
		public File_valContext file_val() {
			return getRuleContext(File_valContext.class,0);
		}
		public Value4Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value3Context extends ValueContext {
		public Text_valContext text_val() {
			return getRuleContext(Text_valContext.class,0);
		}
		public Value3Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Value9Context extends ValueContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Value9Context(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_value);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new Value1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				number_val();
				}
				break;
			case 2:
				_localctx = new Value2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				boolean_val();
				}
				break;
			case 3:
				_localctx = new Value3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				text_val();
				}
				break;
			case 4:
				_localctx = new Value4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				file_val();
				}
				break;
			case 5:
				_localctx = new Value5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				tree_val();
				}
				break;
			case 6:
				_localctx = new Value6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(544);
				group_val();
				}
				break;
			case 7:
				_localctx = new Value7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(545);
				list_val();
				}
				break;
			case 8:
				_localctx = new Value8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(546);
				id_variable();
				}
				break;
			case 9:
				_localctx = new Value9Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(547);
				functionCall();
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

	public static class Number_valContext extends ParserRuleContext {
		public TerminalNode NUMBER_VAL() { return getToken(StructFileGrammarParser.NUMBER_VAL, 0); }
		public Number_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterNumber_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitNumber_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitNumber_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number_valContext number_val() throws RecognitionException {
		Number_valContext _localctx = new Number_valContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_number_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(NUMBER_VAL);
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

	public static class Text_valContext extends ParserRuleContext {
		public TerminalNode TEXT_VAL() { return getToken(StructFileGrammarParser.TEXT_VAL, 0); }
		public Text_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterText_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitText_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitText_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_valContext text_val() throws RecognitionException {
		Text_valContext _localctx = new Text_valContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_text_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(TEXT_VAL);
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

	public static class Boolean_valContext extends ParserRuleContext {
		public TerminalNode TRUE_VAL() { return getToken(StructFileGrammarParser.TRUE_VAL, 0); }
		public TerminalNode FALSE_VAL() { return getToken(StructFileGrammarParser.FALSE_VAL, 0); }
		public Boolean_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterBoolean_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitBoolean_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitBoolean_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_valContext boolean_val() throws RecognitionException {
		Boolean_valContext _localctx = new Boolean_valContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_boolean_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			_la = _input.LA(1);
			if ( !(_la==TRUE_VAL || _la==FALSE_VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expression8Context extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Value_extrasContext value_extras() {
			return getRuleContext(Value_extrasContext.class,0);
		}
		public Expression8Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterExpression8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitExpression8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitExpression8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression6Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Tk_operatorContext tk_operator() {
			return getRuleContext(Tk_operatorContext.class,0);
		}
		public Expression6Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterExpression6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitExpression6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitExpression6(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression7Context extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Expression7Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterExpression7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitExpression7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitExpression7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression4Context extends ExpressionContext {
		public Tk_notContext tk_not() {
			return getRuleContext(Tk_notContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression4Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterExpression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitExpression4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitExpression4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression5Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Tk_comparatorContext tk_comparator() {
			return getRuleContext(Tk_comparatorContext.class,0);
		}
		public Expression5Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterExpression5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitExpression5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitExpression5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression2Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Tk_andContext tk_and() {
			return getRuleContext(Tk_andContext.class,0);
		}
		public Expression2Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitExpression2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitExpression2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression3Context extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Tk_orContext tk_or() {
			return getRuleContext(Tk_orContext.class,0);
		}
		public Expression3Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitExpression3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitExpression3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expression1Context extends ExpressionContext {
		public Tk_open_brackedContext tk_open_bracked() {
			return getRuleContext(Tk_open_brackedContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Tk_close_brackedContext tk_close_bracked() {
			return getRuleContext(Tk_close_brackedContext.class,0);
		}
		public Expression1Context(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitExpression1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitExpression1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_OPEN_BRACKED:
				{
				_localctx = new Expression1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(557);
				tk_open_bracked();
				setState(558);
				expression(0);
				setState(559);
				tk_close_bracked();
				}
				break;
			case TK_NOT:
				{
				_localctx = new Expression4Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(561);
				tk_not();
				setState(562);
				expression(4);
				}
				break;
			case TK_OPEN_BRACES:
			case TK_OPEN_SQUARE_BRACKED:
			case TRUE_VAL:
			case FALSE_VAL:
			case NUMBER_VAL:
			case TEXT_VAL:
			case FILE_VAL:
			case ID:
			case ID_DIR:
				{
				_localctx = new Expression7Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(564);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(585);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new Expression2Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(567);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(568);
						tk_and();
						setState(569);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new Expression3Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(571);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(572);
						tk_or();
						setState(573);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new Expression5Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(575);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(576);
						tk_comparator();
						setState(577);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new Expression6Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(580);
						tk_operator();
						setState(581);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new Expression8Context(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(583);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(584);
						value_extras();
						}
						break;
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Tk_andContext extends ParserRuleContext {
		public TerminalNode TK_AND() { return getToken(StructFileGrammarParser.TK_AND, 0); }
		public Tk_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_andContext tk_and() throws RecognitionException {
		Tk_andContext _localctx = new Tk_andContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tk_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(TK_AND);
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

	public static class Tk_orContext extends ParserRuleContext {
		public TerminalNode TK_OR() { return getToken(StructFileGrammarParser.TK_OR, 0); }
		public Tk_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_orContext tk_or() throws RecognitionException {
		Tk_orContext _localctx = new Tk_orContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tk_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(TK_OR);
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

	public static class Tk_notContext extends ParserRuleContext {
		public TerminalNode TK_NOT() { return getToken(StructFileGrammarParser.TK_NOT, 0); }
		public Tk_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_notContext tk_not() throws RecognitionException {
		Tk_notContext _localctx = new Tk_notContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tk_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(TK_NOT);
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

	public static class Tk_comparatorContext extends ParserRuleContext {
		public Tk_comparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_comparator; }
	 
		public Tk_comparatorContext() { }
		public void copyFrom(Tk_comparatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Tk_comparator1Context extends Tk_comparatorContext {
		public Tk_great_thanContext tk_great_than() {
			return getRuleContext(Tk_great_thanContext.class,0);
		}
		public Tk_comparator1Context(Tk_comparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_comparator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_comparator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_comparator1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_comparator3Context extends Tk_comparatorContext {
		public Tk_less_thanContext tk_less_than() {
			return getRuleContext(Tk_less_thanContext.class,0);
		}
		public Tk_comparator3Context(Tk_comparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_comparator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_comparator3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_comparator3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_comparator2Context extends Tk_comparatorContext {
		public Tk_great_equal_thanContext tk_great_equal_than() {
			return getRuleContext(Tk_great_equal_thanContext.class,0);
		}
		public Tk_comparator2Context(Tk_comparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_comparator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_comparator2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_comparator2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_comparator5Context extends Tk_comparatorContext {
		public Tk_equalContext tk_equal() {
			return getRuleContext(Tk_equalContext.class,0);
		}
		public Tk_comparator5Context(Tk_comparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_comparator5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_comparator5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_comparator5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_comparator4Context extends Tk_comparatorContext {
		public Tk_less_equal_thanContext tk_less_equal_than() {
			return getRuleContext(Tk_less_equal_thanContext.class,0);
		}
		public Tk_comparator4Context(Tk_comparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_comparator4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_comparator4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_comparator4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_comparator6Context extends Tk_comparatorContext {
		public Tk_not_equalContext tk_not_equal() {
			return getRuleContext(Tk_not_equalContext.class,0);
		}
		public Tk_comparator6Context(Tk_comparatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_comparator6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_comparator6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_comparator6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_comparatorContext tk_comparator() throws RecognitionException {
		Tk_comparatorContext _localctx = new Tk_comparatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_tk_comparator);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_GREAT_THAN:
				_localctx = new Tk_comparator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				tk_great_than();
				}
				break;
			case TK_GREAT_EQUAL_THAN:
				_localctx = new Tk_comparator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				tk_great_equal_than();
				}
				break;
			case TK_LESS_THAN:
				_localctx = new Tk_comparator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				tk_less_than();
				}
				break;
			case TK_LESS_EQUAL_THAN:
				_localctx = new Tk_comparator4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(599);
				tk_less_equal_than();
				}
				break;
			case TK_EQUAL:
				_localctx = new Tk_comparator5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				tk_equal();
				}
				break;
			case TK_NOT_EQUAL:
				_localctx = new Tk_comparator6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(601);
				tk_not_equal();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tk_great_thanContext extends ParserRuleContext {
		public TerminalNode TK_GREAT_THAN() { return getToken(StructFileGrammarParser.TK_GREAT_THAN, 0); }
		public Tk_great_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_great_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_great_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_great_than(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_great_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_great_thanContext tk_great_than() throws RecognitionException {
		Tk_great_thanContext _localctx = new Tk_great_thanContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_tk_great_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(TK_GREAT_THAN);
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

	public static class Tk_great_equal_thanContext extends ParserRuleContext {
		public TerminalNode TK_GREAT_EQUAL_THAN() { return getToken(StructFileGrammarParser.TK_GREAT_EQUAL_THAN, 0); }
		public Tk_great_equal_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_great_equal_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_great_equal_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_great_equal_than(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_great_equal_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_great_equal_thanContext tk_great_equal_than() throws RecognitionException {
		Tk_great_equal_thanContext _localctx = new Tk_great_equal_thanContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_tk_great_equal_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(TK_GREAT_EQUAL_THAN);
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

	public static class Tk_less_thanContext extends ParserRuleContext {
		public TerminalNode TK_LESS_THAN() { return getToken(StructFileGrammarParser.TK_LESS_THAN, 0); }
		public Tk_less_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_less_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_less_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_less_than(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_less_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_less_thanContext tk_less_than() throws RecognitionException {
		Tk_less_thanContext _localctx = new Tk_less_thanContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_tk_less_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(TK_LESS_THAN);
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

	public static class Tk_less_equal_thanContext extends ParserRuleContext {
		public TerminalNode TK_LESS_EQUAL_THAN() { return getToken(StructFileGrammarParser.TK_LESS_EQUAL_THAN, 0); }
		public Tk_less_equal_thanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_less_equal_than; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_less_equal_than(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_less_equal_than(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_less_equal_than(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_less_equal_thanContext tk_less_equal_than() throws RecognitionException {
		Tk_less_equal_thanContext _localctx = new Tk_less_equal_thanContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_tk_less_equal_than);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(TK_LESS_EQUAL_THAN);
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

	public static class Tk_equalContext extends ParserRuleContext {
		public TerminalNode TK_EQUAL() { return getToken(StructFileGrammarParser.TK_EQUAL, 0); }
		public Tk_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_equalContext tk_equal() throws RecognitionException {
		Tk_equalContext _localctx = new Tk_equalContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_tk_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(TK_EQUAL);
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

	public static class Tk_not_equalContext extends ParserRuleContext {
		public TerminalNode TK_NOT_EQUAL() { return getToken(StructFileGrammarParser.TK_NOT_EQUAL, 0); }
		public Tk_not_equalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_not_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_not_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_not_equal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_not_equal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_not_equalContext tk_not_equal() throws RecognitionException {
		Tk_not_equalContext _localctx = new Tk_not_equalContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_tk_not_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(TK_NOT_EQUAL);
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

	public static class Tk_operatorContext extends ParserRuleContext {
		public Tk_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_operator; }
	 
		public Tk_operatorContext() { }
		public void copyFrom(Tk_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Tk_operator1Context extends Tk_operatorContext {
		public Tk_sumContext tk_sum() {
			return getRuleContext(Tk_sumContext.class,0);
		}
		public Tk_operator1Context(Tk_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_operator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_operator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_operator1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_operator3Context extends Tk_operatorContext {
		public Tk_multContext tk_mult() {
			return getRuleContext(Tk_multContext.class,0);
		}
		public Tk_operator3Context(Tk_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_operator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_operator3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_operator3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_operator2Context extends Tk_operatorContext {
		public Tk_minusContext tk_minus() {
			return getRuleContext(Tk_minusContext.class,0);
		}
		public Tk_operator2Context(Tk_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_operator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_operator2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_operator2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_operator5Context extends Tk_operatorContext {
		public Tk_diviContext tk_divi() {
			return getRuleContext(Tk_diviContext.class,0);
		}
		public Tk_operator5Context(Tk_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_operator5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_operator5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_operator5(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_operator4Context extends Tk_operatorContext {
		public Tk_divrContext tk_divr() {
			return getRuleContext(Tk_divrContext.class,0);
		}
		public Tk_operator4Context(Tk_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_operator4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_operator4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_operator4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_operator7Context extends Tk_operatorContext {
		public Tk_expContext tk_exp() {
			return getRuleContext(Tk_expContext.class,0);
		}
		public Tk_operator7Context(Tk_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_operator7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_operator7(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_operator7(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Tk_operator6Context extends Tk_operatorContext {
		public Tk_modContext tk_mod() {
			return getRuleContext(Tk_modContext.class,0);
		}
		public Tk_operator6Context(Tk_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_operator6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_operator6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_operator6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_operatorContext tk_operator() throws RecognitionException {
		Tk_operatorContext _localctx = new Tk_operatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_tk_operator);
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_SUM:
				_localctx = new Tk_operator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				tk_sum();
				}
				break;
			case TK_HIPHEN:
				_localctx = new Tk_operator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(617);
				tk_minus();
				}
				break;
			case TK_MULT:
				_localctx = new Tk_operator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(618);
				tk_mult();
				}
				break;
			case TK_DIVR:
				_localctx = new Tk_operator4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(619);
				tk_divr();
				}
				break;
			case TK_DIVI:
				_localctx = new Tk_operator5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(620);
				tk_divi();
				}
				break;
			case TK_MOD:
				_localctx = new Tk_operator6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(621);
				tk_mod();
				}
				break;
			case TK_EXP:
				_localctx = new Tk_operator7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(622);
				tk_exp();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tk_sumContext extends ParserRuleContext {
		public TerminalNode TK_SUM() { return getToken(StructFileGrammarParser.TK_SUM, 0); }
		public Tk_sumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_sum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_sum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_sum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_sumContext tk_sum() throws RecognitionException {
		Tk_sumContext _localctx = new Tk_sumContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_tk_sum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(TK_SUM);
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

	public static class Tk_minusContext extends ParserRuleContext {
		public TerminalNode TK_HIPHEN() { return getToken(StructFileGrammarParser.TK_HIPHEN, 0); }
		public Tk_minusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_minusContext tk_minus() throws RecognitionException {
		Tk_minusContext _localctx = new Tk_minusContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_tk_minus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(TK_HIPHEN);
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

	public static class Tk_multContext extends ParserRuleContext {
		public TerminalNode TK_MULT() { return getToken(StructFileGrammarParser.TK_MULT, 0); }
		public Tk_multContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_mult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_multContext tk_mult() throws RecognitionException {
		Tk_multContext _localctx = new Tk_multContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_tk_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(TK_MULT);
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

	public static class Tk_divrContext extends ParserRuleContext {
		public TerminalNode TK_DIVR() { return getToken(StructFileGrammarParser.TK_DIVR, 0); }
		public Tk_divrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_divr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_divr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_divr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_divr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_divrContext tk_divr() throws RecognitionException {
		Tk_divrContext _localctx = new Tk_divrContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_tk_divr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(TK_DIVR);
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

	public static class Tk_diviContext extends ParserRuleContext {
		public TerminalNode TK_DIVI() { return getToken(StructFileGrammarParser.TK_DIVI, 0); }
		public Tk_diviContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_divi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_divi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_divi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_divi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_diviContext tk_divi() throws RecognitionException {
		Tk_diviContext _localctx = new Tk_diviContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_tk_divi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			match(TK_DIVI);
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

	public static class Tk_modContext extends ParserRuleContext {
		public TerminalNode TK_MOD() { return getToken(StructFileGrammarParser.TK_MOD, 0); }
		public Tk_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_modContext tk_mod() throws RecognitionException {
		Tk_modContext _localctx = new Tk_modContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_tk_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(TK_MOD);
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

	public static class Tk_expContext extends ParserRuleContext {
		public TerminalNode TK_EXP() { return getToken(StructFileGrammarParser.TK_EXP, 0); }
		public Tk_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_expContext tk_exp() throws RecognitionException {
		Tk_expContext _localctx = new Tk_expContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_tk_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(TK_EXP);
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

	public static class Tree_valContext extends ParserRuleContext {
		public Id_dirContext id_dir() {
			return getRuleContext(Id_dirContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Tk_colonContext tk_colon() {
			return getRuleContext(Tk_colonContext.class,0);
		}
		public Tree_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tree_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTree_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTree_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTree_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tree_valContext tree_val() throws RecognitionException {
		Tree_valContext _localctx = new Tree_valContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_tree_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			id_dir();
			setState(641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(640);
				tk_colon();
				}
				break;
			}
			setState(643);
			direction();
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

	public static class Id_dirContext extends ParserRuleContext {
		public TerminalNode ID_DIR() { return getToken(StructFileGrammarParser.ID_DIR, 0); }
		public Id_dirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterId_dir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitId_dir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitId_dir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_dirContext id_dir() throws RecognitionException {
		Id_dirContext _localctx = new Id_dirContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_id_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(ID_DIR);
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

	public static class Tk_colonContext extends ParserRuleContext {
		public TerminalNode TK_COLON() { return getToken(StructFileGrammarParser.TK_COLON, 0); }
		public Tk_colonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_colon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_colon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_colon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_colonContext tk_colon() throws RecognitionException {
		Tk_colonContext _localctx = new Tk_colonContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_tk_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(TK_COLON);
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

	public static class DirectionContext extends ParserRuleContext {
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	 
		public DirectionContext() { }
		public void copyFrom(DirectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Direction1Context extends DirectionContext {
		public Id_dirContext id_dir() {
			return getRuleContext(Id_dirContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Direction1Context(DirectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterDirection1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitDirection1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitDirection1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Direction2Context extends DirectionContext {
		public File_or_divisionContext file_or_division() {
			return getRuleContext(File_or_divisionContext.class,0);
		}
		public Direction2Context(DirectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterDirection2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitDirection2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitDirection2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_direction);
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				_localctx = new Direction1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				id_dir();
				setState(650);
				direction();
				}
				break;
			case 2:
				_localctx = new Direction2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(652);
					file_or_division();
					}
					break;
				}
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

	public static class File_or_divisionContext extends ParserRuleContext {
		public File_or_divisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_or_division; }
	 
		public File_or_divisionContext() { }
		public void copyFrom(File_or_divisionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class File_or_division1Context extends File_or_divisionContext {
		public File_valContext file_val() {
			return getRuleContext(File_valContext.class,0);
		}
		public File_or_division1Context(File_or_divisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterFile_or_division1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitFile_or_division1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitFile_or_division1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class File_or_division2Context extends File_or_divisionContext {
		public DivisionContext division() {
			return getRuleContext(DivisionContext.class,0);
		}
		public File_or_division2Context(File_or_divisionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterFile_or_division2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitFile_or_division2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitFile_or_division2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_or_divisionContext file_or_division() throws RecognitionException {
		File_or_divisionContext _localctx = new File_or_divisionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_file_or_division);
		try {
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILE_VAL:
				_localctx = new File_or_division1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				file_val();
				}
				break;
			case TK_OPEN_SQUARE_BRACKED:
				_localctx = new File_or_division2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				division();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DivisionContext extends ParserRuleContext {
		public Tk_open_square_brackedContext tk_open_square_bracked() {
			return getRuleContext(Tk_open_square_brackedContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Add_directionsContext add_directions() {
			return getRuleContext(Add_directionsContext.class,0);
		}
		public Tk_close_square_brackedContext tk_close_square_bracked() {
			return getRuleContext(Tk_close_square_brackedContext.class,0);
		}
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			tk_open_square_bracked();
			setState(662);
			direction();
			setState(663);
			add_directions();
			setState(664);
			tk_close_square_bracked();
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

	public static class Tk_open_square_brackedContext extends ParserRuleContext {
		public TerminalNode TK_OPEN_SQUARE_BRACKED() { return getToken(StructFileGrammarParser.TK_OPEN_SQUARE_BRACKED, 0); }
		public Tk_open_square_brackedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_open_square_bracked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_open_square_bracked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_open_square_bracked(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_open_square_bracked(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_open_square_brackedContext tk_open_square_bracked() throws RecognitionException {
		Tk_open_square_brackedContext _localctx = new Tk_open_square_brackedContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_tk_open_square_bracked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			match(TK_OPEN_SQUARE_BRACKED);
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

	public static class Add_directionsContext extends ParserRuleContext {
		public Tk_commaContext tk_comma() {
			return getRuleContext(Tk_commaContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public Add_directionsContext add_directions() {
			return getRuleContext(Add_directionsContext.class,0);
		}
		public Add_directionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_directions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_directions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_directions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_directions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_directionsContext add_directions() throws RecognitionException {
		Add_directionsContext _localctx = new Add_directionsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_add_directions);
		try {
			setState(673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				tk_comma();
				setState(669);
				direction();
				setState(670);
				add_directions();
				}
				break;
			case TK_CLOSE_SQUARE_BRACKED:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tk_commaContext extends ParserRuleContext {
		public TerminalNode TK_COMMA() { return getToken(StructFileGrammarParser.TK_COMMA, 0); }
		public Tk_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_comma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_commaContext tk_comma() throws RecognitionException {
		Tk_commaContext _localctx = new Tk_commaContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_tk_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(TK_COMMA);
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

	public static class Tk_close_square_brackedContext extends ParserRuleContext {
		public TerminalNode TK_CLOSE_SQUARE_BRACKED() { return getToken(StructFileGrammarParser.TK_CLOSE_SQUARE_BRACKED, 0); }
		public Tk_close_square_brackedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_close_square_bracked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_close_square_bracked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_close_square_bracked(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_close_square_bracked(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_close_square_brackedContext tk_close_square_bracked() throws RecognitionException {
		Tk_close_square_brackedContext _localctx = new Tk_close_square_brackedContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_tk_close_square_bracked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(TK_CLOSE_SQUARE_BRACKED);
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

	public static class File_valContext extends ParserRuleContext {
		public TerminalNode FILE_VAL() { return getToken(StructFileGrammarParser.FILE_VAL, 0); }
		public File_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterFile_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitFile_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitFile_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_valContext file_val() throws RecognitionException {
		File_valContext _localctx = new File_valContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_file_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(FILE_VAL);
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

	public static class Group_valContext extends ParserRuleContext {
		public Tk_open_bracesContext tk_open_braces() {
			return getRuleContext(Tk_open_bracesContext.class,0);
		}
		public Tk_close_bracesContext tk_close_braces() {
			return getRuleContext(Tk_close_bracesContext.class,0);
		}
		public Set_groupContext set_group() {
			return getRuleContext(Set_groupContext.class,0);
		}
		public Group_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterGroup_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitGroup_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitGroup_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_valContext group_val() throws RecognitionException {
		Group_valContext _localctx = new Group_valContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_group_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			tk_open_braces();
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(682);
				set_group();
				}
			}

			setState(685);
			tk_close_braces();
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

	public static class Set_groupContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Tk_dollarContext tk_dollar() {
			return getRuleContext(Tk_dollarContext.class,0);
		}
		public Add_group_valsContext add_group_vals() {
			return getRuleContext(Add_group_valsContext.class,0);
		}
		public Set_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterSet_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitSet_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitSet_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_groupContext set_group() throws RecognitionException {
		Set_groupContext _localctx = new Set_groupContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_set_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			expression(0);
			setState(688);
			tk_dollar();
			setState(689);
			expression(0);
			setState(690);
			add_group_vals();
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

	public static class Add_group_valsContext extends ParserRuleContext {
		public Tk_commaContext tk_comma() {
			return getRuleContext(Tk_commaContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Tk_dollarContext tk_dollar() {
			return getRuleContext(Tk_dollarContext.class,0);
		}
		public Add_group_valsContext add_group_vals() {
			return getRuleContext(Add_group_valsContext.class,0);
		}
		public Add_group_valsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_group_vals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_group_vals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_group_vals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_group_vals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_group_valsContext add_group_vals() throws RecognitionException {
		Add_group_valsContext _localctx = new Add_group_valsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_add_group_vals);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				tk_comma();
				setState(693);
				expression(0);
				setState(694);
				tk_dollar();
				setState(695);
				expression(0);
				setState(696);
				add_group_vals();
				}
				break;
			case TK_CLOSE_BRACES:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class List_valContext extends ParserRuleContext {
		public Tk_open_square_brackedContext tk_open_square_bracked() {
			return getRuleContext(Tk_open_square_brackedContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Add_expressionsContext add_expressions() {
			return getRuleContext(Add_expressionsContext.class,0);
		}
		public Tk_close_square_brackedContext tk_close_square_bracked() {
			return getRuleContext(Tk_close_square_brackedContext.class,0);
		}
		public List_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterList_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitList_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitList_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_valContext list_val() throws RecognitionException {
		List_valContext _localctx = new List_valContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_list_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			tk_open_square_bracked();
			setState(702);
			expression(0);
			setState(703);
			add_expressions();
			setState(704);
			tk_close_square_bracked();
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

	public static class Add_expressionsContext extends ParserRuleContext {
		public Tk_commaContext tk_comma() {
			return getRuleContext(Tk_commaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Add_expressionsContext add_expressions() {
			return getRuleContext(Add_expressionsContext.class,0);
		}
		public Add_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_expressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_expressionsContext add_expressions() throws RecognitionException {
		Add_expressionsContext _localctx = new Add_expressionsContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_add_expressions);
		try {
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				tk_comma();
				setState(707);
				expression(0);
				setState(708);
				add_expressions();
				}
				break;
			case TK_CLOSE_SQUARE_BRACKED:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Value_extrasContext extends ParserRuleContext {
		public Method_referenceContext method_reference() {
			return getRuleContext(Method_referenceContext.class,0);
		}
		public Value_extrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_extras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterValue_extras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitValue_extras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitValue_extras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_extrasContext value_extras() throws RecognitionException {
		Value_extrasContext _localctx = new Value_extrasContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_value_extras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			method_reference();
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

	public static class Method_referenceContext extends ParserRuleContext {
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public Default_callContext default_call() {
			return getRuleContext(Default_callContext.class,0);
		}
		public Method_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterMethod_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitMethod_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitMethod_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_referenceContext method_reference() throws RecognitionException {
		Method_referenceContext _localctx = new Method_referenceContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_method_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			separator();
			setState(716);
			default_call();
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

	public static class SeparatorContext extends ParserRuleContext {
		public Tk_dollarContext tk_dollar() {
			return getRuleContext(Tk_dollarContext.class,0);
		}
		public Tk_double_dollarContext tk_double_dollar() {
			return getRuleContext(Tk_double_dollarContext.class,0);
		}
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitSeparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitSeparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_separator);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				tk_dollar();
				}
				break;
			case TK_DOUBLE_DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				tk_double_dollar();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Tk_dollarContext extends ParserRuleContext {
		public TerminalNode TK_DOLLAR() { return getToken(StructFileGrammarParser.TK_DOLLAR, 0); }
		public Tk_dollarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_dollar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_dollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_dollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_dollar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_dollarContext tk_dollar() throws RecognitionException {
		Tk_dollarContext _localctx = new Tk_dollarContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_tk_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			match(TK_DOLLAR);
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

	public static class Tk_double_dollarContext extends ParserRuleContext {
		public TerminalNode TK_DOUBLE_DOLLAR() { return getToken(StructFileGrammarParser.TK_DOUBLE_DOLLAR, 0); }
		public Tk_double_dollarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tk_double_dollar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterTk_double_dollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitTk_double_dollar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitTk_double_dollar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tk_double_dollarContext tk_double_dollar() throws RecognitionException {
		Tk_double_dollarContext _localctx = new Tk_double_dollarContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_tk_double_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(TK_DOUBLE_DOLLAR);
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

	public static class Default_callContext extends ParserRuleContext {
		public Id_function2Context id_function2() {
			return getRuleContext(Id_function2Context.class,0);
		}
		public Tk_open_brackedContext tk_open_bracked() {
			return getRuleContext(Tk_open_brackedContext.class,0);
		}
		public Call_default_parametersContext call_default_parameters() {
			return getRuleContext(Call_default_parametersContext.class,0);
		}
		public Tk_close_brackedContext tk_close_bracked() {
			return getRuleContext(Tk_close_brackedContext.class,0);
		}
		public Default_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterDefault_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitDefault_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitDefault_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_callContext default_call() throws RecognitionException {
		Default_callContext _localctx = new Default_callContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_default_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			id_function2();
			setState(727);
			tk_open_bracked();
			setState(728);
			call_default_parameters();
			setState(729);
			tk_close_bracked();
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

	public static class Id_function2Context extends ParserRuleContext {
		public Id_functionContext id_function() {
			return getRuleContext(Id_functionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Id_function2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_function2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterId_function2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitId_function2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitId_function2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Id_function2Context id_function2() throws RecognitionException {
		Id_function2Context _localctx = new Id_function2Context(_ctx, getState());
		enterRule(_localctx, 214, RULE_id_function2);
		try {
			setState(733);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				id_function();
				}
				break;
			case TK_NUMBER:
			case TK_TEXT:
			case TK_BOOLEAN:
			case TK_FILE:
			case TK_LIST:
			case TK_TREE:
			case TK_GROUP:
				enterOuterAlt(_localctx, 2);
				{
				setState(732);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Call_default_parametersContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Add_default_expressionContext add_default_expression() {
			return getRuleContext(Add_default_expressionContext.class,0);
		}
		public Call_default_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_default_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterCall_default_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitCall_default_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitCall_default_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_default_parametersContext call_default_parameters() throws RecognitionException {
		Call_default_parametersContext _localctx = new Call_default_parametersContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_call_default_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_OPEN_BRACKED) | (1L << TK_OPEN_BRACES) | (1L << TK_OPEN_SQUARE_BRACKED) | (1L << TK_NOT) | (1L << TRUE_VAL) | (1L << FALSE_VAL) | (1L << NUMBER_VAL) | (1L << TEXT_VAL) | (1L << FILE_VAL) | (1L << ID) | (1L << ID_DIR))) != 0)) {
				{
				setState(735);
				expression(0);
				setState(736);
				add_default_expression();
				}
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

	public static class Add_default_expressionContext extends ParserRuleContext {
		public TerminalNode TK_COMMA() { return getToken(StructFileGrammarParser.TK_COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Add_default_expressionContext add_default_expression() {
			return getRuleContext(Add_default_expressionContext.class,0);
		}
		public Add_default_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_default_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).enterAdd_default_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StructFileGrammarListener ) ((StructFileGrammarListener)listener).exitAdd_default_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StructFileGrammarVisitor ) return ((StructFileGrammarVisitor<? extends T>)visitor).visitAdd_default_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_default_expressionContext add_default_expression() throws RecognitionException {
		Add_default_expressionContext _localctx = new Add_default_expressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_add_default_expression);
		try {
			setState(745);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(740);
				match(TK_COMMA);
				setState(741);
				expression(0);
				setState(742);
				add_default_expression();
				}
				break;
			case TK_CLOSE_BRACKED:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 66:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u02ee\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\3\2\3\2\3\2\5\2\u00e2\n\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00f7\n"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0101\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u011b\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u0145\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u014c\n\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\31\5\31\u0155\n\31\3\32\3\32\3\32\3\32\5\32\u015b\n\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\5\35\u0167\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u016e\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u0175"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u017f\n \3!\3!\3\"\3\"\3\"\5\"\u0186"+
		"\n\"\3#\3#\3#\3#\5#\u018c\n#\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0196\n$\3%\3"+
		"%\3&\3&\3&\5&\u019d\n&\3\'\3\'\3\'\3\'\5\'\u01a3\n\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3*\3*\3*\5*\u01b3\n*\3+\3+\3+\3+\5+\u01b9\n+\3,\3,\3"+
		",\3,\3-\3-\3-\5-\u01c2\n-\3.\3.\3.\3.\5.\u01c8\n.\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\5\62\u01db\n\62"+
		"\3\63\3\63\3\63\3\63\5\63\u01e1\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\65\3\65\3\66\3\66\3\66\5\66\u01f0\n\66\3\67\3\67\3\67\3\67\5\67"+
		"\u01f6\n\67\38\38\38\38\38\38\38\38\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\5"+
		";\u020b\n;\3<\3<\3<\3<\5<\u0211\n<\3=\3=\3=\3>\3>\3>\3>\5>\u021a\n>\3"+
		"?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0227\n@\3A\3A\3B\3B\3C\3C\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\5D\u0238\nD\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\7D\u024c\nD\fD\16D\u024f\13D\3E\3E\3F\3F\3G\3G\3H\3H"+
		"\3H\3H\3H\3H\5H\u025d\nH\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3O"+
		"\3O\3O\3O\3O\5O\u0272\nO\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W"+
		"\3W\5W\u0284\nW\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u0290\nZ\5Z\u0292\nZ"+
		"\3[\3[\5[\u0296\n[\3\\\3\\\3\\\3\\\3\\\3]\3]\3^\3^\3^\3^\3^\5^\u02a4\n"+
		"^\3_\3_\3`\3`\3a\3a\3b\3b\5b\u02ae\nb\3b\3b\3c\3c\3c\3c\3c\3d\3d\3d\3"+
		"d\3d\3d\3d\5d\u02be\nd\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\5f\u02ca\nf\3g\3"+
		"g\3h\3h\3h\3i\3i\5i\u02d3\ni\3j\3j\3k\3k\3l\3l\3l\3l\3l\3m\3m\5m\u02e0"+
		"\nm\3n\3n\3n\5n\u02e5\nn\3o\3o\3o\3o\3o\5o\u02ec\no\3o\2\3\u0086p\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\2\3\3\2\65\66\2\u02d3\2\u00e1\3\2\2\2\4\u00f6\3\2\2"+
		"\2\6\u00f8\3\2\2\2\b\u0100\3\2\2\2\n\u011a\3\2\2\2\f\u011c\3\2\2\2\16"+
		"\u011e\3\2\2\2\20\u0120\3\2\2\2\22\u0122\3\2\2\2\24\u0124\3\2\2\2\26\u0126"+
		"\3\2\2\2\30\u0128\3\2\2\2\32\u012a\3\2\2\2\34\u012c\3\2\2\2\36\u0130\3"+
		"\2\2\2 \u0132\3\2\2\2\"\u013b\3\2\2\2$\u013d\3\2\2\2&\u013f\3\2\2\2(\u0144"+
		"\3\2\2\2*\u014b\3\2\2\2,\u014d\3\2\2\2.\u014f\3\2\2\2\60\u0154\3\2\2\2"+
		"\62\u015a\3\2\2\2\64\u015c\3\2\2\2\66\u015e\3\2\2\28\u0166\3\2\2\2:\u016d"+
		"\3\2\2\2<\u0174\3\2\2\2>\u0176\3\2\2\2@\u0180\3\2\2\2B\u0185\3\2\2\2D"+
		"\u018b\3\2\2\2F\u0195\3\2\2\2H\u0197\3\2\2\2J\u019c\3\2\2\2L\u01a2\3\2"+
		"\2\2N\u01a4\3\2\2\2P\u01ad\3\2\2\2R\u01b2\3\2\2\2T\u01b8\3\2\2\2V\u01ba"+
		"\3\2\2\2X\u01c1\3\2\2\2Z\u01c7\3\2\2\2\\\u01c9\3\2\2\2^\u01cd\3\2\2\2"+
		"`\u01d5\3\2\2\2b\u01da\3\2\2\2d\u01e0\3\2\2\2f\u01e2\3\2\2\2h\u01ea\3"+
		"\2\2\2j\u01ef\3\2\2\2l\u01f5\3\2\2\2n\u01f7\3\2\2\2p\u01ff\3\2\2\2r\u0201"+
		"\3\2\2\2t\u020a\3\2\2\2v\u0210\3\2\2\2x\u0212\3\2\2\2z\u0219\3\2\2\2|"+
		"\u021b\3\2\2\2~\u0226\3\2\2\2\u0080\u0228\3\2\2\2\u0082\u022a\3\2\2\2"+
		"\u0084\u022c\3\2\2\2\u0086\u0237\3\2\2\2\u0088\u0250\3\2\2\2\u008a\u0252"+
		"\3\2\2\2\u008c\u0254\3\2\2\2\u008e\u025c\3\2\2\2\u0090\u025e\3\2\2\2\u0092"+
		"\u0260\3\2\2\2\u0094\u0262\3\2\2\2\u0096\u0264\3\2\2\2\u0098\u0266\3\2"+
		"\2\2\u009a\u0268\3\2\2\2\u009c\u0271\3\2\2\2\u009e\u0273\3\2\2\2\u00a0"+
		"\u0275\3\2\2\2\u00a2\u0277\3\2\2\2\u00a4\u0279\3\2\2\2\u00a6\u027b\3\2"+
		"\2\2\u00a8\u027d\3\2\2\2\u00aa\u027f\3\2\2\2\u00ac\u0281\3\2\2\2\u00ae"+
		"\u0287\3\2\2\2\u00b0\u0289\3\2\2\2\u00b2\u0291\3\2\2\2\u00b4\u0295\3\2"+
		"\2\2\u00b6\u0297\3\2\2\2\u00b8\u029c\3\2\2\2\u00ba\u02a3\3\2\2\2\u00bc"+
		"\u02a5\3\2\2\2\u00be\u02a7\3\2\2\2\u00c0\u02a9\3\2\2\2\u00c2\u02ab\3\2"+
		"\2\2\u00c4\u02b1\3\2\2\2\u00c6\u02bd\3\2\2\2\u00c8\u02bf\3\2\2\2\u00ca"+
		"\u02c9\3\2\2\2\u00cc\u02cb\3\2\2\2\u00ce\u02cd\3\2\2\2\u00d0\u02d2\3\2"+
		"\2\2\u00d2\u02d4\3\2\2\2\u00d4\u02d6\3\2\2\2\u00d6\u02d8\3\2\2\2\u00d8"+
		"\u02df\3\2\2\2\u00da\u02e4\3\2\2\2\u00dc\u02eb\3\2\2\2\u00de\u00df\5\4"+
		"\3\2\u00df\u00e0\5z>\2\u00e0\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5|?\2\u00e4\3\3\2\2\2\u00e5\u00e6"+
		"\5\b\5\2\u00e6\u00e7\5\6\4\2\u00e7\u00f7\3\2\2\2\u00e8\u00e9\5\34\17\2"+
		"\u00e9\u00ea\5\6\4\2\u00ea\u00f7\3\2\2\2\u00eb\u00f7\5 \21\2\u00ec\u00ed"+
		"\5\66\34\2\u00ed\u00ee\5\6\4\2\u00ee\u00f7\3\2\2\2\u00ef\u00f7\5<\37\2"+
		"\u00f0\u00f1\5x=\2\u00f1\u00f2\5\6\4\2\u00f2\u00f7\3\2\2\2\u00f3\u00f4"+
		"\5\u0086D\2\u00f4\u00f5\5\6\4\2\u00f5\u00f7\3\2\2\2\u00f6\u00e5\3\2\2"+
		"\2\u00f6\u00e8\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00ef"+
		"\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\5\3\2\2\2\u00f8"+
		"\u00f9\7\32\2\2\u00f9\7\3\2\2\2\u00fa\u00fb\5\n\6\2\u00fb\u00fc\5\32\16"+
		"\2\u00fc\u0101\3\2\2\2\u00fd\u00fe\5\n\6\2\u00fe\u00ff\5\34\17\2\u00ff"+
		"\u0101\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\t\3\2\2\2"+
		"\u0102\u011b\5\f\7\2\u0103\u011b\5\16\b\2\u0104\u011b\5\20\t\2\u0105\u011b"+
		"\5\22\n\2\u0106\u011b\5\24\13\2\u0107\u011b\5\26\f\2\u0108\u0109\5\30"+
		"\r\2\u0109\u010a\5\f\7\2\u010a\u011b\3\2\2\2\u010b\u010c\5\30\r\2\u010c"+
		"\u010d\5\16\b\2\u010d\u011b\3\2\2\2\u010e\u010f\5\30\r\2\u010f\u0110\5"+
		"\20\t\2\u0110\u011b\3\2\2\2\u0111\u0112\5\30\r\2\u0112\u0113\5\22\n\2"+
		"\u0113\u011b\3\2\2\2\u0114\u0115\5\30\r\2\u0115\u0116\5\24\13\2\u0116"+
		"\u011b\3\2\2\2\u0117\u0118\5\30\r\2\u0118\u0119\5\26\f\2\u0119\u011b\3"+
		"\2\2\2\u011a\u0102\3\2\2\2\u011a\u0103\3\2\2\2\u011a\u0104\3\2\2\2\u011a"+
		"\u0105\3\2\2\2\u011a\u0106\3\2\2\2\u011a\u0107\3\2\2\2\u011a\u0108\3\2"+
		"\2\2\u011a\u010b\3\2\2\2\u011a\u010e\3\2\2\2\u011a\u0111\3\2\2\2\u011a"+
		"\u0114\3\2\2\2\u011a\u0117\3\2\2\2\u011b\13\3\2\2\2\u011c\u011d\7\6\2"+
		"\2\u011d\r\3\2\2\2\u011e\u011f\7\b\2\2\u011f\17\3\2\2\2\u0120\u0121\7"+
		"\7\2\2\u0121\21\3\2\2\2\u0122\u0123\7\t\2\2\u0123\23\3\2\2\2\u0124\u0125"+
		"\7\n\2\2\u0125\25\3\2\2\2\u0126\u0127\7\13\2\2\u0127\27\3\2\2\2\u0128"+
		"\u0129\7\f\2\2\u0129\31\3\2\2\2\u012a\u012b\7:\2\2\u012b\33\3\2\2\2\u012c"+
		"\u012d\5\32\16\2\u012d\u012e\5\36\20\2\u012e\u012f\5\u0086D\2\u012f\35"+
		"\3\2\2\2\u0130\u0131\7\62\2\2\u0131\37\3\2\2\2\u0132\u0133\5\"\22\2\u0133"+
		"\u0134\5$\23\2\u0134\u0135\5&\24\2\u0135\u0136\5(\25\2\u0136\u0137\5,"+
		"\27\2\u0137\u0138\5.\30\2\u0138\u0139\5\60\31\2\u0139\u013a\5\64\33\2"+
		"\u013a!\3\2\2\2\u013b\u013c\5\n\6\2\u013c#\3\2\2\2\u013d\u013e\7:\2\2"+
		"\u013e%\3\2\2\2\u013f\u0140\7\34\2\2\u0140\'\3\2\2\2\u0141\u0142\5\b\5"+
		"\2\u0142\u0143\5*\26\2\u0143\u0145\3\2\2\2\u0144\u0141\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145)\3\2\2\2\u0146\u0147\7\33\2\2\u0147\u0148\5\b\5\2\u0148"+
		"\u0149\5*\26\2\u0149\u014c\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0146\3\2"+
		"\2\2\u014b\u014a\3\2\2\2\u014c+\3\2\2\2\u014d\u014e\7\35\2\2\u014e-\3"+
		"\2\2\2\u014f\u0150\7\36\2\2\u0150/\3\2\2\2\u0151\u0152\5\4\3\2\u0152\u0153"+
		"\5\62\32\2\u0153\u0155\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0155\3\2\2\2"+
		"\u0155\61\3\2\2\2\u0156\u0157\5\4\3\2\u0157\u0158\5\62\32\2\u0158\u015b"+
		"\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0156\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"\63\3\2\2\2\u015c\u015d\7\37\2\2\u015d\65\3\2\2\2\u015e\u015f\5$\23\2"+
		"\u015f\u0160\5&\24\2\u0160\u0161\58\35\2\u0161\u0162\5,\27\2\u0162\67"+
		"\3\2\2\2\u0163\u0164\5\u0086D\2\u0164\u0165\5:\36\2\u0165\u0167\3\2\2"+
		"\2\u0166\u0163\3\2\2\2\u0166\u0167\3\2\2\2\u01679\3\2\2\2\u0168\u0169"+
		"\7\33\2\2\u0169\u016a\5\u0086D\2\u016a\u016b\5:\36\2\u016b\u016e\3\2\2"+
		"\2\u016c\u016e\3\2\2\2\u016d\u0168\3\2\2\2\u016d\u016c\3\2\2\2\u016e;"+
		"\3\2\2\2\u016f\u0175\5> \2\u0170\u0175\5N(\2\u0171\u0175\5^\60\2\u0172"+
		"\u0175\5f\64\2\u0173\u0175\5n8\2\u0174\u016f\3\2\2\2\u0174\u0170\3\2\2"+
		"\2\u0174\u0171\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0173\3\2\2\2\u0175="+
		"\3\2\2\2\u0176\u0177\5@!\2\u0177\u0178\5&\24\2\u0178\u0179\5\u0086D\2"+
		"\u0179\u017a\5,\27\2\u017a\u017b\5.\30\2\u017b\u017c\5B\"\2\u017c\u017e"+
		"\5\64\33\2\u017d\u017f\5F$\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"?\3\2\2\2\u0180\u0181\7\r\2\2\u0181A\3\2\2\2\u0182\u0183\5\4\3\2\u0183"+
		"\u0184\5D#\2\u0184\u0186\3\2\2\2\u0185\u0182\3\2\2\2\u0185\u0186\3\2\2"+
		"\2\u0186C\3\2\2\2\u0187\u0188\5\4\3\2\u0188\u0189\5D#\2\u0189\u018c\3"+
		"\2\2\2\u018a\u018c\3\2\2\2\u018b\u0187\3\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"E\3\2\2\2\u018d\u018e\5H%\2\u018e\u018f\5> \2\u018f\u0196\3\2\2\2\u0190"+
		"\u0191\5H%\2\u0191\u0192\5.\30\2\u0192\u0193\5J&\2\u0193\u0194\5\64\33"+
		"\2\u0194\u0196\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u0190\3\2\2\2\u0196G"+
		"\3\2\2\2\u0197\u0198\7\16\2\2\u0198I\3\2\2\2\u0199\u019a\5\4\3\2\u019a"+
		"\u019b\5L\'\2\u019b\u019d\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019d\3\2"+
		"\2\2\u019dK\3\2\2\2\u019e\u019f\5\4\3\2\u019f\u01a0\5L\'\2\u01a0\u01a3"+
		"\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u019e\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"M\3\2\2\2\u01a4\u01a5\5P)\2\u01a5\u01a6\5&\24\2\u01a6\u01a7\5\u0086D\2"+
		"\u01a7\u01a8\5,\27\2\u01a8\u01a9\5.\30\2\u01a9\u01aa\5R*\2\u01aa\u01ab"+
		"\5\\/\2\u01ab\u01ac\5\64\33\2\u01acO\3\2\2\2\u01ad\u01ae\7\17\2\2\u01ae"+
		"Q\3\2\2\2\u01af\u01b0\5V,\2\u01b0\u01b1\5T+\2\u01b1\u01b3\3\2\2\2\u01b2"+
		"\u01af\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3S\3\2\2\2\u01b4\u01b5\5V,\2\u01b5"+
		"\u01b6\5T+\2\u01b6\u01b9\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b4\3\2\2"+
		"\2\u01b8\u01b7\3\2\2\2\u01b9U\3\2\2\2\u01ba\u01bb\5\u0086D\2\u01bb\u01bc"+
		"\5\u00b0Y\2\u01bc\u01bd\5X-\2\u01bdW\3\2\2\2\u01be\u01bf\5\4\3\2\u01bf"+
		"\u01c0\5Z.\2\u01c0\u01c2\3\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01c2\3\2\2"+
		"\2\u01c2Y\3\2\2\2\u01c3\u01c4\5\4\3\2\u01c4\u01c5\5Z.\2\u01c5\u01c8\3"+
		"\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c3\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8"+
		"[\3\2\2\2\u01c9\u01ca\5H%\2\u01ca\u01cb\5\u00b0Y\2\u01cb\u01cc\5X-\2\u01cc"+
		"]\3\2\2\2\u01cd\u01ce\5`\61\2\u01ce\u01cf\5&\24\2\u01cf\u01d0\5\u0086"+
		"D\2\u01d0\u01d1\5,\27\2\u01d1\u01d2\5.\30\2\u01d2\u01d3\5b\62\2\u01d3"+
		"\u01d4\5\64\33\2\u01d4_\3\2\2\2\u01d5\u01d6\7\22\2\2\u01d6a\3\2\2\2\u01d7"+
		"\u01d8\5\4\3\2\u01d8\u01d9\5d\63\2\u01d9\u01db\3\2\2\2\u01da\u01d7\3\2"+
		"\2\2\u01da\u01db\3\2\2\2\u01dbc\3\2\2\2\u01dc\u01dd\5\4\3\2\u01dd\u01de"+
		"\5d\63\2\u01de\u01e1\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01dc\3\2\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e1e\3\2\2\2\u01e2\u01e3\5h\65\2\u01e3\u01e4\5.\30\2"+
		"\u01e4\u01e5\5j\66\2\u01e5\u01e6\5\64\33\2\u01e6\u01e7\5&\24\2\u01e7\u01e8"+
		"\5\u0086D\2\u01e8\u01e9\5,\27\2\u01e9g\3\2\2\2\u01ea\u01eb\7\23\2\2\u01eb"+
		"i\3\2\2\2\u01ec\u01ed\5\4\3\2\u01ed\u01ee\5l\67\2\u01ee\u01f0\3\2\2\2"+
		"\u01ef\u01ec\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0k\3\2\2\2\u01f1\u01f2\5"+
		"\4\3\2\u01f2\u01f3\5l\67\2\u01f3\u01f6\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5"+
		"\u01f1\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6m\3\2\2\2\u01f7\u01f8\5p9\2\u01f8"+
		"\u01f9\5&\24\2\u01f9\u01fa\5r:\2\u01fa\u01fb\5,\27\2\u01fb\u01fc\5.\30"+
		"\2\u01fc\u01fd\5t;\2\u01fd\u01fe\5\64\33\2\u01feo\3\2\2\2\u01ff\u0200"+
		"\7\24\2\2\u0200q\3\2\2\2\u0201\u0202\5\b\5\2\u0202\u0203\5\6\4\2\u0203"+
		"\u0204\5\u0086D\2\u0204\u0205\5\6\4\2\u0205\u0206\5\34\17\2\u0206s\3\2"+
		"\2\2\u0207\u0208\5\4\3\2\u0208\u0209\5v<\2\u0209\u020b\3\2\2\2\u020a\u0207"+
		"\3\2\2\2\u020a\u020b\3\2\2\2\u020bu\3\2\2\2\u020c\u020d\5\4\3\2\u020d"+
		"\u020e\5v<\2\u020e\u0211\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020c\3\2\2"+
		"\2\u0210\u020f\3\2\2\2\u0211w\3\2\2\2\u0212\u0213\7\25\2\2\u0213\u0214"+
		"\5\u0086D\2\u0214y\3\2\2\2\u0215\u0216\5\4\3\2\u0216\u0217\5z>\2\u0217"+
		"\u021a\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0215\3\2\2\2\u0219\u0218\3\2"+
		"\2\2\u021a{\3\2\2\2\u021b\u021c\7\2\2\3\u021c}\3\2\2\2\u021d\u0227\5\u0080"+
		"A\2\u021e\u0227\5\u0084C\2\u021f\u0227\5\u0082B\2\u0220\u0227\5\u00c0"+
		"a\2\u0221\u0227\5\u00acW\2\u0222\u0227\5\u00c2b\2\u0223\u0227\5\u00c8"+
		"e\2\u0224\u0227\5\32\16\2\u0225\u0227\5\66\34\2\u0226\u021d\3\2\2\2\u0226"+
		"\u021e\3\2\2\2\u0226\u021f\3\2\2\2\u0226\u0220\3\2\2\2\u0226\u0221\3\2"+
		"\2\2\u0226\u0222\3\2\2\2\u0226\u0223\3\2\2\2\u0226\u0224\3\2\2\2\u0226"+
		"\u0225\3\2\2\2\u0227\177\3\2\2\2\u0228\u0229\7\67\2\2\u0229\u0081\3\2"+
		"\2\2\u022a\u022b\78\2\2\u022b\u0083\3\2\2\2\u022c\u022d\t\2\2\2\u022d"+
		"\u0085\3\2\2\2\u022e\u022f\bD\1\2\u022f\u0230\5&\24\2\u0230\u0231\5\u0086"+
		"D\2\u0231\u0232\5,\27\2\u0232\u0238\3\2\2\2\u0233\u0234\5\u008cG\2\u0234"+
		"\u0235\5\u0086D\6\u0235\u0238\3\2\2\2\u0236\u0238\5~@\2\u0237\u022e\3"+
		"\2\2\2\u0237\u0233\3\2\2\2\u0237\u0236\3\2\2\2\u0238\u024d\3\2\2\2\u0239"+
		"\u023a\f\b\2\2\u023a\u023b\5\u0088E\2\u023b\u023c\5\u0086D\t\u023c\u024c"+
		"\3\2\2\2\u023d\u023e\f\7\2\2\u023e\u023f\5\u008aF\2\u023f\u0240\5\u0086"+
		"D\b\u0240\u024c\3\2\2\2\u0241\u0242\f\5\2\2\u0242\u0243\5\u008eH\2\u0243"+
		"\u0244\5\u0086D\6\u0244\u024c\3\2\2\2\u0245\u0246\f\4\2\2\u0246\u0247"+
		"\5\u009cO\2\u0247\u0248\5\u0086D\5\u0248\u024c\3\2\2\2\u0249\u024a\f\n"+
		"\2\2\u024a\u024c\5\u00ccg\2\u024b\u0239\3\2\2\2\u024b\u023d\3\2\2\2\u024b"+
		"\u0241\3\2\2\2\u024b\u0245\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u024f\3\2"+
		"\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0087\3\2\2\2\u024f"+
		"\u024d\3\2\2\2\u0250\u0251\7\"\2\2\u0251\u0089\3\2\2\2\u0252\u0253\7#"+
		"\2\2\u0253\u008b\3\2\2\2\u0254\u0255\7$\2\2\u0255\u008d\3\2\2\2\u0256"+
		"\u025d\5\u0090I\2\u0257\u025d\5\u0092J\2\u0258\u025d\5\u0094K\2\u0259"+
		"\u025d\5\u0096L\2\u025a\u025d\5\u0098M\2\u025b\u025d\5\u009aN\2\u025c"+
		"\u0256\3\2\2\2\u025c\u0257\3\2\2\2\u025c\u0258\3\2\2\2\u025c\u0259\3\2"+
		"\2\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2\2\2\u025d\u008f\3\2\2\2\u025e"+
		"\u025f\7%\2\2\u025f\u0091\3\2\2\2\u0260\u0261\7&\2\2\u0261\u0093\3\2\2"+
		"\2\u0262\u0263\7\'\2\2\u0263\u0095\3\2\2\2\u0264\u0265\7(\2\2\u0265\u0097"+
		"\3\2\2\2\u0266\u0267\7)\2\2\u0267\u0099\3\2\2\2\u0268\u0269\7*\2\2\u0269"+
		"\u009b\3\2\2\2\u026a\u0272\5\u009eP\2\u026b\u0272\5\u00a0Q\2\u026c\u0272"+
		"\5\u00a2R\2\u026d\u0272\5\u00a4S\2\u026e\u0272\5\u00a6T\2\u026f\u0272"+
		"\5\u00a8U\2\u0270\u0272\5\u00aaV\2\u0271\u026a\3\2\2\2\u0271\u026b\3\2"+
		"\2\2\u0271\u026c\3\2\2\2\u0271\u026d\3\2\2\2\u0271\u026e\3\2\2\2\u0271"+
		"\u026f\3\2\2\2\u0271\u0270\3\2\2\2\u0272\u009d\3\2\2\2\u0273\u0274\7+"+
		"\2\2\u0274\u009f\3\2\2\2\u0275\u0276\7,\2\2\u0276\u00a1\3\2\2\2\u0277"+
		"\u0278\7-\2\2\u0278\u00a3\3\2\2\2\u0279\u027a\7.\2\2\u027a\u00a5\3\2\2"+
		"\2\u027b\u027c\7\61\2\2\u027c\u00a7\3\2\2\2\u027d\u027e\7/\2\2\u027e\u00a9"+
		"\3\2\2\2\u027f\u0280\7\60\2\2\u0280\u00ab\3\2\2\2\u0281\u0283\5\u00ae"+
		"X\2\u0282\u0284\5\u00b0Y\2\u0283\u0282\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\u0286\5\u00b2Z\2\u0286\u00ad\3\2\2\2\u0287\u0288"+
		"\7;\2\2\u0288\u00af\3\2\2\2\u0289\u028a\7\31\2\2\u028a\u00b1\3\2\2\2\u028b"+
		"\u028c\5\u00aeX\2\u028c\u028d\5\u00b2Z\2\u028d\u0292\3\2\2\2\u028e\u0290"+
		"\5\u00b4[\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2"+
		"\2\u0291\u028b\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u00b3\3\2\2\2\u0293\u0296"+
		"\5\u00c0a\2\u0294\u0296\5\u00b6\\\2\u0295\u0293\3\2\2\2\u0295\u0294\3"+
		"\2\2\2\u0296\u00b5\3\2\2\2\u0297\u0298\5\u00b8]\2\u0298\u0299\5\u00b2"+
		"Z\2\u0299\u029a\5\u00ba^\2\u029a\u029b\5\u00be`\2\u029b\u00b7\3\2\2\2"+
		"\u029c\u029d\7 \2\2\u029d\u00b9\3\2\2\2\u029e\u029f\5\u00bc_\2\u029f\u02a0"+
		"\5\u00b2Z\2\u02a0\u02a1\5\u00ba^\2\u02a1\u02a4\3\2\2\2\u02a2\u02a4\3\2"+
		"\2\2\u02a3\u029e\3\2\2\2\u02a3\u02a2\3\2\2\2\u02a4\u00bb\3\2\2\2\u02a5"+
		"\u02a6\7\33\2\2\u02a6\u00bd\3\2\2\2\u02a7\u02a8\7!\2\2\u02a8\u00bf\3\2"+
		"\2\2\u02a9\u02aa\79\2\2\u02aa\u00c1\3\2\2\2\u02ab\u02ad\5.\30\2\u02ac"+
		"\u02ae\5\u00c4c\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af"+
		"\3\2\2\2\u02af\u02b0\5\64\33\2\u02b0\u00c3\3\2\2\2\u02b1\u02b2\5\u0086"+
		"D\2\u02b2\u02b3\5\u00d2j\2\u02b3\u02b4\5\u0086D\2\u02b4\u02b5\5\u00c6"+
		"d\2\u02b5\u00c5\3\2\2\2\u02b6\u02b7\5\u00bc_\2\u02b7\u02b8\5\u0086D\2"+
		"\u02b8\u02b9\5\u00d2j\2\u02b9\u02ba\5\u0086D\2\u02ba\u02bb\5\u00c6d\2"+
		"\u02bb\u02be\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02b6\3\2\2\2\u02bd\u02bc"+
		"\3\2\2\2\u02be\u00c7\3\2\2\2\u02bf\u02c0\5\u00b8]\2\u02c0\u02c1\5\u0086"+
		"D\2\u02c1\u02c2\5\u00caf\2\u02c2\u02c3\5\u00be`\2\u02c3\u00c9\3\2\2\2"+
		"\u02c4\u02c5\5\u00bc_\2\u02c5\u02c6\5\u0086D\2\u02c6\u02c7\5\u00caf\2"+
		"\u02c7\u02ca\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c4\3\2\2\2\u02c9\u02c8"+
		"\3\2\2\2\u02ca\u00cb\3\2\2\2\u02cb\u02cc\5\u00ceh\2\u02cc\u00cd\3\2\2"+
		"\2\u02cd\u02ce\5\u00d0i\2\u02ce\u02cf\5\u00d6l\2\u02cf\u00cf\3\2\2\2\u02d0"+
		"\u02d3\5\u00d2j\2\u02d1\u02d3\5\u00d4k\2\u02d2\u02d0\3\2\2\2\u02d2\u02d1"+
		"\3\2\2\2\u02d3\u00d1\3\2\2\2\u02d4\u02d5\7\63\2\2\u02d5\u00d3\3\2\2\2"+
		"\u02d6\u02d7\7\64\2\2\u02d7\u00d5\3\2\2\2\u02d8\u02d9\5\u00d8m\2\u02d9"+
		"\u02da\5&\24\2\u02da\u02db\5\u00dan\2\u02db\u02dc\5,\27\2\u02dc\u00d7"+
		"\3\2\2\2\u02dd\u02e0\5$\23\2\u02de\u02e0\5\n\6\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02de\3\2\2\2\u02e0\u00d9\3\2\2\2\u02e1\u02e2\5\u0086D\2\u02e2\u02e3"+
		"\5\u00dco\2\u02e3\u02e5\3\2\2\2\u02e4\u02e1\3\2\2\2\u02e4\u02e5\3\2\2"+
		"\2\u02e5\u00db\3\2\2\2\u02e6\u02e7\7\33\2\2\u02e7\u02e8\5\u0086D\2\u02e8"+
		"\u02e9\5\u00dco\2\u02e9\u02ec\3\2\2\2\u02ea\u02ec\3\2\2\2\u02eb\u02e6"+
		"\3\2\2\2\u02eb\u02ea\3\2\2\2\u02ec\u00dd\3\2\2\2\60\u00e1\u00f6\u0100"+
		"\u011a\u0144\u014b\u0154\u015a\u0166\u016d\u0174\u017e\u0185\u018b\u0195"+
		"\u019c\u01a2\u01b2\u01b8\u01c1\u01c7\u01da\u01e0\u01ef\u01f5\u020a\u0210"+
		"\u0219\u0226\u0237\u024b\u024d\u025c\u0271\u0283\u028f\u0291\u0295\u02a3"+
		"\u02ad\u02bd\u02c9\u02d2\u02df\u02e4\u02eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}