package com.ai;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <b>Duplicates The elements of List</b>
 *<pre>
 *     duplicate(Arrays.asList("a","b","c","d"))
 *</pre>
 */
public class Problem_14 {

    /**
     * Duplicates using the stream
     * @param list
     * @param <T>
     * @return Duplicates using stream
     */
    static public <T> List<T> duplicateList(List<T> list){
        return list.stream().flatMap(e -> Stream.of(e,e)).collect(Collectors.toList());
    }
}