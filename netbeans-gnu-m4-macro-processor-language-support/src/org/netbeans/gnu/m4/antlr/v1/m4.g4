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

grammar m4;

@header {
package org.netbeans.gnu.m4.antlr.v1;
}

/* Parser */

m4
    : (statement | punctuation)* EOF
    ;

statement
    : expr
    | quote
    | verbatimText
    ;

quote
    : '[' (statement | punctuation)* ']'
    ;

expr
    : ID '(' exprParameters ')'
    | ID
    ;

exprParameters
    : (exprParameter)* (COMMA (exprParameter)*)*
    ;

exprParameter
    : statement
    | parenthesizedText
    ;

parenthesizedText
    : LPAREN (parenthesizedText | statement | verbatimText)* RPAREN
    ;

verbatimText
    : ( NL
      | WS
      | ANY)+
    ;

punctuation
    : ( LPAREN
      | RPAREN
      | COMMA)+
    ;

/* Lexer */

DNL_COMMENT
    : 'dnl' (HORIZONTAL_WHITESPACE)+ ~[\r\n]* (NL)? -> skip
    ;

ID
    : M4_LETTER (M4_LETTER_OR_DIGIT)*
    ;

LPAREN: '(' ;
RPAREN: ')' ;
LBRACKET: '[' ;
RBRACKET: ']' ;
COMMA:  ',' ;

fragment
M4_LETTER
    : LETTER | [_]
    ;

fragment
M4_LETTER_OR_DIGIT
    : LETTER | DIGIT | [_]
    ;

fragment
LETTER
    : [a-zA-Z]
    ;

fragment
DIGIT
    : [0-9]
    ;

WS: (NL | HORIZONTAL_WHITESPACE)+ ;
NL: ('\r')? '\n' ;
HORIZONTAL_WHITESPACE
    : ([ \t\f\u000c])
    ;

ANY
    : (.)+?
    ;
