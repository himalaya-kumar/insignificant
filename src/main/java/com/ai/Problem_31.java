package com.ai;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Prime Factors of a given integer
 */
public class Problem_31 {

    /**
     * Multiple factors in Simple Entry map
     *
     * @param number multiple factors of number
     * @return List<SimpleEntry>
     */
    public static List<SimpleEntry<Integer, Integer>> primeFactorMultiple(int number) {
        return Problem_10.encode(Problem_30.primeFactorStream(number)).stream()
                .map(e -> new SimpleEntry<>(e.getValue(),e.getKey()))
                .collect(Collectors.toList());
    }
}