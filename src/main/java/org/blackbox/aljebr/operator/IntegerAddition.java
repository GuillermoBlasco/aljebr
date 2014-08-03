package org.blackbox.aljebr.operator;

import com.google.common.base.Preconditions;

/**
 * @author guillermo
 */
public class IntegerAddition implements InvertibleBinaryOperator<Integer> {

    public static final IntegerAddition OPERATOR = new IntegerAddition();

    private IntegerAddition() {

    }

    @Override
    public Integer inverse(Integer integer) {
        Preconditions.checkNotNull(integer);
        return - integer;
    }

    @Override
    public Integer id() {
        return 0;
    }

    @Override
    public Integer apply(Integer e1, Integer e2) {
        Preconditions.checkNotNull(e1);
        Preconditions.checkNotNull(e2);
        return e1 + e2;
    }
}
