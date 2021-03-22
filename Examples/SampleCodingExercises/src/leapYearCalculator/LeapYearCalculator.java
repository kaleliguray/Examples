package leapYearCalculator;

public class LeapYearCalculator {

    public static boolean isLeapYear(int year){
       if ((year >= 1) && (year <= 9999)){
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("isLeapYear");
                        return true;
                    } else {
                        System.out.println("is not a Leap Year");
                        return false;
                    }
                } else {
                    System.out.println("isLeapYear");
                    return true;
                }
            } else {
                System.out.println("is not a Leap Year");
                return false;
            }
       }
       System.out.println("is not a Leap Year");
       return false;
    }

}

































