package com.rechingskies.basicjava.arraysandstrings;

import java.util.Scanner;

public class ReverseOfString {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        StringBuilder reverseStr = new StringBuilder();
        int strLength = str.length()-1;
        while(strLength >= 0) {
            reverseStr = reverseStr.append(str.charAt(strLength));
            strLength--;
        }
        System.out.println(reverseStr);
    }
}
