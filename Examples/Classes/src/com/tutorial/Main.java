package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // Inside the main method if we want to access our class we need to create a reference and initialise it

        Car porche = new Car();
        Car mercedes = new Car();

        // if we want to look inside our class we need to use '.' dot operator and also our class inherit some method from Java by default
//        porche.models = "Carrera";

        porche.setModel("Carrera");
        System.out.println("Model is " + porche.getModel());
        porche.setModel("923");
        System.out.println("Model is " + porche.getModel());

    }

}




























