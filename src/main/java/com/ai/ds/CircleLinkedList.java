package com.ai.ds;

import static java.lang.String.format;

public class CircleLinkedList<E> {
    private int size;
    private Node<E> head = null;
    private Node<E> tail = null;


    public CircleLinkedList() {
        head = new Node<>(null, head);
        tail = head;
        size = 0;
    }

    //1. Insert
    public void append(E value) {
        if (value == null) {
            throw new IllegalArgumentException("This is close to Null Pointer exception");
        }
        if (tail == null) {
            tail = new Node<>(value, head);
            head.next = tail;
        } else {
            tail.next = new Node<>(value, head);
            tail = tail.next;
        }
        ++size;
    }

    //2.
    public E delete(int position){
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException(format("Position = %s, size = 0 to %s",position,size));
        }
        Node<E> current = head; //previous node with respect to node to destroy
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        Node<E> destroyNode = current.next;
        E destroyValue = destroyNode.value;
        current.next = current.next.next;
        if (destroyNode == tail) tail = current;
        destroyNode = null;
        --size;
        return destroyValue;
    }
    //extra
    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        Node<E> p = head.next;
        StringBuilder s = new StringBuilder("[ ");
        while (p!=head) {
            s.append(p.value);
            s.append(" , ");
            p = p.next;
        }
        return s + " ]";
    }
    private static class Node<E> {
        Node<E> next;
        E value;

        private Node(E value, Node<E> next) {
            this.next = next;
            this.value = value;
        }
    }
}
