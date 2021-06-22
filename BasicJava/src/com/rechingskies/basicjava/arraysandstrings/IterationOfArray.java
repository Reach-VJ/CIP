package com.rechingskies.basicjava.arraysandstrings;

public class IterationOfArray {
    public static void main(String [] args) {
        int [] arrayElements = { 10, 20, 30, 40, 50};
        //Normal for loop
        System.out.println("Iterating array elements in normal way\n");
        for(int i = 0; i < arrayElements.length; i++)
            System.out.println(arrayElements[i]);
        //Enhanced for loop
        System.out.println("\nIterating array elements in enhanced for loop\n");
        for(int element : arrayElements)
            System.out.println(element);
    }
}
