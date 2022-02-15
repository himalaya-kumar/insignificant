package com.ai.ds;

import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@Test(suiteName = "LinkedQueueDsTest")
public class LinkedQueueDsTest {

    @Test
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