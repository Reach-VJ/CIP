package com.rechingskies.basicjava.arraysandstrings;

import java.util.Arrays;

public class IsArraySorted {
    public static void main(String [] args) {
        int [] arrayElements = {10, 20, 10, 40, 50, 60, 70};
        for(int i = 1; i < arrayElements.length; i++) {
            if(arrayElements[i] < arrayElements[i-1]) {
                System.out.println("Array : " + Arrays.toString(arrayElements) + " not sorted");
                return;
            }
        }
        System.out.println("Array : " + Arrays.toString(arrayElements) + " sorted");
    }
}
