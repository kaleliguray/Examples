package staticExample;

class Calculator {

    public static void printSum(int a, int b){
        System.out.println("Sum : " + (a+b));
    }

}

class Main{
    public static void main(String[] args) {

        Calculator.printSum(5,10);
        printHello();
    }

    public static void printHello(){
        System.out.println("Hello");
    }
}

/*
* Static methods are declared using 'static' modifier
*
* Static method can't access instance method or instance variables directly
*
* don't need to use 'this' keyword
*
* Whenever you see a method that does not use instance variables that method should be declared as a static method
*
* and static method when it is created in that moment has place in the memory
*
* */