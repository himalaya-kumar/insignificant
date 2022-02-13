package com.ai.problems;

import com.ai.problems.Problem_34;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.AbstractMap.SimpleEntry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.internal.matchers.IsCollectionContaining.hasItems;

@DisplayName("SUITE_34")
public class Problem_34_Tests {

    @Test
    @DisplayName("TEST_1:Should produce list of all gold bach compositions")
    public void getListOfCompositionsBetweenNumbers() {
        List<SimpleEntry<Integer, List<Integer>>> compositions = Problem_34.goldbach_Composition(IntStream.rangeClosed(9, 20));
        assertThat(compositions, hasSize(6));
        assertThat(compositions, hasItems(
                new SimpleEntry<>(10, asList(3, 7)),
                new SimpleEntry<>(12, asList(5, 7)),
                new SimpleEntry<>(14, asList(3, 11)),
                new SimpleEntry<>(16, asList(3, 13)),
                new SimpleEntry<>(18, asList(5, 13))
        ));
    }

    @Test
    @DisplayName("TEST_2:Should Produce List of Goldbach List")
    public void shouldProduceListOfGoldBachCompositionsWhereBothPrimeNumberAreGreaterThan50() {
        List<SimpleEntry<Integer, List<Integer>>> compositions = Problem_34.goldbach_list1(IntStream.rangeClosed(1, 2000), 50);
        assertThat(compositions, hasSize(4));
        assertThat(compositions, hasItems(
                new SimpleEntry<>(992, asList(73, 919)),
                new SimpleEntry<>(1382, asList(61, 1321)),
                new SimpleEntry<>(1856, asList(67, 1789)),
                new SimpleEntry<>(1928, asList(61, 1867))
        ));
    }
}