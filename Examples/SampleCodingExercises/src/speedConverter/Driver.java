package speedConverter;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your km : ");
        double yourKm = scanner.nextDouble();

        double converted = SpeedConverter.toMilesPerHour(yourKm);

        SpeedConverter.printConversion(yourKm);
    }
}
