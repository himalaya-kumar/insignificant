package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;


@DisplayName("SUITE_22")
public class Problem_22_Tests {

    @Test
    @DisplayName("TEST_1:Should Create A Range Between 4 and 9")
    public void shouldCreateARangeBetween4And9() {
        List<Integer> range = Problem_22.range(4, 9);
        assertThat(range, hasSize(6));
        assertThat(range, contains(4, 5, 6, 7, 8, 9));
    }
}