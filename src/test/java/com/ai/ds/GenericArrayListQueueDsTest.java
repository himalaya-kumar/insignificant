package com.ai.ds;

import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@Test(suiteName = "GenericArrayListQueueDsTest")
public class GenericArrayListQueueDsTest {
    @Test(testName = "testAddGenericMethod")
    public void testAdditionGeneric() {
        GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<>();
        queue.add(1);
        assertThat(queue.peek(), is(1));
        queue.add(2);
        queue.add(3);
        queue.add(4);
        assertThat(queue.peek(), is(1));
    }

    @Test(testName = "testDeletionGeneric")
    public void testDeletionGeneric() {
        GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        assertThat(queue.pull(), is(1));
        assertThat(queue.peek(), is(2));

    }
}