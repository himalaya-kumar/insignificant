package com.ai;

import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.internal.matchers.IsCollectionContaining.hasItems;

@DisplayName("SUITE_7")
public class Problem_07_Tests {

    @Test
    @DisplayName("TEST_1:Flatten a List")
    public void shouldFlattenAListOfList() {
        List<String> flatten = Problem_07.flatten(asList("a",asList("b",asList("c","d")),"e",asList("f","g")),String.class);
        assertThat(flatten,hasSize(7));
        assertThat(flatten,hasItems("a","b","c","d","e","f","g"));
        assertThat(flatten,hasSize(7));
        assertThat(flatten,hasItems("a","b","c","d","e","f","g"));
    }

    @Test
    @DisplayName("TEST_2:Flatten Deep Nested")
    public void should_flatten_deep_nested_list(){
        List<String> flatten = Problem_07.flatten(asList("a", asList("b", asList("c", asList("d", "e", asList("f", "g"))), "h")),String.class);
        assertThat(flatten,hasSize(8));
        assertThat(flatten,hasItems("a","b","c","d","e","f","g","h"));
    }

    @Test
    @DisplayName("TEST_3:Empty list when empty value")
    public void should_return_empty_list_when_flatten(){
        List<String> flatten = Problem_07.flatten(Collections.EMPTY_LIST,String.class);
        assertThat(flatten.isEmpty(),is(TRUE));
    }

    @Test
    @DisplayName("TEST_4:Should return flatten using Stream")
    public void shouldFlattenAListOfStream(){
        List<String> flatten = Problem_07.flatten_stream(asList("a", asList("b", asList("c", asList("d", "e", asList("f", "g"))), "h")),String.class);
        assertThat(flatten,hasSize(8));
        assertThat(flatten,hasItems("a","b","c","d","e","f","g","h"));
    }

    @Test
    @DisplayName("TEST_5:Return an empty list when type is not present")
    public void return_an_empty_list_when_Type_is_not_present(){
        List<Integer> flatten = Problem_07.flatten(asList("a", asList("b", asList("c", asList("d", "e", asList("f", "g"))), "h")),Integer.class);
        assertThat(flatten,hasSize(0));
        assertThat(flatten,equalTo(Collections.EMPTY_LIST));
    }

    @Test
    @DisplayName("TEST_6:Return same list when not listed")
    public void should_return_same_list_when_not_listed(){
        List<String> flatten = Problem_07.flatten(asList("a","b","c","d"),String.class);
        assertThat(flatten,hasItems("a","b","c","d"));
    }
}