package com.ai.problems;

/**
 * If GCD is CO prime number
 */
public class Problem_36 {
    /**
     * If GCD is Co Prime
     *
     * @param first integer
     * @param second integer
     * @return boolean
     */
    static public boolean coPrime(int first,int second){
        return Problem_35.gcd(first, second) == 1;
    }
}
