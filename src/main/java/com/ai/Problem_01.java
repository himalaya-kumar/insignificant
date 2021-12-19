package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Find the last element in the list
 */
public class Problem_01 {

    static Logger LOGGER = LoggerFactory.getLogger(Problem_01.class);

    /**
     * A Very Straight forward way
     *
     * @param elements
     * @param <T>
     * @return T
     */
    public static <T> T lastElement(List<T> elements) {
        int numberOfElements = elements.size();
        LOGGER.info("Problem_01#lastElement(List),numberOfElements:{}", numberOfElements);
        return elements.get(numberOfElements - 1);
    }

    /**
     * Date Structure way or already done for you way
     *
     * @param <T>
     * @return T
     */
    public static <T> T lastElement(LinkedList<T> linkedList) {
        LOGGER.info("Problem_01#lastElement(LinkedList)");
        return linkedList.getLast();
    }

    /**
     * A Unnecessary way
     *
     * @param <T>
     * @return T
     */
    public static <T> T lastRecursive(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            LOGGER.info("Problem_01#lastRecursive(List<T>):No Such Element Present");
            throw new NoSuchElementException("No Such Element is present");
        }
        LOGGER.info("Problem_01#lastRecursive(List),numberOfElements:{}", elements.size());
        if (elements.size() == 1) {
            LOGGER.info("Problem_01#lastRecursive(List),numberOfElements:{}", elements.get(0));
            return elements.get(0);
        }
        return lastElement(elements.subList(0, elements.size()));
    }
}