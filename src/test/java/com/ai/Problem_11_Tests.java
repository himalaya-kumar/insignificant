package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DisplayName("SUITE_11")
public class Problem_11_Tests {

    @Test
    @DisplayName("TEST_1:Should encode a list")
    public void shouldEncodeAList(){
        List<Object> encodedList = Problem_11.encode_Modified(
                asList("a","a","a","b","c","c","a","a","d","e","e","e","e"));
        assertThat(encodedList.size(),is(equalTo(6)));
        assertThat(encodedList.get(0),is(equalTo(new AbstractMap.SimpleEntry<>(3,"a"))));
        assertThat(encodedList.get(1),is(equalTo("b")));
        assertThat(encodedList.get(2),is(equalTo(new AbstractMap.SimpleEntry<>(2,"c"))));
        assertThat(encodedList.get(3),is(equalTo(new AbstractMap.SimpleEntry<>(2,"a"))));
        assertThat(encodedList.get(4),is(equalTo(("d"))));
        assertThat(encodedList.get(5),is(equalTo(new AbstractMap.SimpleEntry<>(4,"e"))));
    }
}