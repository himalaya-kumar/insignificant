package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;

@DisplayName("SUITE_25")
public class Problem_25_Tests {

    @Test
    @DisplayName("TEST_1:Permutation of List")
    public void randomizeList(){
        List<String> list = Arrays.asList("a","b","c","d","e","f");
        List<String> randomPermutation = Problem_25.randomPermutation(list);
        assertThat(randomPermutation,hasSize(6));
        assertThat(randomPermutation,containsInAnyOrder("a","b","c","d","e","f"));
    }
}