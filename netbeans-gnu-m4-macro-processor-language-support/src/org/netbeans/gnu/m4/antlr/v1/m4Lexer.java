// Generated from m4.g4 by ANTLR 4.2.1

package org.netbeans.gnu.m4.antlr.v1;

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
		DNL_COMMENT=1, ID=2, LPAREN=3, RPAREN=4, LBRACKET=5, RBRACKET=6, COMMA=7, 
		LQUOTE=8, RQUOTE=9, WS=10, NL=11, HORIZONTAL_WHITESPACE=12, ANY=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DNL_COMMENT", "ID", "'('", "')'", "'['", "']'", "','", "'`'", "'''", 
		"WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final String[] ruleNames = {
		"DNL_COMMENT", "ID", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COMMA", 
		"LQUOTE", "RQUOTE", "M4_LETTER", "M4_LETTER_OR_DIGIT", "LETTER", "DIGIT", 
		"WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\6\2+\n\2\r\2\16\2,\3\2\7\2\60\n\2\f\2\16\2\63\13"+
		"\2\3\2\5\2\66\n\2\3\2\3\2\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\5\13Q\n\13\3\f"+
		"\3\f\3\f\5\fV\n\f\3\r\3\r\3\16\3\16\3\17\3\17\6\17^\n\17\r\17\16\17_\3"+
		"\20\5\20c\n\20\3\20\3\20\3\21\3\21\3\22\6\22j\n\22\r\22\16\22k\3k\2\23"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\2\35\f\37"+
		"\r!\16#\17\3\2\7\4\2\f\f\17\17\3\2aa\4\2C\\c|\3\2\62;\5\2\13\13\16\16"+
		"\"\"s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\59\3\2\2\2\7@\3\2\2\2\tB\3\2\2\2"+
		"\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25P\3\2\2"+
		"\2\27U\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35]\3\2\2\2\37b\3\2\2\2!f\3\2\2"+
		"\2#i\3\2\2\2%&\7f\2\2&\'\7p\2\2\'(\7n\2\2(*\3\2\2\2)+\5!\21\2*)\3\2\2"+
		"\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\61\3\2\2\2.\60\n\2\2\2/.\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64\66"+
		"\5\37\20\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\b\2\2\28\4\3"+
		"\2\2\29=\5\25\13\2:<\5\27\f\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2"+
		">\6\3\2\2\2?=\3\2\2\2@A\7*\2\2A\b\3\2\2\2BC\7+\2\2C\n\3\2\2\2DE\7]\2\2"+
		"E\f\3\2\2\2FG\7_\2\2G\16\3\2\2\2HI\7.\2\2I\20\3\2\2\2JK\7b\2\2K\22\3\2"+
		"\2\2LM\7)\2\2M\24\3\2\2\2NQ\5\31\r\2OQ\t\3\2\2PN\3\2\2\2PO\3\2\2\2Q\26"+
		"\3\2\2\2RV\5\31\r\2SV\5\33\16\2TV\t\3\2\2UR\3\2\2\2US\3\2\2\2UT\3\2\2"+
		"\2V\30\3\2\2\2WX\t\4\2\2X\32\3\2\2\2YZ\t\5\2\2Z\34\3\2\2\2[^\5\37\20\2"+
		"\\^\5!\21\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\36\3\2"+
		"\2\2ac\7\17\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\f\2\2e \3\2\2\2fg\t"+
		"\6\2\2g\"\3\2\2\2hj\13\2\2\2ih\3\2\2\2jk\3\2\2\2kl\3\2\2\2ki\3\2\2\2l"+
		"$\3\2\2\2\r\2,\61\65=PU]_bk\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}