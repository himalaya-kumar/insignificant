package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.ai.UtilityClass.linkedList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * TEST for P03
 */

@DisplayName("SUITE_3")
public class Problem_03_Tests {

    /**
     * Testing the kth element
     *
     * @throws Exception
     */
    @Test
    @DisplayName("Kth Element from the List")
    public void shouldFindKthElementFromAList() throws Exception{
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer integer = Integer.valueOf(3);
        assertThat(Problem_03.kth(integers,2),is(equalTo(integer)));
    }

    @Test
    @DisplayName("Kth Element from recursive element")
    public void shouldFindKthElementsFromAListRecursive(){
        LinkedList<Integer> integers = linkedList(1,2,3,4,5);
        assertThat(Problem_03.kthRecursive(integers,2),is(equalTo(3)));
    }

    @Test
    @DisplayName("Should Find Kth Element From List_Linked List And Stream")
    public void shouldFindKthElementFromAList_LinkedListAndStream() {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        assertThat(Problem_03.kthStream(integerList,2),is(equalTo(3)));
    }
}
