package com.ai.ds;

/**
 * This Class implements Stack using regular array
 */
public class StackArray {

    //Properties
    private static final int DEFAULT_CAPACITY = 10;
    private int maxSize;
    private int[] stackArray;
    private int topPosition;

    public StackArray() {
        this(DEFAULT_CAPACITY);
    }

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        topPosition = -1;
    }

    //1.
    public void push(int value) {
        if (!isFull()) {
            topPosition++;
            stackArray[topPosition] = value;
        } else {
            resize(maxSize * 2);
            push(value);
        }
    }

    //2.
    public int pop() {
        if (!isEmpty()) {
            return stackArray[topPosition --];
        }
        if (topPosition > maxSize/4) {
            resize(maxSize / 2);
            return pop();
        } else {
            return -1;
        }
    }

    //3.
    public int peek() {
        if (!isEmpty()) {
            return stackArray[topPosition];
        } else {
            return -1;
        }
    }

    //extra
    private void resize(int newSize) {
        int[] transferArray = new int[newSize];
        System.arraycopy(stackArray, 0, transferArray, 0, stackArray.length);
//        for (int i = 0; i < stackArray.length; i++) {
//            transferArray[i] = stackArray[i];
//        }
        stackArray = transferArray;
        maxSize = newSize;
    }

    public boolean isFull() {
        return (topPosition + 1 == maxSize);
    }

    public boolean isEmpty() {
        return topPosition == -1;
    }

    /**
     *
     */
    public void makeEmpty() {
        topPosition = -1;
    }

    public int size() {
        return topPosition + 1;
    }
}