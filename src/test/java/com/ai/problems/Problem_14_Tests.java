package com.ai.problems;


import com.ai.problems.Problem_14;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Duplicates of adjacent to the element list Tests
 */
@DisplayName("SUITE_14")
public class Problem_14_Tests {

    @Test
    @DisplayName("TEST_1:Test adding Duplicates in a list")
    public void testDuplicatesInList() {
        List<Integer> duplicatedList = Problem_14.duplicateList(asList(1, 2, 3, 4));
        assertThat(duplicatedList, is(equalTo(asList(1, 1, 2, 2, 3, 3, 4, 4))));
    }
}