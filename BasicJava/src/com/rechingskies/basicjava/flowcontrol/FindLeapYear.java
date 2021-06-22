package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String [] args) {
        //Leap Year :
        // Rule 1 : divisible by 4 and not divisible by 100
        // Rule 2 : Divisible by 400
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((num%4 == 0 && num%100 != 0) || num%400 == 0)
            System.out.println("Leap Year : "+ num);
        else
            System.out.println("Not a leap year : "+num);
    }
}
