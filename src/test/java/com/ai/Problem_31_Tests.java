package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.util.AbstractMap.SimpleEntry;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsIterableContaining.hasItems;

@DisplayName("SUITE_31")
public class Problem_31_Tests {

    @Test
    @DisplayName("TEST_1:should Create a simple entry list of prime factors")
    void shouldCreateASimpleEntryList() {
        List<SimpleEntry<Integer, Integer>> primeFactors = Problem_31.primeFactorMultiple(315);
        assertThat(primeFactors, hasItems(new SimpleEntry<>(3, 2), new SimpleEntry<>(5, 1), new SimpleEntry<>(7, 1)));
    }

    @Test
    @DisplayName("TEST_2:Should Create a simple entry list of prime factors 33")
    void primeFactorsListOf33() {
        List<SimpleEntry<Integer, Integer>> simpleEntries = Problem_31.primeFactorMultiple(33);
        assertThat(simpleEntries, hasItems(new SimpleEntry<>(3, 1), new SimpleEntry<>(11, 1)));
    }

}