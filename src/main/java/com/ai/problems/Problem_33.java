package com.ai.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * GoldBach's Conjuncture
 * Every positive even number greater than 2 is the sum of two prime numbers.
 */
public class Problem_33 {


    public static List<Integer> goldBach(int number) {
        if (number == 2 || number % 2 != 0) { //number == 2 || number % 2 == 0
            return Collections.emptyList();
        }
        List<Integer> primeNumbers = Problem_32.primeNumbers(IntStream.rangeClosed(2,number));
        for (Integer primeNumber : primeNumbers) {
            if (primeNumbers.contains(number - primeNumber)) {
                return Arrays.asList(primeNumber,number - primeNumber);
            }
        }
        throw new RuntimeException("Problem_33#goldBach(),Exception Occurred");
    }
}