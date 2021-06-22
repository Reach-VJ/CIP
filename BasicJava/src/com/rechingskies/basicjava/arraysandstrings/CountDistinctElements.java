package com.rechingskies.basicjava.arraysandstrings;

import java.util.Arrays;

public class CountDistinctElements {
    public static void main(String [] args) {
        int [] arrayElements = {10, 20, 30, 10, 50, 10, 20, 30, 70, 80};
        int count = 0;
        boolean isDistinct = true;

        for(int i = 0; i < arrayElements.length; i++) {
            isDistinct = true;
            for(int j = 0; j < arrayElements.length; j++) {
                if(i != j && arrayElements[i] == arrayElements[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct)
                count++;
        }
        System.out.println("Distinct elements count of "+ Arrays.toString(arrayElements) +" is "+count);
    }
}
