package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Circle Linked List Tests")
public class CircleLinkedListTests {

    private static final Logger LOG = LoggerFactory.getLogger(CircleLinkedListTests.class);

    @Test
    @DisplayName("TEST_1:Insertion Tests")
    public void testForInsertion() {
        CircleLinkedList<Integer> circleLinkedList = new CircleLinkedList<>();
        circleLinkedList.append(12);
        circleLinkedList.append(23);
        circleLinkedList.append(34);
        circleLinkedList.append(56);
        LOG.info(circleLinkedList.toString());
        assertThat(circleLinkedList.toString(), is("[ 12 , 23 , 34 , 56 ,  ]"));
        circleLinkedList.delete(3);
        LOG.info(circleLinkedList.toString());
        assertThat(circleLinkedList.toString(), is("[ 12 , 23 , 34 ,  ]"));
    }
}