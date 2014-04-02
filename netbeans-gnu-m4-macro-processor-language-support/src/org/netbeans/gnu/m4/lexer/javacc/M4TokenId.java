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
package org.netbeans.gnu.m4.lexer.javacc;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author Enrico M. Crisostomo
 */
public final class M4TokenId implements TokenId {

    private static final Language<M4TokenId> language = new M4LanguageHierarchy().language();
    
    private final String name;
    private final String primaryCategory;
    private final int id;
    private boolean macroName = false;

    public M4TokenId(String name, String primaryCategory, int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }

    public M4TokenId(String name, String primaryCategory, int id, boolean macroName) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
        this.macroName = macroName;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int ordinal() {
        return id;
    }

    @Override
    public String primaryCategory() {
        return primaryCategory;
    }

    public boolean isMacroName() {
        return macroName;
    }
    
    public static Language<M4TokenId> getLanguage() {
        return language;
    }
}
