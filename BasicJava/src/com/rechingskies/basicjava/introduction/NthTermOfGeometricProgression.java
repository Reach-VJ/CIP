package com.rechingskies.basicjava.introduction;

public class NthTermOfGeometricProgression {
    public static void main(String [] args) {
        //Formula : a* r power of n-1
        // Input : 2, 4, 8, 16, 32, need to find the 5th number
        int a = 2;
        int r = 2;
        int n = 5;
        int ans = a*(int)Math.pow(2,4);
        System.out.println("Nth term of Geometric progression : "+ans);
    }
}
