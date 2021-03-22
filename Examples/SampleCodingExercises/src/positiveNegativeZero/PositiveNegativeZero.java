package positiveNegativeZero;

import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen sayınızı giriniz: ");
        int yourNumber = scanner.nextInt();

        numberCheck(yourNumber);

    }

    public static void numberCheck(int number){
        if (number > 0) {
            System.out.println("Your number is positive");
        } else if (number < 0) {
            System.out.println("Your number is negative");
        } else {
            System.out.println("Your number is zero");
        }

    }

}
