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
public final class M4Character {

    private final char character;
    private static final Set<Character> separators;

    static {
        separators = new HashSet<>();

        separators.add('[');
        separators.add(']');
        separators.add('{');
        separators.add('}');
        separators.add('(');
        separators.add(')');
        separators.add(',');
        separators.add(';');
    }

    public M4Character(char character) {
        this.character = character;
    }

    public boolean isSeparator() {
        for (Character sep : separators) {
            if (sep.equals(this.character)) {
                return true;
            }
        }

        return false;
    }
    
    public static boolean isSeparator(char c)
    {
        for (Character sep : separators) {
            if (sep.equals(c)) {
                return true;
            }
        }

        return false;
    }
}
