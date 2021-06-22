package com.rechingskies.basicjava.arraysandstrings;

import java.util.Scanner;

public class UserInputToArray {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int [] arrayElements = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            arrayElements[i] = scanner.nextInt();
        }
        for(int element : arrayElements) {
            System.out.println(element);
        }
    }
}
