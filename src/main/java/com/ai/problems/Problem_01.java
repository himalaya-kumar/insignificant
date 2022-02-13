package com.ai.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Find the last element in the list
 * Logs: Problem_01#lastElement Static Method
 * Logs: Problem_01()#lastElement Constructor method
 *
 */
public class Problem_01 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem_01.class);

    /**
     * A Very Straight forward way
     *
     * @param elements list of elements of Type <T>
     * @param <T> Type Parameter
     * @return Type T Element
     */
    public static <T> T lastElement(List<T> elements) {
        int numberOfElements = elements.size();
        LOGGER.trace("Problem_01#lastElement(List),numberOfElements:{}", numberOfElements);
        return elements.get(numberOfElements - 1);
    }

    /**
     * Date Structure way or already done for you way
     *
     * @param <T> Type Parameter
     * @return Type T Element
     */
    public static <T> T lastElement(LinkedList<T> linkedList) {
        LOGGER.trace("Problem_01#lastElement(LinkedList)");
        return linkedList.getLast();
    }

    /**
     * Unnecessary way it seems
     *
     * @param <T> Type Parameter
     * @return Type T Element
     */
    public static <T> T lastRecursive(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            LOGGER.trace("Problem_01#lastRecursive(List<T>):No Such Element Present");
            throw new NoSuchElementException("No Such Element is present");
        }

        LOGGER.trace("Problem_01#lastRecursive(List),numberOfElements:{}", elements.size());

        if (elements.size() == 1) {
            LOGGER.trace("Problem_01#lastRecursive(List):elements.size() == 1");
            return elements.get(0);
        }
        return lastElement(elements.subList(0, elements.size()));
    }
}