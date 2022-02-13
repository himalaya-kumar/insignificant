package com.ai.problems;

import com.ai.problems.Problem_39;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@DisplayName("SUITE_39")
public class Problem_39_Tests {

    @Test
    @DisplayName("TEST_1:maximum value of numbers")
    public void findMaximumValueOfList() {
        List<Integer> integerList = asList(10,57,68,33);
        assertThat(Problem_39.absoluteMaximum(integerList),is(68));
    }

    @Test
    @DisplayName("TEST_2:maximum value of numbers")
    public void findMaximumValueOfListStream() {
        List<Integer> integerList = asList(10,57,68,33);
        assertThat(Problem_39.absoluteMaximumStream(integerList),is(68));
    }
}