package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("PriorityQueueTest")
public class PriorityQueueTest {

    @Test
    @DisplayName("TEST_1:Init and Insertions in PQ")
    public void initAndInsertionsInPQ() {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(10);
        priorityQueue.insert(10);
        priorityQueue.insert(2);
        priorityQueue.insert(4);
        priorityQueue.insert(12);
        assertThat(priorityQueue.peek(),is(12));
    }

    @Test
    @DisplayName("TEST_2:Init and Insertions in PQ")
    public void initAndDeletionsInPQ() {
        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(10);
        priorityQueue.insert(10);
        priorityQueue.insert(2);
        priorityQueue.insert(4);
        priorityQueue.insert(12);
        assertThat(priorityQueue.peek(),is(12));
        priorityQueue.remove();
        assertThat(priorityQueue.peek(),is(10));
        priorityQueue.remove();
        assertThat(priorityQueue.peek(),is(10));
    }
}
