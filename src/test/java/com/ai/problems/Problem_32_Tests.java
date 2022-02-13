package com.ai.problems;

import com.ai.problems.Problem_32;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.internal.matchers.IsCollectionContaining.hasItems;

@DisplayName("SUITE_32")
public class Problem_32_Tests {

    @Test
    @DisplayName("TEST_1:Prime Numbers between 2 and 10")
    public void shouldGiveAllPrimeNumberBetween2And10() {
        List<Integer> primeNumbers = Problem_32.primeNumbers(IntStream.rangeClosed(2, 10));
        assertThat(primeNumbers, hasSize(4));
        assertThat(primeNumbers, hasItems(2, 3, 5, 7));
    }

    @Test
    @DisplayName("TEST_2:Prime Numbers between 7 and 31")
    public void  primeNumbersBetween7And31() {
        List<Integer> primeNumbers = Problem_32.primeNumbers(IntStream.rangeClosed(7, 31));
        assertThat(primeNumbers, hasSize(8));
        assertThat(primeNumbers, hasItems(7,  11, 13, 17, 19, 23, 29, 31));
    }


    @Test
    @DisplayName("TEST_3:Prime Numbers between 7 and 31")
    public void primeNumbersBetween7And31_sieve() {
        List<Integer> primeNumbers = Problem_32.primeNumber_sieve(7, 31);
        assertThat(primeNumbers, hasSize(8));
        assertThat(primeNumbers, hasItems(7,  11, 13, 17, 19, 23, 29, 31));
    }

    @Test
    @DisplayName("TEST_4:Prime Numbers between 2 and 10")
    public void shouldGiveAllPrimeNumberBetween2And10_sieve() {
        List<Integer> primeNumbers = Problem_32.primeNumber_sieve(2, 10);
        assertThat(primeNumbers, hasSize(4));
        assertThat(primeNumbers, hasItems(2, 3, 5, 7));
    }
}