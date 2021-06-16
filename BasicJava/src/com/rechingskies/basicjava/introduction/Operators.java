package com.rechingskies.basicjava.introduction;

public class Operators {
    public static void main(String [] args) {
        //Incremental operators
        int x = 10;
        int y = 20;
        int z;
        y = x++; //y = x and x = x+1;
        z = ++x; // x = x+1 and z = x;
        System.out.println("Y value after x++ : "+y); // 10
        System.out.println("Z value after ++x : "+z); //12

        // Assignment Operators
        int i = 10;
        int j = 20;
        i +=j; //i = i+j; i = 30, j = 20
        i -=j; //i = i-j; i = 10, j = 20
        i *=j; //i = i*j; i = 200, j = 20
        i %=j; //i = i%j; i = 0, j = 20
        System.out.println("I and J values after Assignment Operators : "+i+" "+j); // 0, 20

        //Logical Operators
        boolean isValid = true;
        boolean isTrue = false;
        if( isValid && isTrue)
            System.out.println("It wont print");
        else
            System.out.println("It will print");

        if( isValid || isTrue)
            System.out.println("It wont print..");
        else
            System.out.println("It will print..");

        if(!isTrue)
            System.out.println("Its ture, will print");

        //Relational Operators :  ==, !=, <, >, >=, <=
        int l = 10;
        int m = 20;
        int o = 10;

        if(l==o)
            System.out.println("Both are same");
        if(l<m)
            System.out.println("L is less than M");
        if(m>l)
            System.out.println("M is great than L");



    }
}
