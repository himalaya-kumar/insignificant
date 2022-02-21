package com.ai.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("SUITE_13")
public class Problem_13_Tests {

    @Test
    @DisplayName("TEST_1:Should encode an list")
    public void shouldDecodeAnEncodedList() {
        List<AbstractMap.SimpleEntry<Integer,String>> encodedList = Problem_13.encode_direct(
                Arrays.asList("a","a","a","a","b","c","c","a","a","d","e","e","e","e"));
        assertThat(encodedList.size(),is(equalTo(6)));
        assertThat(encodedList.get(0),is(equalTo(new AbstractMap.SimpleEntry<>(4,"a"))));
        assertThat(encodedList.get(1),is(equalTo(new AbstractMap.SimpleEntry<>(1,"b"))));
        assertThat(encodedList.get(2),is(equalTo(new AbstractMap.SimpleEntry<>(2,"c"))));
        assertThat(encodedList.get(3),is(equalTo(new AbstractMap.SimpleEntry<>(2,"a"))));
        assertThat(encodedList.get(4),is(equalTo(new AbstractMap.SimpleEntry<>(1,"d"))));
        assertThat(encodedList.get(5),is(equalTo(new AbstractMap.SimpleEntry<>(4,"e"))));
    }

}