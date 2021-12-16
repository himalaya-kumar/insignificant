package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Find the number of element from list
 */

@DisplayName("SUITE_4")
public class Problem_04_Tests {

    @Test
    @DisplayName("Empty list should be 0")
    public void listOfEmptyShouldBe0(){
        int length = Problem_04.length(Collections.EMPTY_LIST);
        assertThat(length,is(equalTo(0)));
    }
}
