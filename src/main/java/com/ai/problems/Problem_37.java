package com.ai.problems;

import java.util.stream.IntStream;

/**
 * Calculate Phi Function numbers less than itself share factor with number
 * phi(8) = 4 {size of [1,3,5,7] and 6 (6 = 2* 3) does not include in the list}
 * phi(7 a prime number) = 6 all the number from 1 to 7 are not factors
 */
public class Problem_37 {

    static public long phi(int m) {
        return IntStream.rangeClosed(1,m).filter(r -> Problem_36.coPrime(r,m)).count();
    }
}
