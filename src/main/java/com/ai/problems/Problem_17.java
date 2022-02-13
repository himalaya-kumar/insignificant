package com.ai.problems;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;
import static java.util.AbstractMap.SimpleEntry;
/**
 * Split List into two parts
 */
public class Problem_17 {

    /**
     * Extract list with number of elements
     * This is an simple operation but i have extracted some methods to dissect.
     * @param l
     * @param n
     * @param <T>
     * @return
     */
    static public <T>Map<Boolean, List<T>> split(List<T> l,int n){

        return IntStream.range(0,l.size())
                .mapToObj(getSimpleEntryIntFunction(l))
                .collect(getEntryMapCollector(n));
    }

    /**
     *
     * @param n
     * @param <T>
     * @return
     */
    private static <T> Collector<SimpleEntry<Integer, T>, ?, Map<Boolean, List<T>>> getEntryMapCollector(int n) {
        return partitioningBy(getSimpleEntryPredicate(n), mapping(SimpleEntry::getValue, toList()));
    }

    /**
     *
     * @param n
     * @param <T>
     * @return
     */
    private static <T> Predicate<SimpleEntry<Integer, T>> getSimpleEntryPredicate(int n) {
        return entry -> entry.getKey() < n;
    }

    /**
     *
     * @param l
     * @param <T>
     * @return
     */
    private static <T> IntFunction<SimpleEntry<Integer, T>> getSimpleEntryIntFunction(List<T> l) {
        return i -> new SimpleEntry<>(i, l.get(i));
        // Creating a simple entry with a number and value of that index

//        return new IntFunction<SimpleEntry<Integer, T>>() {
//            @Override
//            public SimpleEntry<Integer, T> apply(int value) {
//                return new SimpleEntry<Integer,T>(value,l.get(value));
//            }
//        };
    }
}