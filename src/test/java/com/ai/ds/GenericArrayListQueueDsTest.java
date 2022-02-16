package com.ai.ds;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Generic Array List Tests")
public class GenericArrayListQueueDsTest {

    @Test
    @DisplayName("TEST_1:Addition Generic")
    public void testAdditionGeneric() {
        GenericArrayListQueue<Integer> queue = new GenericArrayListQueue<>();
        queue.add(1);
        assertThat(queue.peek(), is(1));
        queue.add(2);
        queue.add(3);
        queue.add(4);
        assertThat(queue.peek(), is(1));
    }

    @Test
    @DisplayName("TEST_2:Deletion Generic")
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