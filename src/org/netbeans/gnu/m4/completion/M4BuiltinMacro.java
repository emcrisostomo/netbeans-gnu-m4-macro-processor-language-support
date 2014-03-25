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
package org.netbeans.gnu.m4.completion;

/**
 *
 * @author Enrico M. Crisostomo
 */
public enum M4BuiltinMacro {
    DEFINE("define", null, false),
    NARGS("nargs", null, false),
    UNDEFINE("undefine", null, false),
    DEFN("defn", null, false),
    PUSHDEF("pushdef", null, false),
    POPDEF("popdef", null, false),
    INDIR("indir", null, false),
    BUILTIN("builtin", null, false),
    IFDEF("ifdef", null, false),
    IFELSE("ifelse", null, false),
    SHIFT("shift", null, false),
    REVERSE("reverse", null, false),
    COND("cond", null, false),
    JOIN("join", null, false),
    JOINALL("joinall", null, false),
    QUOTE("quote", null, false),
    DQUOTE("dquote", null, false),
    DQUOTE_ELT("dquote_elt", null, false),
    ARGN("argn", null, false),
    FORLOOP("forloop", null, false),
    FOREACH("foreach", null, false),
    FOREACHQ("foreachq", null, false),
    STACK_FOREACH("stack_foreach", null, false),
    STACK_FOREACH_LIFO("stack_foreach_lifo", null, false),
    DEFINE_BLIND("define_blind", null, false),
    CURRY("curry", null, false),
    COPY("copy", null, false),
    RENAME("rename", null, false),
    DUMPDEF("dumpdef", null, false),
    TRACEON("traceon", null, false),
    TRACEOFF("traceoff", null, false),
    DEBUGMODE("debugmode", null, false),
    DEBUGFILE("debugfile", null, false),
    CHANGEQUOTE("changequote", null, false),
    CHANGECOM("changecom", null, false),
    CHANGEWORD("changeword", null, false),
    M4WRAP("m4wrap", null, false),
    INCLUDE("include", null, false),
    SINCLUDE("sinclude", null, false),
    DIVERT("divert", null, false),
    UNDIVERT("undivert", null, false),
    DIVNUM("divnum", null, false),
    CLEARDIVERT("cleardivert", null, false),
    LEN("len", null, false),
    INDEX("index", null, false),
    REGEXP("regexp", null, false),
    SUBSTR("substr", null, false),
    TRANSLIT("translit", null, false),
    PATSUBST("patsubst", null, false),
    UPCASE("upcase", null, false),
    DOWNCASE("downcase", null, false),
    CAPITALIZE("capitalize", null, false),
    FORMAT("format", null, false),
    INCR("incr", null, false),
    DECR("decr", null, false),
    EVAL("eval", null, false),
    __GNU__("__gnu__", null, false),
    __OS2__("__os2__", null, false),
    OS2("os2", null, false),
    __UNIX__("__unix__", null, false),
    __WINDOWS__("__windows__", null, false),
    WINDOWS("windows", null, false),
    SYSCMD("syscmd", null, false),
    ESYSCMD("esyscmd", null, false),
    SYSVAL("sysval", null, false),
    MKSTEMP("mkstemp", null, false),
    MAKETEMP("maketemp", null, false),
    ERRPRINT("errprint", null, false),
    __FILE__("__file__", null, false),
    __LINE__("__line__", null, false),
    __PROGRAM__("__program__", null, false),
    M4EXIT("m4exit", null, false),
    FATAL_ERROR("fatal_error", null, false);

    private final String text;
    private final String docUrl;
    private final boolean obsolete;

    private M4BuiltinMacro(String text, String docUrl) {
        this.text = text;
        this.docUrl = docUrl;
        this.obsolete = false;
    }

    private M4BuiltinMacro(String text, String docUrl, boolean obsolete) {
        this.text = text;
        this.docUrl = docUrl;
        this.obsolete = obsolete;
    }

    public String getText() {
        return this.text;
    }

    public String getDocUrl() {
        return this.docUrl;
    }

    public boolean isObsolete() {
        return this.obsolete;
    }
}
