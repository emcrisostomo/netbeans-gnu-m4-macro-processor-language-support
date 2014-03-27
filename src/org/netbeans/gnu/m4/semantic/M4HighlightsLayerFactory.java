/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.gnu.m4.semantic;

import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.highlighting.HighlightsLayer;
import org.netbeans.spi.editor.highlighting.HighlightsLayerFactory;
import org.netbeans.spi.editor.highlighting.ZOrder;

/**
 *
 * @author Enrico M. Crisostomo
 */
@MimeRegistration(mimeType = "text/x-m4", service = HighlightsLayerFactory.class)
public class M4HighlightsLayerFactory implements HighlightsLayerFactory {

    @Override
    public HighlightsLayer[] createLayers(Context context) {
        System.out.println("Creating layers...");
        
        M4LexerBasedHighlightLayer semantic = M4LexerBasedHighlightLayer.getLayer(M4SemanticHighlighter.class, context.getDocument());

        semantic.clearColoringCache();

        return new HighlightsLayer[]{
            HighlightsLayer.create(M4SemanticHighlighter.class.getName() + "-1", ZOrder.SYNTAX_RACK.forPosition(1000), false, semantic)
        };
    }

}
