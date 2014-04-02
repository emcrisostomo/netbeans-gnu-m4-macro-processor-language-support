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

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeListener;
import org.netbeans.api.lexer.Language;
import org.netbeans.gnu.m4.lexer.javacc.M4TokenId;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

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
        return new Parser() {

            private Snapshot snapshot;
            
            @Override
            public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException {
                this.snapshot = snapshot;
            }

            @Override
            public Result getResult(Task task) throws ParseException {
                return new M4ParserResult(this.snapshot);
            }

            @Override
            public void addChangeListener(ChangeListener changeListener) {
            }

            @Override
            public void removeChangeListener(ChangeListener changeListener) {
            }
        };
    }    

    @Override
    public String getDisplayName() {
        return "M4";
    }

    public static class M4ParserResult extends ParserResult {

        public M4ParserResult(Snapshot snapshot) {
            super(snapshot);
        }

        @Override
        protected void invalidate() {

        }

        @Override
        public List<? extends Error> getDiagnostics() {
            return new ArrayList<>();
        }
    }
}
