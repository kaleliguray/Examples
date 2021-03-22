package inputCalculatorExample;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter Number: ");
            boolean isValid = scanner.hasNextInt();

            if (isValid) {
                int x = scanner.nextInt();
                sum += x;
                count ++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        average=Math.round((double)sum/count);
        System.out.println("SUM = " + sum + " AVG = "+ average);
        scanner.close();
    }
}


































