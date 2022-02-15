package com.ai.ds;

/**
 * Priority Queue
 * Queue of elements from priortiy
 *
 */
public class PriorityQueue {

    //Props
    private int maxSize;
    private int[] queueArray;
    private int numberOfItems;

    //Init
    public PriorityQueue(int size) {
        this.maxSize = size;
        queueArray = new int[maxSize];
        numberOfItems = 0;
    }

    //1.
    public void insert(int valueToBeInserted) {
        if (isFull()) {
            throw new RuntimeException("Queue is Full");
        } else {
            int j = numberOfItems - 1;
            while (j >= 0 && queueArray[j] > valueToBeInserted) {
                queueArray[j + 1] = queueArray[j];
                j --;
            }
            queueArray[j + 1] = valueToBeInserted;
            numberOfItems++;
        }
    }

    //2.
    public int remove() {
        return queueArray[--numberOfItems];
    }

    //3.
    public int peek() {
        return queueArray[numberOfItems - 1];
    }

    //extra
    public boolean isFull() {
        return numberOfItems == maxSize;
    }

    public boolean isEmpty() {
        return numberOfItems == maxSize;
    }

    public int getNumberOfItems () {
        return numberOfItems;
    }
}