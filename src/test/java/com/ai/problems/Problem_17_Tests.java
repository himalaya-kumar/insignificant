package com.ai.problems;

import com.ai.problems.Problem_17;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DisplayName("SUITE_17")
public class Problem_17_Tests {

    @Test
    @DisplayName("TEST_1:Should split into two halves")
    public void shouldSplitInTwoHalves(){
        Map<Boolean, List<String>> result = Problem_17.split(asList("a","b","c","d","e","f","g","h"),4);
        assertThat(result.get(true),is(equalTo(asList("a","b","c","d"))));
        assertThat(result.get(false),is(equalTo(asList("e","f","g","h"))));
    }
}
