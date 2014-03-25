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
    DEFINE("define", "Define.html", false),
    UNDEFINE("undefine", "Undefine.html", false),
    DEFN("defn", "Defn.html", false),
    PUSHDEF("pushdef", "Pushdef.html", false),
    POPDEF("popdef", "Pushdef.html", false),
    INDIR("indir", "Indir.html", false),
    BUILTIN("builtin", "Builtin.html", false),
    IFDEF("ifdef", "Ifdef.html", false),
    IFELSE("ifelse", "Ifelse.html", false),
    SHIFT("shift", "Shift.html", false),
    DUMPDEF("dumpdef", "Dumpdef.html", false),
    TRACEON("traceon", "Trace.html", false),
    TRACEOFF("traceoff", "Trace.html", false),
    DEBUGMODE("debugmode", "Debug-Levels.html", false),
    DEBUGFILE("debugfile", "Debug-Output.html", false),
    DNL("dnl", "Dnl.html", false),
    CHANGEQUOTE("changequote", "Changequote.html", false),
    CHANGECOM("changecom", "Changecom.html", false),
    CHANGEWORD("changeword", "Changeword.html", false),
    M4WRAP("m4wrap", "M4wrap.html", false),
    INCLUDE("include", "Include.html", false),
    SINCLUDE("sinclude", "Include.html", false),
    DIVERT("divert", "Divert.html", false),
    UNDIVERT("undivert", "Undivert.html", false),
    DIVNUM("divnum", "Divnum.html", false),
    LEN("len", "Len.html", false),
    INDEX("index", "Index-macro.html", false),
    REGEXP("regexp", "Regexp.html", false),
    SUBSTR("substr", "Substr.html", false),
    TRANSLIT("translit", "Translit.html", false),
    PATSUBST("patsubst", "Patsubst.html", false),
    FORMAT("format", "Format.html", false),
    INCR("incr", "Incr.html", false),
    DECR("decr", "Incr.html", false),
    EVAL("eval", "Eval.html", false),
    __GNU__("__gnu__", "Platform-macros.html", false, true),
    __OS2__("__os2__", "Platform-macros.html", false, true),
    OS2("os2", "Platform-macros.html", false, true),
    __UNIX__("__unix__", "Platform-macros.html", false, true),
    __WINDOWS__("__windows__", "Platform-macros.html", false, true),
    WINDOWS("windows", "Platform-macros.html", false, true),
    SYSCMD("syscmd", "Syscmd.html", false),
    ESYSCMD("esyscmd", "Esyscmd.html", false),
    SYSVAL("sysval", "Sysval.html", false),
    MKSTEMP("mkstemp", "Mkstemp.html", false),
    MAKETEMP("maketemp", "Mkstemp.html", false),
    ERRPRINT("errprint", "Errprint.html", false),
    __FILE__("__file__", "Location.html", false),
    __LINE__("__line__", "Location.html", false),
    __PROGRAM__("__program__", "Location.html", false),
    M4EXIT("m4exit", "M4exit.html", false);

    private final String text;
    private final String docUrl;
    private final boolean obsolete;
    private final boolean optional;

    private M4BuiltinMacro(String text, String docUrl, boolean obsolete) {
        this.text = text;
        this.docUrl = docUrl;
        this.obsolete = obsolete;
        this.optional = false;
    }
    
    private M4BuiltinMacro(String text, String docUrl, boolean obsolete, boolean optional) {
        this.text = text;
        this.docUrl = docUrl;
        this.obsolete = obsolete;
        this.optional = optional;
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

    public boolean isOptional() {
        return this.optional;
    }
}
