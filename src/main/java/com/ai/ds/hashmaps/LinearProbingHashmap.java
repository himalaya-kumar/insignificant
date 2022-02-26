package com.ai.ds.hashmaps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Objects;

public class LinearProbingHashmap {

    private static final Logger LOG = LoggerFactory.getLogger(LinearProbingHashmap.class);
    private int hashSize;
    private Integer[] buckets;
    private Integer AVAILABLE;
    private int size;

    public LinearProbingHashmap(int hashSize) {
        this.buckets = new Integer[hashSize];
        this.hashSize = hashSize;
        this.AVAILABLE = Integer.MIN_VALUE;
        this.size = 0;
    }

    public int hashing(int valueToBeAdded) {
        int hash = valueToBeAdded % hashSize;
        if (hash < 0) {
            hash += hashSize;
        }
        return hash;
    }

    //1.
    public void insert(int valueToBeAdded) {
        Integer wrappedInt = valueToBeAdded;
        int hash = hashing(valueToBeAdded);
        if (isFull()) {
            LOG.info("HashTable is Full");
        }
        for (int i = 0; i < hashSize; i++) {
            if (buckets[i] == null || Objects.equals(buckets[hash], AVAILABLE)) {
                buckets[hash] = wrappedInt;
                size++;
                return;
            }
            if (hash + 1 < hashSize) hash++;
            else hash = 0;
        }
    }

    //2.
    public void deleteHash(int valueToBeRemoved) {
        Integer wrappedInt = valueToBeRemoved;
        int hash = hashing(valueToBeRemoved);
        if (isEmpty()) {
            LOG.info("Table is Empty");
        }
        for (int i = 0; i < hashSize; i++) {
            if (buckets[hash] != null && buckets[hash].equals(wrappedInt)) {
                buckets[hash] = AVAILABLE;
                size--;
                return;
            }
            if (hash + 1 < hashSize) hash++;
            else hash = 0;
        }
        LOG.info("key {} is not found", valueToBeRemoved);
    }

    //3.
    public int findHash(int key) {
        Integer wrappedInt = key;
        int hash = hashing(key);
        if (isEmpty()) {
            LOG.info("Table is Empty");
        }
        for (int i = 0; i < hashSize; i++) {
            if (buckets[hash].equals(wrappedInt)) {
                buckets[hash] = AVAILABLE;
                return hash;
            }
            if (hash + 1 < hashSize) {
                hash++;
            } else hash = 0;
        }
        LOG.info("Key {} is not found", key);
        return -1;
    }

    public void checkLoadFactor() {
        double factor = (double) size / hashSize;
        if (factor > .7) {
            LOG.info("Load factor is {}, lengthening table", factor);
            lengthenTable();
        } else
            LOG.info("Load factor is {}", factor);
    }

    private void lengthenTable() {
        buckets = Arrays.copyOf(buckets, hashSize * 2);
        hashSize = hashSize * 2;
        LOG.info("Table is now: {}", hashSize);
    }

    public void displayHashTable() {
        for (int i = 0; i < hashSize; i++) {
            if (buckets[i] == null || Objects.equals(buckets[i], AVAILABLE)) {
                LOG.info("Bucket {} Empty", i);
            } else {
                LOG.info("Bucket {} : {}", i, buckets[i].toString());
            }
        }
    }

    private boolean isEmpty() {
        boolean response = true;
        for (int i = 0; i < hashSize; i++) {
            if (buckets[i] != null) {
                response = false;
                break;
            }
        }
        return response;
    }

    private boolean isFull() {
        boolean response = true;
        for (int i = 0; i < hashSize; i++) {
            if (buckets[i] == null || Objects.equals(buckets[i], AVAILABLE)) {
                response = false;
                break;
            }
        }
        return response;
    }
}