package com.ai.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <b>Flatten a nested list to a list</b>
 */
public class Problem_07 {

    /**
     * Flatten a nested List
     *
     * @param list List of elements
     * @param elementType element type
     * @param <T> Type Parameter
     * @return List<T>
     **/
    public static <T> List<T> flatten(List<?> list, Class<T> elementType) {

        List<T> flatten = new ArrayList<T>();
        list.forEach(e -> {
            if (e instanceof List) {
                flatten.addAll(flatten((List<?>) e, elementType));
            } else if (e.getClass() == elementType){
                flatten.add((T) e);
            }
            //else {
                //not to add value in the list
            //}
        });
        return flatten;
    }

    /**
     * Flatten a nested list
     *
     * @param list which needs to be flat
     * @param elementType element type of need to be flatten
     * @param <T> Generic value
     * @return {@code List<T>}
     */
    public static <T> List<T> flatten_stream(List<?> list, Class<T> elementType) {

        return list.stream()
                .flatMap(e -> e instanceof List<?> ? flatten_stream((List<?>) e, elementType).stream() : Stream.of(e))
                .map(e -> (T) e)
                .collect(Collectors.toList());
    }
}