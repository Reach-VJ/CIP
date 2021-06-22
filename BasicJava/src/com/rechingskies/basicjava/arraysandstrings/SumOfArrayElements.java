package com.rechingskies.basicjava.arraysandstrings;

import java.util.Arrays;

public class SumOfArrayElements {
    public static void main(String [] args) {
        int [] arrayElements = { 10, 20, 30, 40, 50};
        int sum = 0;
        for(int element : arrayElements)
            sum +=element;
        System.out.println("Sum of array elements : "+ Arrays.toString(arrayElements)+"  is : "+sum);
    }
}
