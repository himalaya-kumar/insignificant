package com.ai.problems;

import com.ai.problems.Problem_36;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@DisplayName("SUITE_36")
public class Problem_36_Tests {

    @Test
    @DisplayName("TEST_1:test 35 and 64 is Co prime")
    public void test35And64IsCoPrime(){
        boolean coprime = Problem_36.coPrime(35,64);
        assertThat(coprime,is(TRUE));
    }
}
