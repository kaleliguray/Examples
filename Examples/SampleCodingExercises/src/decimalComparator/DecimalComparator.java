package decimalComparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        int decimalNumberOne = (int) (num1 * 1000);
        int decimalNumberTwo = (int) (num2 * 1000);

        System.out.println(decimalNumberOne);
        System.out.println(decimalNumberTwo);

        if ((decimalNumberOne / 1000) == (decimalNumberTwo / 1000)) {
            System.out.println(decimalNumberOne);
            System.out.println(decimalNumberTwo);
            decimalNumberOne = (int) ((num1 * 1000) % 1000);
            decimalNumberTwo = (int) ((num2 * 1000) % 1000);
            if (decimalNumberOne == decimalNumberTwo) {
                System.out.println("equal");
                return true;
            }
            return false;
        }

        System.out.println("not equal");
        return false;
    }

}
