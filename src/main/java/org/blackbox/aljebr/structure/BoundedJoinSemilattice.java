package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.IdBinaryOperator;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface BoundedJoinSemilattice
        <
                E extends PartiallyComparable<E>,
                S extends FormalSet<E>,
                J extends IdBinaryOperator<E>
        >
        extends JoinSemilattice<E, S, J> {
}
