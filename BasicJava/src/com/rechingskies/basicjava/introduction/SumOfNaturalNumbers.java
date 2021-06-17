package com.rechingskies.basicjava.introduction;

public class SumOfNaturalNumbers {
    public static void main(String [] args) {
        //Naive solution
        //Time complexity : O(n)
        //Auxiliary space : O(1)
        int sum = 0;
        int n = 10;
        for(int i = 1; i <=10; i++) {
            sum = sum+i;
        }
        System.out.println("Sum of n natural number : "+sum);

        //Efficient solution
        //Time complexity : O(1)
        //Auxiliary space : O(1)
        n = 5;
        System.out.println("Sum of n natural numbers : "+(n*(n+1)/2));
    }
}
