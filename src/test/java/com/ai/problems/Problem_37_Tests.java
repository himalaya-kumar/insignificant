package com.ai.problems;

import com.ai.problems.Problem_37;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@DisplayName("SUITE_37")
public class Problem_37_Tests {

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