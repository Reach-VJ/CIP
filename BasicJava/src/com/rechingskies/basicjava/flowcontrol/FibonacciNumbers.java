package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number < 0)
            System.out.println("Please enter valid input");
        if(number == 0)
            System.out.println(1);
        if(number >= 1)
            System.out.print(1+" "+1+" ");
        int a = 1; int b = 1;
        int c;
        for(int i = 2; i<=number; i++) {
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
