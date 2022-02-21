package com.ai.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Find the number of element from list
 */

@DisplayName("SUITE_4")
public class Problem04Tests {

    @Test
    @DisplayName("TEST_1:Empty list should be 0")
    public void listOfEmptyShouldBe0(){
        int length = Problem_04.length((List<?>) Collections.EMPTY_LIST);
        assertThat(length,is(equalTo(0)));
    }

    @Test
    @DisplayName("TEST_2:Length of List Using Sum of Stream")
    public void testLengthOfListUsingStream_01(){
        long length = Problem_04.lengthStream_01(asList("a","b","c","d"));
        long lengthExpected = 4L;

        assertThat(length,is(lengthExpected));
    }

    @Test
    @DisplayName("TEST_3:Length of List Using Stream count")
    public void testLengthOfListUsingStream(){
        long length = Problem_04.lengthStream(asList("a","b","c","d"));
        long lengthExpected = 4L;

        assertThat(length,is(lengthExpected));
    }

    @Test
    @DisplayName("TEST_4:Length of List Using Recursion")
    public void testLengthOfListUsingRecursion(){
        long length = Problem_04.lengthRecursive(asList("a","b","c","d"));
        long lengthExpected = 4L;

        assertThat(length,is(lengthExpected));
    }
}