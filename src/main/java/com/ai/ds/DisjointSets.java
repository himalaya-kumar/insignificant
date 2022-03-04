package com.ai.ds;

public class DisjointSets<T> {

    public Node<T> makeSet(T x) {
        return new Node<>(x);
    }

    public Node<T> findSet(Node<T> node) {
        if (node != node.parent) {
            node.parent = findSet(node.parent);
        }
        return node.parent;
    }

    public static class Node<T> {
        public int rank;
        public Node<T> parent;
        public T data;

        public Node(T data) {
            this.data = data;
            parent = this;
        }
    }
}