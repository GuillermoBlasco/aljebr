package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.BinaryOperator;
import org.blackbox.aljebr.property.AbsorptionLaw;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
@AbsorptionLaw({"meet", "join"})
public interface Lattice
        <
                E extends PartiallyComparable<E>,
                S extends FormalSet<E>,
                M extends BinaryOperator<E>,
                J extends BinaryOperator<E>
        >
        extends JoinSemilattice<E, S, J>, MeetSemilattice<E, S, M> {

}
