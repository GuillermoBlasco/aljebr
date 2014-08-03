package org.blackbox.aljebr.operator;

/**
 *
 * @author guillermo
 */
public interface BinaryOperator<E> {

    E apply(E e1, E e2);

}
