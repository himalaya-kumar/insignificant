package com.ai.ds;

public class BinarySearch {


    public <T extends Comparable<T>> int find(T[] arrayOfData, T keyNeedsToBeFind) {

        return search(arrayOfData,keyNeedsToBeFind,0,arrayOfData.length);
    }

    private <T extends Comparable<T>> int search(T[] arrayOfData,T keyNeedToBeFound,int leftEndOfQueue,int rightEndOfQueue) {
        // As data is sorted we can compare left end with right end
        if (rightEndOfQueue < leftEndOfQueue) {
            return -1;//And the key is not found
        }
        //find median
        int median = (leftEndOfQueue + rightEndOfQueue) >>> 1;
        int compare = keyNeedToBeFound.compareTo(arrayOfData[median]);
        if (compare == 0) {
            return median;
        } else if (compare < 0) {
            return search(arrayOfData,keyNeedToBeFound,leftEndOfQueue,median -1);
        } else {
            return search(arrayOfData,keyNeedToBeFound,median +1,rightEndOfQueue);
        }
    }
}