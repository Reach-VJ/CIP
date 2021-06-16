package com.rechingskies.basicjava.introduction;

public class ExplicitOrWidening {
    public static void main(String [] args) {
        int i = 100;
        long l = i;
        System.out.println("Printing values after widening : "+i+" "+l);
    }
}
