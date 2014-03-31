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
		ID=1, LPAREN=2, RPAREN=3, COMMA=4, NL=5, WS=6, ANY=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "'('", "')'", "','", "NL", "WS", "ANY"
	};
	public static final String[] ruleNames = {
		"ID", "LPAREN", "RPAREN", "COMMA", "M4_LETTER", "M4_LETTER_OR_DIGIT", 
		"LETTER", "DIGIT", "NL", "WS", "ANY"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\tE\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\5\6)\n\6\3\7\3\7\3\7\5\7.\n\7\3\b\3\b\3\t\3\t\3\n\5\n\65\n"+
		"\n\3\n\3\n\3\13\3\13\6\13;\n\13\r\13\16\13<\5\13?\n\13\3\f\6\fB\n\f\r"+
		"\f\16\fC\3C\2\r\3\3\5\4\7\5\t\6\13\2\r\2\17\2\21\2\23\7\25\b\27\t\3\2"+
		"\6\3\2aa\4\2C\\c|\3\2\62;\5\2\13\13\16\16\"\"H\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3"+
		"\2\2\2\5 \3\2\2\2\7\"\3\2\2\2\t$\3\2\2\2\13(\3\2\2\2\r-\3\2\2\2\17/\3"+
		"\2\2\2\21\61\3\2\2\2\23\64\3\2\2\2\25>\3\2\2\2\27A\3\2\2\2\31\35\5\13"+
		"\6\2\32\34\5\r\7\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2"+
		"\2\2\36\4\3\2\2\2\37\35\3\2\2\2 !\7*\2\2!\6\3\2\2\2\"#\7+\2\2#\b\3\2\2"+
		"\2$%\7.\2\2%\n\3\2\2\2&)\5\17\b\2\')\t\2\2\2(&\3\2\2\2(\'\3\2\2\2)\f\3"+
		"\2\2\2*.\5\17\b\2+.\5\21\t\2,.\t\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3\2\2\2."+
		"\16\3\2\2\2/\60\t\3\2\2\60\20\3\2\2\2\61\62\t\4\2\2\62\22\3\2\2\2\63\65"+
		"\7\17\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\f\2\2\67\24"+
		"\3\2\2\28?\5\23\n\29;\t\5\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2"+
		"=?\3\2\2\2>8\3\2\2\2>:\3\2\2\2?\26\3\2\2\2@B\13\2\2\2A@\3\2\2\2BC\3\2"+
		"\2\2CD\3\2\2\2CA\3\2\2\2D\30\3\2\2\2\n\2\35(-\64<>C\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}