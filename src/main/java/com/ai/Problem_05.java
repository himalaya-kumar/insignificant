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

    private final static Logger LOGGER = LoggerFactory.getLogger(Problem_05.class);

    /**
     * Java Provided reverse list
     *
     * @param list List of elements
     * @return reversed list
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
     *
     * @param list list of elements
     * @return {@link List<T>} Reversed List
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
     *
     * @return List<T>
     */
    public static <T> List<T> reverse_IntStream(List<T> list){
        if (list == null) {
            LOGGER.info("Problem_05#reverse_IntStream(list):Null Argument");
            throw new IllegalArgumentException("Problem_05#reverse_IntStream(list):Argument Can't be null");
        }
        int size = list.size();
        return IntStream.iterate(size - 1,el -> el - 1)
                .peek(el1 -> LOGGER.info("{},{}",size -1,el1 -1))
                .limit(size)
                .mapToObj(list::get).collect(Collectors.toList());
    }

    /**
     * Custom Stream Using Array Deque
     *
     * @param list List of Stream
     * @param <T> Type Parameter
     * @return List of reversed elements
     */
    public static <T> List<T> reverseCustomStream(ArrayDeque<T> list){
        LOGGER.info("Problem_05#reverseCustomStream(ArrayDeque)");
        Objects.requireNonNull(list,"List can not be null");
        LOGGER.info("Problem_05#reverseCustomStream({})",list);

        if (list.isEmpty()) {
            LOGGER.info("Problem_05#reverseCustomStream(list):Empty List Argument");
            throw new IllegalArgumentException("Argument Can't be empty");
        }
        return StreamSupport
                .stream(Spliterators.spliteratorUnknownSize(list.descendingIterator(),Spliterator.ORDERED),false)
                .collect(Collectors.toList());
    }

    /**
     * Reverse linked list for each
     *
     * @param linkedList Linked list of elements
     * @param <T> Type Parameter
     * @return List<T> Reversed List
     */
    public static <T> List<T> reverse(LinkedList<T> linkedList) {
        LOGGER.info("Problem_05#reverse(linkedList)");
        Objects.requireNonNull(linkedList,"List can not be null");
        LOGGER.info("Problem_05#reverseCustomStream({})",linkedList);

        if (linkedList.isEmpty()) {
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