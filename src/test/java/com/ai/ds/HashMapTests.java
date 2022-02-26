package com.ai.ds;

import com.ai.ds.hashmaps.Hashmap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Hashmap Tests")
public class HashMapTests {

    @Test
    @DisplayName("TEST_1:Init and Insertions")
    public void hashmapInitAndInsertions() {
        Hashmap hashmap = new Hashmap(4);
        hashmap.insertHash(6);
        hashmap.insertHash(7);
        hashmap.insertHash(8);
        hashmap.insertHash(9);
        hashmap.displayHashtable();
    }

    @Test
    @DisplayName("TEST_1:Init and Insertions")
    public void hashmapInitAndDeletions() {
        Hashmap hashmap = new Hashmap(4);
        hashmap.insertHash(6);
        hashmap.insertHash(7);
        hashmap.insertHash(8);
        hashmap.insertHash(9);
        hashmap.deleteHash(7);
        hashmap.insertHash(3);
        hashmap.insertHash(6);
        hashmap.insertHash(15);
        hashmap.displayHashtable();
    }


}
