package com.tutorial;

public class Car {

    // Class consist of state and behavior. state =  field  and  behavior = methods
    // if we want to determine our state accessibility level we can choose one of them : public, private, protected

    private int doors;
    private int wheels;
    private String model; //public String models;
    private String engine;  //public String engine;
    private String colour;

    // set and get are encapsulation that is a feature of oop. set for write / get for read
    public void setModel(String model){
        // this refers to the field of the class and if field's name and method parameter's name are same otherwise we don't need to use
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }

}
