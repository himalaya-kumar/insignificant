package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Singly Linked List Test Cases")
public class SinglyLinkedListTests {

    @Test
    @DisplayName("TEST_1: Assert Conditions")
    public void singlyLinkedListEmpty() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        assertThat(singlyLinkedList.isEmpty(), is(true));
        assertThat(singlyLinkedList.size(), is(0));
        assertThat(singlyLinkedList.count(), is(0));
        assertThat(singlyLinkedList.toString(), is(""));
    }

    @Test
    @DisplayName("TEST_2: Test Insertions")
    void singlyTestInsertFunctions() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(7);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.insertNth(1, 4);
        assertThat(singlyLinkedList.toString(), is("10->7->5->3->1"));
    }

    @Test
    @DisplayName("TEST_3: Searching Operations")
    void singlyTestSearchFunctions() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(7);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.insertNth(1, 4);
        assertThat(singlyLinkedList.toString(), is("10->7->5->3->1"));
        assertThat(singlyLinkedList.search(10), is(true));
        assertThat(singlyLinkedList.search(5), is(true));
        assertThat(singlyLinkedList.search(1), is(true));
        assertThat(singlyLinkedList.search(100), is(false));
    }

    @Test
    @DisplayName("TEST_4: Clear function")
    public void clearFunction() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(7);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.insertNth(1, 4);
        singlyLinkedList.clear();
        assertThat(singlyLinkedList.size() == 0, is(true));
    }

    @Test
    @DisplayName("TEST_5: Delete the function")
    public void deleteTheFunction() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(5);
        singlyLinkedList.insertFirst(7);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertLast(3);
        singlyLinkedList.insertNth(1, 4);
        assertThat(singlyLinkedList.toString(), is("10->7->5->3->1"));
        singlyLinkedList.delete();
        assertThat(singlyLinkedList.toString(), is("10->7->5->3"));
        singlyLinkedList.deleteNth(2);
        assertThat(singlyLinkedList.toString(), is("10->7->3"));

    }
}
