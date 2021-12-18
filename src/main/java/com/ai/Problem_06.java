package com.ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Find out if list is an palindrome
 */
public class Problem_06 {

    /**
     * Is An Palindrome list
     *
     * @param <T>
     * @return
     */
    public static <T> boolean isPalindrome(List<T> list) {
        List<T> compareList = new ArrayList<>(list);
        Collections.reverse(list);
        return Objects.equals(list, compareList);
    }

    /**
     * Palindrome using int stream
     *
     * @param list
     * @param <T>
     * @return
     */
    public static <T> boolean isPalindrome_IntStream(List<T> list) {
        if (list == null) {
            throw new IllegalArgumentException("List can't not be null");
        }
        int size = list.size();
        List<T> reversedList = IntStream.iterate(size - 1, el -> el - 1).limit(size).mapToObj(list::get).collect(Collectors.toList());
        return Objects.equals(list, reversedList);
    }
}