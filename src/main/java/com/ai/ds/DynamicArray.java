package com.ai.ds;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * This is practice to add more ability to code
 * Array of Dynamic Array
 */
public class DynamicArray<E> implements Iterable<E> {

    private static final int DEFAULT_CAPACITY = 16;

    private int capacity;
    private int size;
    private Object[] elements;

    /**
     * DynamicArray Constructor
     *
     * @param capacity Capacity of element
     *
     */
    public DynamicArray(final int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.elements = new Object[this.capacity];
    }

    public DynamicArray(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * Method to add Element
     *
     * @param element needs to be added
     */
    public void addElements(final E element) {
        if (Objects.isNull(element)) {
            throw new NoSuchElementException("Null element can not be added");
        }
        if (this.elements.length == this.size) {
            this.elements = Arrays.copyOf(this.elements,newCapacity(2 * this.capacity));
        }
        this.elements[this.size] = element;
        size++;
    }

    /**
     *
     * @param index where element needs to be removed
     * @return element which is removed
     */
    public E remove(final int index){
        final E oldRemoveElement = get(index);
        fastRemove(this.elements,index);

        if (this.capacity < DEFAULT_CAPACITY && size * 4 <= this.capacity) {
            this.elements = Arrays.copyOf(this.elements, newCapacity(this.capacity / 2));
        }
        return oldRemoveElement;
    }

    public int getSize() {return this.size;}

    public boolean isEmpty() {return getSize() == 0;}

    public Stream<E> stream(){return StreamSupport.stream(spliterator(),false);}

    private void fastRemove(final Object[] elements,final int index) {
        final int newSize = this.size - 1;
        if (newSize > index) {
            System.arraycopy(elements,index + 1,elements,index,newSize - index);
        }
        elements[this.size = newSize] = null;
    }

    /**
     * put element to certain index
     *
     * @param index index of element to be placed
     * @param element element needs to be placed
     */
    public void put(final int index,E element) {
        this.elements[index] = element;
    }

    /**
     *
     * @param index
     * @return
     */
    public E get(final int index) {
        return (E) this.elements[index];
    }

    /**
     *
     * @param index
     * @return
     */
    public E getElement(final int index) {
        return get(index);
    }

    /**
     *
     * @param newCapacity
     * @return
     */
    private int newCapacity(int newCapacity) {
        this.capacity = newCapacity;
        return capacity;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}