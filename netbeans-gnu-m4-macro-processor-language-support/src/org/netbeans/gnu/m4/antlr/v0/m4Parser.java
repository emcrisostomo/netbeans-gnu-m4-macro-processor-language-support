// Generated from m4Parser.g4 by ANTLR 4.2.1

package org.netbeans.gnu.m4.antlr.v0;

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
		DIVERT=22, INDIR=6, ERRPRINT=46, DEBUGMODE=14, FORMAT=31, BUILTIN=7, IFDEF=8, 
		LINE__=48, TRANSLIT=29, UNIX__=38, DEFN=3, POPDEF=5, WHITESPACE=53, CHANGEQUOTE=16, 
		INDEX=26, SYSVAL=43, C_VERBATIM_TEXT=63, INCLUDE=20, PROGRAM__=49, SUBSTR=28, 
		GNU__=35, NEWLINE=51, BANG=60, LPAREN=55, WINDOWS__=39, RPAREN=56, UNDIVERT=23, 
		DECR=33, HORIZONTAL_WHITESPACE=52, RBRACK=58, LBRACK=57, PUSHDEF=4, M4WRAP=19, 
		EVAL=34, PATSUBST=30, MKSTEMP=44, NL=64, SINCLUDE=21, FILE__=47, M4EXIT=50, 
		DEFINE=1, OS2=37, SHIFT=10, OS2__=36, VERBATIM_TEXT=62, REGEXP=27, TRACEOFF=13, 
		WINDOWS=40, IFELSE=9, IDENTIFIER=61, MAKETEMP=45, CHANGEWORD=18, DEBUGFILE=15, 
		COMMA=59, SYSCMD=41, DIVNUM=24, CHANGECOM=17, DUMPDEF=11, TRACEON=12, 
		ESYSCMD=42, DNL_COMMENT=54, UNDEFINE=2, LEN=25, INCR=32;
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
		"NEWLINE", "HORIZONTAL_WHITESPACE", "WHITESPACE", "DNL_COMMENT", "'('", 
		"')'", "'['", "']'", "','", "'#'", "IDENTIFIER", "VERBATIM_TEXT", "C_VERBATIM_TEXT", 
		"'\n'"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_text = 1, RULE_ctext = 2, RULE_parameterText = 3, 
		RULE_parenthesizedText = 4, RULE_pText = 5, RULE_quotedText = 6, RULE_qtext = 7, 
		RULE_verbatimQuotedText = 8, RULE_macroName = 9, RULE_macroInvocation = 10, 
		RULE_parameter = 11, RULE_verbatimText = 12, RULE_verbatimParameterText = 13, 
		RULE_builtinMacro = 14;
	public static final String[] ruleNames = {
		"compilationUnit", "text", "ctext", "parameterText", "parenthesizedText", 
		"pText", "quotedText", "qtext", "verbatimQuotedText", "macroName", "macroInvocation", 
		"parameter", "verbatimText", "verbatimParameterText", "builtinMacro"
	};

	@Override
	public String getGrammarFileName() { return "m4Parser.g4"; }

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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << WHITESPACE) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACK) | (1L << COMMA) | (1L << BANG) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT) | (1L << C_VERBATIM_TEXT))) != 0)) {
				{
				setState(32);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(30); macroInvocation();
					}
					break;

				case 2:
					{
					setState(31); text();
					}
					break;
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37); match(EOF);
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
		public CtextContext ctext() {
			return getRuleContext(CtextContext.class,0);
		}
		public QuotedTextContext quotedText() {
			return getRuleContext(QuotedTextContext.class,0);
		}
		public VerbatimTextContext verbatimText() {
			return getRuleContext(VerbatimTextContext.class,0);
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			switch (_input.LA(1)) {
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
			case IDENTIFIER:
				{
				setState(39); macroName();
				}
				break;
			case LBRACK:
				{
				setState(40); quotedText();
				}
				break;
			case BANG:
			case C_VERBATIM_TEXT:
				{
				setState(41); ctext();
				}
				break;
			case WHITESPACE:
			case LPAREN:
			case RPAREN:
			case COMMA:
			case VERBATIM_TEXT:
				{
				setState(42); verbatimText();
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

	public static class CtextContext extends ParserRuleContext {
		public TerminalNode C_VERBATIM_TEXT() { return getToken(m4Parser.C_VERBATIM_TEXT, 0); }
		public TerminalNode BANG() { return getToken(m4Parser.BANG, 0); }
		public CtextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterCtext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitCtext(this);
		}
	}

	public final CtextContext ctext() throws RecognitionException {
		CtextContext _localctx = new CtextContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ctext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==BANG || _la==C_VERBATIM_TEXT) ) {
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterParameterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitParameterText(this);
		}
	}

	public final ParameterTextContext parameterText() throws RecognitionException {
		ParameterTextContext _localctx = new ParameterTextContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameterText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(47); verbatimParameterText();
				}
				break;

			case 2:
				{
				setState(48); macroInvocation();
				}
				break;

			case 3:
				{
				setState(49); macroName();
				}
				break;

			case 4:
				{
				setState(50); quotedText();
				}
				break;

			case 5:
				{
				setState(51); parenthesizedText();
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterParenthesizedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitParenthesizedText(this);
		}
	}

	public final ParenthesizedTextContext parenthesizedText() throws RecognitionException {
		ParenthesizedTextContext _localctx = new ParenthesizedTextContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parenthesizedText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(LPAREN);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << WHITESPACE) | (1L << LPAREN) | (1L << LBRACK) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT))) != 0)) {
				{
				{
				setState(55); pText();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61); match(RPAREN);
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterPText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitPText(this);
		}
	}

	public final PTextContext pText() throws RecognitionException {
		PTextContext _localctx = new PTextContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(63); parenthesizedText();
				}
				break;

			case 2:
				{
				setState(64); parameterText();
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterQuotedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitQuotedText(this);
		}
	}

	public final QuotedTextContext quotedText() throws RecognitionException {
		QuotedTextContext _localctx = new QuotedTextContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quotedText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(LBRACK);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << WHITESPACE) | (1L << LPAREN) | (1L << RPAREN) | (1L << LBRACK) | (1L << COMMA) | (1L << BANG) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT) | (1L << C_VERBATIM_TEXT))) != 0)) {
				{
				{
				setState(68); qtext();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74); match(RBRACK);
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
		public CtextContext ctext() {
			return getRuleContext(CtextContext.class,0);
		}
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterQtext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitQtext(this);
		}
	}

	public final QtextContext qtext() throws RecognitionException {
		QtextContext _localctx = new QtextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_qtext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(76); verbatimText();
				}
				break;

			case 2:
				{
				setState(77); macroInvocation();
				}
				break;

			case 3:
				{
				setState(78); macroName();
				}
				break;

			case 4:
				{
				setState(79); verbatimQuotedText();
				}
				break;

			case 5:
				{
				setState(80); ctext();
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterVerbatimQuotedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitVerbatimQuotedText(this);
		}
	}

	public final VerbatimQuotedTextContext verbatimQuotedText() throws RecognitionException {
		VerbatimQuotedTextContext _localctx = new VerbatimQuotedTextContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_verbatimQuotedText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(LBRACK);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					setState(86);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(84);
						matchWildcard();
						}
						break;

					case 2:
						{
						setState(85); verbatimQuotedText();
						}
						break;
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(91); match(RBRACK);
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterMacroName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitMacroName(this);
		}
	}

	public final MacroNameContext macroName() throws RecognitionException {
		MacroNameContext _localctx = new MacroNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_macroName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(93); match(IDENTIFIER);
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
				setState(94); builtinMacro();
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterMacroInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitMacroInvocation(this);
		}
	}

	public final MacroInvocationContext macroInvocation() throws RecognitionException {
		MacroInvocationContext _localctx = new MacroInvocationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_macroInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); macroName();
			setState(98); match(LPAREN);
			setState(107);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << WHITESPACE) | (1L << LPAREN) | (1L << LBRACK) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT))) != 0)) {
				{
				setState(99); parameter();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100); match(COMMA);
					setState(101); parameter();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(109); match(RPAREN);
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111); parameterText();
				}
				}
				setState(114); 
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterVerbatimText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitVerbatimText(this);
		}
	}

	public final VerbatimTextContext verbatimText() throws RecognitionException {
		VerbatimTextContext _localctx = new VerbatimTextContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_verbatimText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(116);
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
				setState(119); 
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterVerbatimParameterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitVerbatimParameterText(this);
		}
	}

	public final VerbatimParameterTextContext verbatimParameterText() throws RecognitionException {
		VerbatimParameterTextContext _localctx = new VerbatimParameterTextContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_verbatimParameterText);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(121);
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
				setState(124); 
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
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).enterBuiltinMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof m4ParserListener ) ((m4ParserListener)listener).exitBuiltinMacro(this);
		}
	}

	public final BuiltinMacroContext builtinMacro() throws RecognitionException {
		BuiltinMacroContext _localctx = new BuiltinMacroContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_builtinMacro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3B\u0083\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\7\2#\n\2\f\2"+
		"\16\2&\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\67\n\5\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\6\3\6\3\7\3\7\5\7D\n\7"+
		"\3\b\3\b\7\bH\n\b\f\b\16\bK\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tT\n\t"+
		"\3\n\3\n\3\n\7\nY\n\n\f\n\16\n\\\13\n\3\n\3\n\3\13\3\13\5\13b\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\7\fi\n\f\f\f\16\fl\13\f\5\fn\n\f\3\f\3\f\3\r\6\rs\n\r"+
		"\r\r\16\rt\3\16\6\16x\n\16\r\16\16\16y\3\17\6\17}\n\17\r\17\16\17~\3\20"+
		"\3\20\3\20\3Z\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\6\4\2>>AA"+
		"\6\2\67\679:==@@\4\2\67\67@@\3\2\3\64\u008b\2$\3\2\2\2\4-\3\2\2\2\6/\3"+
		"\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20S\3\2\2\2\22U"+
		"\3\2\2\2\24a\3\2\2\2\26c\3\2\2\2\30r\3\2\2\2\32w\3\2\2\2\34|\3\2\2\2\36"+
		"\u0080\3\2\2\2 #\5\26\f\2!#\5\4\3\2\" \3\2\2\2\"!\3\2\2\2#&\3\2\2\2$\""+
		"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\2\2\3(\3\3\2\2\2).\5\24\13"+
		"\2*.\5\16\b\2+.\5\6\4\2,.\5\32\16\2-)\3\2\2\2-*\3\2\2\2-+\3\2\2\2-,\3"+
		"\2\2\2.\5\3\2\2\2/\60\t\2\2\2\60\7\3\2\2\2\61\67\5\34\17\2\62\67\5\26"+
		"\f\2\63\67\5\24\13\2\64\67\5\16\b\2\65\67\5\n\6\2\66\61\3\2\2\2\66\62"+
		"\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2\2\66\65\3\2\2\2\67\t\3\2\2\28<\79\2"+
		"\29;\5\f\7\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2"+
		"\2?@\7:\2\2@\13\3\2\2\2AD\5\n\6\2BD\5\b\5\2CA\3\2\2\2CB\3\2\2\2D\r\3\2"+
		"\2\2EI\7;\2\2FH\5\20\t\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2"+
		"\2\2KI\3\2\2\2LM\7<\2\2M\17\3\2\2\2NT\5\32\16\2OT\5\26\f\2PT\5\24\13\2"+
		"QT\5\22\n\2RT\5\6\4\2SN\3\2\2\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2"+
		"\2T\21\3\2\2\2UZ\7;\2\2VY\13\2\2\2WY\5\22\n\2XV\3\2\2\2XW\3\2\2\2Y\\\3"+
		"\2\2\2Z[\3\2\2\2ZX\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7<\2\2^\23\3\2\2\2_"+
		"b\7?\2\2`b\5\36\20\2a_\3\2\2\2a`\3\2\2\2b\25\3\2\2\2cd\5\24\13\2dm\79"+
		"\2\2ej\5\30\r\2fg\7=\2\2gi\5\30\r\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2kn\3\2\2\2lj\3\2\2\2me\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7:\2\2p\27"+
		"\3\2\2\2qs\5\b\5\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\31\3\2\2\2"+
		"vx\t\3\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\33\3\2\2\2{}\t\4\2"+
		"\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\35\3\2\2\2\u0080\u0081"+
		"\t\5\2\2\u0081\37\3\2\2\2\22\"$-\66<CISXZajmty~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}