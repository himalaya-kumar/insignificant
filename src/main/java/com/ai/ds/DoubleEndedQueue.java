package com.ai.ds;

/**
 *
 */
public class DoubleEndedQueue<T> {

    //Properties
    private DoubleEndedQueueNode<T> headOfDoubleEndedQueue = null;

    private DoubleEndedQueueNode<T> tailOfDoubleEndedQueue = null;

    int size = 0;

    //1.
    public void addFirst(T valueToBeAddedAtFirst) {
        DoubleEndedQueueNode<T> nodeToBeAddedAtFirst = new DoubleEndedQueueNode<>(valueToBeAddedAtFirst);
        if (headOfDoubleEndedQueue == null) {
            headOfDoubleEndedQueue = nodeToBeAddedAtFirst;
            tailOfDoubleEndedQueue = nodeToBeAddedAtFirst;
        } else {
            nodeToBeAddedAtFirst.next = headOfDoubleEndedQueue;
            headOfDoubleEndedQueue.previous = nodeToBeAddedAtFirst;
            headOfDoubleEndedQueue = nodeToBeAddedAtFirst;
        }
        size++;
    }

    public void addLast(T valueToBeAddedAtLast) {
        DoubleEndedQueueNode<T> nodeToBeAddedAtLast = new DoubleEndedQueueNode<>(valueToBeAddedAtLast);
        if (tailOfDoubleEndedQueue == null) {
            headOfDoubleEndedQueue = nodeToBeAddedAtLast;
        } else {
            nodeToBeAddedAtLast.previous = tailOfDoubleEndedQueue;
            tailOfDoubleEndedQueue.next = nodeToBeAddedAtLast;
        }
        tailOfDoubleEndedQueue = nodeToBeAddedAtLast;
        size++;
    }

    //2.
    public T pollFirst() {
        T nodeToBeRemoved = headOfDoubleEndedQueue.valueOfDoubleEndedQueueNode;
        if (nodeToBeRemoved == null) return null;

        if (headOfDoubleEndedQueue == tailOfDoubleEndedQueue) {
            headOfDoubleEndedQueue = null;
            tailOfDoubleEndedQueue = null;
        } else {
            headOfDoubleEndedQueue.next.previous = null;
            DoubleEndedQueueNode<T> oldHead = headOfDoubleEndedQueue;
            headOfDoubleEndedQueue = headOfDoubleEndedQueue.next;
            oldHead.next = null;
        }
        size --;
        return nodeToBeRemoved;
    }

    public T pollLast() {
        T valueAtLast = tailOfDoubleEndedQueue.valueOfDoubleEndedQueueNode;
        if (valueAtLast == null) return null;
        if (headOfDoubleEndedQueue == tailOfDoubleEndedQueue) {
            headOfDoubleEndedQueue = null;
            tailOfDoubleEndedQueue = null;
        } else {
            tailOfDoubleEndedQueue.previous.next = null;
            DoubleEndedQueueNode<T> oldTail = tailOfDoubleEndedQueue;
            tailOfDoubleEndedQueue = tailOfDoubleEndedQueue.previous;
            oldTail.previous = null;
        }
        size --;
        return valueAtLast;
    }
    public T peekFirst() {
        return headOfDoubleEndedQueue.valueOfDoubleEndedQueueNode;
    }

    public T peekLast() {
        return tailOfDoubleEndedQueue.valueOfDoubleEndedQueueNode;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return headOfDoubleEndedQueue == null;
    }

    @Override
    public String toString() {

        StringBuilder deQueueString = new StringBuilder("Head ->");
        DoubleEndedQueueNode<T> currentNode = headOfDoubleEndedQueue;
        while (currentNode != null) {
            deQueueString.append(currentNode.valueOfDoubleEndedQueueNode);
            if (currentNode.next != null) {
                deQueueString.append("<->");
            }
            currentNode = currentNode.next;
        }
        deQueueString.append("<- Tail");
        return deQueueString.toString();
    }

    static class DoubleEndedQueueNode<E> {
        E valueOfDoubleEndedQueueNode;
        DoubleEndedQueueNode<E> next = null;
        DoubleEndedQueueNode<E> previous = null;
        public DoubleEndedQueueNode(E valueOfDoubleEndedQueueNode) {
            this.valueOfDoubleEndedQueueNode = valueOfDoubleEndedQueueNode;
        }
    }

}