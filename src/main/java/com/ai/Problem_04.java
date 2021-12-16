package com.ai;

import java.util.List;

/**
 * Find the number of elements from list
 */
public class Problem_04 {

    /**
     * Length
     * @param list
     * @param <T>
     * @return T
     */
    public static <T> int length(List<T> list){
        return list.size();
    }

    /**
     * Length of Stream
     * @param list
     * @param <T>
     * @return T
     */
    public static <T> long lengthStream(List<T> list){
        return list.stream().count();
    }

    /**
     * length Stream 01
     * stream.mapToInt(x -> 1).sum();
     * @param <T>
     * @return T
     */
    public static <T> long lengthStream_01(List<T> list){
        return list.stream().mapToInt(x -> 1).sum();
    }

    /**
     * Length recursive
     *
     * @param list
     * @param <T>
     * @return T
     */
    public static <T> int lengthRecursive(List<T> list) {
        return _lengthRecursive(list,0);
    }

    private static <T> int _lengthRecursive(List<T> list,int i) {
        if (list.isEmpty()) {
            return i;
        }
        return _lengthRecursive(list.subList(1,list.size()), ++i);
    }
}
