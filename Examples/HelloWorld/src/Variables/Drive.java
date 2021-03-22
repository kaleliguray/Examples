package Variables;

public class Drive {

    public static void main(String[] args) {

        int firstNumber = (10 + 5) + (2 * 10) ;
        int secondNumber = 12 ;
        int thirdNumber = 6;

        System.out.println(firstNumber);

        // now we can keep a value with another declaration

        int total = firstNumber + secondNumber + thirdNumber;

        System.out.println(total);

        // also we can write thirdNumber like this

        thirdNumber = firstNumber * 2;

        total = firstNumber + secondNumber + thirdNumber;
        System.out.println(total);

        // can we write lastNumber less than 1000 ?

        int lastNumber = 1000 - total;
        System.out.println(lastNumber);

    }

}
