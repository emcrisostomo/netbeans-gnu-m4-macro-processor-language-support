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
package org.netbeans.gnu.m4.lexer;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.gnu.m4.lexer.javacc.M4Lexer;
import org.netbeans.gnu.m4.lexer.javacc.M4ParserConstants;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class M4LanguageHierarchy extends LanguageHierarchy<M4TokenId> {

    private static List<M4TokenId> tokens;
    private static Map<Integer, M4TokenId> idToToken;

    private static void init() {
        int regExCounter = 0;
        tokens = Arrays.asList(new M4TokenId[]{
            // whitespace and comments
            new M4TokenId("EOF", "whitespace", regExCounter++),
            new M4TokenId("WHITESPACE", "whitespace", regExCounter++),
            new M4TokenId("SINGLE_LINE_COMMENT", "comment", regExCounter++),
            new M4TokenId("DNL_COMMENT", "comment", regExCounter++),
            // Operators
            new M4TokenId("LBRACKET", "operator", regExCounter++),
            new M4TokenId("MLBRACKET", "operator", regExCounter++),
            new M4TokenId("MRBRACKET", "operator", regExCounter++),
            new M4TokenId("RBRACKET", "operator", regExCounter++),
            new M4TokenId("LQUOTE", "operator", regExCounter++),
            new M4TokenId("MQLQUOTE", "operator", regExCounter++),
            new M4TokenId("MQRQUOTE", "operator", regExCounter++),
            new M4TokenId("RQUOTE", "operator", regExCounter++),
            // Separators
            new M4TokenId("LPAREN", "operator", regExCounter++),
            new M4TokenId("RPAREN", "operator", regExCounter++),
            new M4TokenId("LBRACE", "operator", regExCounter++),
            new M4TokenId("RBRACE", "operator", regExCounter++),
            new M4TokenId("SEMICOLON", "operator", regExCounter++),
            new M4TokenId("COMMA", "operator", regExCounter++),
            new M4TokenId("DOT", "operator", regExCounter++),
            // Operators  
            new M4TokenId("ASSIGN", "operator", regExCounter++),
            new M4TokenId("LT", "operator", regExCounter++),
            new M4TokenId("BANG", "operator", regExCounter++),
            new M4TokenId("TILDE", "operator", regExCounter++),
            new M4TokenId("HOOK", "operator", regExCounter++),
            new M4TokenId("COLON", "operator", regExCounter++),
            new M4TokenId("EQ", "operator", regExCounter++),
            new M4TokenId("LE", "operator", regExCounter++),
            new M4TokenId("GE", "operator", regExCounter++),
            new M4TokenId("NE", "operator", regExCounter++),
            new M4TokenId("SC_OR", "operator", regExCounter++),
            new M4TokenId("SC_AND", "operator", regExCounter++),
            new M4TokenId("INCR_OP", "operator", regExCounter++),
            new M4TokenId("DECR_OP", "operator", regExCounter++),
            new M4TokenId("PLUS", "operator", regExCounter++),
            new M4TokenId("MINUS", "operator", regExCounter++),
            new M4TokenId("STAR", "operator", regExCounter++),
            new M4TokenId("SLASH", "operator", regExCounter++),
            new M4TokenId("BIT_AND", "operator", regExCounter++),
            new M4TokenId("BIT_OR", "operator", regExCounter++),
            new M4TokenId("XOR", "operator", regExCounter++),
            new M4TokenId("REM", "operator", regExCounter++),
            new M4TokenId("LSHIFT", "operator", regExCounter++),
            new M4TokenId("PLUSASSIGN", "operator", regExCounter++),
            new M4TokenId("MINUSASSIGN", "operator", regExCounter++),
            new M4TokenId("STARASSIGN", "operator", regExCounter++),
            new M4TokenId("SLASHASSIGN", "operator", regExCounter++),
            new M4TokenId("ANDASSIGN", "operator", regExCounter++),
            new M4TokenId("ORASSIGN", "operator", regExCounter++),
            new M4TokenId("XORASSIGN", "operator", regExCounter++),
            new M4TokenId("REMASSIGN", "operator", regExCounter++),
            new M4TokenId("LSHIFTASSIGN", "operator", regExCounter++),
            new M4TokenId("RSIGNEDSHIFTASSIGN", "operator", regExCounter++),
            new M4TokenId("ELLIPSIS", "operator", regExCounter++),
            // Quadrigraphs
            new M4TokenId("LBRACKET_QG", "operator", regExCounter++),
            new M4TokenId("RBRACKET_QG", "operator", regExCounter++),
            new M4TokenId("DOLLAR_QG", "operator", regExCounter++),
            new M4TokenId("BANG_QG", "operator", regExCounter++),
            new M4TokenId("LBRACE_QG", "operator", regExCounter++),
            new M4TokenId("RBRACE_QG", "operator", regExCounter++),
            new M4TokenId("EMPTY_QG", "operator", regExCounter++),
            // Builtin M4 Macros
            new M4TokenId("DEFINE", "m4-builtin-macro", regExCounter++),
            new M4TokenId("UNDEFINE", "m4-builtin-macro", regExCounter++),
            new M4TokenId("DEFN", "m4-builtin-macro", regExCounter++),
            new M4TokenId("PUSHDEF", "m4-builtin-macro", regExCounter++),
            new M4TokenId("POPDEF", "m4-builtin-macro", regExCounter++),
            new M4TokenId("INDIR", "m4-builtin-macro", regExCounter++),
            new M4TokenId("BUILTIN", "m4-builtin-macro", regExCounter++),
            new M4TokenId("IFDEF", "m4-builtin-macro", regExCounter++),
            new M4TokenId("IFELSE", "m4-builtin-macro", regExCounter++),
            new M4TokenId("SHIFT", "m4-builtin-macro", regExCounter++),
            new M4TokenId("DUMPDEF", "m4-builtin-macro", regExCounter++),
            new M4TokenId("TRACEON", "m4-builtin-macro", regExCounter++),
            new M4TokenId("TRACEOFF", "m4-builtin-macro", regExCounter++),
            new M4TokenId("DEBUGMODE", "m4-builtin-macro", regExCounter++),
            new M4TokenId("DEBUGFILE", "m4-builtin-macro", regExCounter++),
            new M4TokenId("CHANGEQUOTE", "m4-builtin-macro", regExCounter++),
            new M4TokenId("CHANGECOM", "m4-builtin-macro", regExCounter++),
            new M4TokenId("CHANGEWORD", "m4-builtin-macro", regExCounter++),
            new M4TokenId("M4WRAP", "m4-builtin-macro", regExCounter++),
            new M4TokenId("INCLUDE", "m4-builtin-macro", regExCounter++),
            new M4TokenId("SINCLUDE", "m4-builtin-macro", regExCounter++),
            new M4TokenId("DIVERT", "m4-builtin-macro", regExCounter++),
            new M4TokenId("UNDIVERT", "m4-builtin-macro", regExCounter++),
            new M4TokenId("DIVNUM", "m4-builtin-macro", regExCounter++),
            new M4TokenId("LEN", "m4-builtin-macro", regExCounter++),
            new M4TokenId("INDEX", "m4-builtin-macro", regExCounter++),
            new M4TokenId("REGEXP", "m4-builtin-macro", regExCounter++),
            new M4TokenId("SUBSTR", "m4-builtin-macro", regExCounter++),
            new M4TokenId("TRANSLIT", "m4-builtin-macro", regExCounter++),
            new M4TokenId("PATSUBST", "m4-builtin-macro", regExCounter++),
            new M4TokenId("FORMAT", "m4-builtin-macro", regExCounter++),
            new M4TokenId("INCR", "m4-builtin-macro", regExCounter++),
            new M4TokenId("DECR", "m4-builtin-macro", regExCounter++),
            new M4TokenId("EVAL", "m4-builtin-macro", regExCounter++),
            new M4TokenId("__GNU__", "m4-builtin-macro", regExCounter++),
            new M4TokenId("__OS2__", "m4-builtin-macro", regExCounter++),
            new M4TokenId("OS2", "m4-builtin-macro", regExCounter++),
            new M4TokenId("__UNIX__", "m4-builtin-macro", regExCounter++),
            new M4TokenId("__WINDOWS__", "m4-builtin-macro", regExCounter++),
            new M4TokenId("WINDOWS", "m4-builtin-macro", regExCounter++),
            new M4TokenId("SYSCMD", "m4-builtin-macro", regExCounter++),
            new M4TokenId("ESYSCMD", "m4-builtin-macro", regExCounter++),
            new M4TokenId("SYSVAL", "m4-builtin-macro", regExCounter++),
            new M4TokenId("MKSTEMP", "m4-builtin-macro", regExCounter++),
            new M4TokenId("MAKETEMP", "m4-builtin-macro", regExCounter++),
            new M4TokenId("ERRPRINT", "m4-builtin-macro", regExCounter++),
            new M4TokenId("__FILE__", "m4-builtin-macro", regExCounter++),
            new M4TokenId("__LINE__", "m4-builtin-macro", regExCounter++),
            new M4TokenId("__PROGRAM__", "m4-builtin-macro", regExCounter++),
            new M4TokenId("M4EXIT", "m4-builtin-macro", regExCounter++),
            // m4 macros
            new M4TokenId("M4_MACRO", "m4-macro", regExCounter++, true),
            new M4TokenId("MACRO_NAME", "m4-macro", regExCounter++),
            new M4TokenId("M4_MACRO_INVOCATION", "m4-macro-invocation", regExCounter++),
            //  Literals
            new M4TokenId("INTEGER_LITERAL", "number", regExCounter++),
            new M4TokenId("DECIMAL_LITERAL", "number", regExCounter++),
            new M4TokenId("HEX_LITERAL", "number", regExCounter++),
            new M4TokenId("OCTAL_LITERAL", "number", regExCounter++),
            new M4TokenId("FLOATING_POINT_LITERAL", "number", regExCounter++),
            new M4TokenId("DECIMAL_FLOATING_POINT_LITERAL", "number", regExCounter++),
            new M4TokenId("DECIMAL_EXPONENT", "number", regExCounter++),
            new M4TokenId("HEXADECIMAL_FLOATING_POINT_LITERAL", "number", regExCounter++),
            new M4TokenId("HEXADECIMAL_EXPONENT", "number", regExCounter++),
            new M4TokenId("CHARACTER_LITERAL", "character", regExCounter++),
            new M4TokenId("STRING_LITERAL", "string", regExCounter++),
            // Text
            new M4TokenId("QUOTED_TEXT", "m4-quoted", M4ParserConstants.QUOTED_TEXT),
            new M4TokenId("TEXT", "text", M4ParserConstants.TEXT)
        });

        idToToken = new HashMap<>();

        for (M4TokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    public static synchronized M4TokenId getToken(int id) {
        if (idToToken == null) {
            init();
        }

        return idToToken.get(id);
    }

    @Override
    protected Collection<M4TokenId> createTokenIds() {
        if (tokens == null) {
            init();
        }

        return tokens;
    }

    @Override
    protected Lexer<M4TokenId> createLexer(LexerRestartInfo<M4TokenId> info) {
        return new M4Lexer(info);
    }

    @Override
    protected String mimeType() {
        return "text/x-m4";
    }
}
