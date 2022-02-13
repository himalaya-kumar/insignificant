package com.ai.problems;

import java.util.List;
import java.util.Map;

/**
 * Rotate the List to the left
 */
public class Problem_19 {

    /**
     * To Rotate left we need to split and then add it to the part
     * of the right.
     * @param list
     * @param n
     * @param {{@code}<T>}
     * @return
     */
    public static <T> List<T> rotate(List<T> list,int n) {
        n = n < 0 ? list.size() + n : n;
        Map<Boolean,List<T>> split = Problem_17.split(list,n);
        List<T> result = split.get(false);
        result.addAll(split.get(true));
        return result;
    }
}