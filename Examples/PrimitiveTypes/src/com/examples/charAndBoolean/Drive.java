package com.examples.charAndBoolean;

public class Drive {

    public static void main(String[] args) {

        // char stores only single character with single quote ; and it is 2 byte(16 bits) because of Unicode

        char myChar = 'A';
        char myUnicodeChar = '\u0041';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        myChar = 'C';
        myUnicodeChar = '\u0043';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        // boolean provides us two option : true or false; it is 1 byte(8 bits)
        boolean isTrueBooleanValue = true;
        boolean isFalseTrueBooleanValue = false;
        System.out.println(isTrueBooleanValue);
        System.out.println(isFalseTrueBooleanValue);

        boolean isCustomerOverEighteen = true;
        System.out.println("Is customer eighteen years old? : " + isCustomerOverEighteen);

    }

}




























