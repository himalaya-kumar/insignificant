package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueueDsTest {

    @Test
    @DisplayName("TEST_1:Queue init and insertions")
    public void queueInitAndInsertion() {
        Queue testQueue = new Queue(4);
        testQueue.insert(5); //0
        testQueue.insert(6); //1
        testQueue.insert(7); //2
        testQueue.insert(8);
        assertThat(testQueue.toString(),is("[5, 6, 7, 8]"));
    }

    @Test
    @DisplayName("TEST_2:Queue insertions and deletions")
    public void queueInitAndDeletion() {
        Queue testQueue = new Queue();
        testQueue.insert(5); //0
        testQueue.insert(6); //1
        testQueue.insert(7); //2
        testQueue.insert(8);
        testQueue.insert(9);
        testQueue.insert(10);
        testQueue.insert(11);
        testQueue.remove();
        testQueue.remove();
        assertThat(testQueue.toString(),is("[7, 8, 9, 10, 11]"));
    }
}