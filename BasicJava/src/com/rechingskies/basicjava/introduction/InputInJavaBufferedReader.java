package com.rechingskies.basicjava.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputInJavaBufferedReader {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your input");
        String st = br.readLine();
        System.out.println("You entered : " + st);
        System.out.println("Enter number  ");
        int i = Integer.parseInt(br.readLine());
        System.out.print("Entered number : "+i);
    }
}
