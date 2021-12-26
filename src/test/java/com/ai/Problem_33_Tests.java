package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.internal.matchers.IsCollectionContaining.hasItems;

@DisplayName("SUITE_33")
public class Problem_33_Tests {

    @Test
    @DisplayName("TEST_1:8 is sum of 3 and 5")
    public void shouldEightIsTheSumOfFiveAndThree() {
        List<Integer> integers = Problem_33.goldBach(8);
        assertThat(integers,hasSize(2));
        assertThat(integers,hasItems(3,5));
    }

    @Test
    @DisplayName("TEST_2:Four Is the sum of the two and two")
    public void shouldFourIsTheSumOfTwoAndTwo() {
        List<Integer> integersList = Problem_33.goldBach(4);
        assertThat(integersList,hasSize(2));
        assertThat(integersList,hasItems(2,2));
    }

    @Test
    @DisplayName("TEST_3:28 is the sum of 5 and 23")
    public void input28ShouldGiveBackThe23and5() {
        List<Integer> integersList = Problem_33.goldBach(28);
        assertThat(integersList,hasSize(2));
        assertThat(integersList,hasItems(23,5));
    }
}