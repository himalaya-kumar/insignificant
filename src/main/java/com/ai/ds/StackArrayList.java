package com.ai.ds;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Stack using the Collections -> Arraylist
 *
 */
public class StackArrayList {

    private final ArrayList<Integer> stack;

    public StackArrayList() {
        stack = new ArrayList<>();
    }

    //1.
    public void push(int valueToBePushed) {
        stack.add(valueToBePushed);
    }

    //2.
    public int pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    //3.
    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    //extra
    public boolean isEmpty() {
        return stack.isEmpty();
    }

}