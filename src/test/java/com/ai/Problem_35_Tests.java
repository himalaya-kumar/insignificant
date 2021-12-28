package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("SUITE_35")
public class Problem_35_Tests {

    @Test
    @DisplayName("TEST_1: GCD of Two Numbers")
    public void gcdOf36And63() {
        assertThat(Problem_35.gcd(36,63),is(9));
    }

    @Test
    @DisplayName("TEST_2: GCD of Two Numbers")
    public void gcdOfSwitched() {
        assertThat(Problem_35.gcd(63,36),is(9));
    }

    @Test
    @DisplayName("TEST_3: GCD of Two Numbers")
    public void gcdOf36And63Conditional() {
        assertThat(Problem_35.gcdC(36,63),is(9));
    }
}
