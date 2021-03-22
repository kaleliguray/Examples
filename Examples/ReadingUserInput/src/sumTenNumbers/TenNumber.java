package sumTenNumbers;

import java.util.Scanner;

public class TenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

/*        while (true){
            int order = counter + 1;
            System.out.print("Enter number #" + order + " : ");

            boolean isNumber = scanner.hasNextInt();

            if (isNumber) {
                int number = scanner.nextInt();
                counter++;
                sum += number;

                if (counter == 10){
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

        scanner.nextLine(); // for handle end of line (enter key)

        }*/

        while (counter < 10){
            int order = counter + 1;
            System.out.print("Enter number #" + order + " : ");

            boolean isNumber = scanner.hasNextInt();

            if (isNumber) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // for handle end of line (enter key)

        }

        System.out.println("Sum : " + sum);
        scanner.close();
    }


}
































