package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class FirstDigitOfNumber {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = number;
        System.out.println("First digit of "+number+" is ");

        //Naive solution
        while(number > 10) {
            number = number/10;
        }
        System.out.println(number);

        //Different solution
        System.out.println("First digit of "+temp+" is ");
        int power = (int)Math.log10(temp);
        int a = (int) Math.pow(10,power);
        System.out.println(temp/1000);


    }
}
