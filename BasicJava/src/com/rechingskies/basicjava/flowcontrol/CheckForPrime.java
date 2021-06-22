package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number < 2)
            System.out.println("Please enter valid input");
        //Naive solution Time complexity : O(n)
        for(int i = 2; i < number; i++){
            if(number%i == 0) {
                System.out.println(number + " is composite number");
                return;
            }
        }
        System.out.println(number+ " is prime number");

        //Efficient solution : Time complexity : O(Square root of n)
        if(number == 1)
            System.out.println(number+ " is a composite number");
        if(number == 2 || number == 3)
            System.out.println(number+" is a prime number");

        if(number%2 == 0 || number%3 == 0) {
            System.out.println(number + " is a composite number");
            return;
        }

        for(int i = 5; i*i <= number; i=i+6) {
            if(number%i == 0 || number%(i+2) == 0)
                System.out.println(number + "is a composite number");
            return;
        }
        System.out.println(number +" is a prime number");
    }
}
