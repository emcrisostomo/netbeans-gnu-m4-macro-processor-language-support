// Generated from m4.g4 by ANTLR 4.2.1

package org.netbeans.gnu.m4.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class m4Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEFINE=1, UNDEFINE=2, DEFN=3, PUSHDEF=4, POPDEF=5, INDIR=6, BUILTIN=7, 
		IFDEF=8, IFELSE=9, SHIFT=10, DUMPDEF=11, TRACEON=12, TRACEOFF=13, DEBUGMODE=14, 
		DEBUGFILE=15, CHANGEQUOTE=16, CHANGECOM=17, CHANGEWORD=18, M4WRAP=19, 
		INCLUDE=20, SINCLUDE=21, DIVERT=22, UNDIVERT=23, DIVNUM=24, LEN=25, INDEX=26, 
		REGEXP=27, SUBSTR=28, TRANSLIT=29, PATSUBST=30, FORMAT=31, INCR=32, DECR=33, 
		EVAL=34, GNU__=35, OS2__=36, OS2=37, UNIX__=38, WINDOWS__=39, WINDOWS=40, 
		SYSCMD=41, ESYSCMD=42, SYSVAL=43, MKSTEMP=44, MAKETEMP=45, ERRPRINT=46, 
		FILE__=47, LINE__=48, PROGRAM__=49, M4EXIT=50, WHITESPACE=51, SINGLE_LINE_COMMENT=52, 
		DNL_COMMENT=53, LPAREN=54, RPAREN=55, LBRACE=56, RBRACE=57, LBRACK=58, 
		RBRACK=59, SEMI=60, COMMA=61, DOT=62, IDENTIFIER=63, VERBATIM_TEXT=64;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'define'", "'undefine'", "'defn'", "'pushdef'", "'popdef'", "'indir'", 
		"'builtin'", "'ifdef'", "'ifelse'", "'shift'", "'dumpdef'", "'traceon'", 
		"'traceoff'", "'debugmode'", "'debugfile'", "'changequote'", "'changecom'", 
		"'changeword'", "'m4wrap'", "'include'", "'sinclude'", "'divert'", "'undivert'", 
		"'divnum'", "'len'", "'index'", "'regexp'", "'substr'", "'translit'", 
		"'patsubst'", "'format'", "'incr'", "'decr'", "'eval'", "'__gnu__'", "'__os2__'", 
		"'os2'", "'__unix__'", "'__windows__'", "'windows'", "'syscmd'", "'esyscmd'", 
		"'sysval'", "'mkstemp'", "'maketemp'", "'errprint'", "'__file__'", "'__line__'", 
		"'__program__'", "'m4exit'", "WHITESPACE", "SINGLE_LINE_COMMENT", "DNL_COMMENT", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "IDENTIFIER", 
		"VERBATIM_TEXT"
	};
	public static final String[] ruleNames = {
		"DEFINE", "UNDEFINE", "DEFN", "PUSHDEF", "POPDEF", "INDIR", "BUILTIN", 
		"IFDEF", "IFELSE", "SHIFT", "DUMPDEF", "TRACEON", "TRACEOFF", "DEBUGMODE", 
		"DEBUGFILE", "CHANGEQUOTE", "CHANGECOM", "CHANGEWORD", "M4WRAP", "INCLUDE", 
		"SINCLUDE", "DIVERT", "UNDIVERT", "DIVNUM", "LEN", "INDEX", "REGEXP", 
		"SUBSTR", "TRANSLIT", "PATSUBST", "FORMAT", "INCR", "DECR", "EVAL", "GNU__", 
		"OS2__", "OS2", "UNIX__", "WINDOWS__", "WINDOWS", "SYSCMD", "ESYSCMD", 
		"SYSVAL", "MKSTEMP", "MAKETEMP", "ERRPRINT", "FILE__", "LINE__", "PROGRAM__", 
		"M4EXIT", "WHITESPACE", "SINGLE_LINE_COMMENT", "DNL_COMMENT", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"IDENTIFIER", "M4_LETTER", "M4_LETTER_OR_DIGIT", "VERBATIM_TEXT"
	};


	public m4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "m4.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2B\u0254\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\6\64\u0211\n\64\r\64\16\64\u0212\3\64\3\64\3\65"+
		"\3\65\7\65\u0219\n\65\f\65\16\65\u021c\13\65\3\65\3\65\3\65\5\65\u0221"+
		"\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\7\66\u022a\n\66\f\66\16\66\u022d"+
		"\13\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3="+
		"\3=\3>\3>\3?\3?\3@\3@\7@\u0247\n@\f@\16@\u024a\13@\3A\3A\3B\3B\3C\6C\u0251"+
		"\nC\rC\16C\u0252\4\u022b\u0252\2D\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60"+
		"_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081\2\u0083\2\u0085"+
		"B\3\2\6\5\2\13\f\16\17\"\"\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\u0258"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u008e"+
		"\3\2\2\2\7\u0097\3\2\2\2\t\u009c\3\2\2\2\13\u00a4\3\2\2\2\r\u00ab\3\2"+
		"\2\2\17\u00b1\3\2\2\2\21\u00b9\3\2\2\2\23\u00bf\3\2\2\2\25\u00c6\3\2\2"+
		"\2\27\u00cc\3\2\2\2\31\u00d4\3\2\2\2\33\u00dc\3\2\2\2\35\u00e5\3\2\2\2"+
		"\37\u00ef\3\2\2\2!\u00f9\3\2\2\2#\u0105\3\2\2\2%\u010f\3\2\2\2\'\u011a"+
		"\3\2\2\2)\u0121\3\2\2\2+\u0129\3\2\2\2-\u0132\3\2\2\2/\u0139\3\2\2\2\61"+
		"\u0142\3\2\2\2\63\u0149\3\2\2\2\65\u014d\3\2\2\2\67\u0153\3\2\2\29\u015a"+
		"\3\2\2\2;\u0161\3\2\2\2=\u016a\3\2\2\2?\u0173\3\2\2\2A\u017a\3\2\2\2C"+
		"\u017f\3\2\2\2E\u0184\3\2\2\2G\u0189\3\2\2\2I\u0191\3\2\2\2K\u0199\3\2"+
		"\2\2M\u019d\3\2\2\2O\u01a6\3\2\2\2Q\u01b2\3\2\2\2S\u01ba\3\2\2\2U\u01c1"+
		"\3\2\2\2W\u01c9\3\2\2\2Y\u01d0\3\2\2\2[\u01d8\3\2\2\2]\u01e1\3\2\2\2_"+
		"\u01ea\3\2\2\2a\u01f3\3\2\2\2c\u01fc\3\2\2\2e\u0208\3\2\2\2g\u0210\3\2"+
		"\2\2i\u0216\3\2\2\2k\u0224\3\2\2\2m\u0232\3\2\2\2o\u0234\3\2\2\2q\u0236"+
		"\3\2\2\2s\u0238\3\2\2\2u\u023a\3\2\2\2w\u023c\3\2\2\2y\u023e\3\2\2\2{"+
		"\u0240\3\2\2\2}\u0242\3\2\2\2\177\u0244\3\2\2\2\u0081\u024b\3\2\2\2\u0083"+
		"\u024d\3\2\2\2\u0085\u0250\3\2\2\2\u0087\u0088\7f\2\2\u0088\u0089\7g\2"+
		"\2\u0089\u008a\7h\2\2\u008a\u008b\7k\2\2\u008b\u008c\7p\2\2\u008c\u008d"+
		"\7g\2\2\u008d\4\3\2\2\2\u008e\u008f\7w\2\2\u008f\u0090\7p\2\2\u0090\u0091"+
		"\7f\2\2\u0091\u0092\7g\2\2\u0092\u0093\7h\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7p\2\2\u0095\u0096\7g\2\2\u0096\6\3\2\2\2\u0097\u0098\7f\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7h\2\2\u009a\u009b\7p\2\2\u009b\b\3\2\2\2\u009c"+
		"\u009d\7r\2\2\u009d\u009e\7w\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7j\2\2"+
		"\u00a0\u00a1\7f\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7h\2\2\u00a3\n\3\2"+
		"\2\2\u00a4\u00a5\7r\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8"+
		"\7f\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7h\2\2\u00aa\f\3\2\2\2\u00ab\u00ac"+
		"\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\16\3\2\2\2\u00b1\u00b2\7d\2\2\u00b2\u00b3\7w\2\2\u00b3"+
		"\u00b4\7k\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7v\2\2\u00b6\u00b7\7k\2\2"+
		"\u00b7\u00b8\7p\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7"+
		"h\2\2\u00bb\u00bc\7f\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7h\2\2\u00be\22"+
		"\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7g\2\2\u00c2"+
		"\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c5\24\3\2\2\2\u00c6"+
		"\u00c7\7u\2\2\u00c7\u00c8\7j\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7h\2\2"+
		"\u00ca\u00cb\7v\2\2\u00cb\26\3\2\2\2\u00cc\u00cd\7f\2\2\u00cd\u00ce\7"+
		"w\2\2\u00ce\u00cf\7o\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7f\2\2\u00d1\u00d2"+
		"\7g\2\2\u00d2\u00d3\7h\2\2\u00d3\30\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6"+
		"\7t\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7q\2\2\u00da\u00db\7p\2\2\u00db\32\3\2\2\2\u00dc\u00dd\7v\2\2\u00dd"+
		"\u00de\7t\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1\u00e2\7q\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7h\2\2\u00e4\34\3\2"+
		"\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7d\2\2\u00e8\u00e9"+
		"\7w\2\2\u00e9\u00ea\7i\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		"\u00ed\7f\2\2\u00ed\u00ee\7g\2\2\u00ee\36\3\2\2\2\u00ef\u00f0\7f\2\2\u00f0"+
		"\u00f1\7g\2\2\u00f1\u00f2\7d\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7i\2\2"+
		"\u00f4\u00f5\7h\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8"+
		"\7g\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7j\2\2\u00fb\u00fc"+
		"\7c\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7i\2\2\u00fe\u00ff\7g\2\2\u00ff"+
		"\u0100\7s\2\2\u0100\u0101\7w\2\2\u0101\u0102\7q\2\2\u0102\u0103\7v\2\2"+
		"\u0103\u0104\7g\2\2\u0104\"\3\2\2\2\u0105\u0106\7e\2\2\u0106\u0107\7j"+
		"\2\2\u0107\u0108\7c\2\2\u0108\u0109\7p\2\2\u0109\u010a\7i\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7e\2\2\u010c\u010d\7q\2\2\u010d\u010e\7o\2\2\u010e"+
		"$\3\2\2\2\u010f\u0110\7e\2\2\u0110\u0111\7j\2\2\u0111\u0112\7c\2\2\u0112"+
		"\u0113\7p\2\2\u0113\u0114\7i\2\2\u0114\u0115\7g\2\2\u0115\u0116\7y\2\2"+
		"\u0116\u0117\7q\2\2\u0117\u0118\7t\2\2\u0118\u0119\7f\2\2\u0119&\3\2\2"+
		"\2\u011a\u011b\7o\2\2\u011b\u011c\7\66\2\2\u011c\u011d\7y\2\2\u011d\u011e"+
		"\7t\2\2\u011e\u011f\7c\2\2\u011f\u0120\7r\2\2\u0120(\3\2\2\2\u0121\u0122"+
		"\7k\2\2\u0122\u0123\7p\2\2\u0123\u0124\7e\2\2\u0124\u0125\7n\2\2\u0125"+
		"\u0126\7w\2\2\u0126\u0127\7f\2\2\u0127\u0128\7g\2\2\u0128*\3\2\2\2\u0129"+
		"\u012a\7u\2\2\u012a\u012b\7k\2\2\u012b\u012c\7p\2\2\u012c\u012d\7e\2\2"+
		"\u012d\u012e\7n\2\2\u012e\u012f\7w\2\2\u012f\u0130\7f\2\2\u0130\u0131"+
		"\7g\2\2\u0131,\3\2\2\2\u0132\u0133\7f\2\2\u0133\u0134\7k\2\2\u0134\u0135"+
		"\7x\2\2\u0135\u0136\7g\2\2\u0136\u0137\7t\2\2\u0137\u0138\7v\2\2\u0138"+
		".\3\2\2\2\u0139\u013a\7w\2\2\u013a\u013b\7p\2\2\u013b\u013c\7f\2\2\u013c"+
		"\u013d\7k\2\2\u013d\u013e\7x\2\2\u013e\u013f\7g\2\2\u013f\u0140\7t\2\2"+
		"\u0140\u0141\7v\2\2\u0141\60\3\2\2\2\u0142\u0143\7f\2\2\u0143\u0144\7"+
		"k\2\2\u0144\u0145\7x\2\2\u0145\u0146\7p\2\2\u0146\u0147\7w\2\2\u0147\u0148"+
		"\7o\2\2\u0148\62\3\2\2\2\u0149\u014a\7n\2\2\u014a\u014b\7g\2\2\u014b\u014c"+
		"\7p\2\2\u014c\64\3\2\2\2\u014d\u014e\7k\2\2\u014e\u014f\7p\2\2\u014f\u0150"+
		"\7f\2\2\u0150\u0151\7g\2\2\u0151\u0152\7z\2\2\u0152\66\3\2\2\2\u0153\u0154"+
		"\7t\2\2\u0154\u0155\7g\2\2\u0155\u0156\7i\2\2\u0156\u0157\7g\2\2\u0157"+
		"\u0158\7z\2\2\u0158\u0159\7r\2\2\u01598\3\2\2\2\u015a\u015b\7u\2\2\u015b"+
		"\u015c\7w\2\2\u015c\u015d\7d\2\2\u015d\u015e\7u\2\2\u015e\u015f\7v\2\2"+
		"\u015f\u0160\7t\2\2\u0160:\3\2\2\2\u0161\u0162\7v\2\2\u0162\u0163\7t\2"+
		"\2\u0163\u0164\7c\2\2\u0164\u0165\7p\2\2\u0165\u0166\7u\2\2\u0166\u0167"+
		"\7n\2\2\u0167\u0168\7k\2\2\u0168\u0169\7v\2\2\u0169<\3\2\2\2\u016a\u016b"+
		"\7r\2\2\u016b\u016c\7c\2\2\u016c\u016d\7v\2\2\u016d\u016e\7u\2\2\u016e"+
		"\u016f\7w\2\2\u016f\u0170\7d\2\2\u0170\u0171\7u\2\2\u0171\u0172\7v\2\2"+
		"\u0172>\3\2\2\2\u0173\u0174\7h\2\2\u0174\u0175\7q\2\2\u0175\u0176\7t\2"+
		"\2\u0176\u0177\7o\2\2\u0177\u0178\7c\2\2\u0178\u0179\7v\2\2\u0179@\3\2"+
		"\2\2\u017a\u017b\7k\2\2\u017b\u017c\7p\2\2\u017c\u017d\7e\2\2\u017d\u017e"+
		"\7t\2\2\u017eB\3\2\2\2\u017f\u0180\7f\2\2\u0180\u0181\7g\2\2\u0181\u0182"+
		"\7e\2\2\u0182\u0183\7t\2\2\u0183D\3\2\2\2\u0184\u0185\7g\2\2\u0185\u0186"+
		"\7x\2\2\u0186\u0187\7c\2\2\u0187\u0188\7n\2\2\u0188F\3\2\2\2\u0189\u018a"+
		"\7a\2\2\u018a\u018b\7a\2\2\u018b\u018c\7i\2\2\u018c\u018d\7p\2\2\u018d"+
		"\u018e\7w\2\2\u018e\u018f\7a\2\2\u018f\u0190\7a\2\2\u0190H\3\2\2\2\u0191"+
		"\u0192\7a\2\2\u0192\u0193\7a\2\2\u0193\u0194\7q\2\2\u0194\u0195\7u\2\2"+
		"\u0195\u0196\7\64\2\2\u0196\u0197\7a\2\2\u0197\u0198\7a\2\2\u0198J\3\2"+
		"\2\2\u0199\u019a\7q\2\2\u019a\u019b\7u\2\2\u019b\u019c\7\64\2\2\u019c"+
		"L\3\2\2\2\u019d\u019e\7a\2\2\u019e\u019f\7a\2\2\u019f\u01a0\7w\2\2\u01a0"+
		"\u01a1\7p\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7z\2\2\u01a3\u01a4\7a\2\2"+
		"\u01a4\u01a5\7a\2\2\u01a5N\3\2\2\2\u01a6\u01a7\7a\2\2\u01a7\u01a8\7a\2"+
		"\2\u01a8\u01a9\7y\2\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac"+
		"\7f\2\2\u01ac\u01ad\7q\2\2\u01ad\u01ae\7y\2\2\u01ae\u01af\7u\2\2\u01af"+
		"\u01b0\7a\2\2\u01b0\u01b1\7a\2\2\u01b1P\3\2\2\2\u01b2\u01b3\7y\2\2\u01b3"+
		"\u01b4\7k\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7f\2\2\u01b6\u01b7\7q\2\2"+
		"\u01b7\u01b8\7y\2\2\u01b8\u01b9\7u\2\2\u01b9R\3\2\2\2\u01ba\u01bb\7u\2"+
		"\2\u01bb\u01bc\7{\2\2\u01bc\u01bd\7u\2\2\u01bd\u01be\7e\2\2\u01be\u01bf"+
		"\7o\2\2\u01bf\u01c0\7f\2\2\u01c0T\3\2\2\2\u01c1\u01c2\7g\2\2\u01c2\u01c3"+
		"\7u\2\2\u01c3\u01c4\7{\2\2\u01c4\u01c5\7u\2\2\u01c5\u01c6\7e\2\2\u01c6"+
		"\u01c7\7o\2\2\u01c7\u01c8\7f\2\2\u01c8V\3\2\2\2\u01c9\u01ca\7u\2\2\u01ca"+
		"\u01cb\7{\2\2\u01cb\u01cc\7u\2\2\u01cc\u01cd\7x\2\2\u01cd\u01ce\7c\2\2"+
		"\u01ce\u01cf\7n\2\2\u01cfX\3\2\2\2\u01d0\u01d1\7o\2\2\u01d1\u01d2\7m\2"+
		"\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7g\2\2\u01d5\u01d6"+
		"\7o\2\2\u01d6\u01d7\7r\2\2\u01d7Z\3\2\2\2\u01d8\u01d9\7o\2\2\u01d9\u01da"+
		"\7c\2\2\u01da\u01db\7m\2\2\u01db\u01dc\7g\2\2\u01dc\u01dd\7v\2\2\u01dd"+
		"\u01de\7g\2\2\u01de\u01df\7o\2\2\u01df\u01e0\7r\2\2\u01e0\\\3\2\2\2\u01e1"+
		"\u01e2\7g\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4\7t\2\2\u01e4\u01e5\7r\2\2"+
		"\u01e5\u01e6\7t\2\2\u01e6\u01e7\7k\2\2\u01e7\u01e8\7p\2\2\u01e8\u01e9"+
		"\7v\2\2\u01e9^\3\2\2\2\u01ea\u01eb\7a\2\2\u01eb\u01ec\7a\2\2\u01ec\u01ed"+
		"\7h\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7n\2\2\u01ef\u01f0\7g\2\2\u01f0"+
		"\u01f1\7a\2\2\u01f1\u01f2\7a\2\2\u01f2`\3\2\2\2\u01f3\u01f4\7a\2\2\u01f4"+
		"\u01f5\7a\2\2\u01f5\u01f6\7n\2\2\u01f6\u01f7\7k\2\2\u01f7\u01f8\7p\2\2"+
		"\u01f8\u01f9\7g\2\2\u01f9\u01fa\7a\2\2\u01fa\u01fb\7a\2\2\u01fbb\3\2\2"+
		"\2\u01fc\u01fd\7a\2\2\u01fd\u01fe\7a\2\2\u01fe\u01ff\7r\2\2\u01ff\u0200"+
		"\7t\2\2\u0200\u0201\7q\2\2\u0201\u0202\7i\2\2\u0202\u0203\7t\2\2\u0203"+
		"\u0204\7c\2\2\u0204\u0205\7o\2\2\u0205\u0206\7a\2\2\u0206\u0207\7a\2\2"+
		"\u0207d\3\2\2\2\u0208\u0209\7o\2\2\u0209\u020a\7\66\2\2\u020a\u020b\7"+
		"g\2\2\u020b\u020c\7z\2\2\u020c\u020d\7k\2\2\u020d\u020e\7v\2\2\u020ef"+
		"\3\2\2\2\u020f\u0211\t\2\2\2\u0210\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\b\64"+
		"\2\2\u0215h\3\2\2\2\u0216\u021a\7%\2\2\u0217\u0219\n\3\2\2\u0218\u0217"+
		"\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u0220\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0221\t\3\2\2\u021e\u021f\7\17"+
		"\2\2\u021f\u0221\7\f\2\2\u0220\u021d\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\b\65\2\2\u0223j\3\2\2\2"+
		"\u0224\u0225\7f\2\2\u0225\u0226\7p\2\2\u0226\u0227\7n\2\2\u0227\u022b"+
		"\3\2\2\2\u0228\u022a\13\2\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2"+
		"\u022b\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b"+
		"\3\2\2\2\u022e\u022f\7\f\2\2\u022f\u0230\3\2\2\2\u0230\u0231\b\66\2\2"+
		"\u0231l\3\2\2\2\u0232\u0233\7*\2\2\u0233n\3\2\2\2\u0234\u0235\7+\2\2\u0235"+
		"p\3\2\2\2\u0236\u0237\7}\2\2\u0237r\3\2\2\2\u0238\u0239\7\177\2\2\u0239"+
		"t\3\2\2\2\u023a\u023b\7]\2\2\u023bv\3\2\2\2\u023c\u023d\7_\2\2\u023dx"+
		"\3\2\2\2\u023e\u023f\7=\2\2\u023fz\3\2\2\2\u0240\u0241\7.\2\2\u0241|\3"+
		"\2\2\2\u0242\u0243\7\60\2\2\u0243~\3\2\2\2\u0244\u0248\5\u0081A\2\u0245"+
		"\u0247\5\u0083B\2\u0246\u0245\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0080\3\2\2\2\u024a\u0248\3\2\2\2\u024b"+
		"\u024c\t\4\2\2\u024c\u0082\3\2\2\2\u024d\u024e\t\5\2\2\u024e\u0084\3\2"+
		"\2\2\u024f\u0251\13\2\2\2\u0250\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0086\3\2\2\2\t\2\u0212\u021a"+
		"\u0220\u022b\u0248\u0252\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}