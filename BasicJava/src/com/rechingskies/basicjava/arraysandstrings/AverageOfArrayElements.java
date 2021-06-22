package com.rechingskies.basicjava.arraysandstrings;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArrayElements {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] arrayElements = new int[size];
        for(int i = 0; i < size; i++) {
            arrayElements[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int element : arrayElements) {
            sum +=element;
        }
        System.out.println("Average of array elements : "+ Arrays.toString(arrayElements)+" is "
                +(sum/arrayElements.length));
    }
}
