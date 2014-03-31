// Generated from m4.g4 by ANTLR 4.2.1

package org.netbeans.gnu.m4.antlr.v1;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class m4Parser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, LPAREN=2, RPAREN=3, COMMA=4, NL=5, WS=6, ANY=7;
	public static final String[] tokenNames = {
		"<INVALID>", "ID", "'('", "')'", "','", "NL", "WS", "ANY"
	};
	public static final int
		RULE_m4 = 0, RULE_statement = 1, RULE_expr = 2, RULE_exprParameters = 3, 
		RULE_exprParameter = 4, RULE_parenthesizedText = 5, RULE_verbatimText = 6;
	public static final String[] ruleNames = {
		"m4", "statement", "expr", "exprParameters", "exprParameter", "parenthesizedText", 
		"verbatimText"
	};

	@Override
	public String getGrammarFileName() { return "m4.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public m4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class M4Context extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(m4Parser.EOF, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public M4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterM4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitM4(this);
		}
	}

	public final M4Context m4() throws RecognitionException {
		M4Context _localctx = new M4Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_m4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << NL) | (1L << WS) | (1L << ANY))) != 0)) {
				{
				{
				setState(14); statement();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20); match(EOF);
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

	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VerbatimTextContext verbatimText() {
			return getRuleContext(VerbatimTextContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(24);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(22); expr();
				}
				break;
			case NL:
			case WS:
			case ANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); verbatimText();
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(m4Parser.ID, 0); }
		public ExprParametersContext exprParameters() {
			return getRuleContext(ExprParametersContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(32);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(26); match(ID);
				setState(27); match(LPAREN);
				setState(28); exprParameters();
				setState(29); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); match(ID);
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

	public static class ExprParametersContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(m4Parser.COMMA); }
		public ExprParameterContext exprParameter(int i) {
			return getRuleContext(ExprParameterContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(m4Parser.COMMA, i);
		}
		public List<ExprParameterContext> exprParameter() {
			return getRuleContexts(ExprParameterContext.class);
		}
		public ExprParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterExprParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitExprParameters(this);
		}
	}

	public final ExprParametersContext exprParameters() throws RecognitionException {
		ExprParametersContext _localctx = new ExprParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LPAREN) | (1L << NL) | (1L << WS) | (1L << ANY))) != 0)) {
				{
				{
				setState(34); exprParameter();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(40); match(COMMA);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LPAREN) | (1L << NL) | (1L << WS) | (1L << ANY))) != 0)) {
					{
					{
					setState(41); exprParameter();
					}
					}
					setState(46);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprParameterContext extends ParserRuleContext {
		public ParenthesizedTextContext parenthesizedText() {
			return getRuleContext(ParenthesizedTextContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExprParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterExprParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitExprParameter(this);
		}
	}

	public final ExprParameterContext exprParameter() throws RecognitionException {
		ExprParameterContext _localctx = new ExprParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprParameter);
		try {
			setState(54);
			switch (_input.LA(1)) {
			case ID:
			case NL:
			case WS:
			case ANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(52); statement();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); parenthesizedText();
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

	public static class ParenthesizedTextContext extends ParserRuleContext {
		public VerbatimTextContext verbatimText(int i) {
			return getRuleContext(VerbatimTextContext.class,i);
		}
		public ParenthesizedTextContext parenthesizedText(int i) {
			return getRuleContext(ParenthesizedTextContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(m4Parser.LPAREN, 0); }
		public List<ParenthesizedTextContext> parenthesizedText() {
			return getRuleContexts(ParenthesizedTextContext.class);
		}
		public TerminalNode RPAREN() { return getToken(m4Parser.RPAREN, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<VerbatimTextContext> verbatimText() {
			return getRuleContexts(VerbatimTextContext.class);
		}
		public ParenthesizedTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterParenthesizedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitParenthesizedText(this);
		}
	}

	public final ParenthesizedTextContext parenthesizedText() throws RecognitionException {
		ParenthesizedTextContext _localctx = new ParenthesizedTextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parenthesizedText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(LPAREN);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << LPAREN) | (1L << NL) | (1L << WS) | (1L << ANY))) != 0)) {
				{
				setState(60);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(57); parenthesizedText();
					}
					break;

				case 2:
					{
					setState(58); statement();
					}
					break;

				case 3:
					{
					setState(59); verbatimText();
					}
					break;
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65); match(RPAREN);
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

	public static class VerbatimTextContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(m4Parser.NL, 0); }
		public TerminalNode WS() { return getToken(m4Parser.WS, 0); }
		public TerminalNode ANY() { return getToken(m4Parser.ANY, 0); }
		public VerbatimTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbatimText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterVerbatimText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitVerbatimText(this);
		}
	}

	public final VerbatimTextContext verbatimText() throws RecognitionException {
		VerbatimTextContext _localctx = new VerbatimTextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_verbatimText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << WS) | (1L << ANY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\tH\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4#\n\4\3\5"+
		"\7\5&\n\5\f\5\16\5)\13\5\3\5\3\5\7\5-\n\5\f\5\16\5\60\13\5\7\5\62\n\5"+
		"\f\5\16\5\65\13\5\3\6\3\6\5\69\n\6\3\7\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B"+
		"\13\7\3\7\3\7\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\7\tJ\2\23\3\2\2"+
		"\2\4\32\3\2\2\2\6\"\3\2\2\2\b\'\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2\16E\3\2"+
		"\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2"+
		"\2\2\24\26\3\2\2\2\25\23\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\33\5\6"+
		"\4\2\31\33\5\16\b\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\7\3"+
		"\2\2\35\36\7\4\2\2\36\37\5\b\5\2\37 \7\5\2\2 #\3\2\2\2!#\7\3\2\2\"\34"+
		"\3\2\2\2\"!\3\2\2\2#\7\3\2\2\2$&\5\n\6\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2"+
		"\2\'(\3\2\2\2(\63\3\2\2\2)\'\3\2\2\2*.\7\6\2\2+-\5\n\6\2,+\3\2\2\2-\60"+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\61*\3\2\2\2\62\65"+
		"\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\t\3\2\2\2\65\63\3\2\2\2\669\5"+
		"\4\3\2\679\5\f\7\28\66\3\2\2\28\67\3\2\2\29\13\3\2\2\2:@\7\4\2\2;?\5\f"+
		"\7\2<?\5\4\3\2=?\5\16\b\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?B\3\2\2\2@>\3"+
		"\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7\5\2\2D\r\3\2\2\2EF\t\2\2\2F\17"+
		"\3\2\2\2\13\23\32\"\'.\638>@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}