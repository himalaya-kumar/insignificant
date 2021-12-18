package com.ai;

import java.util.AbstractMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <b>Run length encoding of a list</b>
 */
public class Problem_10 {

    /**
     * Length encoding of a list
     * @param <T>
     * @return
     */
    public static <T>List<AbstractMap.SimpleEntry<Integer,T>> encode(List<T> list){
        return Problem_09.pack(list).stream().map(l -> new AbstractMap.SimpleEntry<>(l.size(),l.get(0))).collect(Collectors.toList());
    }
}