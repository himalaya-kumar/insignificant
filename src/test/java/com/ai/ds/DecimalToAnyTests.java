package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@DisplayName("Decimal to any using stack")
public class DecimalToAnyTests {

    @Test
    @DisplayName("TEST_1:Decimal to Binary")
    public void testDecimalToBinary() {
        assertThat(DecimalToAnyUsingStack.convertToBinary(0),is("0"));
        assertThat(DecimalToAnyUsingStack.convertToBinary(30),is("11110"));
    }

    @Test
    @DisplayName("TEST_2:Decimal to Any")
    public void testDecimalToAny() {
        assertThat(DecimalToAnyUsingStack.convertToAny(30,8),is("36"));
        assertThat(DecimalToAnyUsingStack.convertToAny(30,10),is("30"));
    }
}