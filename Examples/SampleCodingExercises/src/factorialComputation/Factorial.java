package factorialComputation;

public class Factorial {
    public static void main(String[] args) {
        computeFactorial(4);
    }

    public static void computeFactorial(int number){
        if (number<0){
            System.out.println("Invalid Value");
        }

        int factor = 1;
        System.out.print("Number: " + number + "! = " );
        for (int i=1; i<=number; i++){
            factor *= i;
            System.out.print(i + "\t");
        }
        System.out.println("\n"+"Factorial: "+factor);
    }


}
