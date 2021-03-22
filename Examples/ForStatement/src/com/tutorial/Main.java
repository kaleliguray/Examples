package com.tutorial;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000,3));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000,4));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000,5));

/*        for (init; termination; increment) {
            statement;
        }*/

/*        for (int i= 0; i < 5; i++) {
            System.out.println("For Loop " + i + " hello!");
        }*/

         for (int i = 2; i<9; i++) {
             System.out.println("10,000 at " +i +"% interest = " + String.format("%.2f",calculateInterest(10000,i)));
         }

        System.out.println("-------------------------------------------------");

        for (int i = 8; i>1; i--) {
            System.out.println("10,000 at " +i +"% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount* (interestRate/100));
    }

}
































