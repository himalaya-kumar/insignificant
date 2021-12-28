package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Objects;

/**
 * Find the number of elements from list
 */
public class Problem_04 {

    static public Logger LOGGER = LoggerFactory.getLogger(Problem_04.class);

    /**
     * Length of the list
     *
     * @param list List of Elements
     * @param <T> Type Parameter
     * @return Type Parameter T
     */
    public static <T> int length(List<T> list){

        LOGGER.info("Problem_04#length(list)");
        Objects.requireNonNull(list,"List can not be null");
        LOGGER.info("Problem_04#length({})",list);

        return list.size();
    }

    /**
     * Length list using Stream
     *
     * @param list List of elements
     * @param <T> Type Parameter
     * @return Type Parameter T
     */
    public static <T> long lengthStream(List<T> list){
        LOGGER.info("Problem_04#lengthStream(list)");
        Objects.requireNonNull(list,"List can not be null");
        LOGGER.info("Problem_04#lengthStream({})",list);

        return list.stream().mapToInt(x -> 1).count();
    }

    /**
     * length Stream 01
     * stream.mapToInt(x -> 1).sum();
     *
     * @param list List of elements
     * @param <T> Type Parameter
     * @return Type Parameter T
     */
    public static <T> long lengthStream_01(List<T> list){

        LOGGER.info("Problem_04#lengthStream_01(list)");
        Objects.requireNonNull(list,"List can not be null");
        LOGGER.info("Problem_04#lengthStream_01({})",list);

        return list.stream().mapToInt(x -> 1).peek(e -> LOGGER.info("{}",e)).sum();
    }

    /**
     * Length recursive
     *
     * @param list List of elements
     * @param <T> Type Parameter
     * @return Type Parameter T
     */
    public static <T> int lengthRecursive(List<T> list) {
        LOGGER.info("Problem_04#lengthRecursive(list)");
        Objects.requireNonNull(list,"List can not be null");
        LOGGER.info("Problem_04#lengthRecursive({})",list);
        return _lengthRecursive(list,0);
    }

    /**
     * private length Recursive
     *
     * @param list list of elements
     * @param i int
     * @param <T> Type Parameter
     * @return integer
     */
    private static <T> int _lengthRecursive(List<T> list,int i) {
        if (list.isEmpty()) {
            return i;
        }
        return _lengthRecursive(list.subList(1,list.size()), ++i);
    }
}