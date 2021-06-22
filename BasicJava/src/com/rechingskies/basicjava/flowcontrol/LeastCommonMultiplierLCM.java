package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;
import java.util.zip.CheckedInputStream;

public class LeastCommonMultiplierLCM {
    public static void main(String [] args) {
        // LCM of two numbers :
        // 1. Find the multiplication of two numbers
        // 2. Find the max of two numbers and iterate and find the lowest number
        //    which is multiplier of both numbers.
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int highestMultiplier = num1 * num2;
        int minNumber = Math.min(num1,num2);
        int ans = highestMultiplier;
        for(int i = minNumber; i <= highestMultiplier; i++) {
            if(num1%i == 0 && num2%i == 0) {
                ans = i;
                break;
            }
        }
        System.out.println("LCM of two number : "+num1+" and "+num2+" is "+ans);
    }
}
