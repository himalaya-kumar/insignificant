package com.ai.ds;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Bag Tests")
public class BagTests {

    @Test
    @DisplayName("TEST_1:Init and Insertions")
    public void bagInitAndInsertions() {
        Bag<String> bag = new Bag<>();
        bag.addElement("1");
        bag.addElement("2");
        bag.addElement("3");
        assert bag.contains("2");
        assert bag.contains("3");
    }
}
