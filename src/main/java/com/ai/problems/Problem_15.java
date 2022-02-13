package com.ai.problems;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Add Duplicates number of times using stream
 *
 */
public class Problem_15 {

    /**
     * Creating duplicates multiple times
     * @param  list ,int times
     * @return List
     */
    static public <T> List<T> duplicates(List<T> list,final int times){
        return list.stream().flatMap(e -> Collections.nCopies(times,e).stream()).collect(Collectors.toList());
    }
}