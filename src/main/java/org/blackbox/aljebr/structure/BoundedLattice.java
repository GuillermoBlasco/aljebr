package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.IdBinaryOperator;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface BoundedLattice
        <
                E extends PartiallyComparable<E>,
                S extends FormalSet<E>,
                M extends IdBinaryOperator<E>,
                J extends IdBinaryOperator<E>
        >
        extends Lattice<E, S, M, J>, BoundedJoinSemilattice<E, S, J>, BoundedMeetSemilattice<E, S, M> {

}
