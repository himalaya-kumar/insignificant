package com.ai.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

@DisplayName("SUITE_30")
public class Problem_30_Tests {

    @Test
    @DisplayName("TEST_1: Should Find Prime Factors of 315")
    public void shouldFindPrimeFactorsOf315() {
        List<Integer> primeFactors315 = Problem_30.primeFactors(315);
        assertThat(primeFactors315,hasItems(3,3,5,7));
    }

    @Test
    @DisplayName("TEST_2: Should find prime factors of 33")
    public void shouldFindPrimeFactorsOf33() {
        List<Integer> primeFactors33 = Problem_30.primeFactors(33);
        assertThat(primeFactors33,hasItems(3,11));
    }

    @Test
    @DisplayName("TEST_3:Should find primer factors of 315 stream")
    public void shouldFindPrimeFactorsOf315Stream() {
        List<Integer> primeFactors315 = Problem_30.primeFactorStream(315);
        assertThat(primeFactors315,hasItems(3,3,5,7));
    }
    @Test
    @DisplayName("TEST_4: Should find prime factors of 33")
    public void shouldFindPrimeFactorsOf33Stream() {
        List<Integer> primeFactors33 = Problem_30.primeFactorStream(33);
        assertThat(primeFactors33,hasItems(3,11));
    }
}
