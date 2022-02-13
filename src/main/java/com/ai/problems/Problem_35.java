package com.ai.problems;

/**
 * GCD of Numbers
 * Greatest common divisor of two numbers
 */
public class Problem_35 {

    /**
     * GCD of Two Positive Numbers
     * @return int gcd
     */
    static public int gcd(int first,int second) {

        if (first == 0) {
            return second;
        } else if (second == 0) {
            return first;
        } else if(first > second) {
            return gcd(first-second,second);
        } else {
            return gcd(first,second - first);
        }
    }

    /**
     *Conditional
     *
     * @return int gcd
     */
    static public int gcdC(int first,int second) {
    // Condition ? true : false;
    // first == 0 ? second : (second == 0 ? first : (first > second) ? gcd(first-second,second):gcd(first,second - first))
        return first == 0 ? second : (second == 0 ? first :(first > second ? gcdC(first - second,second): gcdC(first,second-first)));
    }


}