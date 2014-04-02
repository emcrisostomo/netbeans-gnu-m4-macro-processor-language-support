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
package org.netbeans.gnu.m4.parser;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ChangeListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.netbeans.gnu.m4.antlr.v1.m4Lexer;
import org.netbeans.gnu.m4.antlr.v1.m4Parser;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author Enrico M. Crisostomo
 */
public class M4Parser extends Parser {

    private Snapshot snapshot;
    private m4Parser parser;
    private m4Parser.CompilationUnitContext compilationUnit;

    public M4Parser() {
    }

    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException {
        this.snapshot = snapshot;

        ANTLRInputStream is = new ANTLRInputStream(snapshot.getText().toString());
        m4Lexer lexer = new m4Lexer(is);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        parser = new m4Parser(tokenStream);
        compilationUnit = parser.compilationUnit();
    }

    @Override
    public Result getResult(Task task) throws ParseException {
        return new M4ParserResult(snapshot, parser, compilationUnit);
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener) {
    }

    public static class M4ParserResult extends ParserResult {
        private final m4Parser.CompilationUnitContext compilationUnit;
        private final m4Parser parser;

        private M4ParserResult(Snapshot snapshot, m4Parser parser, m4Parser.CompilationUnitContext compilationUnit) {
            super(snapshot);
            this.parser = parser;
            this.compilationUnit = compilationUnit;
        }

        @Override
        protected void invalidate() {

        }

        @Override
        public List<? extends Error> getDiagnostics() {
            return new ArrayList<>();
        }
        
        public m4Parser.CompilationUnitContext getCompilationUnit()
        {
            return compilationUnit;
        }
        
        public m4Parser getParser()
        {
            return parser;
        }
    }
}
