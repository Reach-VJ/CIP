package com.rechingskies.basicjava.introduction;

public class BitwiseOperators2 {
    public static void main(String [] args) {
        int x = 1;
        //Bitwise not : ~x (Inverse the bits) x : 0000 0001 ~x : 1111 1110.
        // 2 power 32 -x : 2 power 32 -1 -1 : 2 power 32 - 2. Answer is : -2
        System.out.println(~x);
        x = 3;
        System.out.println(~x);
    }
}
