package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.BinaryOperator;
import org.blackbox.aljebr.property.Associativity;
import org.blackbox.aljebr.property.Commutativity;
import org.blackbox.aljebr.property.Idempotent;
import org.blackbox.aljebr.property.Operator;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface JoinSemilattice
        <
                E extends PartiallyComparable<E>,
                S extends FormalSet<E>,
                J extends BinaryOperator<E>
        >
        extends Structure<E, S> {

    @Operator("join")
    @Commutativity
    @Associativity
    @Idempotent
    J join();
}
