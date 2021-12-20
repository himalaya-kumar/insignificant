package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsIterableContaining.hasItems;


@DisplayName("SUITE_9")
public class Problem_09_Tests {

    @Test
    @DisplayName("TEST_1:Should Return a same element with two Unique Element is Passed")
    public void shouldReturnAListWithTwoListElementsWhenAListWithTwoUniqueElementsIsPassed() {
        List<List<String>> packedList = Problem_09.pack(asList("a", "b"));

        assertThat(packedList, hasSize(2));
        assertThat(packedList.get(0), is(singletonList("a")));
        assertThat(packedList.get(1), is(singletonList("b")));
    }

    @Test
    @DisplayName("TEST_2:Should Pack Consecutive in their own list")
    public void shouldPackConsecutiveDuplicatesInTheirOwnLists_small() throws Exception {
        List<List<String>> packedList = Problem_09.pack(asList("a", "a", "b", "a"));
        assertThat(packedList, hasSize(3));
        assertThat(packedList.get(0), is(equalTo(asList("a", "a"))));
        assertThat(packedList.get(1), is(singletonList("b")));
        assertThat(packedList.get(2), is(singletonList("a")));
    }

    @Test
    @DisplayName("TEST_3:Should Pack Consecutive duplicates in their own list")
    public void shouldPackConsecutiveDuplicatesInTheirOwnLists() throws Exception {
        List<List<String>> packedList = Problem_09.pack(asList("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"));
        assertThat(packedList.size(), is(6));
        assertThat(packedList.get(0), hasItems("a", "a", "a", "a"));
        assertThat(packedList.get(1), hasItems("b"));
        assertThat(packedList.get(2), hasItems("c", "c"));
        assertThat(packedList.get(3), hasItems("a", "a"));
    }
}