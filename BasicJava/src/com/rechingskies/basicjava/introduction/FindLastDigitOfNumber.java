package com.rechingskies.basicjava.introduction;

public class FindLastDigitOfNumber {
    public static void main(String [] args) {
        int number = 123;
        number = Math.abs(number);
        System.out.println("Last digit of 123 : "+number%10);
        number = -123;
        System.out.println("Last digit of -123 : "+Math.abs(number)%10);
    }
}
