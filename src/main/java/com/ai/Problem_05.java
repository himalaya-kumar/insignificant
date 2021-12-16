package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.StreamSupport;

/**
 * Reverse a List
 */
public class Problem_05 {

    public static Logger LOGGER = LoggerFactory.getLogger(Problem_05.class);

    /**
     * Java Provided reverse list
     * @param @code{List<T>} list
     * @param <T>
     * @return
     */
    public static <T> List<T> reverseList(List<T> list){
        if (list.isEmpty()) {
            LOGGER.info("Problem_05#reverseList(list):Empty list is a not right argument for method");
            throw new IllegalArgumentException("Empty list is a right argument for Problem_05#reverseList(list)");
        }
        Collections.reverse(list);
        return list;
    }

    /**
     * For loop to reverse the list
     * @param list
     * @param <T>
     * @return
     */
    public static <T> List<T> reverseList_ForEach(List<T> list) {
        if (list.isEmpty()) {
            LOGGER.info("Problem_05#reverseList_ForEach(list):Empty list is not a right argument for method");
            throw new IllegalArgumentException("Empty list is not a right argument for Problem_05#reverseList_ForEach(list)");
        }
        List<T> reversed = new ArrayList<>();
        for (int i = list.size() -1 ; i >= 0;i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    /**
     * Int stream reverse list
     * @param <T>
     * @return List<T>
     */
    public static <T> List<T> reverse_IntStream(List<T> list){
        if (list == null) {
            LOGGER.info("Problem_05#reverse_IntStream(list):Null Argument");
            throw new IllegalArgumentException("Problem_05#reverse_IntStream(list):Argument Can't be null");
        }
        int size = list.size();
        return IntStream.iterate(size - 1,el -> el - 1)
                .limit(size)
                .mapToObj(list::get).collect(Collectors.toList());
    }

    /**
     * Custom Stream
     * @param list
     * @param <T>
     * @return
     */
    public static <T> List<T> reverseCustomStream(ArrayDeque<T> list){
        if (list == null) {
            LOGGER.info("Problem_05#reverse_IntStream(list):Null Argument");
            throw new IllegalArgumentException("Argument Can't be null");
        }
        return StreamSupport
                .stream(Spliterators.spliteratorUnknownSize(list.descendingIterator(),Spliterator.ORDERED),false)
                .collect(Collectors.toList());
    }

    /**
     * Reverse linked list
     * @param linkedList
     * @param <T>
     * @return
     */
    public static <T> List<T> reverse(LinkedList<T> linkedList) {
        if (linkedList == null) {
            LOGGER.info("Problem_05#reverse_IntStream(list):Argument Can't be null");
            throw new IllegalArgumentException("Argument Can't be null");
        }
        var reversed = new LinkedList<T>();
        for (T e:linkedList) {
            reversed.addFirst(e);
        }
        return reversed;
    }
}