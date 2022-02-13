package com.ai.problems;

import com.ai.problems.Problem_29;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("SUITE_29")
public class Problem_29_Tests {

    @Test
    @DisplayName("TEST_1:Test Prime Number")
    public void testThePrimeNumber16(){
        assertThat(Problem_29.isPrime(16),is(FALSE));
    }

    @Test
    @DisplayName("TEST_2:Test Prime Number")
    public void testThePrimeNumber16L(){
        assertThat(Problem_29.isPrime(16L),is(FALSE));
    }

    @Test
    @DisplayName("TEST_3:Test Prime Number")
    public void testThePrimeNumber19(){
        assertThat(Problem_29.isPrime(19),is(TRUE));
    }

    @Test
    @DisplayName("TEST_4:Test Prime Number")
    public void testThePrimeNumber41(){
        assertThat(Problem_29.isPrime(41),is(TRUE));
    }

    @Test
    @DisplayName("TEST_5:Test Prime Number")
    public void testThePrimeNumber43(){
        assertThat(Problem_29.isPrime(43L),is(TRUE));
    }

    @Test
    @DisplayName("TEST_6:Test Prime Number")
    public void testThePrimeNumber47(){
        assertThat(Problem_29.isPrime(47L),is(TRUE));
    }
}