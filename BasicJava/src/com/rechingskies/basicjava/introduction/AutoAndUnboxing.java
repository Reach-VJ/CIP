package com.rechingskies.basicjava.introduction;

public class AutoAndUnboxing {
    public static void main(String [] args) {
        int x1 = 10;
        Integer x2 = x1;
        Integer x3 = new Integer(20);
        int x4 = x3;
        System.out.println("Printing values after auto and unboxing : "+x2+" "+x4);
    }
}
