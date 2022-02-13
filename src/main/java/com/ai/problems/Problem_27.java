package com.ai.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.ai.problems.Problem_26.combinations;

/**
 * Group the elements in Disjoint subset
 */
public class Problem_27 {

    /**
     * In how many ways can group of 9 people work in 3 disjoint subgroup 2,3 and 4 persons
     *
     * @param <T>
     * @return
     */
    static public <T> List<List<List<T>>> group3(List<T> list) {
        /**
         * 1. Find all the combinations of 2
         * 2. For Each Combination of 2 find combination of 3 in the remaining group
         * 3. Add combination of 2, 3 and remaining to the result.
         *
         */
        List<List<List<T>>> result = new ArrayList<>();
        for (List<T> combinationOf2:combinations(list,2)){
            List<T> r = remaining(list,combinationOf2);
            for (List<T> combination3:combinations(r,3)){
                result.add(Stream.of(combinationOf2,combination3,remaining(r,combination3)).collect(Collectors.toList()));
            }
        }
        return result;
    }

    public static <T> List<List<List<T>>> group(List<T> list, List<Integer> gss) {
        if (gss.isEmpty()) {
            List<List<List<T>>> lists = new ArrayList<>();
            lists.add(new ArrayList<>());
            return lists;
        }
        int n = gss.get(0);
        List<Integer> ns = gss.subList(1, gss.size());
        List<List<List<T>>> result = new ArrayList<>();
        for (List<T> c:combinations(list,n)){
            List<T> remains = remaining(list,c);
            for (List<List<T>> cg:group(remains,ns)) {
                List<List<T>> sg = new ArrayList<>();
                sg.add(c);
                sg.addAll(cg);
                result.add(sg);
            }
        }
        return result;
    }

    private static <T> List<T> remaining(List<T> list, List<T> c) {
        return list.stream().filter(e -> !c.contains(e)).collect(Collectors.toList());
    }
}
