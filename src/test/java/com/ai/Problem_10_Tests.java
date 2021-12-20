package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.AbstractMap.SimpleEntry;
import java.util.List;


import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;


/**
 *
 */
@DisplayName("SUITE_10")
public class Problem_10_Tests {

    @Test
    @DisplayName("TEST_1:Should encode a list")
    public void shouldEncodeAList(){
        List<SimpleEntry<Integer,String>> encodedList = Problem_10
                .encode(asList(
                        "a","a","a","a",
                        "b",
                        "c","c","c",
                        "a","a",
                        "d",
                        "e","e","e","e"));
        assertThat(encodedList,hasSize(6));
        assertThat(encodedList.get(0),is(equalTo(new SimpleEntry<>(4,"a"))));
        assertThat(encodedList.get(1),is(equalTo(new SimpleEntry<>(1,"b"))));
        assertThat(encodedList.get(2),is(equalTo(new SimpleEntry<>(3,"c"))));
        assertThat(encodedList.get(3),is(equalTo(new SimpleEntry<>(2,"a"))));
        assertThat(encodedList.get(4),is(equalTo(new SimpleEntry<>(1,"d"))));
        assertThat(encodedList.get(5),is(equalTo(new SimpleEntry<>(4,"e"))));
    }
}