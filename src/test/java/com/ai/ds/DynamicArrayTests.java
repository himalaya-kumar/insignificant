package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("Dynamic Array Tests")
public class DynamicArrayTests {

    @Test
    @DisplayName("TEST_1: Array if able to add")
    public void addInDynamicArray() {
        DynamicArray<String> stringDynamicArray = new DynamicArray<>();
        stringDynamicArray.addElements("a");
        stringDynamicArray.addElements("b");
        stringDynamicArray.addElements("c");
        stringDynamicArray.addElements("d");
        stringDynamicArray.addElements("e");
        stringDynamicArray.addElements("f");
        assertThat(stringDynamicArray.get(4), is("e"));
    }

    @Test
    @DisplayName("TEST_2 : Array if able to remove")
    public void removeElementFromArray() {
        DynamicArray<String> stringDynamicArray = new DynamicArray<>();
        stringDynamicArray.addElements("a");
        stringDynamicArray.addElements("b");
        stringDynamicArray.addElements("c");
        stringDynamicArray.addElements("d");
        stringDynamicArray.addElements("e");
        stringDynamicArray.addElements("f");
        stringDynamicArray.remove(3);
        assertThat(stringDynamicArray.get(3), is("e"));
    }

    @Test
    @DisplayName("TEST_2 : Array if able to remove")
    public void insertElementFromArray() {
        DynamicArray<String> stringDynamicArray = new DynamicArray<>();
        stringDynamicArray.addElements("a");
        stringDynamicArray.addElements("b");
        stringDynamicArray.addElements("c");
        stringDynamicArray.addElements("d");
        stringDynamicArray.addElements("e");
        stringDynamicArray.addElements("f");
        stringDynamicArray.remove(3);
        assertThat(stringDynamicArray.get(3), is("e"));
    }
}