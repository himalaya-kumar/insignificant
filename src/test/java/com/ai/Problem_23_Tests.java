package com.ai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

@DisplayName("SUITE_23")
public class Problem_23_Tests {

    public static Logger logger = LoggerFactory.getLogger(Problem_23_Tests.class);
    @Test
    @DisplayName("TEST_1:Should Return List of three random selected elements")
    public void shouldReturnAListOfThreeRandomSelectedElement(){
        List<String> result = Problem_23.randomSelect(Stream.of("a","b","c","d","e").collect(Collectors.toList()), 3);
        logger.info("Randomly Created List:{}",result);
        assertThat(result,hasSize(3));
    }
}