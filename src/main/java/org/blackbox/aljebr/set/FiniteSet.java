package org.blackbox.aljebr.set;

import java.util.Set;

/**
 * @author guillermo
 */
public interface FiniteSet<E> extends NumerableSet<E> {

    Set<E> asModifiableSet();

}
