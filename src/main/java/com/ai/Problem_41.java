package com.ai;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * Alphabetical
 */
public class Problem_41 {

    private static final Logger LOG = LoggerFactory.getLogger(Problem_41.class);

    /**
     * Is Alphabetical or not
     * @param s String of alphabetical
     * @return boolean
     */
    public static boolean isAlphabetical(String s){
        s = s.toLowerCase();
        String finalS = s;
        for (int i = 0; i < s.length() - 1; i++) {
            if (!Character.isLetter(s.charAt(i)) || !(s.charAt(i) <= s.charAt(i+1))) {
                return false;
            }
        }
        return true;
    }
}