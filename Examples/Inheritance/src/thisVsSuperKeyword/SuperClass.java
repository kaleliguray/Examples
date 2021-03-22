package thisVsSuperKeyword;

public class SuperClass { // this is a parent class at the same time is called super class

    public  void printMethod(){
        System.out.println("Printed in SuperClass.");
    }

}

class SubClass extends SuperClass { // this is a sub class at the same time is called child class

    // Override methods from parents
    @Override
    public void printMethod() {
        super.printMethod();     // calls method in SuperClass, Also super have to execute first orders at all the time
        System.out.println("Printed in Subclass");
    }
}

class MainClass {
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}