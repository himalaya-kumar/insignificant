package com.ai.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Remove the element from kth Element
 */
public class Problem_20 {

    /**
     * Remove the element according to index
     *
     * @param list
     * @param k
     * @param <T>
     * @return
     */
    static public <T> Object[] removeAt(List<T> list, int k) {
        List<T> input = new ArrayList<>(list);
        T kth = input.remove(k - 1);
        return new Object[]{input, kth};
    }

    /**
     * Remove the element according to natural number
     *
     * @param list
     * @param k
     * @param <T>
     * @return Object[]
     */
    static public <T> Object[] removeAt0(List<T> list, int k) {
        List<T> input = new ArrayList<>(list);
        T kth = input.remove(k);
        return new Object[]{input, kth};
    }

    /**
     * Remove the value by splitting it
     * @param list
     * @param k
     * @param <T>
     * @return Object[]
     */
    static public <T> Object[] removeAt_splitAt(List<T> list, int k) {
        Map<Boolean, List<T>> split = Problem_17.split(list, k);
        List<T> first = split.get(true);
        List<T> second = split.get(false);
        T kth = first.remove(k - 1);
        first.addAll(second);
        return new Object[]{first, kth};
    }
}
