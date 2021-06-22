package com.rechingskies.basicjava.flowcontrol;

public class TableOfNumber {
    public static void main(String [] args) {
        int num = 3;
        int i = 1;
        while(i < 11) {
            System.out.println(num+ " x "+i+" = "+i*num);
            i++;
        }
        for(int j = 1; j <= 10; j++) {
            System.out.println(num+" x "+j+" = "+j*num);
        }
    }
}
