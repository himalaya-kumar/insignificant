package com.ai.problems;

import com.ai.problems.Problem_27;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

@DisplayName("SUITE_27")
public class Problem_27_Tests {

    public Logger LOGGER = LoggerFactory.getLogger(Problem_27.class);

    @Test
    @DisplayName("TEST_1:Should Group Into Size of 2,3 and 4")
    public void shouldGroupIntoSizeOf_2_3_and_4(){
        List<String> input = Stream.of("aldo","beat","carla","david","evi","flip","gary","hugo","ida").collect(toList());
        List<List<List<String>>> group3 = Problem_27.group3(input);
        //LOGGER.info("{}",group3);
        assertThat(group3,hasSize(1260));
    }

    @Test
    @DisplayName("TEST_2:Should Group Into Size of 2,2 and 5")
    public void shouldGroupIntoSizeOf_2_2_and_5(){
        List<String> input = Stream.of("aldo","beat","carla","david","evi","flip","gary","hugo","ida").collect(toList());
        List<List<List<String>>> group = Problem_27.group(input,Stream.of(2,2,5).collect(toList()));
        //LOGGER.info("{}",group);
        assertThat(group,hasSize(756));
    }

    @Test
    @DisplayName("TEST_3:Should Group Into Size of 1,1 and 2")
    public void shouldGroupIntoSizeOf_1_1_and_2(){
        List<String> input = Stream.of("a","b","c").collect(toList());
        List<List<List<String>>> group = Problem_27.group(input,Stream.of(1,2).collect(toList()));
        //LOGGER.info("{}",group);
        assertThat(group,hasSize(3));
    }

    @Test
    @DisplayName("TEST_4:Should Group into size 2,3,4")
    public void shouldGroupIntoThreeGroupsOfSize_2_3_and_4_part2() throws Exception {
        List<String> input = Stream.of("aldo", "beat", "carla", "david", "evi", "flip", "gary", "hugo", "ida").collect(toList());
        List<List<List<String>>> groups = Problem_27.group(input, Stream.of(2, 3, 4).collect(toList()));
        assertThat(groups, hasSize(1260));
    }

}