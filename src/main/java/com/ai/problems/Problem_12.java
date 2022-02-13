package com.ai.problems;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <b>Decode a run-length encoded list</b>
 */
public class Problem_12 {

    /**
     *
     * @param <T>
     * @param encoded
     * @return List<T>
     */
    public static <T> List<T> decode(List<Object> encoded) {
        return encoded.stream().flatMap(e -> {
           if (e instanceof AbstractMap.SimpleEntry) {
               AbstractMap.SimpleEntry<Integer,T> entry = (AbstractMap.SimpleEntry<Integer, T>) e;
               return Collections.nCopies(entry.getKey(),entry.getValue()).stream();
           }
           return Stream.of((T) e);
        }).collect(Collectors.toList());
    }
}