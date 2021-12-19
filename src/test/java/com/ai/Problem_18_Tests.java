package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@DisplayName("SUITE_18")
public class Problem_18_Tests {

    @Test
    @DisplayName("TEST_1:List should be Sliced")
    public void shouldGiveASliceOfList(){
        List<String> stringList = Problem_18.slice(asList("a","b","c","d","e","f","g","h","i","k"),3,7);
        assertThat(stringList,is(equalTo(asList("c","d","e","f","g"))));
        assertThat(stringList.size(),is(equalTo(5)));
    }
}