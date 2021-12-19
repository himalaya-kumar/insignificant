package com.ai;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

/**
 * Split List into two parts
 */
public class Problem_17 {

    /**
     * Extract list with number of elements
     * @param l
     * @param n
     * @param <T>
     * @return
     */
    static public <T>Map<Boolean, List<T>> split(List<T> l,int n){
        return IntStream.range(0,l.size()).mapToObj(i -> new AbstractMap.SimpleEntry<>(i,l.get(i)))
                .collect(partitioningBy(entry -> entry.getKey() < n,mapping(AbstractMap.SimpleEntry::getValue,toList())));
    }
}