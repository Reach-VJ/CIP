package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String [] args) {
        int x,y,z;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        if(x >= y && x >= z) {
            System.out.println(x);
        }
        else if(y >= z && y >= x) {
            System.out.println(y);
        }
        else {
            System.out.println(z);
        }

        //Another way
        System.out.println(Math.max(Math.max(x, y),z));
    }
}
