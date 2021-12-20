package com.ai;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Extract a given number of randomly selected elements from a list
 */
public class Problem_23_Tests {

    /**
     * Random Select element from a list
     * @param list
     * @param n
     * @return List<T>
     */
    public static <T> List<T> randomSelect(List<T> list,int n) {
        return new Random().ints(n,0,list.size()).mapToObj(list::get).collect(Collectors.toList());
    }
}