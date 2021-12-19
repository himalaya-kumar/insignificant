package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@DisplayName("SUITE_9")
public class Problem_09_Tests {

    @Test
    @DisplayName("TEST_1:Should Return a same element with two Unique Element is Passed")
    public void shouldReturnAListWithTwoListElementsWhenAListWithTwoUniqueElementsIsPassed() throws Exception {

        List<List<String>> packedList = Problem_09.pack(asList("a", "b"));

        assertThat(packedList.size(), is(equalTo(2)));
        assertThat(packedList.get(0),is(equalTo(asList("a"))));
        assertThat(packedList.get(1), is(equalTo(asList("b"))));
    }

    @Test
    @DisplayName("TEST_2:Should Pack Consecutive in their own list")
    public void shouldPackConsecutiveDuplicatesInTheirOwnLists_small() throws Exception {
        List<List<String>> packedList = Problem_09.pack(asList("a", "a", "b", "a"));
        assertThat(packedList.size(), is(equalTo(3)));
        assertThat(packedList.get(0), is(equalTo(asList("a", "a"))));
        assertThat(packedList.get(1), is(equalTo(asList("b"))));
        assertThat(packedList.get(2), is(equalTo(asList("a"))));
    }

    @Test
    @DisplayName("TEST_3:Should Pack Consecutive duplicates in their own list")
    public void shouldPackConsecutiveDuplicatesInTheirOwnLists() throws Exception {
        List<List<String>> packedList = Problem_09.pack(asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
        assertThat(packedList.size(), is(equalTo(6)));
        assertThat(packedList.get(0), is(equalTo(asList("a", "a", "a", "a"))));
        assertThat(packedList.get(1), is(equalTo(asList("b"))));
        assertThat(packedList.get(2), is(equalTo(asList("c","c"))));
        assertThat(packedList.get(3), is(equalTo(asList("a","a"))));

    }
}