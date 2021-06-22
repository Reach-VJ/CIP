package com.rechingskies.basicjava.flowcontrol;

public class ContinueAndBreak {
    public static void main(String [] args) {
        // Continue : skip the iteration and continue.
        // Break : break the loop
        for(int i = 0; i < 5; i++) {
            if(i == 3)
                continue;
            System.out.println(i);
        }
        for(int i = 0; i < 5; i++) {
            if(i == 3)
                break;
            System.out.println(i);
        }
    }
}
