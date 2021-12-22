package com.ai;

import java.util.List;

/**
 * Random Number from 1 to n
 */
public class Problem_24 {

    static public List<Integer> drawRandomNumber(int n,int start,int end) {
        return Problem_23.randomSelect(Problem_22.range(start, end),n);
    }
}
