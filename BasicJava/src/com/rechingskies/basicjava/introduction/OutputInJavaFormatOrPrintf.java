package com.rechingskies.basicjava.introduction;

public class OutputInJavaFormatOrPrintf {
    public static void main(String[] args) {
        int x = 10;
        int y = 100;
        float pi = 3.14f;
        System.out.format("Print x value %d\n", x);
        System.out.format("Print x and y values %d %d\n", x, y);
        System.out.format("Print pi value %.2f\n", pi); //Print 2 digits after .
        System.out.format("Print pi value %5.2f\n", pi); //print total 5 chars, fill with empty char if there are below 5.
        System.out.format("Print pi value %05.2f\n", pi); //Print total 5 chars, fill zero char if there are below 5.

    }
}
