package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class GreatestCommonDivisorGCD {
    public static void main(String [] args) {
        //GCD of two numbers :
        //1. Find minimum of two numbers
        //2. Iterate 1 to minimum and find the highest number which divides both numbers
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int minNum = Math.min(num1,num2);
        int ans = 1;
        for(int i = 2; i <= minNum; i++) {
            if(num1%i==0 && num2%i==0)
                ans = i;
        }
        System.out.println("GCD of : "+num1+" and "+num2+" is : "+ans);
    }
}
