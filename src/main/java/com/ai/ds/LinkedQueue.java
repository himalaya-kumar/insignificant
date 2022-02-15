package com.ai.ds;

import java.util.NoSuchElementException;

public class LinkedQueue {

    static class Node {
        int data;
        Node next;

        public Node() {
            this(0);
        }

        public Node(int data) {
            this(data, null);

        }

        public Node(int data, Node next) {
            this.data = data;
        }
    }

    private Node frontOfQueue;

    private Node endOfQueue;

    private int size;

    public LinkedQueue () {
        frontOfQueue = endOfQueue = new Node();
    }

    //1.
    public boolean enqueue(int valueToBeAdded) {
        //1(1,2) => 2(2)
        Node nodeToBeAdded = new Node(valueToBeAdded);
        endOfQueue.next = nodeToBeAdded;
        endOfQueue = nodeToBeAdded;
        size++;
        return false;
    }

    //2.
    public int deQueue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is Empty");
        }
        Node destroy = frontOfQueue.next;
        int retValue = destroy.data;
        frontOfQueue.next = frontOfQueue.next.next;
        destroy = null;
        size --;
        if (isEmpty()) {frontOfQueue = endOfQueue;}
        return retValue;
    }

    //3.
    public int peekFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return frontOfQueue.next.data;
    }

    public int peekRear() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return endOfQueue.data;
    }

    public void clear() {
        while (!isEmpty()) {
            deQueue();
        }
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        Node currentNode = frontOfQueue.next;
        stringBuilder.append("[");
        while (currentNode!=null) {
            stringBuilder.append(currentNode.data).append(", ");
            currentNode = currentNode.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    //extra
    public int size () {
        return size;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}