package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String [] args) {
        // Formula to print spaces = n-i (n = rows, i = specific row)
        // Formula to print *s = 2i-1 (i = specific row)
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        while(i <= num) {
            int j = 1;
            while(j <= (num-i)) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            while(k <= (2*i-1)) {
                System.out.print("*");
                k++;
            }
            i++;
            System.out.println();
        }
    }
}
