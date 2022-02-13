package com.ai.problems;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Extract a given number of randomly selected elements from a list
 */
public class Problem_23 {

    /**
     * @param list
     * @param n
     * @param <T>
     * @return
     */
    static public <T> List<T> randomSelect(List<T> list, int sizeOfTheOutputList) {
        return new Random().ints(sizeOfTheOutputList, 0, list.size()).mapToObj(list::get).collect(Collectors.toList());
    }

    /**
     * @param list
     * @param sizeOfTheOutputList
     * @param <T>
     * @return
     */
    static public <T> List<T> randomSelectR(List<T> list, int sizeOfTheOutputList) {
        if (sizeOfTheOutputList == 0) return Collections.emptyList();
        Object[] objects = Problem_20.removeAt0(list, new Random().nextInt(list.size()));
        List<T> remaining = (List<T>) objects[0];
        T t = (T) objects[1];
        List<T> result = new ArrayList<>();
        result.add(t);
        result.addAll(randomSelectR(remaining, sizeOfTheOutputList - 1));
        return result;
    }

    /**
     * @param list
     * @param n
     * @param <T>
     * @return
     */
    public static <T> List<T> randomSelect_imperative(List<T> list, int n) {
        List<T> result = new ArrayList<>();
        Random random = new Random();
        List<T> remaining = list;
        while (result.size() < n) {
            Object[] objects = Problem_20.removeAt0(remaining, random.nextInt(remaining.size()));
            remaining = (List<T>) objects[0];
            T t = (T) objects[1];
            result.add(t);
        }
        return result;
    }
}