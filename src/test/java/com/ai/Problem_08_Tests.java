package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsIterableContaining.hasItems;


/**
 * Testing the elimination consecutive elements
 *
 */
@DisplayName("SUITE_8")
public class Problem_08_Tests {

    @Test
    @DisplayName("TEST_1:Should Remove Consecutive Duplicates")
    public void shouldRemoveConsecutiveDuplicatesInAList(){
        List<String> compressedList = Problem_08.compress(asList("a", "a", "a", "a", "b", "c", "c", "d", "e", "e", "e", "e"));
        assertThat(compressedList,hasSize(5));
        assertThat(compressedList,hasItems("a","b","c","d","e"));
    }

    @Test
    @DisplayName("TEST_2:Should Not remove if found same element")
    public void shouldNotRemoveIfFoundOtherElement(){
        List<String> compressedList = Problem_08.compress(asList("a", "a", "a", "a", "b", "c", "c", "d", "e", "e", "e", "e","a","a"));
        assertThat(compressedList,hasSize(6));
        assertThat(compressedList,hasItems("a","b","c","d","e","a"));
    }
}