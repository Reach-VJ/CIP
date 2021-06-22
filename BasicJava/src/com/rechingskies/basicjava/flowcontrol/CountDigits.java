package com.rechingskies.basicjava.flowcontrol;

public class CountDigits {
    public static void main(String [] args) {
        int num = 1345;
        int count = 0;
        System.out.println("Number of digits of "+num+" is : ");
        while(num > 0 ) {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
