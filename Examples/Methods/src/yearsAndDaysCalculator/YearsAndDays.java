package yearsAndDaysCalculator;

public class YearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(-1);
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {
            long year = (((minutes / 60) / 24) / 365);
            long day = (((minutes / 60) / 24) % 365);

            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }
    }

}






















