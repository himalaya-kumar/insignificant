package com.ai;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Create a list containing all integers within a given range
 */
public class Problem_22 {

    /**
     * Range Integer
     *
     * @param start
     * @param end
     * @return List<Integer>
     */
    public static List<Integer> range(int start,int end){
        return IntStream.rangeClosed(start, end).boxed().collect(Collectors.toList());
    }
}
