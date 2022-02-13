package com.ai.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * A List of Prime Numbers
 */
public class Problem_32 {

    /**
     * @param range Range of IntStream
     * @return List of Integer
     */
    public static List<Integer> primeNumbers(IntStream range) {
        return range.filter(Problem_29::isPrime).boxed().collect(Collectors.toList());
    }

    /**
     * Prime number
     *
     * @param start start point of prime number
     * @param end end point of prime number
     * @return List of Integer
     */
    public static List<Integer> primeNumber_sieve(final int start, final int end) {
        boolean[] primes = new boolean[end + 1];
        Arrays.fill(primes, true);

        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < primes.length; i++) {
            for (int j = i + 1; j < primes.length; j++) {
                //  primes[j] = primes[j] && j % i != 0;
                primes[j] = !primes[j] || j % i == 0 ? false : true;
            }}
            for (int k = start; k < primes.length; k++) {
                if (primes[k]) {
                    primeNumbers.add(k);
                }
            }

        return primeNumbers;
    }
}