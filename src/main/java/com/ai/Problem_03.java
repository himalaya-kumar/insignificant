package com.ai;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find Kth element from the list
 */
public class Problem_03 {
    /**
     * Get Kth element from the list
     *
     * @param list
     * @param k
     * @param <T>
     * @return T
     */
    public static <T> T kth(final List<T> list, final int k) {
        return list.get(k);
    }

    /**
     * Using the recursive way
     *
     * @param linkedList
     * @param k
     * @param <T>
     * @return T
     */
    public static <T> T kthRecursive(final LinkedList<T> linkedList, final int k) {
        if (k == 0) {
            return linkedList.getFirst();
        }
        return kthRecursive(new LinkedList<>(linkedList.subList(1, linkedList.size())), k - 1);
    }

    /**
     * Get The kth element from the list
     * k+1 set the stream to the limit
     *
     * @param <T>
     * @return T
     */
    public static <T> T kthStream(final List<T> list, final int k) {
        return list.stream().limit(k+1).collect(Collectors.toCollection(LinkedList::new)).getLast();
    }
}
