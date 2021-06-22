package com.rechingskies.basicjava.arraysandstrings;

public class DecimalToBinary {
    public static void main(String [] args) {
        String str = "";
        int num = 10;
        int temp = num;
        while(temp > 0) {
            str = temp%2+str;
            temp = temp/2;
        }
        System.out.println(num+" to "+str);
    }
}
