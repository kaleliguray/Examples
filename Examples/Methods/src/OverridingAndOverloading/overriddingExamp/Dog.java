package OverridingAndOverloading.overriddingExamp;

class Dog {
    public void bark(){
        System.out.println("woof");
    }
}

class GermanShepherd extends Dog {
    @Override
    public void bark() {
        System.out.println("wofff wofff wofff");
    }
}

/*
 * Used to override a behavior which the class has inherited from parent class
 *
 * Always in 2 classes that have a child - parent relationship
 *
 * Must have the same parameters and same name
 *
 * Must have the same return type or covariant return type as Child class
 *
 * Must not have lower modifier but may have a higher modifier
 *
 * Must not throw new or broader checking exception
 *
 * */