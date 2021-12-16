package com.ai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Find out if list is an palindrome
 */
public class Problem_06 {

    /**
     * Is An Palindrome list
     * @param <T>
     * @return
     */
    public static <T> boolean isPalindrome(List<T> list) {
        List<T> compareList = new ArrayList<>(list);
        Collections.reverse(list);
        return Objects.equals(list,compareList);
    }
//
//    public static <T> boolean isPalindrome_IntStream(){
//
//    }
}