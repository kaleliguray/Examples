package com.examples.casting;

public class Drive {

    public static void main(String[] args) {

        // casting means that convert a number from one type to another; but convert way follow byte -> long
        // why do we need to that? because java tell us that when you do some calculation with different type don't lose some value from yours

        int maxIntValue = Integer.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;
        short minShortValue = Short.MIN_VALUE;

        int myTotal = (maxIntValue / 2);

        byte myNewByteValue = (byte) (minByteValue / 2); // Explicit

        short myNewShortValue = (short) (minShortValue / 2); // Explicit

        long myNewLongValue = myTotal; // Implicit



    }

}
