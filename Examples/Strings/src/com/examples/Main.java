package com.examples;

public class Main {

    public static void main(String[] args) {

        // String is a sequence of characters. In the memory it stores in heap memory despite primitive types that store in stack memory

        String isString = "This is a String";
        System.out.println("String is equal to : " + isString);
        isString = isString + ", and we can add more... ";
        System.out.println("String is equal to : " + isString);

        // we can use unicode character in the string
        isString = isString + " \u00A9 2020";
        System.out.println("String is equal to : " + isString);

        // we can use numbers in String but not for calculation
        String numberString = "150.55";
        numberString = numberString + "49.5";
        System.out.println(numberString);
        String myNumberString = "20";
        int number = 50;
        myNumberString = myNumberString + number;
        System.out.println(myNumberString);
        double anotherNumber = 210.08d;
        myNumberString = myNumberString + anotherNumber;
        System.out.println(myNumberString);

    }

}
