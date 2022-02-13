package com.ai.problems;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Modified Problem 11
 *
 */
public class Problem_11 {

    /**
     * Modified Encoding
     *
     * @param <T>
     * @return
     */
    public static <T>List<Object> encode_Modified(List<T> list){
        return Problem_09.pack(list).stream().map( l -> {
           if (l.size() == 1) {
               return l.get(0);
           }
           return new AbstractMap.SimpleEntry<>(l.size(),l.get(0));
        }).collect(Collectors.toList());
    }
}