package com.ai.ds;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Collections which does not allow to deletions only
 * insertions and iterate
 */
public class Bag<Element> implements Iterable<Element> {

    private Node<Element> firstElement; //first element of the bag
    private int size;

    private static class Node<Element> {
        private Element content;
        private Node<Element> nextElement;
    }

    public Bag(){
        firstElement = null;
        size = 0;
    }

    public void addElement(Element elementToBeAdded) {
        Node<Element> oldFirst = firstElement;
        firstElement = new Node<>();
        firstElement.content = elementToBeAdded;
        firstElement.nextElement = oldFirst;
        size++;
    }

    public boolean contains(Element element){
        for (Element value : this) {
            if (value.equals(element)) return true;
        }
        return false;
    }

    @Override
    public Iterator<Element> iterator() {
        return new ListIterator<>(firstElement);
    }

    /**
     *
     * @return Boolean
     */
    public boolean isEmpty() {
        return firstElement == null;
    }

    private class ListIterator<Elements> implements Iterator<Element> {
        private Node<Element> currentElement;

        public ListIterator(Node<Element> firstElement){
            currentElement = firstElement;
        }

        public boolean hasNext() {
            return currentElement != null;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("This Operation is not supported under BAG DS");
        }

        @Override
        public Element next() {
            if (!hasNext()) throw new NoSuchElementException();
            Element element = currentElement.content;
            currentElement = currentElement.nextElement;
            return element;
        }

    }
}
