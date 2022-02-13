package com.ai.problems;

import java.util.List;
import java.util.Map;

/**
 * Insert an element at a given position into a list
 */
public class Problem_21 {

    /**
     *
     * @param list
     * @param pos
     * @param t
     * @param <T>
     * @return
     */
    public static <T>List<T> insertAt(List<T> list,int pos,T t){
        if (pos < 1) {
            throw new IllegalArgumentException("pos can't be less than 1");
        }
        list.add((pos - 1), t);
        return list;
    }


    public static <T> List<T> insertAt_split(List<T> list,int pos,T t){
        if (pos < 1) {
            throw new IllegalArgumentException("pos can't be less than 1");
        }
        Map<Boolean,List<T>> split = Problem_17.split(list,pos);
        List<T> first = split.get(true);
        List<T> second = split.get(false);
        first.add(pos -1,t);
        first.addAll(second);
        return first;
    }

}