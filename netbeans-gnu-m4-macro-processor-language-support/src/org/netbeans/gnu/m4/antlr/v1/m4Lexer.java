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
		DNL_COMMENT=1, ID=2, LPAREN=3, RPAREN=4, COMMA=5, WS=6, NL=7, HORIZONTAL_WHITESPACE=8, 
		ANY=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DNL_COMMENT", "ID", "'('", "')'", "','", "WS", "NL", "HORIZONTAL_WHITESPACE", 
		"ANY"
	};
	public static final String[] ruleNames = {
		"DNL_COMMENT", "ID", "LPAREN", "RPAREN", "COMMA", "M4_LETTER", "M4_LETTER_OR_DIGIT", 
		"LETTER", "DIGIT", "WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\6\2#\n\2\r\2\16\2$\3"+
		"\2\7\2(\n\2\f\2\16\2+\13\2\3\2\5\2.\n\2\3\2\3\2\3\3\3\3\7\3\64\n\3\f\3"+
		"\16\3\67\13\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\5\b"+
		"F\n\b\3\t\3\t\3\n\3\n\3\13\3\13\6\13N\n\13\r\13\16\13O\3\f\5\fS\n\f\3"+
		"\f\3\f\3\r\3\r\3\16\6\16Z\n\16\r\16\16\16[\3[\2\17\3\3\5\4\7\5\t\6\13"+
		"\7\r\2\17\2\21\2\23\2\25\b\27\t\31\n\33\13\3\2\7\4\2\f\f\17\17\3\2aa\4"+
		"\2C\\c|\3\2\62;\5\2\13\13\16\16\"\"c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\3\35\3\2\2\2\5\61\3\2\2\2\78\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r"+
		"@\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3\2\2\2\25M\3\2\2\2\27R\3\2\2\2"+
		"\31V\3\2\2\2\33Y\3\2\2\2\35\36\7f\2\2\36\37\7p\2\2\37 \7n\2\2 \"\3\2\2"+
		"\2!#\5\31\r\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%)\3\2\2\2&(\n"+
		"\2\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*-\3\2\2\2+)\3\2\2\2,"+
		".\5\27\f\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\b\2\2\2\60\4\3\2\2\2\61\65"+
		"\5\r\7\2\62\64\5\17\b\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66"+
		"\3\2\2\2\66\6\3\2\2\2\67\65\3\2\2\289\7*\2\29\b\3\2\2\2:;\7+\2\2;\n\3"+
		"\2\2\2<=\7.\2\2=\f\3\2\2\2>A\5\21\t\2?A\t\3\2\2@>\3\2\2\2@?\3\2\2\2A\16"+
		"\3\2\2\2BF\5\21\t\2CF\5\23\n\2DF\t\3\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2"+
		"F\20\3\2\2\2GH\t\4\2\2H\22\3\2\2\2IJ\t\5\2\2J\24\3\2\2\2KN\5\27\f\2LN"+
		"\5\31\r\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\26\3\2\2"+
		"\2QS\7\17\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\f\2\2U\30\3\2\2\2VW\t"+
		"\6\2\2W\32\3\2\2\2XZ\13\2\2\2YX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2[Y\3\2\2\2"+
		"\\\34\3\2\2\2\r\2$)-\65@EMOR[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}