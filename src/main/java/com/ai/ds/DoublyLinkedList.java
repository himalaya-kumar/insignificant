package com.ai.ds;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.StringJoiner;

import static java.lang.String.format;

public class DoublyLinkedList {

    private Link head;
    private Link tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //1.
    public void insertHead(int x) {

        Link newHeadLink = new Link(x);//Head.previous does not have value

        if (isEmpty()) {
            tail = newHeadLink;
        } else {
            head.previous = newHeadLink; //newHeadLink <-- currentHead
        }
        newHeadLink.next = head;
        head = newHeadLink;
        ++size;
    }

    public void insertTail(int x) {
        Link newTailLink = new Link(x);
        newTailLink.next = null;

        if (isEmpty()) {
            tail = newTailLink;
            head = tail;
        } else {
            tail.next = newTailLink;
            newTailLink.previous = tail;
            tail = newTailLink;
        }
        ++size;
    }

    public void insertElementByIndex(int x, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException(format("Index = %s,Size = %s", index, size));
        }
        if (index == 0) {
            insertHead(x);
        } else if (index == size) {
            insertTail(x);
        } else {
            Link linkToBeInserted = new Link(x);
            Link previousLink = head;//previous Link Of linkTobeInserted
            for (int i = 1; i < index; i++) {
                previousLink = previousLink.next;
            }
            // => 1 => 2 =>
            // => 1 => linkToBeInserted => 2
            // (previousLink.next = 2).previous = linkToBeInserted
            previousLink.next.previous = linkToBeInserted;

            linkToBeInserted.next = previousLink.next;
            linkToBeInserted.previous = previousLink;
            previousLink.next = linkToBeInserted;
        }
        size++;
    }

    public void insertIfDoublyIsOrdered(int valueToBeInserted) {
        Link linkToBeInserted = new Link(valueToBeInserted);
        Link currentLink = head;
        while (currentLink != tail && valueToBeInserted > currentLink.value) {
            currentLink = currentLink.next;
        }
        if (currentLink == head) insertHead(valueToBeInserted);
        else if (currentLink == null) insertTail(valueToBeInserted);
        else {
            linkToBeInserted.previous = currentLink.previous;
            currentLink.previous.next = linkToBeInserted;
            linkToBeInserted.next = currentLink;
            currentLink.previous = linkToBeInserted;
        }
        ++size;
    }

    //2.
    public Link deleteHead() {
        Link temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.previous = null;
        }
        --size;
        return temp;
    }

    public Link deleteTail() {
        Link temp = tail;
        tail = tail.previous;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
        --size;
        return temp;
    }

    /**
     * Delete the value from Doubly Linked List
     *
     * @param valueToBeDeleted Value to be deleted
     */
    public void delete(int valueToBeDeleted) {
        Link currentLink = head;

        while (currentLink.value != valueToBeDeleted) {
            if (currentLink != tail) currentLink = currentLink.next;
            else throw new RuntimeException(format("%s is not present present in DoublyLinkedList", valueToBeDeleted));
        }
        if (currentLink == head) deleteHead();
        else if (currentLink == tail) deleteTail();
        else {
            currentLink.previous.next = currentLink.next;
            currentLink.next.previous = currentLink.previous;
        }
        --size;
    }

    public void deleteNode(Link linkToBeRemoved) {
        if (linkToBeRemoved.next == null) {
            deleteTail();
        } else if (linkToBeRemoved == tail) {
            linkToBeRemoved.previous.next = linkToBeRemoved.next;
            linkToBeRemoved.next.previous = linkToBeRemoved.previous;
        }
        --size;
    }

    public void deleteDuplicates(DoublyLinkedList linkedList) {
        Link linkOne = linkedList.head;
        while (linkOne.next != null) {
            Link linkTwo = linkOne.next;
            while (linkTwo.next != null) {
                if (linkOne.value == linkTwo.value) {
                    linkedList.delete(linkTwo.value);
                }
                linkTwo = linkTwo.next;
            }
            linkOne = linkOne.next;
        }
    }

    //extra
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Reverse the list in place
     *
     */
    public void reverse () {
        Link thisHead = this.head;
        Link thisTail = this.tail;

        this.head = thisTail;
        this.tail = thisHead;

        Link nextLink = thisHead;
        while (nextLink != null) {
            Link nextLinkNext = nextLink.next;
            Link nextLinkPrevious = nextLink.previous;
            nextLink.next = nextLinkPrevious;
            nextLink.previous = nextLinkNext;
            nextLink = nextLinkNext;
        }
    }

    public void clearList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Prints the content of the list
     *
     */
    public void display() {
        Link current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Prints the contents of the list in the reverse order
     *
     */
    public void displayBackwards() {
        Link currentLink = tail;
        while (currentLink != null) {
            currentLink.displayLink();
            currentLink = currentLink.previous;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("<=>");
        Link current = head;
        while (current != null) {
            stringJoiner.add(""+current.value);
            current = current.next;
        }
        return stringJoiner.toString();
    }
}

class Link {
    /**
     * Properties
     */
    private static final Logger LOG = LoggerFactory.getLogger(Link.class);
    public int value;
    public Link next;
    public Link previous;

    public Link(int value) {
        this.value = value;
    }

    public void displayLink() {
        LOG.info(value + "");
    }
}