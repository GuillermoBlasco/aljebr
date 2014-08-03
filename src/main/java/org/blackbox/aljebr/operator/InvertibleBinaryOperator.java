package org.blackbox.aljebr.operator;

/**
 * @author guillermo
 */
public interface InvertibleBinaryOperator<E> extends IdBinaryOperator<E> {

    E inverse(E e);

}
