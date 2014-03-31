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
		WS=8, NL=9, HORIZONTAL_WHITESPACE=10, ANY=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DNL_COMMENT", "ID", "'('", "')'", "'['", "']'", "','", "WS", "NL", "HORIZONTAL_WHITESPACE", 
		"ANY"
	};
	public static final String[] ruleNames = {
		"DNL_COMMENT", "ID", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "COMMA", 
		"M4_LETTER", "M4_LETTER_OR_DIGIT", "LETTER", "DIGIT", "WS", "NL", "HORIZONTAL_WHITESPACE", 
		"ANY"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\re\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\6\2\'\n\2\r\2\16\2(\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\5\2\62\n\2\3\2\3"+
		"\2\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\5\tI\n\t\3\n\3\n\3\n\5\nN\n\n\3\13\3\13\3\f\3\f\3\r\3\r\6"+
		"\rV\n\r\r\r\16\rW\3\16\5\16[\n\16\3\16\3\16\3\17\3\17\3\20\6\20b\n\20"+
		"\r\20\16\20c\3c\2\21\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2"+
		"\31\n\33\13\35\f\37\r\3\2\7\4\2\f\f\17\17\3\2aa\4\2C\\c|\3\2\62;\5\2\13"+
		"\13\16\16\"\"k\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\3!\3\2\2\2\5\65\3\2\2\2\7<\3\2\2\2\t>\3\2\2\2\13@\3\2\2"+
		"\2\rB\3\2\2\2\17D\3\2\2\2\21H\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2"+
		"\2\2\31U\3\2\2\2\33Z\3\2\2\2\35^\3\2\2\2\37a\3\2\2\2!\"\7f\2\2\"#\7p\2"+
		"\2#$\7n\2\2$&\3\2\2\2%\'\5\35\17\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3"+
		"\2\2\2)-\3\2\2\2*,\n\2\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\61"+
		"\3\2\2\2/-\3\2\2\2\60\62\5\33\16\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3"+
		"\2\2\2\63\64\b\2\2\2\64\4\3\2\2\2\659\5\21\t\2\668\5\23\n\2\67\66\3\2"+
		"\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\6\3\2\2\2;9\3\2\2\2<=\7*\2\2=\b"+
		"\3\2\2\2>?\7+\2\2?\n\3\2\2\2@A\7]\2\2A\f\3\2\2\2BC\7_\2\2C\16\3\2\2\2"+
		"DE\7.\2\2E\20\3\2\2\2FI\5\25\13\2GI\t\3\2\2HF\3\2\2\2HG\3\2\2\2I\22\3"+
		"\2\2\2JN\5\25\13\2KN\5\27\f\2LN\t\3\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2"+
		"N\24\3\2\2\2OP\t\4\2\2P\26\3\2\2\2QR\t\5\2\2R\30\3\2\2\2SV\5\33\16\2T"+
		"V\5\35\17\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\32\3\2"+
		"\2\2Y[\7\17\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\f\2\2]\34\3\2\2\2"+
		"^_\t\6\2\2_\36\3\2\2\2`b\13\2\2\2a`\3\2\2\2bc\3\2\2\2cd\3\2\2\2ca\3\2"+
		"\2\2d \3\2\2\2\r\2(-\619HMUWZc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}