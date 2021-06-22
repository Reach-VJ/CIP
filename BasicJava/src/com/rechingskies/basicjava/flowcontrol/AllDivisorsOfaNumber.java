package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class AllDivisorsOfaNumber {
    public static void main(String [] args) {
        //Naive solution O(n)
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Divisors of "+number+" are ");
        for(int i = 1; i <= number; i++) {
            if(number%i == 0)
                System.out.println(i);
        }

        //Efficient solution in ascending order: O(Square root of n)
        int i;
        System.out.println("Divisors of "+number+" are ");
        for(i = 1; i*i < number; i++) {
            if(number%i == 0)
                System.out.println(i);
        }
        for(;i>=1; i--) {
            if(number%i == 0)
                System.out.println(number/i);
        }

    }

}
