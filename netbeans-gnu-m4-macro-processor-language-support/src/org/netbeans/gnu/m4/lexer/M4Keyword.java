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

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Enrico M. Crisostomo
 */
public final class M4Keyword {

    private static final Set<String> builtins;

    static {
        builtins = new HashSet<>();

        builtins.add("define");
        builtins.add("undefine");
        builtins.add("defn");
        builtins.add("pushdef");
        builtins.add("popdef");
        builtins.add("indir");
        builtins.add("builtin");
        builtins.add("ifdef");
        builtins.add("ifelse");
        builtins.add("shift");
        builtins.add("dumpdef");
        builtins.add("traceon");
        builtins.add("traceoff");
        builtins.add("debugmode");
        builtins.add("debugfile");
        builtins.add("changequote");
        builtins.add("changecom");
        builtins.add("changeword");
        builtins.add("m4wrap");
        builtins.add("include");
        builtins.add("sinclude");
        builtins.add("divert");
        builtins.add("undivert");
        builtins.add("divnum");
        builtins.add("len");
        builtins.add("index");
        builtins.add("regexp");
        builtins.add("substr");
        builtins.add("translit");
        builtins.add("patsubst");
        builtins.add("format");
        builtins.add("incr");
        builtins.add("decr");
        builtins.add("eval");
        builtins.add("__gnu__");
        builtins.add("__os2__");
        builtins.add("os2");
        builtins.add("__unix__");
        builtins.add("__windows__");
        builtins.add("windows");
        builtins.add("syscmd");
        builtins.add("esyscmd");
        builtins.add("sysval");
        builtins.add("mkstemp");
        builtins.add("maketemp");
        builtins.add("errprint");
        builtins.add("__file__");
        builtins.add("__line__");
        builtins.add("__program__");
        builtins.add("m4exit");
    }

    private M4Keyword() {
    }

    public static boolean isBuiltin(String name) {
        if (name == null) {
            return false;
        }

        return builtins.contains(name);
    }
}
