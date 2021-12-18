package com.ai;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

@DisplayName("SUITE_6")
public class Problem_06_Tests {

    @Test
    @DisplayName("TEST_1:Verify Palindrome using collection")
    public void verify_palindrome_using_collection() {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
        Assert.assertThat(Problem_06.isPalindrome(list), is(equalTo(Boolean.TRUE)));
    }

    @Test
    @DisplayName("TEST_2:Verify Palindrome using collection")
    public void verify_not_palindrome_using_collection() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertThat(Problem_06.isPalindrome(list), is(equalTo(Boolean.FALSE)));
    }

    @Test
    @DisplayName("TEST_3:Verify Palindrome using int stream collection")
    public void verify_palindrome_using_intStream() {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
        Assert.assertThat(Problem_06.isPalindrome_IntStream(list), is(equalTo(Boolean.TRUE)));
    }

    @Test
    @DisplayName("TEST_4:Verify not Palindrome using int stream")
    public void verify_not_palindrome_using_intStream() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertThat(Problem_06.isPalindrome_IntStream(list), is(equalTo(Boolean.FALSE)));
    }
}