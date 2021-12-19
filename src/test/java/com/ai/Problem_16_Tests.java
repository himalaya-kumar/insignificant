package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DisplayName("SUITE_16")
public class Problem_16_Tests {

    @Test
    @DisplayName("TEST_1:Should drop every nth Element")
    public void shouldDropEveryNthElement() {
        List<String> result = Problem_16.dropEveryNthElement(asList("a","b","c","d","e","f","g","h","i","j","k"),3);
        assertThat(result,is(equalTo(asList("a","b","d","e","g","h","j","k"))));
        assertThat(result.size(),is(equalTo(8)));
    }

    @Test
    @DisplayName("TEST_2: Should Return same list every nth element")
    public void shouldReturnSameListWhenNIsLessThanListSize(){
        List<String> result = Problem_16.dropEveryNthElement(asList("a","b"),3);
        assertThat(result.size(),is(equalTo(2)));
        assertThat(result,is(equalTo(asList("a","b"))));
    }

    @Test
    @DisplayName("TEST_3: Should Return Same List when N Is Zero")
    public void shouldReturnSameListWhenNisZero(){
        List<String> result = Problem_16.dropEveryNthElement(asList("a","b","c","d"),0);
        assertThat(result.size(),is(equalTo(4)));
        assertThat(result,is(equalTo(asList("a","b","c","d"))));
    }
}