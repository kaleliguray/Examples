package com.examples;

public class Main {

    public static void main(String[] args) {

        // primitive type: byte, short, int, long, float, double, boolean, char
        // also Byte, Short, Integer, Float, Double are their Wrapper Class
        // we can call them data type also; and every data type has a different size

        int value = 1000;

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value : " + minIntValue);
        System.out.println("Integer Maximum Value : " + maxIntValue);

        // if we try to exceed their size; first ide can warn us second we can reverse data type size
        System.out.println("Exceed Max Value : " + (maxIntValue + 1)); // overflow
        System.out.println("Exceed Min Value : " + (minIntValue - 1)); // underflow

        // also we can write a big numbers with underscore sign : 2_147_483_647;
        /* primitive type is as byte genders:
                                              1 byte  = 8 bits
                                              byte = 1 byte
                                              short = 2 byte(16 bits)
                                              int = 4 byte(32 bits)
                                              long = 8 byte(64 bits)
         */

        int myMaxInt = 2_147_483_647;

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value : " + minByteValue);
        System.out.println("Byte Maximum Value : " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value : " + minShortValue);
        System.out.println("Short Maximum Value : " + maxShortValue);

        long myLongValue = 100L; // if we use long, we need to add "L" end of the number by this way we tell java that we use long not int
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value : " + minLongValue);
        System.out.println("Long Maximum Value : " + maxLongValue);

        long bigLongValue = 2_147_483_647_234L;
        System.out.println(bigLongValue);

        // java can assign a number as int by default

    }

}





















