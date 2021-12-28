package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Phi Functions from Prime multiples
 */
@DisplayName("SUITE_38")
public class Problem_38_Tests {
    @Test
    @DisplayName("TEST_1:Test the phi of 8")
    public void shouldSayPhiOf10is4() {
        assertThat(Problem_37.phi(8),is(4L));
    }

    @Test
    @DisplayName("TEST_2:Test the phi of 10")
    public void shouldSayPhiOf8is4() {
        assertThat(Problem_37.phi(10),is(4L));
    }
}
