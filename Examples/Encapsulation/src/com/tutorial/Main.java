package com.tutorial;

/*
*
* Encapsulation is mechanism that allows you to restrict access to certain components in objects that you created
*
* by this way you are able to protect your members of class from external access in order to guard against unauthorized access
*
* it can be very useful to hide that inner working from another class to sort of give you more control and to be able to enable you change things without breaking code
*
* */

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name="Jonh"; // there is warning because we reached and changed field in player class
//        player.health=20;
//        player.weapon="Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health=200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Mike",200,"Sword");
        System.out.println("Initial health is " + player.getHealth());


    }



}






















