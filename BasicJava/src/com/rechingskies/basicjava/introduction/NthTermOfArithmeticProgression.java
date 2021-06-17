package com.rechingskies.basicjava.introduction;

public class NthTermOfArithmeticProgression {
    public static void main(String [] args) {
        //Formula : a + (n-1) d
        // Input : 2, 3, 4, 5,6, need to find the 5th number
        int a = 2;
        int d = 1;
        int ans = 2+(5-1)*1;
        System.out.println("Nth term of arithmetic progression : "+ans);
    }
}
