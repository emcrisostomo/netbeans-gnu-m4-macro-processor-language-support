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
		ID=1, Any=2;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "Any"
	};
	public static final String[] ruleNames = {
		"ID", "M4_LETTER", "M4_LETTER_OR_DIGIT", "LETTER", "DIGIT", "Any"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\4(\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\5\3\31\n\3\3\4\3\4\3\4\5\4\36\n\4\3\5\3\5\3\6\3\6\3\7\6"+
		"\7%\n\7\r\7\16\7&\3&\2\b\3\3\5\2\7\2\t\2\13\2\r\4\3\2\5\3\2aa\4\2C\\c"+
		"|\3\2\62;(\2\3\3\2\2\2\2\r\3\2\2\2\3\17\3\2\2\2\5\30\3\2\2\2\7\35\3\2"+
		"\2\2\t\37\3\2\2\2\13!\3\2\2\2\r$\3\2\2\2\17\23\5\5\3\2\20\22\5\7\4\2\21"+
		"\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\4\3\2\2\2\25"+
		"\23\3\2\2\2\26\31\5\t\5\2\27\31\t\2\2\2\30\26\3\2\2\2\30\27\3\2\2\2\31"+
		"\6\3\2\2\2\32\36\5\t\5\2\33\36\5\13\6\2\34\36\t\2\2\2\35\32\3\2\2\2\35"+
		"\33\3\2\2\2\35\34\3\2\2\2\36\b\3\2\2\2\37 \t\3\2\2 \n\3\2\2\2!\"\t\4\2"+
		"\2\"\f\3\2\2\2#%\13\2\2\2$#\3\2\2\2%&\3\2\2\2&\'\3\2\2\2&$\3\2\2\2\'\16"+
		"\3\2\2\2\7\2\23\30\35&\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}