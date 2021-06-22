package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0) {
            System.out.println("Negative number");
            return;
        }
        System.out.println(num*(num+1)/2);
    }
}
