package com.ai;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Find the last element in the list
 */
public class Problem_01 {

    /**
     * A Very Straight forward way
     *
     * @param elements
     * @param <T>
     * @return T
     */
    public static <T> T lastElement(List<T> elements) {
        int numberOfElements = elements.size();
        return elements.get(numberOfElements - 1);
    }

    /**
     * Date Structure way or already done for you way
     *
     * @param <T>
     * @return T
     */
    public static <T> T lastElement(LinkedList<T> linkedList) {
        return linkedList.getLast();
    }

    /**
     * A Unnecessary way
     *
     * @param <T>
     * @return T
     */
    public static <T> T lastRecursive(List<T> element) {
        if (element == null || element.isEmpty()) {
            throw new NoSuchElementException("No Such Element is present");
        }
        if (element.size() == 1) {
            return element.get(0);
        }
        return lastElement(element.subList(0,element.size()));
    }
}