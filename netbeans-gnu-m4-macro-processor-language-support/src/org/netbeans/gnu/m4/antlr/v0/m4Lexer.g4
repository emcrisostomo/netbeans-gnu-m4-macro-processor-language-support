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
lexer grammar m4Lexer;

@header {
package org.netbeans.gnu.m4.antlr.v0;
}

/* Lexer */

DEFINE:             'define' ;
UNDEFINE:           'undefine' ;
DEFN:               'defn' ;
PUSHDEF:            'pushdef' ;
POPDEF:             'popdef' ;
INDIR:              'indir' ;
BUILTIN:            'builtin' ;
IFDEF:              'ifdef' ;
IFELSE:             'ifelse' ;
SHIFT:              'shift' ;
DUMPDEF:            'dumpdef' ;
TRACEON:            'traceon' ;
TRACEOFF:           'traceoff' ;
DEBUGMODE:          'debugmode' ;
DEBUGFILE:          'debugfile' ;
CHANGEQUOTE:        'changequote' ;
CHANGECOM:          'changecom' ;
CHANGEWORD:         'changeword' ;
M4WRAP:             'm4wrap' ;
INCLUDE:            'include' ;
SINCLUDE:           'sinclude' ;
DIVERT:             'divert' ;
UNDIVERT:           'undivert' ;
DIVNUM:             'divnum' ;
LEN:                'len' ;
INDEX:              'index' ;
REGEXP:             'regexp' ;
SUBSTR:             'substr' ;
TRANSLIT:           'translit' ;
PATSUBST:           'patsubst' ;
FORMAT:             'format' ;
INCR:               'incr' ;
DECR:               'decr' ;
EVAL:               'eval' ;
GNU__:              '__gnu__' ;
OS2__:              '__os2__' ;
OS2:                'os2' ;
UNIX__:             '__unix__' ;
WINDOWS__:          '__windows__' ;
WINDOWS:            'windows' ;
SYSCMD:             'syscmd' ;
ESYSCMD:            'esyscmd' ;
SYSVAL:             'sysval' ;
MKSTEMP:            'mkstemp' ;
MAKETEMP:           'maketemp' ;
ERRPRINT:           'errprint' ;
FILE__:             '__file__' ;
LINE__:             '__line__' ;
PROGRAM__:          '__program__' ;
M4EXIT:             'm4exit' ;

NEWLINE
    : ('\r')? '\n'
    ;

HORIZONTAL_WHITESPACE
    : ([ \t\f\u000c])+
    ;

WHITESPACE
    : (HORIZONTAL_WHITESPACE | NEWLINE)+
    ;

DNL_COMMENT
    : 'dnl' (HORIZONTAL_WHITESPACE)+ ~[\r\n]* (NEWLINE)? -> skip
    ;

/* Separators */

LPAREN          : '(' ;
RPAREN          : ')' ;
LBRACK          : '[' ;
RBRACK          : ']' ;
COMMA           : ',' ;
BANG            : '#' -> mode(SINGLE_LINE_COMMENT) ;

IDENTIFIER
    : M4_LETTER (M4_LETTER_OR_DIGIT)*
    ;

fragment
M4_LETTER
    : [a-zA-Z_]
    ;

fragment
M4_LETTER_OR_DIGIT
    : [a-zA-Z0-9_]
    ;

VERBATIM_TEXT
    : (.+?)
    ;

mode SINGLE_LINE_COMMENT;

C_VERBATIM_TEXT
    : (.+?)
    ;

NL
    : '\n' -> mode(DEFAULT_MODE)
    ;