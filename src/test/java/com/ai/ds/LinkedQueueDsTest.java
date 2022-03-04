package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Linked Queue Tests")
public class LinkedQueueDsTest {

    @Test
    @DisplayName("TEST_1:Linked Queue Insertions")
    public void testInsertionAndInitialization() {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        linkedQueue.enqueue(4);
        linkedQueue.enqueue(5);
        assertThat(linkedQueue.peekFront(),is(1));
    }

    @Test
    @DisplayName("TEST_2:LinkedQueue and Deletions")
    public void testDeletion() {
        LinkedQueue linkedQueue = new LinkedQueue();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        linkedQueue.enqueue(4);
        linkedQueue.enqueue(5);
        linkedQueue.deQueue();
        linkedQueue.deQueue();
        assertThat(linkedQueue.peekFront(),is(3));
    }
}