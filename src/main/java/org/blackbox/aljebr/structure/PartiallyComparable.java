package org.blackbox.aljebr.structure;

/**
 * @author guillermo
 */
public interface PartiallyComparable<E extends PartiallyComparable<E>> {

    public enum Value {EQUAL, GREATER, LESSER, NOT_COMPARABLE}

    Value compareTo(E e);

}
