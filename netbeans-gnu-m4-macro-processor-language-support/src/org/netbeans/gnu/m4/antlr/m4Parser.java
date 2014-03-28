// Generated from m4.g4 by ANTLR 4.2.1

package org.netbeans.gnu.m4.antlr;

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
	public static final String[] tokenNames = {
		"<INVALID>", "'define'", "'undefine'", "'defn'", "'pushdef'", "'popdef'", 
		"'indir'", "'builtin'", "'ifdef'", "'ifelse'", "'shift'", "'dumpdef'", 
		"'traceon'", "'traceoff'", "'debugmode'", "'debugfile'", "'changequote'", 
		"'changecom'", "'changeword'", "'m4wrap'", "'include'", "'sinclude'", 
		"'divert'", "'undivert'", "'divnum'", "'len'", "'index'", "'regexp'", 
		"'substr'", "'translit'", "'patsubst'", "'format'", "'incr'", "'decr'", 
		"'eval'", "'__gnu__'", "'__os2__'", "'os2'", "'__unix__'", "'__windows__'", 
		"'windows'", "'syscmd'", "'esyscmd'", "'sysval'", "'mkstemp'", "'maketemp'", 
		"'errprint'", "'__file__'", "'__line__'", "'__program__'", "'m4exit'", 
		"WHITESPACE", "SINGLE_LINE_COMMENT", "DNL_COMMENT", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "IDENTIFIER", "VERBATIM_TEXT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_macroInvocation = 1, RULE_parameter = 2, 
		RULE_verbatimText = 3;
	public static final String[] ruleNames = {
		"compilationUnit", "macroInvocation", "parameter", "verbatimText"
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
	public static class CompilationUnitContext extends ParserRuleContext {
		public MacroInvocationContext macroInvocation(int i) {
			return getRuleContext(MacroInvocationContext.class,i);
		}
		public VerbatimTextContext verbatimText(int i) {
			return getRuleContext(VerbatimTextContext.class,i);
		}
		public TerminalNode EOF() { return getToken(m4Parser.EOF, 0); }
		public List<MacroInvocationContext> macroInvocation() {
			return getRuleContexts(MacroInvocationContext.class);
		}
		public List<VerbatimTextContext> verbatimText() {
			return getRuleContexts(VerbatimTextContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER || _la==VERBATIM_TEXT) {
				{
				setState(10);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(8); macroInvocation();
					}
					break;
				case VERBATIM_TEXT:
					{
					setState(9); verbatimText();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15); match(EOF);
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

	public static class MacroInvocationContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public TerminalNode LPAREN() { return getToken(m4Parser.LPAREN, 0); }
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(m4Parser.COMMA); }
		public TerminalNode RPAREN() { return getToken(m4Parser.RPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(m4Parser.IDENTIFIER, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(m4Parser.COMMA, i);
		}
		public MacroInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterMacroInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitMacroInvocation(this);
		}
	}

	public final MacroInvocationContext macroInvocation() throws RecognitionException {
		MacroInvocationContext _localctx = new MacroInvocationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_macroInvocation);
		int _la;
		try {
			setState(31);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17); match(IDENTIFIER);
				setState(18); match(LPAREN);
				setState(27);
				_la = _input.LA(1);
				if (_la==IDENTIFIER || _la==VERBATIM_TEXT) {
					{
					setState(19); parameter();
					setState(24);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(20); match(COMMA);
						setState(21); parameter();
						}
						}
						setState(26);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(29); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30); match(IDENTIFIER);
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

	public static class ParameterContext extends ParserRuleContext {
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public VerbatimTextContext verbatimText() {
			return getRuleContext(VerbatimTextContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(m4Parser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameter);
		try {
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); macroInvocation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(34); match(IDENTIFIER);
					}
					break;
				case VERBATIM_TEXT:
					{
					setState(35); verbatimText();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class VerbatimTextContext extends ParserRuleContext {
		public TerminalNode VERBATIM_TEXT(int i) {
			return getToken(m4Parser.VERBATIM_TEXT, i);
		}
		public List<TerminalNode> VERBATIM_TEXT() { return getTokens(m4Parser.VERBATIM_TEXT); }
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
		enterRule(_localctx, 6, RULE_verbatimText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(40); match(VERBATIM_TEXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(43); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\60\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\5\3\36\n\3\3\3\3\3\5\3\"\n\3"+
		"\3\4\3\4\3\4\5\4\'\n\4\5\4)\n\4\3\5\6\5,\n\5\r\5\16\5-\3\5\2\2\6\2\4\6"+
		"\b\2\2\63\2\16\3\2\2\2\4!\3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\n\r\5\4\3\2\13"+
		"\r\5\b\5\2\f\n\3\2\2\2\f\13\3\2\2\2\r\20\3\2\2\2\16\f\3\2\2\2\16\17\3"+
		"\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\2\2\3\22\3\3\2\2\2\23\24\7"+
		"A\2\2\24\35\78\2\2\25\32\5\6\4\2\26\27\7?\2\2\27\31\5\6\4\2\30\26\3\2"+
		"\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\36\3\2\2\2\34\32\3\2"+
		"\2\2\35\25\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37\"\79\2\2 \"\7A\2\2!"+
		"\23\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#)\5\4\3\2$\'\7A\2\2%\'\5\b\5\2&$\3\2"+
		"\2\2&%\3\2\2\2\')\3\2\2\2(#\3\2\2\2(&\3\2\2\2)\7\3\2\2\2*,\7B\2\2+*\3"+
		"\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\t\3\2\2\2\n\f\16\32\35!&(-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}