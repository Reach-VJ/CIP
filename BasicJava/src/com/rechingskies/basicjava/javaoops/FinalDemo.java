package com.rechingskies.basicjava.javaoops;

public class FinalDemo {
    final int NUMBER;
    {
        NUMBER = 200;
        //NUMBER = 300; Cant compile
    }
    final static int NUMBER_STATIC;
    static {
        NUMBER_STATIC = 300;
        //NUMBER_STATIC = 500; cont compile.
    }
    public static void main(String [] args) {
        //Final
        // Variable :
        //      Local : Only one time initialization.
        //      instance : Final variable, only one time initialization
        //      and class : Static final, Can access by Class name
        // Method : Cant override
        // Class : Cant extend
        // reference : cant rebound to different object.

        final int localVar;
        {
            localVar = 100;
            //localVar = 200; Cant compile
        }

        final StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World ");
        //buffer = new StringBuffer("It wont compile"); Rebound to different object wont compile.

    }
}


