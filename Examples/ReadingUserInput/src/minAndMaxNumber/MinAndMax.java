package minAndMaxNumber;

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/*        while (true) {
            System.out.print("Enter First Number : ");
            boolean firstNumberValid = scanner.hasNextInt();
            if (firstNumberValid) {
                int first = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Second Number : ");
                boolean secondNumberValid = scanner.hasNextInt();
                if (secondNumberValid) {
                    int second = scanner.nextInt();

                    System.out.println("Min : " + Math.min(first,second));
                    System.out.println("Max : " + Math.max(first,second));

                    break;
                }else {
                    System.out.println("Invalid second number");
                    break;
                }
            }else {
                System.out.println("Invalid first number");
                break;
            }
        }*/

        int max = 0;
        int min = 0;
        int counter = 0;
        boolean first = true;
        System.out.println("If you want to quit enter 'q'");
        while(true) {
            int order = counter + 1;
            System.out.print("Enter number #"+order + " : ");

            boolean isValidNumber=scanner.hasNextInt();

            if (isValidNumber) {
                int number = scanner.nextInt();
                counter++;

                if (first) {
                    first = false;
                    max=number;
                    min=number;
                }

                if (number > max) {
                    max = number;

                }
                if (number < min) {
                    min = number;

                }

            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min : "+ min + " , Max : " + max);
        scanner.close();
    }

}



























