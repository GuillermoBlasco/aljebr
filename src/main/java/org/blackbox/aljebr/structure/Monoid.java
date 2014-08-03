package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.IdBinaryOperator;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface Monoid
        <
                E,
                S extends FormalSet<E>,
                A extends IdBinaryOperator<E>
        >
        extends Semigroup<E, S, A> {


}
