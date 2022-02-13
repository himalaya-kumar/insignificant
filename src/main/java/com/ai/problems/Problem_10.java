package com.ai.problems;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <b>Run length encoding of a list</b>
 */
public class Problem_10 {

    /**
     * Length encoding of a list
     *
     * @param <T> Type Parameter
     * @return encoded list of SimpleEntry<Integer,T>
     */
    public static <T> List<AbstractMap.SimpleEntry<Integer, T>> encode(List<T> list) {

        return Problem_09.pack(list).stream().map(list1 -> new AbstractMap.SimpleEntry<>(list1.size(), list1.get(0))).collect(Collectors.toList());
    }
}