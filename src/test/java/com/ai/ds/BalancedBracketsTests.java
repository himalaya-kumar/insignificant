package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Balanced Bracket Tests")
public class BalancedBracketsTests {

    @Test
    @DisplayName("TEST_1: Balanced Brackets Test")
    void testIfBalancedBrackets() {
        assert BalancedBrackets.isBalanced("([<{}>])");
    }
}