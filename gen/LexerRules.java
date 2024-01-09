// Generated from G:/Dev/Carbon/Carbon/Parser/Grammar\LexerRules.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerRules extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PP_IMPORT=1, PP_DEFINE=2, CLASS=3, INTERFACE=4, PROTECT=5, PUBLIC=6, PRIVATE=7, 
		INTERNAL=8, G_ASSEMBLY=9, G_DOT=10, G_ENTRY=11, G_ELLIPSE=12, PROP_GET=13, 
		PROP_SET=14, CMP=15, CM_GTR=16, CM_LSS=17, CM_EQU=18, CM_GTR_EQU=19, CM_LSS_EQU=20, 
		UNARY_MATH=21, SET=22, AMB_MATH=23, BIN_MATH=24, A_SET=25, A_ADD=26, A_SUB=27, 
		A_MULT=28, A_DIV=29, A_EXP=30, A_MOD=31, A_SET_SUM=32, A_SET_DIFF=33, 
		A_SET_MULT=34, A_SET_QUOTIENT=35, A_INCREMENT=36, A_DECRIMENT=37, UNARY_LG_OP=38, 
		BIN_LG_OP=39, L_OR=40, L_AND=41, L_NAND=42, L_NOR=43, L_XOR=44, L_XNOR=45, 
		L_NOT=46, UNARY_BW_OP=47, BIN_BW_OP=48, BL_AND=49, BL_OR=50, BL_INV=51, 
		BL_LEFT=52, BL_RIGHT=53, CTRL_CND=54, CTRL_KW=55, C_IF=56, C_ELSE=57, 
		C_WHILE=58, C_FOR=59, C_GOTO=60, C_BREAK=61, C_CONT=62, C_IN=63, L_BRACKET=64, 
		R_BRACKET=65, L_PARANTH=66, R_PARANTH=67, L_BRACE=68, R_BRACE=69, LINE_COMMENT=70, 
		BLOCK_COMMENT=71, BOOL_VAL=72, REF_VAL=73, VALUE=74, THIS=75, TRUE=76, 
		FALSE=77, RETURN=78, PRIMITIVE=79, NUMBER=80, STRING=81, CHAR=82, COMMA=83, 
		INTEGER=84, DECIMAL=85, IDENTIFIER=86, SEMI=87, WS=88;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PP_IMPORT", "PP_DEFINE", "CLASS", "INTERFACE", "PROTECT", "PUBLIC", 
			"PRIVATE", "INTERNAL", "G_ASSEMBLY", "G_DOT", "G_ENTRY", "G_ELLIPSE", 
			"PROP_GET", "PROP_SET", "CMP", "CM_GTR", "CM_LSS", "CM_EQU", "CM_GTR_EQU", 
			"CM_LSS_EQU", "UNARY_MATH", "SET", "AMB_MATH", "BIN_MATH", "A_SET", "A_ADD", 
			"A_SUB", "A_MULT", "A_DIV", "A_EXP", "A_MOD", "A_SET_SUM", "A_SET_DIFF", 
			"A_SET_MULT", "A_SET_QUOTIENT", "A_INCREMENT", "A_DECRIMENT", "UNARY_LG_OP", 
			"BIN_LG_OP", "L_OR", "L_AND", "L_NAND", "L_NOR", "L_XOR", "L_XNOR", "L_NOT", 
			"UNARY_BW_OP", "BIN_BW_OP", "BL_AND", "BL_OR", "BL_INV", "BL_LEFT", "BL_RIGHT", 
			"CTRL_CND", "CTRL_KW", "C_IF", "C_ELSE", "C_WHILE", "C_FOR", "C_GOTO", 
			"C_BREAK", "C_CONT", "C_IN", "L_BRACKET", "R_BRACKET", "L_PARANTH", "R_PARANTH", 
			"L_BRACE", "R_BRACE", "LINE_COMMENT", "BLOCK_COMMENT", "ESCAPE", "ALPHANUM", 
			"ALPHA", "BOOL_VAL", "REF_VAL", "VALUE", "THIS", "TRUE", "FALSE", "RETURN", 
			"PRIMITIVE", "NUMBER", "STRING", "CHAR", "COMMA", "INTEGER", "DECIMAL", 
			"IDENTIFIER", "SEMI", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "'define'", "'class'", "'interface'", null, "'public'", 
			"'private'", "'internal'", "'__asm__'", "'.'", "'entry'", "'...'", "'get'", 
			"'set'", null, "'>'", "'<'", "'=='", "'>='", "'<='", null, null, null, 
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'**'", "'%'", "'+='", "'-='", 
			"'*='", "'/='", "'++'", "'--'", null, null, "'||'", "'&&'", "'!&'", "'!|'", 
			"'^|'", "'^!|'", "'!'", null, null, "'&'", "'|'", "'~'", "'<<'", "'>>'", 
			null, null, "'if'", "'else'", "'while'", "'for'", "'goto'", "'break'", 
			"'continue'", "'in'", "'['", "']'", "'('", "')'", "'{'", "'}'", null, 
			null, null, null, "'value'", "'this'", "'true'", "'false'", "'return'", 
			null, null, null, null, "','", null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PP_IMPORT", "PP_DEFINE", "CLASS", "INTERFACE", "PROTECT", "PUBLIC", 
			"PRIVATE", "INTERNAL", "G_ASSEMBLY", "G_DOT", "G_ENTRY", "G_ELLIPSE", 
			"PROP_GET", "PROP_SET", "CMP", "CM_GTR", "CM_LSS", "CM_EQU", "CM_GTR_EQU", 
			"CM_LSS_EQU", "UNARY_MATH", "SET", "AMB_MATH", "BIN_MATH", "A_SET", "A_ADD", 
			"A_SUB", "A_MULT", "A_DIV", "A_EXP", "A_MOD", "A_SET_SUM", "A_SET_DIFF", 
			"A_SET_MULT", "A_SET_QUOTIENT", "A_INCREMENT", "A_DECRIMENT", "UNARY_LG_OP", 
			"BIN_LG_OP", "L_OR", "L_AND", "L_NAND", "L_NOR", "L_XOR", "L_XNOR", "L_NOT", 
			"UNARY_BW_OP", "BIN_BW_OP", "BL_AND", "BL_OR", "BL_INV", "BL_LEFT", "BL_RIGHT", 
			"CTRL_CND", "CTRL_KW", "C_IF", "C_ELSE", "C_WHILE", "C_FOR", "C_GOTO", 
			"C_BREAK", "C_CONT", "C_IN", "L_BRACKET", "R_BRACKET", "L_PARANTH", "R_PARANTH", 
			"L_BRACE", "R_BRACE", "LINE_COMMENT", "BLOCK_COMMENT", "BOOL_VAL", "REF_VAL", 
			"VALUE", "THIS", "TRUE", "FALSE", "RETURN", "PRIMITIVE", "NUMBER", "STRING", 
			"CHAR", "COMMA", "INTEGER", "DECIMAL", "IDENTIFIER", "SEMI", "WS"
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


	public LexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerRules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Z\u024f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u00db\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0116\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\5\26\u0127\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u012e\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0138\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\5(\u0163\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u0180"+
		"\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\5\67\u0190\n\67\38\38\58\u0194\n8\39\39\39\3:\3:\3:\3:\3:\3;\3;"+
		"\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?"+
		"\3?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\7G"+
		"\u01cd\nG\fG\16G\u01d0\13G\3G\3G\3H\3H\3H\3H\7H\u01d8\nH\fH\16H\u01db"+
		"\13H\3H\3H\3H\3H\3H\3I\3I\3I\3J\3J\5J\u01e7\nJ\3K\3K\3L\3L\5L\u01ed\n"+
		"L\3M\3M\5M\u01f1\nM\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3"+
		"Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\5S\u0214\nS\3T\3T\5"+
		"T\u0218\nT\3U\3U\3U\7U\u021d\nU\fU\16U\u0220\13U\3U\3U\3V\3V\3V\5V\u0227"+
		"\nV\3V\3V\3W\3W\3X\6X\u022e\nX\rX\16X\u022f\3Y\6Y\u0233\nY\rY\16Y\u0234"+
		"\3Y\3Y\5Y\u0239\nY\3Z\6Z\u023c\nZ\rZ\16Z\u023d\3Z\6Z\u0241\nZ\rZ\16Z\u0242"+
		"\5Z\u0245\nZ\3[\3[\3\\\6\\\u024a\n\\\r\\\16\\\u024b\3\\\3\\\3\u01d9\2"+
		"]\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o"+
		"9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH"+
		"\u008fI\u0091\2\u0093\2\u0095\2\u0097J\u0099K\u009bL\u009dM\u009fN\u00a1"+
		"O\u00a3P\u00a5Q\u00a7R\u00a9S\u00abT\u00adU\u00afV\u00b1W\u00b3X\u00b5"+
		"Y\u00b7Z\3\2\t\4\2\f\f\17\17\5\2ddqqzz\5\2C\\aac|\4\2$$^^\4\2))^^\3\2"+
		"\62;\5\2\13\f\16\17\"\"\2\u0278\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2"+
		"\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\3\u00b9\3\2\2\2\5\u00c0\3\2\2\2\7\u00c7"+
		"\3\2\2\2\t\u00cd\3\2\2\2\13\u00da\3\2\2\2\r\u00dc\3\2\2\2\17\u00e3\3\2"+
		"\2\2\21\u00eb\3\2\2\2\23\u00f4\3\2\2\2\25\u00fc\3\2\2\2\27\u00fe\3\2\2"+
		"\2\31\u0104\3\2\2\2\33\u0108\3\2\2\2\35\u010c\3\2\2\2\37\u0115\3\2\2\2"+
		"!\u0117\3\2\2\2#\u0119\3\2\2\2%\u011b\3\2\2\2\'\u011e\3\2\2\2)\u0121\3"+
		"\2\2\2+\u0126\3\2\2\2-\u012d\3\2\2\2/\u012f\3\2\2\2\61\u0137\3\2\2\2\63"+
		"\u0139\3\2\2\2\65\u013b\3\2\2\2\67\u013d\3\2\2\29\u013f\3\2\2\2;\u0141"+
		"\3\2\2\2=\u0143\3\2\2\2?\u0146\3\2\2\2A\u0148\3\2\2\2C\u014b\3\2\2\2E"+
		"\u014e\3\2\2\2G\u0151\3\2\2\2I\u0154\3\2\2\2K\u0157\3\2\2\2M\u015a\3\2"+
		"\2\2O\u0162\3\2\2\2Q\u0164\3\2\2\2S\u0167\3\2\2\2U\u016a\3\2\2\2W\u016d"+
		"\3\2\2\2Y\u0170\3\2\2\2[\u0173\3\2\2\2]\u0177\3\2\2\2_\u0179\3\2\2\2a"+
		"\u017f\3\2\2\2c\u0181\3\2\2\2e\u0183\3\2\2\2g\u0185\3\2\2\2i\u0187\3\2"+
		"\2\2k\u018a\3\2\2\2m\u018f\3\2\2\2o\u0193\3\2\2\2q\u0195\3\2\2\2s\u0198"+
		"\3\2\2\2u\u019d\3\2\2\2w\u01a3\3\2\2\2y\u01a7\3\2\2\2{\u01ac\3\2\2\2}"+
		"\u01b2\3\2\2\2\177\u01bb\3\2\2\2\u0081\u01be\3\2\2\2\u0083\u01c0\3\2\2"+
		"\2\u0085\u01c2\3\2\2\2\u0087\u01c4\3\2\2\2\u0089\u01c6\3\2\2\2\u008b\u01c8"+
		"\3\2\2\2\u008d\u01ca\3\2\2\2\u008f\u01d3\3\2\2\2\u0091\u01e1\3\2\2\2\u0093"+
		"\u01e6\3\2\2\2\u0095\u01e8\3\2\2\2\u0097\u01ec\3\2\2\2\u0099\u01f0\3\2"+
		"\2\2\u009b\u01f2\3\2\2\2\u009d\u01f8\3\2\2\2\u009f\u01fd\3\2\2\2\u00a1"+
		"\u0202\3\2\2\2\u00a3\u0208\3\2\2\2\u00a5\u0213\3\2\2\2\u00a7\u0217\3\2"+
		"\2\2\u00a9\u0219\3\2\2\2\u00ab\u0223\3\2\2\2\u00ad\u022a\3\2\2\2\u00af"+
		"\u022d\3\2\2\2\u00b1\u0232\3\2\2\2\u00b3\u023b\3\2\2\2\u00b5\u0246\3\2"+
		"\2\2\u00b7\u0249\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc"+
		"\7r\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7v\2\2\u00bf"+
		"\4\3\2\2\2\u00c0\u00c1\7f\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7h\2\2\u00c3"+
		"\u00c4\7k\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7g\2\2\u00c6\6\3\2\2\2\u00c7"+
		"\u00c8\7e\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7u\2\2"+
		"\u00cb\u00cc\7u\2\2\u00cc\b\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p"+
		"\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7h\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\n\3\2\2\2\u00d7\u00db\5\r\7\2\u00d8\u00db\5\17\b\2\u00d9\u00db\5\21\t"+
		"\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\f"+
		"\3\2\2\2\u00dc\u00dd\7r\2\2\u00dd\u00de\7w\2\2\u00de\u00df\7d\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7e\2\2\u00e2\16\3\2\2\2\u00e3"+
		"\u00e4\7r\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7x\2\2"+
		"\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\20\3\2"+
		"\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7c\2\2\u00f2"+
		"\u00f3\7n\2\2\u00f3\22\3\2\2\2\u00f4\u00f5\7a\2\2\u00f5\u00f6\7a\2\2\u00f6"+
		"\u00f7\7c\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7o\2\2\u00f9\u00fa\7a\2\2"+
		"\u00fa\u00fb\7a\2\2\u00fb\24\3\2\2\2\u00fc\u00fd\7\60\2\2\u00fd\26\3\2"+
		"\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7p\2\2\u0100\u0101\7v\2\2\u0101\u0102"+
		"\7t\2\2\u0102\u0103\7{\2\2\u0103\30\3\2\2\2\u0104\u0105\7\60\2\2\u0105"+
		"\u0106\7\60\2\2\u0106\u0107\7\60\2\2\u0107\32\3\2\2\2\u0108\u0109\7i\2"+
		"\2\u0109\u010a\7g\2\2\u010a\u010b\7v\2\2\u010b\34\3\2\2\2\u010c\u010d"+
		"\7u\2\2\u010d\u010e\7g\2\2\u010e\u010f\7v\2\2\u010f\36\3\2\2\2\u0110\u0116"+
		"\5!\21\2\u0111\u0116\5#\22\2\u0112\u0116\5\'\24\2\u0113\u0116\5)\25\2"+
		"\u0114\u0116\5%\23\2\u0115\u0110\3\2\2\2\u0115\u0111\3\2\2\2\u0115\u0112"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116 \3\2\2\2\u0117"+
		"\u0118\7@\2\2\u0118\"\3\2\2\2\u0119\u011a\7>\2\2\u011a$\3\2\2\2\u011b"+
		"\u011c\7?\2\2\u011c\u011d\7?\2\2\u011d&\3\2\2\2\u011e\u011f\7@\2\2\u011f"+
		"\u0120\7?\2\2\u0120(\3\2\2\2\u0121\u0122\7>\2\2\u0122\u0123\7?\2\2\u0123"+
		"*\3\2\2\2\u0124\u0127\5I%\2\u0125\u0127\5K&\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127,\3\2\2\2\u0128\u012e\5\63\32\2\u0129\u012e\5A!\2"+
		"\u012a\u012e\5C\"\2\u012b\u012e\5E#\2\u012c\u012e\5G$\2\u012d\u0128\3"+
		"\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012c\3\2\2\2\u012e.\3\2\2\2\u012f\u0130\5\67\34\2\u0130\60\3\2\2\2\u0131"+
		"\u0138\5\65\33\2\u0132\u0138\5/\30\2\u0133\u0138\5;\36\2\u0134\u0138\5"+
		"9\35\2\u0135\u0138\5? \2\u0136\u0138\5=\37\2\u0137\u0131\3\2\2\2\u0137"+
		"\u0132\3\2\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0136\3\2\2\2\u0138\62\3\2\2\2\u0139\u013a\7?\2\2\u013a\64"+
		"\3\2\2\2\u013b\u013c\7-\2\2\u013c\66\3\2\2\2\u013d\u013e\7/\2\2\u013e"+
		"8\3\2\2\2\u013f\u0140\7,\2\2\u0140:\3\2\2\2\u0141\u0142\7\61\2\2\u0142"+
		"<\3\2\2\2\u0143\u0144\7,\2\2\u0144\u0145\7,\2\2\u0145>\3\2\2\2\u0146\u0147"+
		"\7\'\2\2\u0147@\3\2\2\2\u0148\u0149\7-\2\2\u0149\u014a\7?\2\2\u014aB\3"+
		"\2\2\2\u014b\u014c\7/\2\2\u014c\u014d\7?\2\2\u014dD\3\2\2\2\u014e\u014f"+
		"\7,\2\2\u014f\u0150\7?\2\2\u0150F\3\2\2\2\u0151\u0152\7\61\2\2\u0152\u0153"+
		"\7?\2\2\u0153H\3\2\2\2\u0154\u0155\7-\2\2\u0155\u0156\7-\2\2\u0156J\3"+
		"\2\2\2\u0157\u0158\7/\2\2\u0158\u0159\7/\2\2\u0159L\3\2\2\2\u015a\u015b"+
		"\5]/\2\u015bN\3\2\2\2\u015c\u0163\5S*\2\u015d\u0163\5Q)\2\u015e\u0163"+
		"\5U+\2\u015f\u0163\5W,\2\u0160\u0163\5Y-\2\u0161\u0163\5[.\2\u0162\u015c"+
		"\3\2\2\2\u0162\u015d\3\2\2\2\u0162\u015e\3\2\2\2\u0162\u015f\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0162\u0161\3\2\2\2\u0163P\3\2\2\2\u0164\u0165\7~\2\2\u0165"+
		"\u0166\7~\2\2\u0166R\3\2\2\2\u0167\u0168\7(\2\2\u0168\u0169\7(\2\2\u0169"+
		"T\3\2\2\2\u016a\u016b\7#\2\2\u016b\u016c\7(\2\2\u016cV\3\2\2\2\u016d\u016e"+
		"\7#\2\2\u016e\u016f\7~\2\2\u016fX\3\2\2\2\u0170\u0171\7`\2\2\u0171\u0172"+
		"\7~\2\2\u0172Z\3\2\2\2\u0173\u0174\7`\2\2\u0174\u0175\7#\2\2\u0175\u0176"+
		"\7~\2\2\u0176\\\3\2\2\2\u0177\u0178\7#\2\2\u0178^\3\2\2\2\u0179\u017a"+
		"\5g\64\2\u017a`\3\2\2\2\u017b\u0180\5c\62\2\u017c\u0180\5e\63\2\u017d"+
		"\u0180\5i\65\2\u017e\u0180\5k\66\2\u017f\u017b\3\2\2\2\u017f\u017c\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180b\3\2\2\2\u0181\u0182"+
		"\7(\2\2\u0182d\3\2\2\2\u0183\u0184\7~\2\2\u0184f\3\2\2\2\u0185\u0186\7"+
		"\u0080\2\2\u0186h\3\2\2\2\u0187\u0188\7>\2\2\u0188\u0189\7>\2\2\u0189"+
		"j\3\2\2\2\u018a\u018b\7@\2\2\u018b\u018c\7@\2\2\u018cl\3\2\2\2\u018d\u0190"+
		"\5q9\2\u018e\u0190\5s:\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190"+
		"n\3\2\2\2\u0191\u0194\5{>\2\u0192\u0194\5}?\2\u0193\u0191\3\2\2\2\u0193"+
		"\u0192\3\2\2\2\u0194p\3\2\2\2\u0195\u0196\7k\2\2\u0196\u0197\7h\2\2\u0197"+
		"r\3\2\2\2\u0198\u0199\7g\2\2\u0199\u019a\7n\2\2\u019a\u019b\7u\2\2\u019b"+
		"\u019c\7g\2\2\u019ct\3\2\2\2\u019d\u019e\7y\2\2\u019e\u019f\7j\2\2\u019f"+
		"\u01a0\7k\2\2\u01a0\u01a1\7n\2\2\u01a1\u01a2\7g\2\2\u01a2v\3\2\2\2\u01a3"+
		"\u01a4\7h\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7t\2\2\u01a6x\3\2\2\2\u01a7"+
		"\u01a8\7i\2\2\u01a8\u01a9\7q\2\2\u01a9\u01aa\7v\2\2\u01aa\u01ab\7q\2\2"+
		"\u01abz\3\2\2\2\u01ac\u01ad\7d\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7g\2"+
		"\2\u01af\u01b0\7c\2\2\u01b0\u01b1\7m\2\2\u01b1|\3\2\2\2\u01b2\u01b3\7"+
		"e\2\2\u01b3\u01b4\7q\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7v\2\2\u01b6\u01b7"+
		"\7k\2\2\u01b7\u01b8\7p\2\2\u01b8\u01b9\7w\2\2\u01b9\u01ba\7g\2\2\u01ba"+
		"~\3\2\2\2\u01bb\u01bc\7k\2\2\u01bc\u01bd\7p\2\2\u01bd\u0080\3\2\2\2\u01be"+
		"\u01bf\7]\2\2\u01bf\u0082\3\2\2\2\u01c0\u01c1\7_\2\2\u01c1\u0084\3\2\2"+
		"\2\u01c2\u01c3\7*\2\2\u01c3\u0086\3\2\2\2\u01c4\u01c5\7+\2\2\u01c5\u0088"+
		"\3\2\2\2\u01c6\u01c7\7}\2\2\u01c7\u008a\3\2\2\2\u01c8\u01c9\7\177\2\2"+
		"\u01c9\u008c\3\2\2\2\u01ca\u01ce\7%\2\2\u01cb\u01cd\n\2\2\2\u01cc\u01cb"+
		"\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf"+
		"\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d2\bG\2\2\u01d2\u008e\3\2"+
		"\2\2\u01d3\u01d4\7%\2\2\u01d4\u01d5\7,\2\2\u01d5\u01d9\3\2\2\2\u01d6\u01d8"+
		"\13\2\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01da\3\2\2\2"+
		"\u01d9\u01d7\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01dd"+
		"\7,\2\2\u01dd\u01de\7%\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\bH\2\2\u01e0"+
		"\u0090\3\2\2\2\u01e1\u01e2\7^\2\2\u01e2\u01e3\t\3\2\2\u01e3\u0092\3\2"+
		"\2\2\u01e4\u01e7\5\u0095K\2\u01e5\u01e7\5\u00a7T\2\u01e6\u01e4\3\2\2\2"+
		"\u01e6\u01e5\3\2\2\2\u01e7\u0094\3\2\2\2\u01e8\u01e9\t\4\2\2\u01e9\u0096"+
		"\3\2\2\2\u01ea\u01ed\5\u009fP\2\u01eb\u01ed\5\u00a1Q\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01eb\3\2\2\2\u01ed\u0098\3\2\2\2\u01ee\u01f1\5\u009dO\2\u01ef"+
		"\u01f1\5\u009bN\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1\u009a"+
		"\3\2\2\2\u01f2\u01f3\7x\2\2\u01f3\u01f4\7c\2\2\u01f4\u01f5\7n\2\2\u01f5"+
		"\u01f6\7w\2\2\u01f6\u01f7\7g\2\2\u01f7\u009c\3\2\2\2\u01f8\u01f9\7v\2"+
		"\2\u01f9\u01fa\7j\2\2\u01fa\u01fb\7k\2\2\u01fb\u01fc\7u\2\2\u01fc\u009e"+
		"\3\2\2\2\u01fd\u01fe\7v\2\2\u01fe\u01ff\7t\2\2\u01ff\u0200\7w\2\2\u0200"+
		"\u0201\7g\2\2\u0201\u00a0\3\2\2\2\u0202\u0203\7h\2\2\u0203\u0204\7c\2"+
		"\2\u0204\u0205\7n\2\2\u0205\u0206\7u\2\2\u0206\u0207\7g\2\2\u0207\u00a2"+
		"\3\2\2\2\u0208\u0209\7t\2\2\u0209\u020a\7g\2\2\u020a\u020b\7v\2\2\u020b"+
		"\u020c\7w\2\2\u020c\u020d\7t\2\2\u020d\u020e\7p\2\2\u020e\u00a4\3\2\2"+
		"\2\u020f\u0214\5\u00a7T\2\u0210\u0214\5\u00abV\2\u0211\u0214\5\u00a9U"+
		"\2\u0212\u0214\5\u0097L\2\u0213\u020f\3\2\2\2\u0213\u0210\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0213\u0212\3\2\2\2\u0214\u00a6\3\2\2\2\u0215\u0218\5\u00b1"+
		"Y\2\u0216\u0218\5\u00afX\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218"+
		"\u00a8\3\2\2\2\u0219\u021e\7$\2\2\u021a\u021d\5\u0091I\2\u021b\u021d\n"+
		"\5\2\2\u021c\u021a\3\2\2\2\u021c\u021b\3\2\2\2\u021d\u0220\3\2\2\2\u021e"+
		"\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0221\u0222\7$\2\2\u0222\u00aa\3\2\2\2\u0223\u0226\7)\2\2\u0224\u0227"+
		"\5\u0091I\2\u0225\u0227\n\6\2\2\u0226\u0224\3\2\2\2\u0226\u0225\3\2\2"+
		"\2\u0227\u0228\3\2\2\2\u0228\u0229\7)\2\2\u0229\u00ac\3\2\2\2\u022a\u022b"+
		"\7.\2\2\u022b\u00ae\3\2\2\2\u022c\u022e\t\7\2\2\u022d\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u00b0\3\2"+
		"\2\2\u0231\u0233\t\7\2\2\u0232\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0237\7\60"+
		"\2\2\u0237\u0239\t\7\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u00b2\3\2\2\2\u023a\u023c\5\u0095K\2\u023b\u023a\3\2\2\2\u023c\u023d"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0244\3\2\2\2\u023f"+
		"\u0241\5\u00b1Y\2\u0240\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0240\3\2\2\2\u0244"+
		"\u0245\3\2\2\2\u0245\u00b4\3\2\2\2\u0246\u0247\7=\2\2\u0247\u00b6\3\2"+
		"\2\2\u0248\u024a\t\b\2\2\u0249\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\b\\"+
		"\3\2\u024e\u00b8\3\2\2\2\35\2\u00da\u0115\u0126\u012d\u0137\u0162\u017f"+
		"\u018f\u0193\u01ce\u01d9\u01e6\u01ec\u01f0\u0213\u0217\u021c\u021e\u0226"+
		"\u022f\u0234\u0238\u023d\u0242\u0244\u024b\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}