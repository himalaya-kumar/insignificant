package com.ai.ds.hashmaps;

import java.util.LinkedList;

/**
 * A hashmap organizes data so, you can quickly look up value for a given key
 * Strengths
 * Fast lookups
 * worst case
 * in worst case look up take o(1)
 */
public class Hashmap {

    private int hashSize;
    private LinkedList[] buckets;

    public Hashmap(int hashSize){
        buckets = new LinkedList[hashSize];
        for (int i = 0;i < hashSize; i++) {
            buckets[i] = new LinkedList();
        }
        this.hashSize = hashSize;
    }

    public int hashing(int key){
        //Hash is the index of number
        int hash = key % hashSize;
        if (hash < 0) {
            hash += hashSize;
        }
        return hash;
    }

    public void insertHash(int valueToBeAdded){
        int hash = hashing(valueToBeAdded);
        buckets[hash].insert(valueToBeAdded);
    }

    public void deleteHash(int valueToBeDeleted){
        int hash = hashing(valueToBeDeleted);
        buckets[hash].delete(valueToBeDeleted);
    }

    public void displayHashtable() {
        for (int i = 0; i < hashSize; i++) {
            System.out.printf("Bucket %d :", i);
            System.out.println(buckets[i].display());
        }
    }

    public static class LinkedList {
        private Node headOfLinkedList;

        private LinkedList() {
            headOfLinkedList = null;
        }

        //1.
        public void insert(int valueInNode) {
            Node nodeToBeInserted = new Node(valueInNode);
            if (isEmpty()) {
                headOfLinkedList = nodeToBeInserted;
            } else {
                Node endNode = findEnd(headOfLinkedList);
                endNode.next = nodeToBeInserted;
            }
        }

        //2.
        public Node findKey(int key) {
            if (!isEmpty()) {
                return findKey(headOfLinkedList, key);
            } else {
                System.out.println("List is empty");
                return null;
            }
        }

        //3.
        public void delete(int valueInNode) {
            if (!isEmpty()) {
                if (headOfLinkedList.getValueInNode() == valueInNode) {
                    headOfLinkedList = null;
                } else {
                    delete(headOfLinkedList, valueInNode);
                }
            } else {
                System.out.println("List is empty");
            }
        }

        public String display() {
            return display(headOfLinkedList);
        }

        public String display(Node headOfLinkedList) {
            if (headOfLinkedList == null) return "null";
            else {
                return headOfLinkedList.getValueInNode() + "->" + display(headOfLinkedList.getNext());
            }
        }

        //extra
        private Node findKey(Node headOfLinkedList, int valueInNode) {
            if (headOfLinkedList.getValueInNode() == valueInNode) {
                return headOfLinkedList;
            } else if (headOfLinkedList.getNext() == null) {
                System.out.println("Key Not found");
                return null;
            } else {
                return findKey(headOfLinkedList.getNext(), valueInNode);
            }
        }

        private void delete(Node headOfLinkedList, int valueInNode) {
            if (headOfLinkedList.getNext().getValueInNode() == valueInNode) {
                if (headOfLinkedList.getNext().getNext() == null) {
                    headOfLinkedList.setNext(null);
                } else {
                    headOfLinkedList.setNext(headOfLinkedList.getNext().getNext());
                }
            }
        }

        private Node findEnd(Node headOfLinkedList) {
            if (headOfLinkedList.next == null) {
                return headOfLinkedList;
            }
            return findEnd(headOfLinkedList.next);
        }

        public boolean isEmpty() {
            return headOfLinkedList == null;
        }
    }

    public static class Node {
        private int valueInNode;
        private Node next;

        public Node(int valueInNode) {
            this.valueInNode = valueInNode;
            this.next = null;
        }

        public int getValueInNode() {
            return valueInNode;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setValueInNode(int valueInNode) {
            this.valueInNode = valueInNode;
        }
    }
}