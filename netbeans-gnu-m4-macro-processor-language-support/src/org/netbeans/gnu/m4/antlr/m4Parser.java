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
		DNL_COMMENT=53, LPAREN=54, RPAREN=55, LBRACK=56, RBRACK=57, COMMA=58, 
		IDENTIFIER=59, VERBATIM_TEXT=60;
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
		"WHITESPACE", "SINGLE_LINE_COMMENT", "DNL_COMMENT", "'('", "')'", "'['", 
		"']'", "','", "IDENTIFIER", "VERBATIM_TEXT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_text = 1, RULE_parameterText = 2, RULE_parenthesizedText = 3, 
		RULE_pText = 4, RULE_quotedText = 5, RULE_qtext = 6, RULE_verbatimQuotedText = 7, 
		RULE_macroName = 8, RULE_macroInvocation = 9, RULE_parameter = 10, RULE_verbatimText = 11, 
		RULE_verbatimParameterText = 12, RULE_builtinMacro = 13;
	public static final String[] ruleNames = {
		"compilationUnit", "text", "parameterText", "parenthesizedText", "pText", 
		"quotedText", "qtext", "verbatimQuotedText", "macroName", "macroInvocation", 
		"parameter", "verbatimText", "verbatimParameterText", "builtinMacro"
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
		public TerminalNode EOF() { return getToken(m4Parser.EOF, 0); }
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public List<MacroInvocationContext> macroInvocation() {
			return getRuleContexts(MacroInvocationContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
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
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << WHITESPACE) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACK) | (1L << COMMA) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT))) != 0)) {
				{
				setState(30);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(28); text();
					}
					break;

				case 2:
					{
					setState(29); macroInvocation();
					}
					break;
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35); match(EOF);
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

	public static class TextContext extends ParserRuleContext {
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public VerbatimTextContext verbatimText() {
			return getRuleContext(VerbatimTextContext.class,0);
		}
		public QuotedTextContext quotedText() {
			return getRuleContext(QuotedTextContext.class,0);
		}
		public MacroNameContext macroName() {
			return getRuleContext(MacroNameContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(37); verbatimText();
				}
				break;

			case 2:
				{
				setState(38); macroInvocation();
				}
				break;

			case 3:
				{
				setState(39); macroName();
				}
				break;

			case 4:
				{
				setState(40); quotedText();
				}
				break;
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

	public static class ParameterTextContext extends ParserRuleContext {
		public ParenthesizedTextContext parenthesizedText() {
			return getRuleContext(ParenthesizedTextContext.class,0);
		}
		public VerbatimParameterTextContext verbatimParameterText() {
			return getRuleContext(VerbatimParameterTextContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public QuotedTextContext quotedText() {
			return getRuleContext(QuotedTextContext.class,0);
		}
		public MacroNameContext macroName() {
			return getRuleContext(MacroNameContext.class,0);
		}
		public ParameterTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterParameterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitParameterText(this);
		}
	}

	public final ParameterTextContext parameterText() throws RecognitionException {
		ParameterTextContext _localctx = new ParameterTextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameterText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(43); verbatimParameterText();
				}
				break;

			case 2:
				{
				setState(44); macroInvocation();
				}
				break;

			case 3:
				{
				setState(45); macroName();
				}
				break;

			case 4:
				{
				setState(46); quotedText();
				}
				break;

			case 5:
				{
				setState(47); parenthesizedText();
				}
				break;
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

	public static class ParenthesizedTextContext extends ParserRuleContext {
		public PTextContext pText(int i) {
			return getRuleContext(PTextContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(m4Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(m4Parser.RPAREN, 0); }
		public List<PTextContext> pText() {
			return getRuleContexts(PTextContext.class);
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
		enterRule(_localctx, 6, RULE_parenthesizedText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(LPAREN);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << WHITESPACE) | (1L << LPAREN) | (1L << LBRACK) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT))) != 0)) {
				{
				{
				setState(51); pText();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(RPAREN);
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

	public static class PTextContext extends ParserRuleContext {
		public ParameterTextContext parameterText() {
			return getRuleContext(ParameterTextContext.class,0);
		}
		public ParenthesizedTextContext parenthesizedText() {
			return getRuleContext(ParenthesizedTextContext.class,0);
		}
		public PTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterPText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitPText(this);
		}
	}

	public final PTextContext pText() throws RecognitionException {
		PTextContext _localctx = new PTextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(59); parenthesizedText();
				}
				break;

			case 2:
				{
				setState(60); parameterText();
				}
				break;
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

	public static class QuotedTextContext extends ParserRuleContext {
		public QtextContext qtext(int i) {
			return getRuleContext(QtextContext.class,i);
		}
		public List<QtextContext> qtext() {
			return getRuleContexts(QtextContext.class);
		}
		public TerminalNode RBRACK() { return getToken(m4Parser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(m4Parser.LBRACK, 0); }
		public QuotedTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterQuotedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitQuotedText(this);
		}
	}

	public final QuotedTextContext quotedText() throws RecognitionException {
		QuotedTextContext _localctx = new QuotedTextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_quotedText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(LBRACK);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << WHITESPACE) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACK) | (1L << COMMA) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT))) != 0)) {
				{
				{
				setState(64); qtext();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); match(RBRACK);
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

	public static class QtextContext extends ParserRuleContext {
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
		}
		public VerbatimTextContext verbatimText() {
			return getRuleContext(VerbatimTextContext.class,0);
		}
		public MacroNameContext macroName() {
			return getRuleContext(MacroNameContext.class,0);
		}
		public VerbatimQuotedTextContext verbatimQuotedText() {
			return getRuleContext(VerbatimQuotedTextContext.class,0);
		}
		public QtextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterQtext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitQtext(this);
		}
	}

	public final QtextContext qtext() throws RecognitionException {
		QtextContext _localctx = new QtextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_qtext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(72); verbatimText();
				}
				break;

			case 2:
				{
				setState(73); macroInvocation();
				}
				break;

			case 3:
				{
				setState(74); macroName();
				}
				break;

			case 4:
				{
				setState(75); verbatimQuotedText();
				}
				break;
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

	public static class VerbatimQuotedTextContext extends ParserRuleContext {
		public VerbatimQuotedTextContext verbatimQuotedText(int i) {
			return getRuleContext(VerbatimQuotedTextContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(m4Parser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(m4Parser.LBRACK, 0); }
		public List<VerbatimQuotedTextContext> verbatimQuotedText() {
			return getRuleContexts(VerbatimQuotedTextContext.class);
		}
		public VerbatimQuotedTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbatimQuotedText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterVerbatimQuotedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitVerbatimQuotedText(this);
		}
	}

	public final VerbatimQuotedTextContext verbatimQuotedText() throws RecognitionException {
		VerbatimQuotedTextContext _localctx = new VerbatimQuotedTextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verbatimQuotedText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(LBRACK);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(81);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(79);
						matchWildcard();
						}
						break;

					case 2:
						{
						setState(80); verbatimQuotedText();
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(86); match(RBRACK);
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

	public static class MacroNameContext extends ParserRuleContext {
		public BuiltinMacroContext builtinMacro() {
			return getRuleContext(BuiltinMacroContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(m4Parser.IDENTIFIER, 0); }
		public MacroNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_macroName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterMacroName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitMacroName(this);
		}
	}

	public final MacroNameContext macroName() throws RecognitionException {
		MacroNameContext _localctx = new MacroNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_macroName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(88); match(IDENTIFIER);
				}
				break;
			case DEFINE:
			case UNDEFINE:
			case DEFN:
			case PUSHDEF:
			case POPDEF:
			case INDIR:
			case BUILTIN:
			case IFDEF:
			case IFELSE:
			case SHIFT:
			case DUMPDEF:
			case TRACEON:
			case TRACEOFF:
			case DEBUGMODE:
			case DEBUGFILE:
			case CHANGEQUOTE:
			case CHANGECOM:
			case CHANGEWORD:
			case M4WRAP:
			case INCLUDE:
			case SINCLUDE:
			case DIVERT:
			case UNDIVERT:
			case DIVNUM:
			case LEN:
			case INDEX:
			case REGEXP:
			case SUBSTR:
			case TRANSLIT:
			case PATSUBST:
			case FORMAT:
			case INCR:
			case DECR:
			case EVAL:
			case GNU__:
			case OS2__:
			case OS2:
			case UNIX__:
			case WINDOWS__:
			case WINDOWS:
			case SYSCMD:
			case ESYSCMD:
			case SYSVAL:
			case MKSTEMP:
			case MAKETEMP:
			case ERRPRINT:
			case FILE__:
			case LINE__:
			case PROGRAM__:
			case M4EXIT:
				{
				setState(89); builtinMacro();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public MacroNameContext macroName() {
			return getRuleContext(MacroNameContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_macroInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); macroName();
			setState(93); match(LPAREN);
			setState(102);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << WHITESPACE) | (1L << LPAREN) | (1L << LBRACK) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT))) != 0)) {
				{
				setState(94); parameter();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(95); match(COMMA);
					setState(96); parameter();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(104); match(RPAREN);
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
		public List<ParameterTextContext> parameterText() {
			return getRuleContexts(ParameterTextContext.class);
		}
		public ParameterTextContext parameterText(int i) {
			return getRuleContext(ParameterTextContext.class,i);
		}
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
		enterRule(_localctx, 20, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106); parameterText();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << WHITESPACE) | (1L << LPAREN) | (1L << LBRACK) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT))) != 0) );
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
		public TerminalNode RPAREN(int i) {
			return getToken(m4Parser.RPAREN, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(m4Parser.LPAREN); }
		public List<TerminalNode> COMMA() { return getTokens(m4Parser.COMMA); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(m4Parser.WHITESPACE, i);
		}
		public TerminalNode VERBATIM_TEXT(int i) {
			return getToken(m4Parser.VERBATIM_TEXT, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(m4Parser.RPAREN); }
		public List<TerminalNode> VERBATIM_TEXT() { return getTokens(m4Parser.VERBATIM_TEXT); }
		public TerminalNode LPAREN(int i) {
			return getToken(m4Parser.LPAREN, i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(m4Parser.COMMA, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(m4Parser.WHITESPACE); }
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
		enterRule(_localctx, 22, RULE_verbatimText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(111);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << LPAREN) | (1L << RPAREN) | (1L << COMMA) | (1L << VERBATIM_TEXT))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(114); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class VerbatimParameterTextContext extends ParserRuleContext {
		public TerminalNode WHITESPACE(int i) {
			return getToken(m4Parser.WHITESPACE, i);
		}
		public TerminalNode VERBATIM_TEXT(int i) {
			return getToken(m4Parser.VERBATIM_TEXT, i);
		}
		public List<TerminalNode> VERBATIM_TEXT() { return getTokens(m4Parser.VERBATIM_TEXT); }
		public List<TerminalNode> WHITESPACE() { return getTokens(m4Parser.WHITESPACE); }
		public VerbatimParameterTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbatimParameterText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterVerbatimParameterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitVerbatimParameterText(this);
		}
	}

	public final VerbatimParameterTextContext verbatimParameterText() throws RecognitionException {
		VerbatimParameterTextContext _localctx = new VerbatimParameterTextContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_verbatimParameterText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(116);
					_la = _input.LA(1);
					if ( !(_la==WHITESPACE || _la==VERBATIM_TEXT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(119); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class BuiltinMacroContext extends ParserRuleContext {
		public TerminalNode ESYSCMD() { return getToken(m4Parser.ESYSCMD, 0); }
		public TerminalNode M4WRAP() { return getToken(m4Parser.M4WRAP, 0); }
		public TerminalNode DEBUGMODE() { return getToken(m4Parser.DEBUGMODE, 0); }
		public TerminalNode DECR() { return getToken(m4Parser.DECR, 0); }
		public TerminalNode M4EXIT() { return getToken(m4Parser.M4EXIT, 0); }
		public TerminalNode PROGRAM__() { return getToken(m4Parser.PROGRAM__, 0); }
		public TerminalNode INCLUDE() { return getToken(m4Parser.INCLUDE, 0); }
		public TerminalNode WINDOWS__() { return getToken(m4Parser.WINDOWS__, 0); }
		public TerminalNode INDEX() { return getToken(m4Parser.INDEX, 0); }
		public TerminalNode OS2() { return getToken(m4Parser.OS2, 0); }
		public TerminalNode GNU__() { return getToken(m4Parser.GNU__, 0); }
		public TerminalNode SYSVAL() { return getToken(m4Parser.SYSVAL, 0); }
		public TerminalNode BUILTIN() { return getToken(m4Parser.BUILTIN, 0); }
		public TerminalNode TRACEOFF() { return getToken(m4Parser.TRACEOFF, 0); }
		public TerminalNode DUMPDEF() { return getToken(m4Parser.DUMPDEF, 0); }
		public TerminalNode UNDEFINE() { return getToken(m4Parser.UNDEFINE, 0); }
		public TerminalNode EVAL() { return getToken(m4Parser.EVAL, 0); }
		public TerminalNode SINCLUDE() { return getToken(m4Parser.SINCLUDE, 0); }
		public TerminalNode UNIX__() { return getToken(m4Parser.UNIX__, 0); }
		public TerminalNode DIVERT() { return getToken(m4Parser.DIVERT, 0); }
		public TerminalNode INCR() { return getToken(m4Parser.INCR, 0); }
		public TerminalNode PATSUBST() { return getToken(m4Parser.PATSUBST, 0); }
		public TerminalNode INDIR() { return getToken(m4Parser.INDIR, 0); }
		public TerminalNode CHANGEWORD() { return getToken(m4Parser.CHANGEWORD, 0); }
		public TerminalNode PUSHDEF() { return getToken(m4Parser.PUSHDEF, 0); }
		public TerminalNode ERRPRINT() { return getToken(m4Parser.ERRPRINT, 0); }
		public TerminalNode REGEXP() { return getToken(m4Parser.REGEXP, 0); }
		public TerminalNode LINE__() { return getToken(m4Parser.LINE__, 0); }
		public TerminalNode POPDEF() { return getToken(m4Parser.POPDEF, 0); }
		public TerminalNode SYSCMD() { return getToken(m4Parser.SYSCMD, 0); }
		public TerminalNode WINDOWS() { return getToken(m4Parser.WINDOWS, 0); }
		public TerminalNode SHIFT() { return getToken(m4Parser.SHIFT, 0); }
		public TerminalNode UNDIVERT() { return getToken(m4Parser.UNDIVERT, 0); }
		public TerminalNode FILE__() { return getToken(m4Parser.FILE__, 0); }
		public TerminalNode SUBSTR() { return getToken(m4Parser.SUBSTR, 0); }
		public TerminalNode CHANGEQUOTE() { return getToken(m4Parser.CHANGEQUOTE, 0); }
		public TerminalNode FORMAT() { return getToken(m4Parser.FORMAT, 0); }
		public TerminalNode DEFN() { return getToken(m4Parser.DEFN, 0); }
		public TerminalNode MAKETEMP() { return getToken(m4Parser.MAKETEMP, 0); }
		public TerminalNode IFDEF() { return getToken(m4Parser.IFDEF, 0); }
		public TerminalNode DEBUGFILE() { return getToken(m4Parser.DEBUGFILE, 0); }
		public TerminalNode OS2__() { return getToken(m4Parser.OS2__, 0); }
		public TerminalNode CHANGECOM() { return getToken(m4Parser.CHANGECOM, 0); }
		public TerminalNode LEN() { return getToken(m4Parser.LEN, 0); }
		public TerminalNode TRACEON() { return getToken(m4Parser.TRACEON, 0); }
		public TerminalNode MKSTEMP() { return getToken(m4Parser.MKSTEMP, 0); }
		public TerminalNode DEFINE() { return getToken(m4Parser.DEFINE, 0); }
		public TerminalNode DIVNUM() { return getToken(m4Parser.DIVNUM, 0); }
		public TerminalNode IFELSE() { return getToken(m4Parser.IFELSE, 0); }
		public TerminalNode TRANSLIT() { return getToken(m4Parser.TRANSLIT, 0); }
		public BuiltinMacroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinMacro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).enterBuiltinMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4Listener ) ((m4Listener)listener).exitBuiltinMacro(this);
		}
	}

	public final BuiltinMacroContext builtinMacro() throws RecognitionException {
		BuiltinMacroContext _localctx = new BuiltinMacroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_builtinMacro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT))) != 0)) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>~\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5\3\5\7\5"+
		"\67\n\5\f\5\16\5:\13\5\3\5\3\5\3\6\3\6\5\6@\n\6\3\7\3\7\7\7D\n\7\f\7\16"+
		"\7G\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bO\n\b\3\t\3\t\3\t\7\tT\n\t\f\t\16"+
		"\tW\13\t\3\t\3\t\3\n\3\n\5\n]\n\n\3\13\3\13\3\13\3\13\3\13\7\13d\n\13"+
		"\f\13\16\13g\13\13\5\13i\n\13\3\13\3\13\3\f\6\fn\n\f\r\f\16\fo\3\r\6\r"+
		"s\n\r\r\r\16\rt\3\16\6\16x\n\16\r\16\16\16y\3\17\3\17\3\17\3U\2\20\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\2\5\6\2\65\6589<<>>\4\2\65\65>>\3\2\3"+
		"\64\u0086\2\"\3\2\2\2\4+\3\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n?\3\2\2\2"+
		"\fA\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22\\\3\2\2\2\24^\3\2\2\2\26m\3\2\2"+
		"\2\30r\3\2\2\2\32w\3\2\2\2\34{\3\2\2\2\36!\5\4\3\2\37!\5\24\13\2 \36\3"+
		"\2\2\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2"+
		"\2%&\7\2\2\3&\3\3\2\2\2\',\5\30\r\2(,\5\24\13\2),\5\22\n\2*,\5\f\7\2+"+
		"\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-\63\5\32\16\2.\63"+
		"\5\24\13\2/\63\5\22\n\2\60\63\5\f\7\2\61\63\5\b\5\2\62-\3\2\2\2\62.\3"+
		"\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\7\3\2\2\2\648\78\2\2"+
		"\65\67\5\n\6\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2"+
		"\2:8\3\2\2\2;<\79\2\2<\t\3\2\2\2=@\5\b\5\2>@\5\6\4\2?=\3\2\2\2?>\3\2\2"+
		"\2@\13\3\2\2\2AE\7:\2\2BD\5\16\b\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2"+
		"\2\2FH\3\2\2\2GE\3\2\2\2HI\7;\2\2I\r\3\2\2\2JO\5\30\r\2KO\5\24\13\2LO"+
		"\5\22\n\2MO\5\20\t\2NJ\3\2\2\2NK\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\17\3\2\2"+
		"\2PU\7:\2\2QT\13\2\2\2RT\5\20\t\2SQ\3\2\2\2SR\3\2\2\2TW\3\2\2\2UV\3\2"+
		"\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7;\2\2Y\21\3\2\2\2Z]\7=\2\2[]\5\34"+
		"\17\2\\Z\3\2\2\2\\[\3\2\2\2]\23\3\2\2\2^_\5\22\n\2_h\78\2\2`e\5\26\f\2"+
		"ab\7<\2\2bd\5\26\f\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2h`\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\79\2\2k\25\3\2\2\2ln\5\6\4"+
		"\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\27\3\2\2\2qs\t\2\2\2rq\3\2"+
		"\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\31\3\2\2\2vx\t\3\2\2wv\3\2\2\2xy\3"+
		"\2\2\2yw\3\2\2\2yz\3\2\2\2z\33\3\2\2\2{|\t\4\2\2|\35\3\2\2\2\22 \"+\62"+
		"8?ENSU\\ehoty";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}