package com.ai.problems;

import com.ai.problems.Problem_40;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@DisplayName("SUITE_40")
public class Problem_40_Tests {

    @Test
    @DisplayName("TEST_1:test if number is sum of divisor")
    public void testIfNumberIsSumOfDivisor() {
        assertThat(Problem_40.aliquotSum(15),is(9));
    }

    @Test
    @DisplayName("TEST_2:test if number is sum of divisor")
    public void testIfNumberIsSumOfDivisor16() {
        assertThat(Problem_40.aliquotSum(16),is(15));
    }
}