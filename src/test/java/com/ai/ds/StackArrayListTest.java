package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("StackArrayListTests")
public class StackArrayListTest {

    @Test
    @DisplayName("TEST_1:Init and Insertions")
    public void initAndInsertions() {
        StackArrayList stackArrayList = new StackArrayList();
        assertThat(stackArrayList.isEmpty(),is(TRUE));
        stackArrayList.push(1);
        stackArrayList.push(2);
        stackArrayList.push(3);
        stackArrayList.push(5);
        stackArrayList.push(6);
        stackArrayList.push(7);
        assertThat(stackArrayList.isEmpty(),is(FALSE));
        assertThat(stackArrayList.peek(),is(7));
    }

    @Test
    @DisplayName("TEST_2:Init and Deletions")
    public void initAndDeletions() {
        StackArrayList stackArrayList = new StackArrayList();
        assertThat(stackArrayList.isEmpty(),is(TRUE));
        stackArrayList.push(1);
        stackArrayList.push(2);
        stackArrayList.push(3);
        stackArrayList.push(5);
        stackArrayList.push(6);
        stackArrayList.push(7);
        assertThat(stackArrayList.isEmpty(),is(FALSE));
        assertThat(stackArrayList.peek(),is(7));
        stackArrayList.pop();
        stackArrayList.pop();
        assertThat(stackArrayList.peek(),is(5));
    }
}
