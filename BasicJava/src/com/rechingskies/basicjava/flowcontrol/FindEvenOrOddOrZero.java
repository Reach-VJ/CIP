package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class FindEvenOrOddOrZero {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("Positive");
            if(num%2 == 0)
                System.out.print(" Even");
            else
                System.out.print(" Odd");
        }
        else if(num < 0) {
            System.out.println("Negative");
            if(num%2 == 0)
                System.out.print(" Even");
            else
                System.out.print(" Odd");
        }
        else
            System.out.println("Zero");
    }
}