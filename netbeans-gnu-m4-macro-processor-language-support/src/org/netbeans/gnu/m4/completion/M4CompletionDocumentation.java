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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.Action;
import org.netbeans.spi.editor.completion.CompletionDocumentation;
import org.openide.util.Exceptions;

/**
 *
 * @author Enrico M. Crisostomo
 */
class M4CompletionDocumentation implements CompletionDocumentation {

    private final M4CompletionItem item;
    private final String DOC_PACKAGE = "documentation";

    public M4CompletionDocumentation(M4CompletionItem item) {
        this.item = item;
    }

    @Override
    public String getText() {
        try {
            return readDocument();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
            return "An error occurred.";
        }
    }

    @Override
    public URL getURL() {
        return null;
    }

    @Override
    public CompletionDocumentation resolveLink(String string) {
        return null;
    }

    @Override
    public Action getGotoSourceAction() {
        return null;
    }

    private String readDocument() throws IOException {
        String resourceName = DOC_PACKAGE + "/" + item.getMacro().getDocUrl();
        InputStream is = this.getClass().getResourceAsStream(resourceName);

        if (is == null) {
            return "Documentation is missing.";
        }

        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        StringBuilder doc = new StringBuilder(1024);
        String currentLine = br.readLine();

        while (currentLine != null) {
            doc.append(currentLine);
            currentLine = br.readLine();
        }

        return doc.toString();
    }
}
