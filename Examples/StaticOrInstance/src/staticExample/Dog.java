package staticExample;

class Dog {

    private static String name;

    public Dog(String name){
        Dog.name = name;
    }

    public void printName(){
        System.out.println("Name : " + name);
    }
}

class Driver {
    public static void main(String[] args) {
        Dog rex = new Dog("rex"); // create instance (rex)
        Dog fluffy = new Dog("fluffy"); // create instance (flaffy)

        rex.printName();
        fluffy.printName();

    }
}

/*
*
* static variables are also known as static member variables
*
* Every instance of that class shares the same static variable
*
* If changes are made to that variable, all other instances will see the effect of the change
*
* */






























