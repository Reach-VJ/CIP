package com.rechingskies.basicjava.arraysandstrings;

public class StringToDecimal {
    public static void main(String [] args) {
        String str = "1010";
        int m = 0;
        int k = 1;
        for(int i = str.length()-1; i>=0; i--) {
            m +=(str.charAt(i) - '0')*k;
            k = k*2;
        }
        System.out.println(str+" to "+m);
    }
}
