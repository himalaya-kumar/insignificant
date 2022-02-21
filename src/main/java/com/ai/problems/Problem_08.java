package com.ai.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <b>Eliminate Consecutive Duplicate of list elements</b>
 */
public class Problem_08 {

    /**
     * This is for consecutive i.e. for only near
     * not equal after while
     *
     * @param list list of values
     * @param <T> Type parameter
     * @return {@code List}
     */
    public static <T> List<T> compress(List<T> list) {
       //Defensive Coding
        Objects.requireNonNull(list,"Please make sure object is not null");
        List<T> result = new ArrayList<>();
        T lastElement = null;
        for (T e:list) {
            if (!Objects.equals(lastElement,e)){
                result.add(e);
            }
            lastElement = e;
        }
        return result;
    }
}
