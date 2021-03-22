package com.examples.ternaryOperator;

public class Driver {

    public static void main(String[] args) {

        // ternary operator is: condition ? provided(true) : not provided(false)

        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 25;
        boolean isEightOrOver = (ageOfClient > 18) ? true : false;
        if (isEightOrOver) {
            System.out.println("You can get in");
        }


    }

}



























