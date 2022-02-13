package com.ai.problems;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * Sorting a list of lists according to length of sublist
 *
 */
public class Problem_28 {

    /**
     *
     * @param list
     * @param <T>
     * @return
     */
    public static <T>List<List<T>> lsort(List<List<T>> list){
        list.sort((xs1,xs2) -> xs1.size() - xs2.size());
        return list;
    }

    public static List<List<String>> lfsort(List<List<String>> list){
        Map<Integer,Integer> frequency = new HashMap<>();
        list.stream().map(List::size).forEach(l -> frequency.put(l,frequency.compute(l,(k,v) -> v == null ? 1:v+1)));
        return list.stream()
                .sorted((xs1,xs2) -> frequency.get(xs1.size()) - frequency.get(xs2.size()))
                .collect(toList());
    }

    public static List<List<String>> lfsort1(List<List<String>> list) {
        return lsort(
                new ArrayList<>(lsort(list)
                        .stream()
                        .collect(groupingBy(List::size))
                        .values()))
                .stream()
                .flatMap(Collection::stream)
                .collect(toList());
    }

}