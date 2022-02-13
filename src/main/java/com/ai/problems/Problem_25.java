package com.ai.problems;

import java.util.List;

/**
 * General Permutation of random of the elements of the list
 */
public class Problem_25 {
    static public <T> List<T> randomPermutation(List<T> list) {
        return Problem_23.randomSelectR(list, list.size());
    }
}
