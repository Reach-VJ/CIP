package com.rechingskies.basicjava.introduction;

public class CommandLineArguments {
    public static void main(String [] args) {
        if(args.length > 0) {
            System.out.println("Arguments : ");
            for(String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
