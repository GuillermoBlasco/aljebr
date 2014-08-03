package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.InvertibleBinaryOperator;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface Group
        <
                E,
                S extends FormalSet<E>,
                A extends InvertibleBinaryOperator<E>
        >
        extends Monoid<E, S, A> {


}
