    /* 
 * Copyright (C) 2014, Enrico M. Crisostomo
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
parser grammar m4Parser;

options { tokenVocab=m4Lexer; }

@header {
package org.netbeans.gnu.m4.antlr;
}

compilationUnit
    : (macroInvocation | text)* EOF
    ;

text
    : (macroName | quotedText | ctext | verbatimText)
    ;

ctext
    : (BANG | C_VERBATIM_TEXT)
    ;

parameterText
    : (verbatimParameterText | macroInvocation | macroName | quotedText | parenthesizedText)
    ;

parenthesizedText
    : LPAREN pText* RPAREN
    ;

pText
    : (parenthesizedText | parameterText)
    ;

quotedText
    : LBRACK qtext* RBRACK
    ;

qtext
    : (verbatimText | macroInvocation | macroName | verbatimQuotedText | ctext)
    ;

verbatimQuotedText
    : LBRACK (.|verbatimQuotedText)*? RBRACK
    ;

macroName   
    : (IDENTIFIER | builtinMacro)
    ;

macroInvocation
    : macroName LPAREN (parameter (COMMA parameter)*)? RPAREN
    ;

parameter
    : parameterText+
    ;

verbatimText
    : (
        VERBATIM_TEXT
      |
        LPAREN          
      |
        RPAREN
      |
        COMMA
      |
        WHITESPACE
      )+
    ;

verbatimParameterText
    : (
         VERBATIM_TEXT
       |
         WHITESPACE
      )+
    ;

builtinMacro
    :
        (
        DEFINE
        |
        UNDEFINE
        |
        DEFN
        |
        PUSHDEF
        |
        POPDEF
        |
        INDIR
        |
        BUILTIN
        |
        IFDEF
        |
        IFELSE
        |
        SHIFT
        |
        DUMPDEF
        |
        TRACEON
        |
        TRACEOFF
        |
        DEBUGMODE
        |
        DEBUGFILE
        |
        CHANGEQUOTE
        |
        CHANGECOM
        |
        CHANGEWORD
        |
        M4WRAP
        |
        INCLUDE
        |
        SINCLUDE
        |
        DIVERT
        |
        UNDIVERT
        |
        DIVNUM
        |
        LEN
        |
        INDEX
        |
        REGEXP
        |
        SUBSTR
        |
        TRANSLIT
        |
        PATSUBST
        |
        FORMAT
        |
        INCR
        |
        DECR
        |
        EVAL
        |
        GNU__
        |
        OS2__
        |
        OS2
        |
        UNIX__
        |
        WINDOWS__
        |
        WINDOWS
        |
        SYSCMD
        |
        ESYSCMD
        |
        SYSVAL
        |
        MKSTEMP
        |
        MAKETEMP
        |
        ERRPRINT
        |
        FILE__
        |
        LINE__
        |
        PROGRAM__
        |
        M4EXIT
        )
    ;