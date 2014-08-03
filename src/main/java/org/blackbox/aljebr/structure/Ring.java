package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.IdBinaryOperator;
import org.blackbox.aljebr.operator.InvertibleBinaryOperator;
import org.blackbox.aljebr.property.Associativity;
import org.blackbox.aljebr.property.Commutativity;
import org.blackbox.aljebr.property.Distributive;
import org.blackbox.aljebr.property.Operator;
import org.blackbox.aljebr.set.FormalSet;

/**
 * @author guillermo
 */
@Distributive(subject="product", object="addition")
public interface Ring
        <
                E,
                S extends FormalSet<E>,
                A extends InvertibleBinaryOperator<E>,
                P extends IdBinaryOperator<E>
        >
        extends Structure<E, S> {

    @Operator("addition")
    @Associativity
    @Commutativity
    A addition();

    @Operator("product")
    @Associativity
    P product();

}
