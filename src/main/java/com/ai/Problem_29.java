package com.ai;

import java.util.stream.LongStream;

/**
 * Prime Number check
 */
public class Problem_29 {

    /**
     * To check if a number is prime Wilson's Theorem
     *
     * @param n number needs to be checked
     * @return boolean
     */
    public static boolean isPrime(final int n) {
        final int one = 1;
        final int firstPrime = 2;
        final int secondPrime = 3;
        final int thirdPrime = 5;
        final int gap = 6;

        if (n <= secondPrime) {
            return n > one;
        } else if (n % firstPrime == 0 || n % secondPrime == 0) {
            return false;
        }
        int i = thirdPrime;

        while (i * i <= n) {
            if (n % i == 0 || n % (i + firstPrime) == 0) {
                return false;
            }
            i = i + gap;
        }
        return true;
    }

    public static boolean isPrime(long number) {
        return LongStream.rangeClosed(2,Math.round(Math.sqrt(number))).noneMatch(n -> number % n == 0);
    }
}