package org.blackbox.aljebr.structure;

import org.blackbox.aljebr.operator.IntegerAddition;
import org.blackbox.aljebr.set.Integers;

/**
 * @author guillermo
 */
public class IntegerGroup implements AbelianGroup<Integer, Integers, IntegerAddition> {

    public static final IntegerGroup GROUP = new IntegerGroup();

    private IntegerGroup() {

    }

    @Override
    public IntegerAddition addition() {
        return IntegerAddition.OPERATOR;
    }

    @Override
    public Integers getElementSet() {
        return Integers.SET;
    }
}
