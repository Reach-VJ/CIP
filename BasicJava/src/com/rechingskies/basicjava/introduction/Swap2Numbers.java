package com.rechingskies.basicjava.introduction;

public class Swap2Numbers {
    public static void main(String [] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Printing numbers after swapping : a : "+a+", b : "+b);
    }
}
