package com.examples;

public class Examples {

    public static void main(String[] args) {

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double myValuesTotal = firstValue + secondValue * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double remindValue = myValuesTotal % 40.00d;
        System.out.println("Remaind = " + remindValue);
        boolean isNoRemainder = (remindValue == 0) ? true : false;
        System.out.println("isNoRemainder: " + isNoRemainder);
        System.out.println(!isNoRemainder);
        if(!isNoRemainder) {
            System.out.println("Got some remainder");
        }



    }

}
