package com.ai.ds;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

/**
 * Stack using the linked list
 */
public class StackOfLinkedList {
    //Properties
    private Node head;
    private int size;

    public StackOfLinkedList(){
        head = null;
        size = 0;
    }

    public boolean push(int dataToBeInserted) {
        Node nodeToBeInserted = new Node(dataToBeInserted);
        //in stack everything is added at the top
        nodeToBeInserted.next = head;
        head = nodeToBeInserted;
        size++;
        return true;
    }

    //Pop from the head
    public int pop() {
        if (isEmpty()) throw new NoSuchElementException("Element is not present");
        Node destroy = head;
        int ret = destroy.data;
        head = head.next;
        destroy = null;
        size --;
        return ret;
    }

    public int peek(){
        if (isEmpty()) throw new NoSuchElementException("Element is not present");
        return head.data;
    }

    @Override
    public String toString() {
        Node currentHead = head;
        StringJoiner stringBuilder = new StringJoiner("->");
        while (currentHead != null) {
            stringBuilder.add(head.data+"");
            currentHead = head.next;
        }
        return stringBuilder.toString();
    }

    //extra
    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize(){
        return this.size;
    }

    static class Node{

        public int data;
        public Node next;

        public Node(int dataOfNode){
            this.data = dataOfNode;
            this.next = null;
        }
    }
}