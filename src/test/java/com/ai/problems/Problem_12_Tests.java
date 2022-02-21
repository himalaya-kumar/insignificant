package com.ai.problems;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 *
 */
@DisplayName("SUITE_12")
public class Problem_12_Tests {

    @Test
    @DisplayName("TEST_1:Should decode a encoded list")
    public void shouldDecodeEncodedList(){
        List<String> encoded = Problem_12.decode(
                Arrays.asList(
                        new AbstractMap.SimpleEntry<>(4,"a"),"b",
                        new AbstractMap.SimpleEntry<>(2,"c"),
                        new AbstractMap.SimpleEntry<>(2,"a"),
                        "d",
                        new AbstractMap.SimpleEntry<>(4,"e")
                )
        );

        assertThat(encoded.size(),is(equalTo(14)));
    }
}