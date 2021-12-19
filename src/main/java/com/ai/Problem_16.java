package com.ai;

import static java.util.AbstractMap.SimpleEntry;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Drop every element from a list
 */
public class Problem_16 {

    /**
     * @param list
     * @param n
     * @param <T>
     * @return List
     */
    static public <T> List<T> dropEveryNthElement(List<T> list, int n) {
        if (n == 0) return list;
        return IntStream.range(0, list.size())
                .mapToObj(i -> new SimpleEntry<>(list.get(i), i))
                //Filter record and verify the element is not null
                .filter(entry -> (entry.getValue() + 1) % n != 0)
                .map(SimpleEntry::getKey)
                .collect(Collectors.toList());
    }
}