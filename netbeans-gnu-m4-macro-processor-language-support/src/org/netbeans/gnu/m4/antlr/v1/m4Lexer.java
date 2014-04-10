// Generated from m4.g4 by ANTLR 4.2.2

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
		ANYQUOTE=1, DNL_COMMENT=2, SINGLE_LINE_COMMENT=3, ID=4, LPAREN=5, RPAREN=6, 
		COMMA=7, WS=8, NL=9, HORIZONTAL_WHITESPACE=10, ANY=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ANYQUOTE", "DNL_COMMENT", "SINGLE_LINE_COMMENT", "ID", "'('", "')'", 
		"','", "WS", "NL", "HORIZONTAL_WHITESPACE", "ANY"
	};
	public static final String[] ruleNames = {
		"ANYQUOTE", "DNL_COMMENT", "SINGLE_LINE_COMMENT", "ID", "LPAREN", "RPAREN", 
		"COMMA", "M4_LETTER", "M4_LETTER_OR_DIGIT", "LETTER", "DIGIT", "WS", "NL", 
		"HORIZONTAL_WHITESPACE", "ANY"
	};


	public int quoteLevel = 0;
	public boolean quoted = false;
	public String lquote = "[";
	public String rquote = "]";

	private boolean isQuote(String q) {
	    return isLQuote(q) || isRQuote(q);
	}

	private boolean isLQuote(String q) {
	    return lquote.equals(q);
	}

	private boolean isRQuote(String q) {
	    return rquote.equals(q);
	}


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
		case 0: ANYQUOTE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ANYQUOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  if (isLQuote(getText())) { setType(m4Parser.LQUOTE); ++quoteLevel; quoted = true; } else if (isRQuote(getText())) { setType(m4Parser.RQUOTE); --quoteLevel; if (quoteLevel < 0) quoteLevel = 0; if (quoteLevel == 0) quoted = false; }  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return ANYQUOTE_sempred((RuleContext)_localctx, predIndex);

		case 2: return SINGLE_LINE_COMMENT_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean SINGLE_LINE_COMMENT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return !quoted;
		}
		return true;
	}
	private boolean ANYQUOTE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return isQuote(getText());
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r\2\16"+
		"\2$\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\3\7\3\64\n"+
		"\3\f\3\16\3\67\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3\3\3\3\3\4\3"+
		"\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5R\n\5\f\5\16"+
		"\5U\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\5\nd\n\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\6\rl\n\r\r\r\16\rm\3\16\5\16q\n\16\3\16\3\16"+
		"\3\17\3\17\3\20\6\20x\n\20\r\20\16\20y\4$y\2\21\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\2\23\2\25\2\27\2\31\n\33\13\35\f\37\r\3\2\7\4\2\f\f\17\17\3"+
		"\2aa\4\2C\\c|\3\2\62;\5\2\13\13\16\16\"\"\u0083\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3\"\3\2\2\2\5?\3\2\2\2"+
		"\7C\3\2\2\2\tO\3\2\2\2\13V\3\2\2\2\rX\3\2\2\2\17Z\3\2\2\2\21^\3\2\2\2"+
		"\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31k\3\2\2\2\33p\3\2\2\2\35t\3\2\2"+
		"\2\37w\3\2\2\2!#\13\2\2\2\"!\3\2\2\2#$\3\2\2\2$%\3\2\2\2$\"\3\2\2\2%&"+
		"\3\2\2\2&\'\6\2\2\2\'(\b\2\2\2(\4\3\2\2\2)*\7f\2\2*+\7p\2\2+,\7n\2\2,"+
		".\3\2\2\2-/\5\35\17\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2"+
		"\61\65\3\2\2\2\62\64\n\2\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\5\33\16\29@\3\2\2\2:;\7f\2"+
		"\2;<\7p\2\2<=\7n\2\2=>\3\2\2\2>@\5\33\16\2?)\3\2\2\2?:\3\2\2\2@A\3\2\2"+
		"\2AB\b\3\3\2B\6\3\2\2\2CG\7%\2\2DF\n\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\33\16\2KL\6\4\3\2LM\3\2\2\2MN\b\4"+
		"\3\2N\b\3\2\2\2OS\5\21\t\2PR\5\23\n\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST"+
		"\3\2\2\2T\n\3\2\2\2US\3\2\2\2VW\7*\2\2W\f\3\2\2\2XY\7+\2\2Y\16\3\2\2\2"+
		"Z[\7.\2\2[\20\3\2\2\2\\_\5\25\13\2]_\t\3\2\2^\\\3\2\2\2^]\3\2\2\2_\22"+
		"\3\2\2\2`d\5\25\13\2ad\5\27\f\2bd\t\3\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2"+
		"\2d\24\3\2\2\2ef\t\4\2\2f\26\3\2\2\2gh\t\5\2\2h\30\3\2\2\2il\5\33\16\2"+
		"jl\5\35\17\2ki\3\2\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\32\3\2"+
		"\2\2oq\7\17\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2s\34\3\2\2\2tu"+
		"\t\6\2\2u\36\3\2\2\2vx\13\2\2\2wv\3\2\2\2xy\3\2\2\2yz\3\2\2\2yw\3\2\2"+
		"\2z \3\2\2\2\17\2$\60\65?GS^ckmpy\4\3\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}