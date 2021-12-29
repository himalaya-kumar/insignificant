package com.ai;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Absolute Maximum and Minimum
 */
public class Problem_39 {

    /**
     * T is Most Probably going to be math Types
     *
     */
    public static  Integer absoluteMaximum(List<Integer> list){
        Integer absMaxValue = list.get(0);
        for (int i = 1;i< list.size();++i) {
            if (Math.abs(list.get(i)) > Math.abs(absMaxValue)) {
                absMaxValue = list.get(i);
            }
        }
        return absMaxValue;
    }

    public static  Integer absoluteMaximumStream(List<Integer> list){
        return Math.abs(Problem_01.lastElement(list.stream().sorted().collect(Collectors.toList())));
    }
}