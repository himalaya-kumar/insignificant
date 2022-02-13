package com.ai.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/**
 * One Less Than a Last Element
 * Or
 * Second Last
 */
public class Problem_02 {

    private final static Logger LOGGER = LoggerFactory.getLogger(Problem_02.class);

    /**
     * second last element from list
     *
     * @param elements List of elements
     * @param <T>      Type Parameter
     * @return Type Parameter T
     */
    public static <T> T secondLast(List<T> elements) {

        LOGGER.info("Problem_02#secondLast(list)");
        Objects.requireNonNull(elements, "list can't be null");
        LOGGER.info("Problem_02#secondLast({})", elements);

        if (elements.size() < 2) {
            LOGGER.info("Problem_02#secondLast(List<T>):Size < 2");
            throw new NoSuchElementException("Elements list not high enough to find the second last element");
        }
        LOGGER.info("Problem_02#secondLast(List<T>)");
        return elements.get(/* Number of element*/elements.size() - 2);
    }

    /**
     * Second last Recursion way
     *
     * @param linkedList Linked List of elements
     * @param <T>        Type Parameter
     * @return Type Parameter T
     */
    public static <T> T secondLastRecursion(LinkedList<T> linkedList) {

        LOGGER.info("Problem_02#secondLastRecursion(linkedList)");
        Objects.requireNonNull(linkedList, "linkedList can't be null");
        LOGGER.info("Problem_02#secondLast({})", linkedList);

        if (linkedList.size() < 2) {
            LOGGER.info("Problem_02#secondLastRecursion(List<T>):Size < 2");
            throw new NoSuchElementException("Elements list not high enough to find the second last element");
        } else if (linkedList.size() == 2) {
            LOGGER.info("Problem_02#secondLastRecursion(List<T>):Size = 2");
            return linkedList.getFirst();
        } else {
            LOGGER.info("Problem_02#secondLastRecursion(List<T>)");
            return secondLastRecursion(new LinkedList<>(linkedList.subList(1, linkedList.size())));
        }
    }
}