package com.ai.problems;

import com.ai.problems.Problem_06;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("SUITE_6")
public class Problem_06_Tests {

    @Test
    @DisplayName("TEST_1:Verify Palindrome using collection")
    public void verify_palindrome_using_collection() {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
        assertThat(Problem_06.isPalindrome(list), is(TRUE));
    }

    @Test
    @DisplayName("TEST_2:Verify Palindrome using collection")
    public void verify_not_palindrome_using_collection() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(Problem_06.isPalindrome(list), is(FALSE));
    }

    @Test
    @DisplayName("TEST_3:Verify Palindrome using int stream collection")
    public void verify_palindrome_using_intStream() {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1);
        assertThat(Problem_06.isPalindromeIntStream(list), is(TRUE));
    }

    @Test
    @DisplayName("TEST_4:Verify not Palindrome using int stream")
    public void verify_not_palindrome_using_intStream() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(Problem_06.isPalindromeIntStream(list), is(FALSE));
    }
}