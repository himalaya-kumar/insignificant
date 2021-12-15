package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DisplayName("Problem_01_test")
public class Problem_01_Test {

    @Test
    @DisplayName("+ve:Get Last Element")
    public void getLastElement_List_way_Test() {
        assertThat(Problem_01.lastElement(asList("a","b","c","d","e")),is(equalTo("e")));
    }

    @Test
    @DisplayName("Last Element in Linked List")
    public void getLastElement_Linked_List_way_Test() {
        LinkedList<String> list = linkedList("a","b","c","d","e");
        assertThat(Problem_01.lastElement(list),is(equalTo("e")));
    }

    @Test
    @DisplayName("The Recursive Way")
    public void recursion_is_a_way(){
        assertThat(Problem_01.lastRecursive(asList("a","b","c","d","e")),is(equalTo("e")));
    }
    @SafeVarargs
    public static <T> LinkedList<T> linkedList(T... elements) {
        return Stream.of(elements).collect(Collectors.toCollection(LinkedList::new));
    }

}
