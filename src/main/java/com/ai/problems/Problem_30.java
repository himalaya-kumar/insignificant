package com.ai.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

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
        final int firstPrime = 2;
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

    /**
     * Prime factors of given positive integer
     *
     * @param input number
     * @return List<Integer>
     */
    public static List<Integer> primeFactorStream(final int input) {
        List<Integer> fs = new ArrayList<>();
        IntStream.rangeClosed(2,input/2).filter(Problem_29::isPrime)
                //.peek(System.out::println)
                .forEach(f -> {
            int n = input;
            while (n % f == 0) {
                n = n / f;
                fs.add(f);
            }
        });
        return fs;
    }
}