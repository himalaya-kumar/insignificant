package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;

import static org.junit.Assert.assertThat;

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
        assertThat(compressedList.size(),is(equalTo(5)));
        assertThat(compressedList,is(equalTo(asList("a","b","c","d","e"))));
    }

    @Test
    @DisplayName("TEST_2:Should Not remove if found same element")
    public void shouldNotRemoveIfFoundOtherElement(){
        List<String> compressedList = Problem_08.compress(asList("a", "a", "a", "a", "b", "c", "c", "d", "e", "e", "e", "e","a","a"));
        assertThat(compressedList.size(),is(equalTo(6)));
        assertThat(compressedList,is(equalTo(asList("a","b","c","d","e","a"))));
    }
}
