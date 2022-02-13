package com.ai.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Extract a slice of list
 */
public class Problem_18 {

    static public Logger LOGGER = LoggerFactory.getLogger(Problem_18.class);
    /**
     * Slice a list
     * @param list
     * @param start
     * @param end
     * @param <T>
     * @return
     */
    static public <T> List<T> slice(List<T> list,int start,int end) {
        LOGGER.debug("Problem_18#slice({},{},{})",list,start,end);
        return list.subList(start -1,end);
    }
}