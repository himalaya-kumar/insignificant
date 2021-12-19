package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * One Less Than a Last Element
 * Or
 * Second Last
 */
public class Problem_02 {

    static Logger LOGGER = LoggerFactory.getLogger(Problem_02.class);
    /**
     * second last element from list
     * @param element
     * @param <T>
     * @return T
     */
    public static <T> T secondLast(List<T> element) {
        if (element.size() < 2) {
            LOGGER.info("Problem_02#secondLast(List<T>):Size < 2");
            throw new NoSuchElementException("Elements list not high enough to find the second last element");
        }
        LOGGER.info("Problem_02#secondLast(List<T>)");
        return element.get(/* Number of element*/element.size() - 2);
    }

    /**
     * Second linked list and
     * @param linkedList
     * @param <T>
     * @return T
     */
    public static <T> T secondLastRecursion(LinkedList<T> linkedList){
        if (linkedList.size() < 2) {
            LOGGER.info("Problem_02#secondLastRecursion(List<T>):Size < 2");
            throw new NoSuchElementException("Elements list not high enough to find the second last element");
        } else if (linkedList.size() == 2) {
            LOGGER.info("Problem_02#secondLastRecursion(List<T>):Size = 2");
            return linkedList.getFirst();
        } else {
            LOGGER.info("Problem_02#secondLastRecursion(List<T>)");
            return secondLastRecursion(new LinkedList<>(linkedList.subList(1,linkedList.size())));
        }
    }
}