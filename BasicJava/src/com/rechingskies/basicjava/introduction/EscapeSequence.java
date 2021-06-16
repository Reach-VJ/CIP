package com.rechingskies.basicjava.introduction;

public class EscapeSequence {
    public static void main(String [] args) {
        // \ it will escape char after backslash.
        System.out.println("Hi, \"VJ, Welcome to Java World\"");
        // \n --> New line
        // \t --> Tab (4 spaces)
        // \" --> Escape "
        // \' --> Escape '
        // \\ --> Escape backslash itself
        System.out.println("Hello \nWorld");
        System.out.println("Hello\tWorld");
        System.out.println("\"VJ\"");
        System.out.println("\'VJ\'");
        System.out.println("\\HelloWorld");
    }
}
