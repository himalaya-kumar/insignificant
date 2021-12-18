package com.ai;

import org.bytedeco.javacpp.freenect;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Pack Consecutive Duplicates of list elements into sublist
 *
 */
public class Problem_09 {

    /**
     * For each approach
     *
     * @param list
     * @param <T>
     * @return
     */
    public static <T> List<List<T>> pack(List<T> list){
        T lastElement = null;
        List<List<T>> packedElement = new ArrayList<>();
        //temp array
        List<T> elements = new ArrayList<>();
        for (T el:list) {
            if (!Objects.equals(lastElement,el)) {
                elements = new ArrayList<>();
                packedElement.add(elements);
            }
            elements.add(el);
            lastElement = el;
        }
        return packedElement;
    }

    public static <T> List<List<T>> pack2(List<T> list) {
        T lastElement = null;
        List<List<T>> packedElement = new ArrayList<>();
        List<T> elements = new ArrayList<>();
        for (T el:list) {
            if (!Objects.equals(lastElement,el)){
                elements = new ArrayList<>();
                packedElement.add(elements);
            }
            elements.add(el);
            lastElement = el;
        }
        return packedElement;
    }
}