package com.rechingskies.basicjava.introduction;

public class ImplicitOrNarrowing {
    public static void main(String [] args) {
        long l = 200;
        int i = (int)l;
        System.out.println("Printing values after narrowing : "+l+" "+i);
    }
}
