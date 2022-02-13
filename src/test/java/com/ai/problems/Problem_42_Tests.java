package com.ai.problems;

import com.ai.problems.Problem_42;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.TRUE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@DisplayName("SUITE_42")
public class Problem_42_Tests {

    @Test
    @DisplayName("TEST_1:Check if String is anagram or not")
    public void shouldCheckIfAnagram() {
        String actual = "NOT MY PROBLEM";
        String expected = "PROBLEM NOT MY";
        assertThat(Problem_42.checkIfStringIsAnagram(actual,expected),is(TRUE));
    }

    @Test
    @DisplayName("TEST_2:Check if String is anagram or not")
    public void shouldCheckIfAnagram2() {
        String actual = "NOT MY PROBLEM";
        String expected = "PROBLEM NOT MY";
        assertThat(Problem_42.checkIfStringIsAnagram1(actual,expected),is(TRUE));
    }

    @Test
    @DisplayName("TEST_3:Check if String is anagram or not")
    public void shouldCheckIfAnagram3() {
        String actual = "NOT MY PROBLEM";
        String expected = "PROBLEM NOT MY";
        assertThat(Problem_42.checkIfStringIsAnagram2(actual,expected),is(TRUE));
    }

    @Test
    @DisplayName("TEST_4:Check if String is anagram or not")
    public void shouldCheckIfAnagram4() {
        String actual = "NOT MY PROBLEM";
        String expected = "PROBLEM NOT MY";
        assertThat(Problem_42.checkIfStringIsAnagram3(actual,expected),is(TRUE));
    }
}