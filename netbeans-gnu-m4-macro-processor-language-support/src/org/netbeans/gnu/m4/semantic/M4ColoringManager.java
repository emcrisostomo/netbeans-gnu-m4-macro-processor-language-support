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
package org.netbeans.gnu.m4.semantic;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.AttributeSet;
import org.netbeans.api.editor.mimelookup.MimeLookup;
import org.netbeans.api.editor.mimelookup.MimePath;
import org.netbeans.api.editor.settings.AttributesUtilities;
import org.netbeans.api.editor.settings.FontColorSettings;
import static org.netbeans.gnu.m4.semantic.M4ColoringAttributes.*;
import org.netbeans.gnu.m4.semantic.M4ColoringAttributes.Coloring;

/**
 *
 * @author Enrico M. Crisostomo
 */
public final class M4ColoringManager {

    private static final Logger logger = Logger.getLogger(M4ColoringManager.class.getName());
    private static final Map<Set<M4ColoringAttributes>, String> type2Coloring;

    static {
        type2Coloring = new LinkedHashMap<>();

        put("m4-builtin-macro", M4_BUILTIN);
        put("m4-macro-invocation", INVOCATION);
    }

    private static void put(String coloring, M4ColoringAttributes... attributes) {
        Set<M4ColoringAttributes> attribs = EnumSet.copyOf(Arrays.asList(attributes));

        type2Coloring.put(attribs, coloring);
    }

    public static AttributeSet getColoringImpl(Coloring colorings) {
        FontColorSettings fcs = MimeLookup.getLookup(MimePath.get("text/x-m4")).lookup(FontColorSettings.class);

        if (fcs == null) {
            //in tests:
            return AttributesUtilities.createImmutable();
        }

        assert fcs != null;

        List<AttributeSet> attribs = new LinkedList<>();

        EnumSet<M4ColoringAttributes> es = EnumSet.noneOf(M4ColoringAttributes.class);

        es.addAll(colorings);

        for (Map.Entry<Set<M4ColoringAttributes>, String> attribs2Colorings : type2Coloring.entrySet()) {
            if (es.containsAll(attribs2Colorings.getKey())) {
                String key = attribs2Colorings.getValue();
                
                logger.log(Level.FINE, "Matching coloring key: {0}", key);
                
                es.removeAll(attribs2Colorings.getKey());

                if (key != null) {
                    AttributeSet colors = fcs.getTokenFontColors(key);

                    if (colors == null) {
                        logger.log(Level.SEVERE, "no colors for: {0}", key);
                        continue;
                    }

                    attribs.add(adjustAttributes(colors));
                }
            }
        }

        Collections.reverse(attribs);

        AttributeSet result = AttributesUtilities.createComposite(attribs.toArray(new AttributeSet[0]));

        return result;
    }

    private static AttributeSet adjustAttributes(AttributeSet as) {
        Collection<Object> attrs = new LinkedList<>();

        for (Enumeration<?> e = as.getAttributeNames(); e.hasMoreElements();) {
            Object key = e.nextElement();
            Object value = as.getAttribute(key);

            if (value != Boolean.FALSE) {
                attrs.add(key);
                attrs.add(value);
            }
        }

        return AttributesUtilities.createImmutable(attrs.toArray());
    }
}
