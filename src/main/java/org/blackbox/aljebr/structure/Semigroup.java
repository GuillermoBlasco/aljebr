package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.BinaryOperator;
import org.blackbox.aljebr.property.Associativity;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface Semigroup
        <
                E,
                S extends FormalSet<E>,
                A extends BinaryOperator<E>
        >
        extends Algebra<E, S, A> {

    @Override
    @Associativity
    A addition();

}
