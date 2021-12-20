package com.ai;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Find the number of element from list
 */

@DisplayName("SUITE_4")
public class Problem_04_Tests {

    @Test
    @DisplayName("TEST_1:Empty list should be 0")
    public void listOfEmptyShouldBe0(){
        int length = Problem_04.length((List<?>) Collections.EMPTY_LIST);
        assertThat(length,is(0));
    }
}
