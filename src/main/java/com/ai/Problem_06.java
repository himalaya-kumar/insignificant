package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Find out if list is a palindrome
 */
public class Problem_06 {

    private static final Logger LOG = LoggerFactory.getLogger(Problem_06.class);

    /**
     * Is An Palindrome list
     *
     * @param <T> Type Parameter
     * @return boolean
     */
    public static <T> boolean isPalindrome(List<T> list) {
        LOG.info("Problem#isPalindrome(list)");
        Objects.requireNonNull(list,"List can not be null");
        LOG.info("Problem#isPalindrome({})",list);
        List<T> compareList = new ArrayList<>(list);
        Collections.reverse(list);
        return Objects.equals(list, compareList);
    }

    /**
     * Palindrome using int stream
     *
     * @param list List of Elements
     * @param <T> Type Parameter
     * @return Boolean
     */
    public static <T> boolean isPalindromeIntStream(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("List can't not be null");
        }
        int size = list.size();
        List<T> reversedList = IntStream.iterate(size - 1, el -> el - 1).limit(size).mapToObj(list::get).collect(Collectors.toList());
        return Objects.equals(list, reversedList);
    }
}