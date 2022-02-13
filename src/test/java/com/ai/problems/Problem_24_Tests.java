package com.ai.problems;

import com.ai.problems.Problem_24;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

@DisplayName("SUITE_24")
public class Problem_24_Tests {

    public static Logger LOGGER = LoggerFactory.getLogger(Problem_24.class);

    @Test
    @DisplayName("TEST_1:Should Give 6 Number from 1 to 49")
    public void shouldGive6NumberFromARangeStartingFrom1To49(){
        List<Integer> drawRandomNumber = Problem_24.drawRandomNumber(6, 1, 49);
        LOGGER.info("Draw random numbers {}",drawRandomNumber);
        assertThat(drawRandomNumber,hasSize(6));
    }
}