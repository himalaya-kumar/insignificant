package com.ai.ds;

import com.ai.ds.hashmaps.LinearProbingHashmap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Linear Probing Hashmap Tests")
public class LinearProbingHashmapTests {

    @Test
    @DisplayName("TEST_1: Linear Probing Init and Insertions")
    public void probingInitInsertions() {
        LinearProbingHashmap hashmap = new LinearProbingHashmap(4);
        hashmap.insert(6);
        hashmap.insert(7);
        hashmap.insert(8);
        hashmap.insert(9);
        hashmap.displayHashTable();
    }


    @Test
    @DisplayName("TEST_2: Insertions and Deletions")
    public void insertionsAndDeletions() {
        LinearProbingHashmap linearProbingHashmap = new LinearProbingHashmap(16);
        linearProbingHashmap.insert(6);
        linearProbingHashmap.insert(7);
        linearProbingHashmap.insert(8);
        linearProbingHashmap.insert(9);
        linearProbingHashmap.deleteHash(7);
        linearProbingHashmap.insert(3);
        linearProbingHashmap.insert(6);
        linearProbingHashmap.insert(15);
        linearProbingHashmap.displayHashTable();
    }
}