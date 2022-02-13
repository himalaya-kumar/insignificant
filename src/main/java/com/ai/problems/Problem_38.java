package com.ai.problems;

/**
 * Other way to calculate phi function
 *
 */
public class Problem_38 {

    /**
     * Other way to calculate phi function
     * @param m integer
     * @return integer
     */
    public static int phi(int m) {
        return Problem_31.primeFactorMultiple(m)
                .stream()
                .map(entry -> (entry.getKey() -1) * Math.pow(entry.getKey(),entry.getValue() -1))
                .mapToInt(Double::intValue)
                .reduce(1,(i1,i2) -> i1 * i2);
    }
}
