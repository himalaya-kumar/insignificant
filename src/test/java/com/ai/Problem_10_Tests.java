package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.List;


import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 *
 */
@DisplayName("SUITE_10")
public class Problem_10_Tests {

    @Test
    @DisplayName("TEST_1:Should encode a list")
    public void shouldEncodeAList(){
        List<AbstractMap.SimpleEntry<Integer,String>> encodedList = Problem_10
                .encode(asList(
                        "a","a","a","a",
                        "b",
                        "c","c","c",
                        "a","a",
                        "d",
                        "e","e","e","e"));
        assertThat(encodedList.size(),is(equalTo(6)));
        assertThat(encodedList.get(0),is(equalTo(new AbstractMap.SimpleEntry<>(4,"a"))));
        assertThat(encodedList.get(1),is(equalTo(new AbstractMap.SimpleEntry<>(1,"b"))));
        assertThat(encodedList.get(2),is(equalTo(new AbstractMap.SimpleEntry<>(3,"c"))));
        assertThat(encodedList.get(3),is(equalTo(new AbstractMap.SimpleEntry<>(2,"a"))));
        assertThat(encodedList.get(4),is(equalTo(new AbstractMap.SimpleEntry<>(1,"d"))));
        assertThat(encodedList.get(5),is(equalTo(new AbstractMap.SimpleEntry<>(4,"e"))));
    }
}