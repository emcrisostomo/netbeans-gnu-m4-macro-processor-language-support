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
package org.netbeans.gnu.m4;

import org.netbeans.api.lexer.Language;
import org.netbeans.gnu.m4.lexer.antlr.M4TokenId;
import org.netbeans.gnu.m4.parser.M4Parser;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.modules.parsing.spi.Parser;

/**
 *
 * @author Enrico M. Crisostomo
 */
@LanguageRegistration(mimeType = "text/x-m4")
public class M4Language extends DefaultLanguageConfig {

    @Override
    public Language<M4TokenId> getLexerLanguage() {
        return M4TokenId.getLanguage();
    }

    @Override
    public Parser getParser() {
        return new M4Parser();
    }    

    @Override
    public String getDisplayName() {
        return "M4";
    }
}
