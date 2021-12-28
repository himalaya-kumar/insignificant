package com.ai;

import static  java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * A List of Goldbach Compositions
 *
 */
public class Problem_34 {

    static public List<SimpleEntry<Integer,List<Integer>>> goldbach_Composition(IntStream rangeIntStream) {

        return rangeIntStream.filter(n -> n % 2 == 0).filter(even -> even > 2).mapToObj(even -> new SimpleEntry<>(even,Problem_33.goldBach(even)))
                .collect(Collectors.toList());
    }

    public static List<SimpleEntry<Integer,List<Integer>>> goldbach_list1(IntStream intStream,int greaterThan) {
        return goldbach_Composition(intStream).stream().filter(g -> g.getValue().get(0) > greaterThan && g.getValue().get(1) > greaterThan)
                .collect(Collectors.toList());
    }
}