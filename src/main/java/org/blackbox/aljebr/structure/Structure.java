package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.property.BaseSet;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface Structure
        <
                E,
                S extends FormalSet<E>
        > {

    @BaseSet
    S getElementSet();

}
