package com.ai.ds.Tree;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinaryTree {

    private static final Logger LOG = LoggerFactory.getLogger(BinaryTree.class);
    //First element of binary tree
    private Node rootOfBinaryTree;

    public BinaryTree() {
        this.rootOfBinaryTree = null;
    }

    public BinaryTree(Node rootOfBinaryTree) {
        this.rootOfBinaryTree = rootOfBinaryTree;
    }

    //1.
    public void insert(int value) {
        Node newNodeToBeInserted = new Node(value);
        if (rootOfBinaryTree == null) {
            rootOfBinaryTree = newNodeToBeInserted;
        } else {
            Node parentOfNewNodeToBeInserted = find(value);
            if (value < parentOfNewNodeToBeInserted.dataInTheNode) {
                parentOfNewNodeToBeInserted.leftPartOfTheNode = newNodeToBeInserted;
                parentOfNewNodeToBeInserted.leftPartOfTheNode.parentPartOfTheNode = parentOfNewNodeToBeInserted;
            } else {
                parentOfNewNodeToBeInserted.rightPartOfTheNode = newNodeToBeInserted;
                parentOfNewNodeToBeInserted.rightPartOfTheNode.parentPartOfTheNode = parentOfNewNodeToBeInserted;
            }
        }
    }

    //2.
    public Node find(int valueToBeFound) {
        //Going to start from the tree
        Node currentOfTheTree = rootOfBinaryTree;

        while (currentOfTheTree != null) {

            if (/*Left*/valueToBeFound < currentOfTheTree.dataInTheNode) {
                if (currentOfTheTree.leftPartOfTheNode == null) {
                    return currentOfTheTree;
                }
                currentOfTheTree = currentOfTheTree.leftPartOfTheNode;
            } else if (/*Right*/valueToBeFound > currentOfTheTree.dataInTheNode) {
                if (currentOfTheTree.rightPartOfTheNode == null) {
                    return currentOfTheTree;
                }
                currentOfTheTree = currentOfTheTree.rightPartOfTheNode;
            } else {
                return /*Will Get exact value*/currentOfTheTree;
            }
        }
        return /*Thought Never going to happen*/null;
    }


    //3.
    public boolean remove(int valueToBeRemoved) {
        /*Give The parent but value absolutely be present in BST*/
        Node nodeToBeRemoved = find(valueToBeRemoved);

        /*When Parent returned*/
        if (nodeToBeRemoved.dataInTheNode != valueToBeRemoved) return false;

        /*No Children*/
        if (nodeToBeRemoved.rightPartOfTheNode == null && nodeToBeRemoved.leftPartOfTheNode == null){
            if (nodeToBeRemoved == rootOfBinaryTree) rootOfBinaryTree = null;
            //right
            else if (nodeToBeRemoved.parentPartOfTheNode.dataInTheNode < nodeToBeRemoved.dataInTheNode)
                nodeToBeRemoved.parentPartOfTheNode.rightPartOfTheNode = null;
            //left
            else nodeToBeRemoved.parentPartOfTheNode.leftPartOfTheNode = null;
            return true;
        }
        /*Two Children */
        else if (nodeToBeRemoved.leftPartOfTheNode != null && nodeToBeRemoved.rightPartOfTheNode != null){
            Node oneNodeBefore = findSuccessor(nodeToBeRemoved);

            //The left tree of temp is made of the left tree of the successor
            oneNodeBefore.leftPartOfTheNode = nodeToBeRemoved.leftPartOfTheNode;
            oneNodeBefore.leftPartOfTheNode.parentPartOfTheNode = oneNodeBefore;

            if (oneNodeBefore.parentPartOfTheNode != nodeToBeRemoved) {
                if (oneNodeBefore.rightPartOfTheNode != null) {
                    oneNodeBefore.rightPartOfTheNode.parentPartOfTheNode = oneNodeBefore.parentPartOfTheNode;
                    oneNodeBefore.parentPartOfTheNode.leftPartOfTheNode = oneNodeBefore.rightPartOfTheNode;
                } else {
                    oneNodeBefore.parentPartOfTheNode.leftPartOfTheNode = null;
                }
                oneNodeBefore.rightPartOfTheNode = nodeToBeRemoved.rightPartOfTheNode;
                oneNodeBefore.rightPartOfTheNode.parentPartOfTheNode = oneNodeBefore;
            }

            if (nodeToBeRemoved == rootOfBinaryTree) {
                oneNodeBefore.parentPartOfTheNode = null;
                rootOfBinaryTree = oneNodeBefore;
            } else {
                oneNodeBefore.parentPartOfTheNode = nodeToBeRemoved.parentPartOfTheNode;
                if (nodeToBeRemoved.parentPartOfTheNode.dataInTheNode < nodeToBeRemoved.dataInTheNode){
                    nodeToBeRemoved.parentPartOfTheNode.rightPartOfTheNode = oneNodeBefore;
                } else {
                    nodeToBeRemoved.parentPartOfTheNode.leftPartOfTheNode = oneNodeBefore;
                }
            }
            return true;
        }//One Child
        else {
            if (nodeToBeRemoved == rootOfBinaryTree) {
                rootOfBinaryTree = nodeToBeRemoved.leftPartOfTheNode;
                return true;
            }

            assert nodeToBeRemoved.leftPartOfTheNode != null;
            nodeToBeRemoved.leftPartOfTheNode.parentPartOfTheNode = nodeToBeRemoved.parentPartOfTheNode;

            if (nodeToBeRemoved.dataInTheNode < nodeToBeRemoved.parentPartOfTheNode.dataInTheNode) {
                nodeToBeRemoved.parentPartOfTheNode.leftPartOfTheNode = nodeToBeRemoved.leftPartOfTheNode;
            } else {
                nodeToBeRemoved.parentPartOfTheNode.rightPartOfTheNode = nodeToBeRemoved.leftPartOfTheNode;
            }
            return true;
        }
    }

    /**
     * Getter of the root
     *
     * @return rootOfTheBinary returns the root
     */
    public Node getRootOfBinaryTree(){
        return rootOfBinaryTree;
    }

    /**
     * Gives that one before the node
     *
     * @param node main Node
     * @return node before the node
     */
    public Node findSuccessor(Node node) {
        if (node.rightPartOfTheNode == null) return node;
        Node currentNode = node.rightPartOfTheNode;
        Node parentNode = node.rightPartOfTheNode;
        while (currentNode != null){
            parentNode = currentNode;
            currentNode = currentNode.leftPartOfTheNode;
        }
        return parentNode;
    }

    /**
     * prints data in Left child <-> ROOT <-> Right child
     *
     * @param localRoot root of BST
     */
    public void inOrder(Node localRoot){
        if (localRoot != null) {
            inOrder(localRoot.leftPartOfTheNode);
            LOG.info(localRoot.dataInTheNode+" ");
            inOrder(localRoot.rightPartOfTheNode);
        }
    }

    /**
     * ROOT <-> Left Child <-> Right Child
     *
     * @param localRoot root of BST
     */
    public void preOrder(Node localRoot){
        if (localRoot != null) {
            LOG.info(localRoot.dataInTheNode+" ");
            preOrder(localRoot.leftPartOfTheNode);
            preOrder(localRoot.rightPartOfTheNode);
        }
    }

    /**
     * Right Child <-> Left Child <-> ROOT
     *
     * @param localRoot root of the BST
     */
    public void postOrder(Node localRoot){
        if (localRoot!= null){
            postOrder(localRoot.leftPartOfTheNode);
            postOrder(localRoot.rightPartOfTheNode);
            LOG.info(localRoot.dataInTheNode + " ");
        }
    }

    public static class Node {
        public int dataInTheNode;
        public Node leftPartOfTheNode;
        public Node rightPartOfTheNode;
        public Node parentPartOfTheNode;

        //So A Node definitely needs to be initialized
        // And only Data should be parameter obviously
        public Node(int dataInTheNode){
            this.dataInTheNode = dataInTheNode;
            leftPartOfTheNode = null;
            rightPartOfTheNode = null;
            parentPartOfTheNode = null;
        }
    }
}