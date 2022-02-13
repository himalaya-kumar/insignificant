package com.ai.problems;

import com.ai.problems.Problem_41;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@DisplayName("SUITE_41")
public class Problem_41_Tests {

    @Test
    @DisplayName("TEST_1:Is Alphabetical or not")
    public void testStringAlphabeticalOrNot1() {
        assertThat(Problem_41.isAlphabetical("123abc"),is(FALSE));
    }

    @Test
    @DisplayName("TEST_2:Is Alphabetical or not")
    public void testStringAlphabeticalOrNot2() {
        assertThat(Problem_41.isAlphabetical("aBC"),is(TRUE));
    }

    @Test
    @DisplayName("TEST_3:Is Alphabetical or not3")
    public void testStringAlphabeticalOrNot() {
        assertThat(Problem_41.isAlphabetical("aBC"),is(TRUE));
    }
}