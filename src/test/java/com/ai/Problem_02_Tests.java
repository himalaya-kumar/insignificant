package com.ai;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.ai.UtilityClass.linkedList;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * TESTS for P02
 */
@DisplayName("SUITE_2")
public class Problem_02_Tests {
    @Test
    @DisplayName("TEST_1:Get Last Element")
    public void getLastElement_List_way_Test() {
        assertThat(Problem_02.secondLast(asList("a","b","c","d","e")),is(equalTo("d")));
    }

    @Test
    @DisplayName("TEST_2:Last Element in Linked List")
    public void getLastElement_Linked_List_way_Test() {
        LinkedList<String> list = linkedList("a","b","c","d","e");
        assertThat(Problem_02.secondLastRecursion(list),is(equalTo("d")));
    }

    @Test
    @DisplayName("TEST_3:The Recursive Way")
    public void recursion_is_a_way(){
        assertThat(Problem_02.secondLastRecursion(linkedList("a","b","c","d","e")),is(equalTo("d")));
    }

    @Test
    @DisplayName("TEST_4:Exception Verification")
    public void noSuchElementExceptionTest(){
        Assertions.assertThrows(NoSuchElementException.class,() -> {
            Problem_02.secondLast(Collections.EMPTY_LIST);
        });
    }
}
