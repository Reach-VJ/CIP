package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        for(int i = 2; i < number; i++) {
            if(isPrime(i)) {
                int x = i;
                while(number%x == 0) {
                    System.out.print(i+" ");
                    x = x*i;
                }
            }
        }
    }
    static boolean isPrime(int num) {
        if(num == 1)
            return false;
        if(num == 2 || num == 3)
            return true;
        if(num%2 == 0 || num%3 == 0)
            return false;
        for(int i = 5; i*i <= num; i=i+6) {
            if(num%i == 0 || num%(i+2) == 0)
                return false;
        }
        return true;
    }
}
