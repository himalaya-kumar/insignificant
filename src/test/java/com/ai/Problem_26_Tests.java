package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

@DisplayName("SUITE_26")
public class Problem_26_Tests {

    private final Logger LOGGER = LoggerFactory.getLogger(Problem_26.class);

    @Test
    @DisplayName("TEST_1:Find All the combination of size 3")
    public void shouldFindAllCombinationOfSize2FromAListWithSize3(){
        List<String> listOfABC = Stream.of("a","b","c").collect(toList());
        List<List<String>> combinations = Problem_26.combinations(listOfABC,2);
        LOGGER.info("{}",combinations);
        assertThat(combinations,hasSize(3));
    }

    @Test
    @DisplayName("TEST_2:Find All the combination of size 6")
    public void shouldFindAllCombinationOfSize3FromAListSize6(){
        List<String> stringList = Stream.of("a","b","c","d","e","f").collect(toList());
        List<List<String>> combinations = Problem_26.combinations(stringList,3);
        LOGGER.info("{}",combinations);
        assertThat(combinations,hasSize(20));
    }

    @Test
    @DisplayName("TEST_3:Find All the combination of size 6")
    public void shouldFindAllCombinationOfSize4FromAListSize6(){
        List<String> stringList = Stream.of("a","b","c","d","e","f").collect(toList());
        List<List<String>> combinations = Problem_26.combinations(stringList,4);
        LOGGER.info("{}",combinations);
        assertThat(combinations,hasSize(15));
    }
}