package com.rechingskies.basicjava.flowcontrol;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'L':
                x--;
                break;
            case 'R' :
                x++;
                break;
            case 'U' :
                y++;
                break;
            case 'D' :
                y--;
                break;
            default :
                System.out.println("Invalid input");
        }
        System.out.println("X and Y values : "+x+" "+y);
    }
}
