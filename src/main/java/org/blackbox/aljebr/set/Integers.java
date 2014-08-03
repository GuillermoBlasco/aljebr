package org.blackbox.aljebr.set;

import java.util.Iterator;

/**
 * @author guillermo
 */
public class Integers implements NumerableSet<Integer> {

    public static final Integers SET = new Integers();

    private Integers() {

    }

    @Override
    public boolean contains(Integer integer) {
        return integer != null;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntegerIterator();
    }

    private class IntegerIterator implements Iterator<Integer> {

        private int n = 0;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return n++;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("org.blackbox.aljebr.set.Integers.IntegerIterator.remove");
        }
    }
}
