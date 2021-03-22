package com.examples.conditionalLogic;

public class Driver {

    public static void main(String[] args) {

        boolean isAlien = false;

        if (isAlien == false)
            System.out.println("It is not a alien!");

        boolean isFly = true;

        if (isFly == true) {
            System.out.println("It is flying...");
            System.out.println("It could be a odd object");
        }

        if (isAlien != false)
            System.out.println("It is a alien");

        int score = 80;
        int firstScore = 50;
        int secondScore = 100;

        if (score < 100) {
            System.out.println("you not got the high score");
        }

        if (score > firstScore) {
            System.out.println("you have bigger score than first score");
        }

        if (score <= secondScore) {
            System.out.println("your score less than second score or equal");
        }

        if ((score < firstScore) && (score < secondScore)) {
            System.out.println("less than firstScore and secondScore");
        }
        System.out.println();

        if ((score < firstScore) || (score < secondScore)) {
            System.out.println("One condition is true: that is score less than secondScore");
        }

        int value = 70;
        if (value == 70) {
            System.out.println("This is true");
        }

        boolean isHouse = false;
        if (isHouse == true) {
            System.out.println("This is not supposed to happen");
        }

        if (isHouse = false) {
            System.out.println("This is happened");
        }

        if (isHouse != true) {
            System.out.println("This is also happened");
        }

    }

}
