package com.ai.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("SUITE_20")
public class Problem_20_Tests {

    @Test
    @DisplayName("TEST_1:Should remove kth element from a List")
    public void shouldRemoveKthElementFromList(){
        Object[] result = Problem_20.removeAt(asList("a","b","c","d"),2);
        assertThat(result[0],equalTo(asList("a","c","d")));
        assertThat(result[1],equalTo("b"));
    }

    @Test
    @DisplayName("TEST_2:Should remove kth element from a List using split")
    public void shouldRemoveKthElementFromList_split(){
        Object[] result = Problem_20.removeAt_splitAt(asList("a","b","c","d"),2);
        assertThat(result[0],equalTo(asList("a","c","d")));
        assertThat(result[1],equalTo("b"));
    }

}