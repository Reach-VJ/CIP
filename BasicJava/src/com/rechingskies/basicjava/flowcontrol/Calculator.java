package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter input\n" +
                "1 Addition\n" +
                "2 Subtraction\n" +
                "3 Multiplication");
        int operation = scanner.nextInt();
        int a = 0, b = 0;
        if(operation == 1 || operation == 2 || operation == 3) {
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        else {
            System.out.println("Please enter valid operation");
        }
        if(operation == 1)
            System.out.println(a+b);
        else if(operation == 2)
            System.out.println(a-b);
        else
            System.out.println(a*b);
    }
}
