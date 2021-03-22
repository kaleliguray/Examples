package com.examples;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 7;
        int bonus = 90;

        // we can use if statement without curly braces if we have only a statement after "if" and if condition is true that will work otherwise don't
/*        if (score == 5000)
            System.out.println("Your score was 5000");*/

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score less than 5000 but greater than 1000");
//        } else if (score < 1000){
//            System.out.println("Your score less than 1000");
//        } else {
//            System.out.println("Got here!");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        int yourMoney = 500;

        if(yourMoney >= 2000) {
            System.out.println("You can continue your game");
        } else if (yourMoney < 1000 && yourMoney > 100) {
            System.out.println("You need to charge your account");
        } else {
            System.out.println("Sorry! You can't play anymore");
        }




    }

}






























