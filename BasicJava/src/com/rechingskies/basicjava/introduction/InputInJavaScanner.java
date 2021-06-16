package com.rechingskies.basicjava.introduction;


import java.util.Scanner;

public class InputInJavaScanner {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here : ");
        String st = sc.nextLine();
        System.out.print(st+"\nEnter number : ");
        int i = sc.nextInt();
        System.out.print(i);

    }
}
