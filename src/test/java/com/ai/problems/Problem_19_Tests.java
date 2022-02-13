package com.ai.problems;

import com.ai.problems.Problem_19;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Rotate the list to left
 *
 */
@DisplayName("SUITE_19")
public class Problem_19_Tests {

    @Test
    @DisplayName("TEST_1:Should Rotate a List by Three Element")
    public void shouldRotateAListByThreeElement() {
        List<String> rotated = Problem_19.rotate(asList("a", "b", "c", "d", "e", "f", "g", "h"),3);
        assertThat(rotated,is(equalTo(asList( "d", "e", "f", "g", "h","a", "b", "c"))));
    }

    @Test
    @DisplayName("TEST_2:Should Return a same List by when arg is 0")
    public void shouldReturnAListBy0Element() {
        List<String> rotated = Problem_19.rotate(asList("a", "b", "c", "d", "e", "f", "g", "h"),0);
        assertThat(rotated,is(equalTo(asList( "a", "b", "c", "d", "e", "f", "g", "h"))));
    }

    @Test
    @DisplayName("TEST_3:Should Rotated List by when arg is -ve")
    public void shouldReturnALListByNegativeElement() {
        List<String> rotated = Problem_19.rotate(asList("a", "b", "c", "d", "e", "f", "g", "h"),-2);
        assertThat(rotated,is(equalTo(asList( "g","h","a", "b", "c", "d", "e", "f"))));
    }
}