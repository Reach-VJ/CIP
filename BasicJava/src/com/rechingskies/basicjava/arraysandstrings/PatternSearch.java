package com.rechingskies.basicjava.arraysandstrings;

public class PatternSearch {
    public static void main(String [] args) {
        String text = "geeks for geeks";
        String pattern = "geeks";

        int pos = text.indexOf(pattern);
        while(pos >= 0) {
            System.out.println(pattern+ " starts at index of "+pos);
            pos = text.indexOf(pattern,pos+1);
        }

        //Find the digits after decimal point
        String str = "12.5318";
        int index = str.indexOf(".");
        if(index >= 0)
            System.out.println(str.substring(index+1));
    }
}
