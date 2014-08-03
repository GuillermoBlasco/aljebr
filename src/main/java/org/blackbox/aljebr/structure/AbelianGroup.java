package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.InvertibleBinaryOperator;
import org.blackbox.aljebr.property.Commutativity;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface AbelianGroup
        <
                E,
                S extends FormalSet<E>,
                A extends InvertibleBinaryOperator<E>
        >
        extends Group<E, S, A> {

    @Override
    @Commutativity
    A addition();

}
