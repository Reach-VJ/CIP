package com.rechingskies.basicjava.arraysandstrings;

import java.util.Scanner;

public class CheckForPalindrome {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = 0;
        int j = str.length()-1;
        while(i <= j) {
            if(str.charAt(i) != str.charAt(j)) {
                System.out.println(str + " not a Palindrome");
                return;
            }
            else {
                i++;
                j--;
            }
        }
        System.out.println(str+" is a Palindrome");
    }
}
