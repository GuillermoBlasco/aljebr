package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.BinaryOperator;
import org.blackbox.aljebr.property.Closure;
import org.blackbox.aljebr.property.Operator;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
public interface Algebra
        <
                E,
                S extends FormalSet<E>,
                A extends BinaryOperator<E>
        >
        extends Structure<E, S> {

    @Operator("addition")
    @Closure
    A addition();

}
