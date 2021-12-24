package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

import java.util.stream.Collectors;

/**
 * Find Kth element from the list
 */
public class Problem_03 {

    private static final Logger LOGGER = LoggerFactory.getLogger(Problem_03.class);

    /**
     * Get Kth element from the list
     *
     * @param list List of elements
     * @param k index
     * @param <T> Type Parameter
     * @return Type Parameter
     */
    public static <T> T kth(final List<T> list, final int k) {

        LOGGER.info("Problem_03#kth(list,int)");
        LOGGER.info("Problem_03#kth({},{})", list, k);

        return list.get(k);
    }

    /**
     * Using the recursive way
     *
     * @param linkedList list of T
     * @param k index of element
     * @param <T> Type Parameter
     * @return Type Parameter T
     */
    public static <T> T kthRecursive(final LinkedList<T> linkedList, final int k) {

        LOGGER.info("Problem_03#kthRecursive(linkedList,int)");
        LOGGER.info("Problem_03#kthRecursive({},{})",linkedList,k);

        if (k == 0) {
            LOGGER.info("Problem_03#kthRecursive(LinkedList):k==0");
            return linkedList.getFirst();
        }

        return kthRecursive(new LinkedList<>(linkedList.subList(1, linkedList.size())), k - 1);
    }

    /**
     * Get The kth element from the list
     * k+1 set the stream to the limit
     *
     * @param <T> Type Parameter
     * @return Type Parameter T
     */
    public static <T> T kthStream(final List<T> list, final int k) {

        LOGGER.info("Problem_03#kthStream(list,int)");
        LOGGER.info("Problem_03#kthStream({},{})",list,k);

        return list.stream().limit(k + 1)
                .collect(Collectors.toCollection(LinkedList::new))
                .getLast();
    }
}
