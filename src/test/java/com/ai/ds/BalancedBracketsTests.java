package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Balanced Bracket Tests")
public class BalancedBracketsTests {

    @Test
    @DisplayName("TEST_1: Balanced Brackets Test")
    void testIfBalancedBrackets() {
        assert BalancedBrackets.isBalanced("([<{}>])");
        assertThat(BalancedBrackets.isBalanced("([<{}>])"),is(TRUE));
    }
}