package instanceExample;

class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("Name : " + name);
    }

    public void bark(){
        System.out.println("woof");
    }
}

class Driver {
    public static void main(String[] args) {

        Dog rex = new Dog("rex"); // created instance (rex)
        Dog fluffy = new Dog("fluffy"); // create instance (fluffy)

        rex.bark();   // called instance method

        rex.printName();
        fluffy.printName();


    }
}

/*
* Instance methods belong to an instance class
*
* To use an instance method we have to instantiate the class first usually by using the new keyword
*
* Can access instance method and instance variables directly
*
* Also can access static methods and static variables directly
*
*
* */

/*
*
* Instance variables are also known as fields or member variables
*
* Instance variables belong to an instance of a class
*
* Every instance has it's own copy of an instance variable
*
* Every instance can have different value(state)
*
* Instance variables represent the state of an instance
*
*
* */





















