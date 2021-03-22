package com.example.one;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I can believe, I can fly, flitting branch to branch with twitting");
    }


}
