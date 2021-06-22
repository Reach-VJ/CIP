package com.rechingskies.basicjava.arraysandstrings;

public class StringBufferOrBuilder {
    public static void main(String [] args) {
        // StringBuilder : Mutable and not thread safe
        // StringBuffer : Mutable and thread safe.

        StringBuilder stringBuilder = new StringBuilder("hello");
        StringBuilder stringBuilder1 = stringBuilder;
        stringBuilder = stringBuilder.append(" world ");

        System.out.println(stringBuilder == stringBuilder1);

        // Methods in String, StringBuffer and StringBuilder
        // Length(), charAt(index), indexOf(str), indexOf(str, fromIndex),
        // lastIndexOf(str), lastIndexOf(str, fromIndex), compareTo(subStr),
        //subString(beginIndex), subString(beginIndex,endIndex), chars().
        String name = new String("Hello");
        //chars() method creates the stream
        int count = (int) name.chars().count();
        System.out.println(count);

        // Methods which are present in Buffer and Builder
        // append(x), insert(offset,x), setCharAt(index, c), reverse()
        // deleteCharAt(index), delete(start, end), capacity(), replace(start, end, str)

        StringBuilder builder = new StringBuilder("Hello World");
        System.out.println(builder);
        builder.append(" Hello ");
        System.out.println(builder);
        builder.insert(12,"World ");
        System.out.println(builder);
        builder.setCharAt(23,'!');
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        builder.delete(10,15);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder.deleteCharAt(0));
        System.out.println(builder.capacity());
        builder.replace(0,5, "Hello");
        System.out.println(builder);
    }
}
