package com.ai.ds;


import java.util.ArrayList;

public class GenericArrayListQueue<T> {

    private ArrayList<T> _queue = new ArrayList<>();

    //1.
    public boolean add(T element) {
        return _queue.add(element);
    }

    //2.
    public T pull() {
        T result = null;
        if (this.hasElement()) {
            result = _queue.remove(0);
        }
        return result;
    }

    //3.
    public T peek() {
        T result = null;
        if (this.hasElement()) result = _queue.get(0);
        return result;
    }

    //Other
    private boolean hasElement() {return !_queue.isEmpty();}
}
