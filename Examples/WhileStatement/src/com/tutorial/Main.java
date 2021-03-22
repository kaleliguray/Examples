package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // in outside we define and initiate (count); in while we set condition and check; in While scope we increase or decrease our circumtance
        // if your while condition always true or you forget to increase or decrease your count, while will execute forever

        int count = 1;

        while (count != 5){
            System.out.println("Counting value = "+count);
            count++;
        }

        /*for (count = 0; count<5; count++) {
            System.out.println("Counting value = "+count);
        }*/

        count = 1;

        while (true){
            if (count == 5){
                break;
            }
            System.out.println("Counting Value = " + count);
            count++;
        }

        // if you want to execute your code at least once you will use do-While

        count = 1;

        do {
            System.out.println("Counting value = " + count);
            count++;
        } while (count != 5);

    }

}




























