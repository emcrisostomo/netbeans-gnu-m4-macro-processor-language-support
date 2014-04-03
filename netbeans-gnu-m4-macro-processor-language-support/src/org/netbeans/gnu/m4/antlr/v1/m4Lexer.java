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
		DNL_COMMENT=1, SINGLE_LINE_COMMENT=2, ID=3, LPAREN=4, RPAREN=5, LBRACKET=6, 
		RBRACKET=7, COMMA=8, LQUOTE=9, RQUOTE=10, WS=11, NL=12, HORIZONTAL_WHITESPACE=13, 
		ANY=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"DNL_COMMENT", "SINGLE_LINE_COMMENT", "ID", "'('", "')'", "'['", "']'", 
		"','", "'`'", "'''", "WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final String[] ruleNames = {
		"DNL_COMMENT", "SINGLE_LINE_COMMENT", "ID", "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "COMMA", "LQUOTE", "RQUOTE", "M4_LETTER", "M4_LETTER_OR_DIGIT", 
		"LETTER", "DIGIT", "WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
	};


	public int quoteLevel = 0;
	public boolean quoted = false;


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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5: LBRACKET_action((RuleContext)_localctx, actionIndex); break;

		case 6: RBRACKET_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void LBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  ++quoteLevel; quoted = true;  break;
		}
	}
	private void RBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  --quoteLevel; if (quoteLevel < 0) quoteLevel = 0; if (quoteLevel == 0) quoted = false;  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1: return SINGLE_LINE_COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean SINGLE_LINE_COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !quoted;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\6\2-\n\2\r\2\16\2.\3\2\7\2\62\n\2\f\2\16"+
		"\2\65\13\2\3\2\5\28\n\2\3\2\3\2\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\5\fa\n\f\3\r\3\r\3"+
		"\r\5\rf\n\r\3\16\3\16\3\17\3\17\3\20\3\20\6\20n\n\20\r\20\16\20o\3\21"+
		"\5\21s\n\21\3\21\3\21\3\22\3\22\3\23\6\23z\n\23\r\23\16\23{\3{\2\24\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\2\31\2\33\2\35\2\37\r"+
		"!\16#\17%\20\3\2\7\4\2\f\f\17\17\3\2aa\4\2C\\c|\3\2\62;\5\2\13\13\16\16"+
		"\"\"\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5;\3\2\2\2\7G\3"+
		"\2\2\2\tN\3\2\2\2\13P\3\2\2\2\rR\3\2\2\2\17U\3\2\2\2\21X\3\2\2\2\23Z\3"+
		"\2\2\2\25\\\3\2\2\2\27`\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37"+
		"m\3\2\2\2!r\3\2\2\2#v\3\2\2\2%y\3\2\2\2\'(\7f\2\2()\7p\2\2)*\7n\2\2*,"+
		"\3\2\2\2+-\5#\22\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\63\3\2\2\2"+
		"\60\62\n\2\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2"+
		"\64\67\3\2\2\2\65\63\3\2\2\2\668\5!\21\2\67\66\3\2\2\2\678\3\2\2\289\3"+
		"\2\2\29:\b\2\2\2:\4\3\2\2\2;?\7%\2\2<>\n\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3"+
		"\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\5!\21\2CD\6\3\2\2DE\3\2\2\2EF\b"+
		"\3\2\2F\6\3\2\2\2GK\5\27\f\2HJ\5\31\r\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2"+
		"KL\3\2\2\2L\b\3\2\2\2MK\3\2\2\2NO\7*\2\2O\n\3\2\2\2PQ\7+\2\2Q\f\3\2\2"+
		"\2RS\7]\2\2ST\b\7\3\2T\16\3\2\2\2UV\7_\2\2VW\b\b\4\2W\20\3\2\2\2XY\7."+
		"\2\2Y\22\3\2\2\2Z[\7b\2\2[\24\3\2\2\2\\]\7)\2\2]\26\3\2\2\2^a\5\33\16"+
		"\2_a\t\3\2\2`^\3\2\2\2`_\3\2\2\2a\30\3\2\2\2bf\5\33\16\2cf\5\35\17\2d"+
		"f\t\3\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\32\3\2\2\2gh\t\4\2\2h\34\3\2"+
		"\2\2ij\t\5\2\2j\36\3\2\2\2kn\5!\21\2ln\5#\22\2mk\3\2\2\2ml\3\2\2\2no\3"+
		"\2\2\2om\3\2\2\2op\3\2\2\2p \3\2\2\2qs\7\17\2\2rq\3\2\2\2rs\3\2\2\2st"+
		"\3\2\2\2tu\7\f\2\2u\"\3\2\2\2vw\t\6\2\2w$\3\2\2\2xz\13\2\2\2yx\3\2\2\2"+
		"z{\3\2\2\2{|\3\2\2\2{y\3\2\2\2|&\3\2\2\2\16\2.\63\67?K`emor{\5\2\3\2\3"+
		"\7\2\3\b\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}