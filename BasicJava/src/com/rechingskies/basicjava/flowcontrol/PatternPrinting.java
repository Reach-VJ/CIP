package com.rechingskies.basicjava.flowcontrol;

public class PatternPrinting {
    public static void main(String [] args) {
        int num = 4;
        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print(" "+i+" ");
            }
            System.out.println();
        }
    }
}
