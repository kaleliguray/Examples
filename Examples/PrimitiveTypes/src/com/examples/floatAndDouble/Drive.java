package com.examples.floatAndDouble;

public class Drive {

    public static void main(String[] args) {

        // floating point numbers is real numbers, they are float and double. unlike other this has a fractional parts that we express them with decimal point
        // we use them for precision calculate

        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("Float minimum value : " + floatMinValue);
        System.out.println("Float maximum value : " + floatMaxValue);

        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("Double minimum value : " + doubleMinValue);
        System.out.println("Double maximum value : " + doubleMaxValue);

        // we use double and float value with "d" and "f"; and in java decimal number as default is double

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; // also we can 5f/2f
        double myDoubleValue = 5d / 3d; // 5.00 / 3.00 becaue java will understand it is double
        System.out.println("myIntValue : " + myIntValue);
        System.out.println("myFloatValue : " + myFloatValue);
        System.out.println("myDoubleValue : " + myDoubleValue);

        System.out.println("**********Example********");
        double numberOfPound = 300d;
        double convertedKilograms = numberOfPound * 0.45359237d;
        System.out.println("Converted Kilograms: " + convertedKilograms);
        System.out.println("**********Example********");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);





    }

}


















