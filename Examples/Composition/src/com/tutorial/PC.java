package com.tutorial;

/*
*
* Composition Relationship is "has-a" vs Inheritance Relationship is "is-a"
*
* Composition acquired at run time vs Inheritance acquired at compile time
*
* In composition as you see that you can make changes instance class and that does not effect to base class
*
* In inheritance, if you want to make changes in parent class you need to know that your child class will been affected by changes of parent class
*
* Also in inheritance one class can extends only one parents vs in composition one class can create instance of other class according to requirements
*
* In there we didn't inherit other classes but in the PC class we have other classes object instance
*
* that is compositon by this way we can reach them without extends parent class
*
* but if we want to reach their methods we need to use '.' dot operator to accessing their own methods
*
* */

public class PC {
    private Case theCase; // compositon
    private Monitor monitor; // compositon
    private Motherboard motherboard; // compositon

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200,500,"yellow");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

/*  public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }*/
}
