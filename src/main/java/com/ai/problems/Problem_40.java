package com.ai.problems;

import java.util.List;
import java.util.stream.IntStream;

/**
 * In Number theory, The Aliquot sum of S(n) positive integer n is the sum of all proper divisor
 * of n,i.e. all divisor of n other than n itself.
 * for example 15 divisor are 1,3,5
 * than aliquot sum is 1 + 3 + 5
 */
public class Problem_40 {

    public static Integer aliquotSum(int number){
        return IntStream.rangeClosed(1,number/2).filter(i -> number % i == 0).sum();
    }
}