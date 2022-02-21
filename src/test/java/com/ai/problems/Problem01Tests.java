package com.ai.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static com.ai.problems.UtilityClass.linkedList;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * TESTS for P01
 */
@DisplayName("SUITE_1")
public class Problem01Tests {

    @Test
    @DisplayName("TEST_1:Get Last Element")
    public void getLastElement_List_way_Test() {
        List<String> elements = asList("a", "b", "c", "d", "e");
        assertThat(Problem_01.lastElement(elements), is("e"));
    }

    @Test
    @DisplayName("TEST_2:Last Element in Linked List")
    public void getLastElement_Linked_List_way_Test() {
        LinkedList<String> list = linkedList("a", "b", "c", "d", "e");
        assertThat(Problem_01.lastElement(list), is("e"));
    }

    @Test
    @DisplayName("TEST_3:The Recursive Way")
    public void recursion_is_a_way() {
        List<String> elements = asList("a", "b", "c", "d", "e");
        assertThat(Problem_01.lastRecursive(elements), is("e"));
    }
}