package com.ai.ds.Tree;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class BTREE {

    private static final Logger LOGGER = LoggerFactory.getLogger(BTREE.class);

    /**
     * Head of the node
     */
    private Node root;

    /**
     * Default Constructor init the node with null
     */
    public BTREE() {
        root = null;
    }

    //1.
    public void remove(int dataNeedsToRemove) {
        //        15
        //      6    20
        //   1   7 16   23
        Node parent = null;
        Node current = this.root;
        int rightOrLeft = -1; //0 for left and 1 for right

        while (current != null) {
            if (dataNeedsToRemove == current.dataInNode) {
                break;
            } else if (dataNeedsToRemove < current.dataInNode) {
                parent = current;
                current = parent.leftPart;
                rightOrLeft = 0;
            } else {
                // else if (dataNeedsToRemove > current.dataInNode) {
                parent = current;
                current = parent.rightPart;
                rightOrLeft = 1;
            }
        }

        //if current is null than node with given value is not present in the tree
        Node replacement = null;//used to store the new value for replacing node

        if (current != null) {
            //Left Child only
            if (current.rightPart == null) {
                replacement = current.leftPart;
                current.leftPart = null;
            }
            //right Child only
            else if (current.leftPart == null) {
                replacement = current.rightPart;
                current.rightPart = null;
            }
            //No Child
            // Anyway, replacement always going to be null
            else if (current.rightPart == null && current.leftPart == null) {
                replacement = null;
            }
            //Both Child present
            else {
                /* If both left and right child are present
                 * we replace this node data with
                 * leftmost node's data in its right subtree
                 * to maintain the balance of BST.
                 * And then delete that node
                 */
                if (current.rightPart.leftPart == null) {
                    current.dataInNode = current.rightPart.dataInNode;
                    replacement = current;
                    current.rightPart = current.rightPart.rightPart;
                } else {
                    Node parent2 = current.rightPart;
                    Node child = current.rightPart.leftPart;
                    while (child.leftPart != null) {
                        parent2 = child;
                        child = parent2.leftPart;
                    }
                    current.dataInNode = child.dataInNode;
                    parent2.leftPart = child.rightPart;
                    replacement = current;
                }
            }
        }

        /*
         * Change Reference of parent after deleting the child
         */
        if (parent == null) {
            this.root = replacement;
        } else {
            if (rightOrLeft == 0) {
                parent.leftPart = replacement;
            } else {
                parent.rightPart = replacement;
            }
        }
    }

    //2.
    public void add(int dataInNode) {
        Node parent = null;
        Node current = this.root;
        int rightOrLeft = -1;
        while (current != null) {
            if (current.dataInNode > dataInNode) {
                parent = current;
                current = current.leftPart;
                rightOrLeft = 0;
            } else if (current.dataInNode < dataInNode) {
                parent = current;
                current = current.rightPart;
                rightOrLeft = 1;
            } else {
                LOGGER.info("this {} already Present in The BST", dataInNode);
                return;
            }
        }
        Node nodeToAdd = new Node(dataInNode);
        if (parent == null) {
            this.root = nodeToAdd;
        } else {
            if (rightOrLeft == 0) parent.leftPart = nodeToAdd;
            else parent.rightPart = nodeToAdd;
        }
    }

    //3.
    public boolean find(int dataInNode) {
        Node current = this.root;
        /*Check Node exists*/
        while (current != null) {
            if (current.dataInNode > dataInNode) current = current.leftPart;
            else if (current.dataInNode < dataInNode) current = current.rightPart;
            else {
                LOGGER.info("{} is present in the tree", dataInNode);
                return true;
            }
        }
        LOGGER.info("{} is not present in the tree", dataInNode);
        return false;
    }

    /**
     * A method of inorder traversal of BST
     */
    public void inorder() {
        if (this.root == null){
            LOGGER.info("This bst is empty");
        }
        LOGGER.info("Inorder traversal of the tree is: ");
        Stack<Node> stack = new Stack<>();
        Node current = this.root;
        while (current != null || !stack.empty()) {
            while (current != null) {
                stack.push(current);
                current = current.leftPart;
            }
            current = stack.pop();
            LOGGER.info(current.dataInNode+" ");
            current = current.rightPart;
        }
        LOGGER.info("");
    }


    /**
     * The Node Class used for building binary search
     */
    static class Node {
        int dataInNode;
        Node leftPart;
        Node rightPart;

        Node(int dataInNode) {
            this.dataInNode = dataInNode;
            leftPart = null;
            rightPart = null;
        }
    }
}