package com.rechingskies.basicjava.introduction;

public class BitwiseOperators2 {
    public static void main(String [] args) {
        int x = 1;
        //Bitwise not : ~x (Inverse the bits) x : 0000 0001 ~x : 1111 1110.
        // 2 power 32 -x : 2 power 32 -1 -1 : 2 power 32 - 2. Answer is : -2
        System.out.println(~x);
        x = 3;
        System.out.println(~x);
        //Bitwise left shift : x <<1
        System.out.println(x<<2); //x : 0000 0011 x << 2 : 0000 1100 o/p : 12

        //Bitwise right shift : x >> 1 : Shift right to one bit, fill zeros at left side(not for -ve numbers).
        // Fill 1s at left side if number is negative.
        // x = 3 (0000 0011) x >>1 : 0000 0001 o/p : 1
        System.out.println(x>>1);
        x = -1;
        System.out.println(x>>1); //Right shift one bit, and fill 1s at left side to maintain negative number.
        //Bitwise unsigned right shift : Shift right to bits, fill zeros at left side for all numbers.
        System.out.println(x>>>1); // //Right shift one bit, and fill 0s at left side.
    }
}
