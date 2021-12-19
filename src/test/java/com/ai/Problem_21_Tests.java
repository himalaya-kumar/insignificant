package com.ai;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

@DisplayName("SUITE_21")
public class Problem_21_Tests {

    @Test
    @DisplayName("TEST_1:Should Insert Element At Second Position")
    public void shouldInsertElementAtSecondPosition(){
        List<String> stringList = Stream.of("a","b","c","d").collect(Collectors.toList());
        List<String> result = Problem_21.insertAt(stringList,2,"woh");
        assertThat(result,hasSize(5));

    }
}