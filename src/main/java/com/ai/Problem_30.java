package com.ai;

import java.util.ArrayList;
import java.util.List;

/**
 * Determine the prime factors of a given positive integer
 */
public class Problem_30 {

    /**
     * Prime factors of a given number
     *
     * @return List of Integer
     *
     **/
    public static List<Integer> primeFactors(final int input) {
        final var firstPrime = 2;
        List<Integer> res = new ArrayList<>();

        for (int currentPrime = firstPrime;currentPrime <= (input / firstPrime);currentPrime++) {
            if (Problem_29.isPrime(currentPrime)){
                int val = input;
                while (val % currentPrime == 0) {
                    res.add(currentPrime);
                    val = val / currentPrime;
                }
            }
        }
        return res;
    }
}