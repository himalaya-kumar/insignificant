package com.ai;


import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

/**
 * Problem 05 Tests
 */
@DisplayName("SUITE_5")
public class Problem_05_Tests {

    @Test
    @DisplayName("TEST_1:Reversing a List")
    public void testReversingAList(){
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        Assert.assertThat(Problem_05.reverseList(integers),is(equalTo(Arrays.asList(5,4,3,2,1))));
    }

    @Test
    @DisplayName("TEST_2:should reverse a list int stream")
    public void shouldReverseAList_IntStream(){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Assert.assertThat(Problem_05.reverse_IntStream(numbers),is(equalTo(Arrays.asList(5,4,3,2,1))));
    }

    @Test
    public void shouldReverseAList_Stream() throws Exception {
        ArrayDeque<Integer> numbers = arrayDeque(1, 2, 3, 4, 5);
        Assert.assertThat(Problem_05.reverseCustomStream(numbers), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }

    private <T> ArrayDeque<T> arrayDeque(T ...args) {
        return Stream.of(args).collect(Collectors.toCollection(ArrayDeque::new));
    }
}
