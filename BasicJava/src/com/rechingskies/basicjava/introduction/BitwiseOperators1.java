package com.rechingskies.basicjava.introduction;

public class BitwiseOperators1 {
    public static void main(String[] args) {
        int x = 3; // 0000 0011
        int y = 6; // 0000 0110
        System.out.println(x & y); // o/p : 0000 0010 (2)
        System.out.println(x | y); // o/p : 0000 0111 (7)
        System.out.println(x ^ y); // o/p : 0000 0101 (5)
    }
}
