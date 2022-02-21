package com.ai.ds;

import java.util.StringJoiner;

public class SinglyLinkedList {
    private Node head;

    private int size;

    public SinglyLinkedList() {
        this.head = null;
        size = 0;
    }

    public SinglyLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }

    //1.2.
    public void insertNth(int data, int position) {
        checkBounds(position, 0, size);
        Node newNode = new Node(data);
        //two conditions
        // position is head == null
        if (head == null) {
            head = newNode;
        } else if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node currentNode = head;
            for (int i = 0; i < position - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
        size++;
    }

    public void insertFirst(int data) {
        insertNth(data, 0);
    }

    public void insertLast(int data) {
        insertNth(data, size);
    }

    public void append(int data) {
        insertLast(data);
    }

    //3.
    public void deleteNth(int position) {
        checkBounds(position, 0, size);
        if (position == 0) {
            Node destroy = head;
            head = head.next;
            destroy = null;
            size--;
            return;
        }
        Node currentNode = head;
        for (int i = 0; i < position - 1; i++) {
            currentNode = currentNode.next;
        }
        Node destroy = currentNode.next;
        currentNode.next = currentNode.next.next;
        destroy = null;
        size--;
    }

    public void delete() {
        deleteNth(size - 1);
    }

    public void deleteHead() {
        deleteNth(0);
    }

    //4.
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.value == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int getNth(int position) {
        checkBounds(position, 0, size - 1);
        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current.value;
    }

    //extra
    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("->");
        Node current = head;
        while (current != null) {
            joiner.add(current.value + "");
            current = current.next;
        }
        return joiner.toString();
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public Node getHead() {
        return this.head;
    }

    public int count() {
        int countValue = 0;
        Node current = head;
        while (current != null) {
            countValue++;
            current = current.next;
        }
        return countValue;
    }

    public void clear() {
        Node curr = head;
        while (curr != null) {
            Node pre = curr;
            curr = curr.next;
            pre = null;
        }
        head = null;
        size = 0;
    }

    Node reverseList(Node nodeOfHead) {
        Node prev = null, current = nodeOfHead, nextTemporary;
        while (current != null) {
            // 1{1,2} -> 2{2,3} -> 3
            nextTemporary = current.next;
            current.next = null;
            prev = current;
            current = nextTemporary;
        }
        nodeOfHead = prev;
        return nodeOfHead;
    }

    public void swapNodes(int a, int b) {
        Node currentNode = head;
        Node temp = null;
        while (currentNode != null) {
            if (currentNode.next.value == a) {
                temp = currentNode.next;
            }
            if (currentNode.next.value == b) {
                currentNode.next = temp;
            }
            currentNode = currentNode.next;
        }
    }

    public boolean detectLoop() {
        Node currentNodeFast = head;
        Node currentNodeSlow = head;
        boolean flag = false;
        while (currentNodeFast != null && currentNodeFast.next != null && currentNodeSlow != null && currentNodeSlow.next != null) {
            currentNodeFast = currentNodeFast.next.next;
            currentNodeSlow = currentNodeSlow.next;
            if (currentNodeSlow == currentNodeFast) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private void checkBounds(int position, int low, int high) {
        if (position > high || position < low)
            throw new IndexOutOfBoundsException(position + "");
    }
}

class Node {
    int value;
    Node next;

    Node() {
    }

    Node(int value) {
        this(value, null);
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}