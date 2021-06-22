package com.rechingskies.basicjava.arraysandstrings;

public class MultiDimensionArray {
    public static void main(String [] args) {
        int [][] arrayOne = new int[3][3];
        int [][] arrayTwo = {
                {1,2,3},
                {4,5,6}
            };
        int [][] arrayThree = new int[10][];
        for(int i = 0; i < arrayOne.length; i++) {
            for(int j = 0; j < arrayOne[i].length; j++) {
                System.out.print(arrayOne[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i < arrayTwo.length; i++) {
            for(int j = 0; j < arrayTwo[i].length; j++) {
                System.out.print(arrayTwo[i][j]+" ");
            }
            System.out.println();
        }

        for(int i = 0; i < arrayThree.length; i++) {
            arrayThree[i] = new int[i+1];
            for(int j= 0; j < arrayThree[i].length; j++)  {
                arrayThree[i][j] = i;
                System.out.print(arrayThree[i][j]+" ");
            }
            System.out.println();
        }

    }
}
