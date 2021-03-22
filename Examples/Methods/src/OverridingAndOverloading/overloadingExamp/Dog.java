package OverridingAndOverloading.overloadingExamp;

public class Dog {
    public  void bark(){
        System.out.println("woof");
    }

    public void bark(int number){
        for (int i=0; i < number; i++){
            System.out.println("woof");
        }
    }

}

/*
* Provide functionality to reuse a method name with different parameters
*
* Usually in a single class
*
* Must have different parameters
*
* May have different return type
*
* May have different access modifier (private, public, protected)
*
* May throw different exceptions
*
* */

