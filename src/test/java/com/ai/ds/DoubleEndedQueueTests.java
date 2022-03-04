package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("DoubleEndedQueueTests")
public class DoubleEndedQueueTests {

    @Test
    @DisplayName("TEST_1:Init and Addition")
    public void doubleEndedQueueInitAndAddition() {
        DoubleEndedQueue<Integer> doubleEndedQueue = new DoubleEndedQueue<>();
        doubleEndedQueue.addFirst(1);
        doubleEndedQueue.addLast(2);
        doubleEndedQueue.addFirst(3);
        doubleEndedQueue.addLast(4);
        assertThat(doubleEndedQueue.peekFirst(), is(3));
        assertThat(doubleEndedQueue.peekLast(), is(4));
    }

    @Test
    @DisplayName("TEST_2:Init and Deletions")
    public void doubleEndedQueueInitAndAdditionAndDeletion() {
        DoubleEndedQueue<Integer> doubleEndedQueue = new DoubleEndedQueue<>();
        doubleEndedQueue.addFirst(1);
        doubleEndedQueue.addLast(2);
        doubleEndedQueue.addFirst(3);
        doubleEndedQueue.addLast(4);
        doubleEndedQueue.addFirst(5);
        doubleEndedQueue.addLast(6);
        doubleEndedQueue.addFirst(7);
        doubleEndedQueue.addLast(8);
        doubleEndedQueue.pollFirst();
        doubleEndedQueue.pollLast();
        assertThat(doubleEndedQueue.peekFirst(), is(5));
        assertThat(doubleEndedQueue.peekLast(), is(6));
    }
}