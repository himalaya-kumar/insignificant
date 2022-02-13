package com.ai.problems;

import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * Run Length encoding of a list(direct solution)
 *
 */
public class Problem_13 {

    /**
     *  encoded list from SimpleEntry
     *
     * @return List<SimpleEntry>
     */
    public static List<AbstractMap.SimpleEntry<Integer,String>> encode_direct(List<String> list){
        LinkedList<AbstractMap.SimpleEntry<Integer,String>> result = new LinkedList<>();
        String lastElement = null;
        for (String elem:list) {
            if (Objects.equals(lastElement,elem)) {
                AbstractMap.SimpleEntry<Integer,String> last = result.removeLast();
                result.add(new AbstractMap.SimpleEntry<>(last.getKey() +1,elem));
            } else {
                result.add(new AbstractMap.SimpleEntry<>(1,elem));
                lastElement = elem;
            }
        }
        return result;
    }
}
