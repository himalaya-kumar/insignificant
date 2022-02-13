package com.ai.ds;

import java.util.Objects;

public class CursorLinkedList<T> {

    private static class Node<T> {

        T element;
        int next;

        Node(T element,int next) {
            this.element = element;
            this.next = next;
        }
    }

    private final int os;
    private int head;
    private final Node<T> [] cursorSpace;
    private int count;
    private static final int CURSOR_SPACE_SIZE = 100;

    {
        //init at Loading time
        cursorSpace = new Node[CURSOR_SPACE_SIZE];
        for (int i = 0; i < CURSOR_SPACE_SIZE; i++) {
            cursorSpace[i] = new Node<>(null,i + 1);
        }
        cursorSpace[CURSOR_SPACE_SIZE - 1].next = 0;
    }

    public CursorLinkedList() {
        os = 0;
        count = 0;
        head = -1;
    }

    //1.
    public void append(T element) {
        Objects.requireNonNull(element);
        int availableIndex = alloc();
        cursorSpace[availableIndex].element = element;

        if (head == -1){
            head = availableIndex;
        }

        int interator = head;
        while (cursorSpace[interator].next != -1) {
            interator = cursorSpace[interator].next;
        }
        cursorSpace[interator].next = availableIndex;
        cursorSpace[availableIndex].next = -1;
        count++;
    }

    //extra
    /**
     * @return the index of the next available node
     */
    private int alloc() {
        //1. get the index at which the os is pointing
        int availableNodeIndex = cursorSpace[os].next;

        if (availableNodeIndex == 0) throw new OutOfMemoryError();

        int availableNext = cursorSpace[availableNodeIndex].next;
        cursorSpace[os].next = availableNext;
        cursorSpace[availableNodeIndex].next = -1;
        return availableNodeIndex;
    }
}
