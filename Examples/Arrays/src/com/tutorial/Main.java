package com.tutorial;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray =  new int[10];    // this is another way to initialise the array {1,2,3,4,5,6,7,8,9};

        myIntArray[0] = 64;
        myIntArray[1] = 36;
        myIntArray[5] = 28;

//        double[] myDoubleArray = new double[10];
//
//        System.out.println(myIntArray[0]);
//        System.out.println(myIntArray[1]);
//        System.out.println(myIntArray[5]);

        /*for (int i = 0; i < 10; i++){
            myIntArray[i] = i * 10;
        }

        for (int i = 0; i < 10; i++){
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }*/

        for (int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }

//        for (int i = 0; i < myIntArray.length; i++){
//            System.out.println("Element " + i + ", value is " + myIntArray[i]);
//        }

        printArray(myIntArray);

    }


    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }

    }





}




























