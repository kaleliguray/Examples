package com.tutorial;

import java.util.Scanner;

public class Driver {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArrays = getInteger(5);
        for (int i = 0 ; i< myIntArrays.length; i++){
            System.out.println("Element " + i + ", value is " + myIntArrays[i]);
        }

        System.out.println("The Average is : "+ getAverage(myIntArrays));

    }

    public static int[] getInteger(int ourNumber){
        System.out.println("Enter "+ourNumber+" integer values. \r");

        int[] values = new int[ourNumber];

        for (int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();

        }

        return values;
    }

    public static double getAverage(int[] myAverage){
        int sum = 0;
        for (int i = 0; i < myAverage.length; i++){
            sum += myAverage[i];
        }


        return (double) sum / myAverage.length;
    }




}




























