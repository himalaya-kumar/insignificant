package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Doubly Linked List Tests")
public class DoublyLinkedListTests {

    @Test
    @DisplayName("TEST_1:Insertion Tests of Doubly Linked List")
    public void insertionTestInDoublyLinkedList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertHead(13);
        doublyLinkedList.insertHead(7);
        doublyLinkedList.insertHead(10);
        assertThat(doublyLinkedList.isEmpty(), is(false));
        assertThat(doublyLinkedList.toString(),is("10<=>7<=>13"));
    }

    @Test
    @DisplayName("TEST_2:Insertion Tests of Doubly Linked List")
    public void insertionTestDoublyLinkedList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertHead(13);
        doublyLinkedList.insertHead(7);
        doublyLinkedList.insertHead(10);
        doublyLinkedList.insertTail(11);
        assertThat(doublyLinkedList.toString(),is("10<=>7<=>13<=>11"));
    }

    @Test
    @DisplayName("TEST_3:Deletion Tests of Doubly Linked List")
    public void deleteTestDoublyLinkedList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertHead(13);
        doublyLinkedList.insertHead(7);
        doublyLinkedList.insertHead(10);
        doublyLinkedList.insertTail(11);
        doublyLinkedList.deleteTail();
        assertThat(doublyLinkedList.toString(),is("10<=>7<=>13"));
    }

    @Test
    @DisplayName("TEST_4:Deletion Tests of Doubly Linked List")
    public void deleteTestInDoublyLinkedList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertHead(13);
        doublyLinkedList.insertHead(7);
        doublyLinkedList.insertHead(10);
        doublyLinkedList.insertTail(11);
        doublyLinkedList.delete(7);
        assertThat(doublyLinkedList.toString(),is("10<=>13<=>11"));
    }
}