package com.ai.problems;

import com.ai.problems.Problem_28;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

@DisplayName("SUITE_28")
public class Problem_28_Tests {

    @Test
    public void shouldSortByElementLength() {
        List<List<String>> input = asList(asList("a", "b", "c"), asList("d", "e"), asList("f", "g", "h"), asList("d", "e"), asList("i", "j", "k"), asList("m", "n"), asList("o"));
        List<List<String>> result = Problem_28.lsort(input);
        assertThat(result, is(equalTo(asList(asList("o"), asList("d", "e"), asList("d", "e"), asList("m", "n"), asList("a", "b", "c"), asList("f", "g", "h"), asList("i", "j", "k")))));
    }

    @Test
    public void shouldSortByLengthFrequency() {
        List<List<String>> input = asList(asList("a", "b", "c"), asList("d", "e"), asList("f", "g", "h"), asList("d", "e"), asList("i", "j", "k", "l"), asList("m", "n"), asList("o"));
        List<List<String>> result = Problem_28.lfsort(input);
        assertThat(result, is(equalTo(asList(asList("i", "j", "k", "l"), asList("o"), asList("a", "b", "c"), asList("f", "g", "h"), asList("d", "e"), asList("d", "e"), asList("m", "n")))));
    }
}