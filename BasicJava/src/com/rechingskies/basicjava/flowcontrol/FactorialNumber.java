package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String [] args) {
        // n factorial : n*n-1*n-2....*1
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial = 1;
        System.out.print("Factorial of : "+num+" is : ");
        while(num > 0) {
            factorial = factorial * num;
            num--;
        }
        System.out.print(factorial);
    }
}
