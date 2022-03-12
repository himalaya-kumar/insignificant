package com.ai.ds.tree;

import com.ai.ds.Tree.BinaryTree;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisplayName("Binary Tree Tests")
public class BinaryTreeTests {

    private static final Logger LOG = LoggerFactory.getLogger(BinaryTreeTests.class);

    @Test
    @DisplayName("TEST_1:Init And Addition")
    public void binaryTreeInit() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(6);
        binaryTree.insert(10);
        binaryTree.insert(15);
        binaryTree.insert(16);
        binaryTree.insert(78);
        binaryTree.insert(89);
        binaryTree.insert(12);
        assert binaryTree.find(10).dataInTheNode == 10;
        assert binaryTree.find(10).rightPartOfTheNode.dataInTheNode == 15;
        //LOG.info(binaryTree.find(10).toString());
    }
}