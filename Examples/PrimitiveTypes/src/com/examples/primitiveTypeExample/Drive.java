package com.examples.primitiveTypeExample;

public class Drive {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longValue = 5000L + 10L * (byteValue + shortValue + intValue);

        System.out.println(longValue);

        short shortCasting = (short) (1000 + 10 * (byteValue + shortValue + intValue));

        System.out.println(shortCasting);


    }

}
