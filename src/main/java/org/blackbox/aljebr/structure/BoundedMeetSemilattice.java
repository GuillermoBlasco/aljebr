package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.IdBinaryOperator;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface BoundedMeetSemilattice
        <
                E extends PartiallyComparable<E>,
                S extends FormalSet<E>,
                M extends IdBinaryOperator<E>
        >
        extends MeetSemilattice<E, S, M> {
}
