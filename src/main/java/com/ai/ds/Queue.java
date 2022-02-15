package com.ai.ds;

import java.util.Arrays;

/**
 * First in first out
 * enqueue  = insert
 * dequeue  = delete
 */
public class Queue {
    //Properties
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Max size of the queue
     */
    private int maxSize;
    /**
     * The array representing the queue
     */
    private int[] queueArray;
    /**
     * Front of the Queue
     */
    private int frontOfQueue;
    /**
     * End of the Queue
     */
    private int endOfQueue;
    /**
     * No of items in queue
     */
    private int numberOfItems;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * @param size Size needs to be initialized
     */
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[size];
        frontOfQueue = 0;
        endOfQueue = -1;
        numberOfItems = 0;
    }

    //1.
    public boolean insert(int valueToBeInserted) {
        if (isFull()) return false;
        endOfQueue = (endOfQueue + 1) % maxSize;//0 -> 1 -> 2 this will never cross the max size
        queueArray[endOfQueue] = valueToBeInserted;
        ++numberOfItems;
        return true;
    }

    //2.
    public int remove(){
        if (isEmpty()) {
            return -1;
        }
        int temp = queueArray[frontOfQueue];
        queueArray[frontOfQueue] = 0;
        frontOfQueue = (frontOfQueue + 1) % maxSize; //will give 0 1 2
        numberOfItems--;
//        queueArray = Arrays.stream(queueArray).filter(i -> i != 0).toArray();
        return temp;
    }

    //extra
    public boolean isEmpty() {
        return numberOfItems == 0;
    }

    public boolean isFull() {
        return numberOfItems == maxSize;
    }

    public int peekFront() {
        return queueArray[frontOfQueue];
    }

    public int peekRear() {
        return queueArray[endOfQueue];
    }

    public int getSize() {
        return numberOfItems;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = frontOfQueue;; i = ++i % maxSize) {
            stringBuilder.append(queueArray[i]).append(", ");
            if (i == endOfQueue) break;
        }
        stringBuilder.replace(stringBuilder.length() - 2,stringBuilder.length(),"]");
        return stringBuilder.toString();
    }
}