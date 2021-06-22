package com.rechingskies.basicjava.arraysandstrings;

import java.util.Arrays;

public class MaximumInAnArray {
    public static void main(String [] args) {
        int [] arrayElements = {10, 20000, 30, 40, 2000};
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arrayElements.length; i++) {
            if(max < arrayElements[i])
                max = arrayElements[i];
        }
        System.out.println("Max element from array : "+ Arrays.toString(arrayElements)+" "+max);
    }
}
