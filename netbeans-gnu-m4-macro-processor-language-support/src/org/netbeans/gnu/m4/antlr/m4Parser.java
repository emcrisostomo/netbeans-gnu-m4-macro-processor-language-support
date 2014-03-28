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
		RULE_compilationUnit = 0, RULE_text = 1, RULE_quotedText = 2, RULE_macroName = 3, 
		RULE_macroInvocation = 4, RULE_parameter = 5, RULE_verbatimText = 6, RULE_builtinMacro = 7;
	public static final String[] ruleNames = {
		"compilationUnit", "text", "quotedText", "macroName", "macroInvocation", 
		"parameter", "verbatimText", "builtinMacro"
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
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << LBRACK) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT))) != 0)) {
				{
				setState(18);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(16); text();
					}
					break;

				case 2:
					{
					setState(17); macroInvocation();
					}
					break;
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23); match(EOF);
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
			setState(29);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(25); verbatimText();
				}
				break;

			case 2:
				{
				setState(26); quotedText();
				}
				break;

			case 3:
				{
				setState(27); macroInvocation();
				}
				break;

			case 4:
				{
				setState(28); macroName();
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
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TerminalNode RBRACK() { return getToken(m4Parser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(m4Parser.LBRACK, 0); }
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
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
		enterRule(_localctx, 4, RULE_quotedText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(LBRACK);
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(32); text();
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(38); match(RBRACK);
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
		enterRule(_localctx, 6, RULE_macroName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(40); match(IDENTIFIER);
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
				setState(41); builtinMacro();
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
		enterRule(_localctx, 8, RULE_macroInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); macroName();
			setState(45); match(LPAREN);
			setState(54);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFINE) | (1L << UNDEFINE) | (1L << DEFN) | (1L << PUSHDEF) | (1L << POPDEF) | (1L << INDIR) | (1L << BUILTIN) | (1L << IFDEF) | (1L << IFELSE) | (1L << SHIFT) | (1L << DUMPDEF) | (1L << TRACEON) | (1L << TRACEOFF) | (1L << DEBUGMODE) | (1L << DEBUGFILE) | (1L << CHANGEQUOTE) | (1L << CHANGECOM) | (1L << CHANGEWORD) | (1L << M4WRAP) | (1L << INCLUDE) | (1L << SINCLUDE) | (1L << DIVERT) | (1L << UNDIVERT) | (1L << DIVNUM) | (1L << LEN) | (1L << INDEX) | (1L << REGEXP) | (1L << SUBSTR) | (1L << TRANSLIT) | (1L << PATSUBST) | (1L << FORMAT) | (1L << INCR) | (1L << DECR) | (1L << EVAL) | (1L << GNU__) | (1L << OS2__) | (1L << OS2) | (1L << UNIX__) | (1L << WINDOWS__) | (1L << WINDOWS) | (1L << SYSCMD) | (1L << ESYSCMD) | (1L << SYSVAL) | (1L << MKSTEMP) | (1L << MAKETEMP) | (1L << ERRPRINT) | (1L << FILE__) | (1L << LINE__) | (1L << PROGRAM__) | (1L << M4EXIT) | (1L << LBRACK) | (1L << IDENTIFIER) | (1L << VERBATIM_TEXT))) != 0)) {
				{
				setState(46); parameter();
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(47); match(COMMA);
					setState(48); parameter();
					}
					}
					setState(53);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(56); match(RPAREN);
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
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public MacroInvocationContext macroInvocation() {
			return getRuleContext(MacroInvocationContext.class,0);
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
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(58); macroInvocation();
				}
				break;

			case 2:
				{
				setState(59); text();
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
		enterRule(_localctx, 12, RULE_verbatimText);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62); match(VERBATIM_TEXT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(65); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 14, RULE_builtinMacro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>H\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2\f"+
		"\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\7\4$\n\4\f\4"+
		"\16\4\'\13\4\3\4\3\4\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\3\6\3\6\7\6\64\n\6\f"+
		"\6\16\6\67\13\6\5\69\n\6\3\6\3\6\3\7\3\7\5\7?\n\7\3\b\6\bB\n\b\r\b\16"+
		"\bC\3\t\3\t\3\t\3%\2\n\2\4\6\b\n\f\16\20\2\3\3\2\3\64J\2\26\3\2\2\2\4"+
		"\37\3\2\2\2\6!\3\2\2\2\b,\3\2\2\2\n.\3\2\2\2\f>\3\2\2\2\16A\3\2\2\2\20"+
		"E\3\2\2\2\22\25\5\4\3\2\23\25\5\n\6\2\24\22\3\2\2\2\24\23\3\2\2\2\25\30"+
		"\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32"+
		"\7\2\2\3\32\3\3\2\2\2\33 \5\16\b\2\34 \5\6\4\2\35 \5\n\6\2\36 \5\b\5\2"+
		"\37\33\3\2\2\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!%"+
		"\7:\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2\2%&\3\2\2\2%#\3\2\2\2&(\3\2\2\2"+
		"\'%\3\2\2\2()\7;\2\2)\7\3\2\2\2*-\7=\2\2+-\5\20\t\2,*\3\2\2\2,+\3\2\2"+
		"\2-\t\3\2\2\2./\5\b\5\2/8\78\2\2\60\65\5\f\7\2\61\62\7<\2\2\62\64\5\f"+
		"\7\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2"+
		"\2\67\65\3\2\2\28\60\3\2\2\289\3\2\2\29:\3\2\2\2:;\79\2\2;\13\3\2\2\2"+
		"<?\5\n\6\2=?\5\4\3\2><\3\2\2\2>=\3\2\2\2?\r\3\2\2\2@B\7>\2\2A@\3\2\2\2"+
		"BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\17\3\2\2\2EF\t\2\2\2F\21\3\2\2\2\13\24"+
		"\26\37%,\658>C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}