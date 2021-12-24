package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.ToIntFunction;

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
        LOGGER.info("Problem_04#length({})",list);

        return list.size();
    }

    /**
     * Length list using Stream
     * @param list List of elements
     * @param <T> Type Parameter
     * @return Type Parameter T
     */
    public static <T> long lengthStream(List<T> list){
        LOGGER.info("Problem_04#lengthStream(list)");
        LOGGER.info("Problem_04#lengthStream({})",list);


        return list.stream().count();
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
        LOGGER.info("Problem_04#lengthStream_01({})",list);

        return list.stream().mapToInt(new ToIntFunction<T>() {
            @Override
            public int applyAsInt(T x) {
                return 1;
            }
        }).peek(e -> {
            LOGGER.info("{}",e);
        }).sum();
    }

    /**
     * Length recursive
     *
     * @param list List of elements
     * @param <T> Type Parameter
     * @return Type Parameter T
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
