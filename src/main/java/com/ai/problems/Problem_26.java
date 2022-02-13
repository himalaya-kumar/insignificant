package com.ai.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Generate the combination of K distinct
 * object chosen from the N element of a list
 * <p>
 * IDEA: Create a library called Operations where display names
 * on classes and method and log the operations
 */
public class Problem_26 {

    /**
     * combination of K distinct object
     *
     * @param <T>
     * @return
     */
    public static <T> List<List<T>> combinations(List<T> list, int k) {
        if (k == 0 || list.isEmpty()) return Collections.emptyList();
        if (k == 1)
            return list.stream().map(e -> Stream.of(e).collect(toList())).collect(toList());
        Map<Boolean, List<T>> headAndTail = Problem_17.split(list, 1);
        List<T> head = headAndTail.get(true);
        List<T> tail = headAndTail.get(false);
        List<List<T>> c1 = combinations(tail, (k - 1)).stream().map(e -> {
            List<T> list1 = new ArrayList<>();
            list1.addAll(head);
            list1.addAll(e);
            return list1;
        }).collect(Collectors.toList());
        List<List<T>> c2 = combinations(tail, k);
        c1.addAll(c2);
        return c1;
    }
}