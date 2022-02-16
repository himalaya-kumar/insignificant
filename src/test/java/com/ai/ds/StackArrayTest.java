package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("StackArrayListTest")
public class StackArrayTest {

    @Test
    @DisplayName("TEST_1:Init and Insertions")
    public void initAndInsertions() {
        StackArray stackArrayList = new StackArray();
        assertThat(stackArrayList.isEmpty(),is(true));
        stackArrayList.push(1);
        stackArrayList.push(3);
        stackArrayList.push(4);
        stackArrayList.push(5);
        stackArrayList.push(6);
        assertThat(stackArrayList.peek(),is(6));
        assertThat(stackArrayList.isEmpty(),is(false));
    }

    @Test
    @DisplayName("TEST_2:Init and Insertions and Deletion")
    public void initAndInsertionsAndDeletions() {
        StackArray stackArrayList = new StackArray();
        assertThat(stackArrayList.isEmpty(),is(true));
        stackArrayList.push(1);
        stackArrayList.push(3);
        stackArrayList.push(4);
        stackArrayList.push(5);
        stackArrayList.push(6);
        assertThat(stackArrayList.peek(),is(6));
        assertThat(stackArrayList.isEmpty(),is(false));
        stackArrayList.pop();
        stackArrayList.pop();
        assertThat(stackArrayList.peek(),is(4));
    }
}