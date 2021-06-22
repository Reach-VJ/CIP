package com.rechingskies.basicjava.arraysandstrings;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Locale;

public class StringInJava {
    public static void main(String [] args) {
        //String declaration
        char [] chars = {'h','e','l','l','o'};
        //Below are immutable
        String strOne = "Hello";
        String strTwo = new String("Hello");
        //StringBuffer is mutable and thread safe
        StringBuffer stringBuffer = new StringBuffer("Hello");
        //StringBuilder is mutable and not thread safe
        StringBuilder stringBuilder = new StringBuilder("Hello");

        System.out.println(strOne);
        System.out.println(strOne.charAt(2));
        System.out.println(strOne.substring(2)); //Print from passed index O/p : llo
        System.out.println(strOne.substring(2,4)); //Print from start index to end-1 index O/p : ll

        //Below are String literals, it refer same object.
        String str1 = "hello";
        String str2 = "hello";


        if(str1 == str2) // O/p : true
            System.out.println(str1 +" and "+str2 + " both refers to same object");

        String str3 = new String("hello");

        if(str1 == str3) // O/p : false and wont print below line
            System.out.println(str1 +" and "+str3 +" both refer different object");

        // Methods :
        //  contains, equals, compareTo, indexOf, lastIndexOf
        String name = "Hello World Hello World";
        String nameDuplicate = new String("Hello World Hello World");
        String smallName = "World";

        if(name.contains(smallName)) // O/p : true
            System.out.println(name +" contains "+smallName);
        if(name.equals(smallName)) // O/p : true
            System.out.println(name+" equals "+nameDuplicate);
        // compareTo compares the word and word in lexicographical, then returns zero if both same
        // returns +ve if greater
        // returns -ve if lesser
        if(name.compareTo(smallName) > 0) // O/p : -ve, it wont print after this line
            System.out.println("It wont print");

        // IndexOf : Prints first occurrence index of passing string
        System.out.println(name.indexOf(smallName)); // O/p : 6
        // Check the passing string from specific index
        System.out.println(name.indexOf(smallName,7)); // O/p : 18
        System.out.println(name.lastIndexOf(smallName)); // O/p : 18

        String s1 = "hello";
        String s2 = s1;
        s1 = s1+" world ";
        System.out.println(s1);
        System.out.println(s1==s2);

        // equalIgnoreCase, toUpperCase, toLowerCase, capitalize
        System.out.println("Hello".equalsIgnoreCase("hello"));
        System.out.println("hello".toUpperCase());
        System.out.println("HELLO".toLowerCase());
        System.out.println(StringUtils.capitalize("hello"));

    }
}
