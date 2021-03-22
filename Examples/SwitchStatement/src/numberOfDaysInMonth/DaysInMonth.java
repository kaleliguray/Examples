package numberOfDaysInMonth;

public class DaysInMonth {
    public static void main(String[] args) {

        getDaysInMonth(12,10000);

    }
    public static boolean isLeapYear(int year) {
        if ((year<1) || (year>9999)){
            return false;
        } else {
            if ((year%4==0) && (year%100==0) || (year%400==0)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {

        /*int daysInMonth=0;
        boolean leap= isLeapYear(year);

        if (!(month < 1) && !(month > 12)) {
            if (isLeapYear(year) || !(leap)) {
                switch (month) {
                    case 1:
                        System.out.println("January : 31");
                        daysInMonth = 31;
                        break;
                    case 2:
                        if (leap) {
                            System.out.println("February : 29");
                            daysInMonth = 29;
                        } else {
                            System.out.println("February : 28");
                            daysInMonth = 28;
                        }
                        break;
                    case 3:
                        System.out.println("March : 31");
                        daysInMonth = 31;
                        break;
                    case 4:
                        System.out.println("April : 30");
                        daysInMonth = 30;
                        break;
                    case 5:
                        System.out.println("May : 31");
                        daysInMonth = 31;
                        break;
                    case 6:
                        System.out.println("June : 30");
                        daysInMonth = 30;
                        break;
                    case 7:
                        System.out.println("July : 31");
                        daysInMonth = 31;
                        break;
                    case 8:
                        System.out.println("August : 31");
                        daysInMonth = 31;
                        break;
                    case 9:
                        System.out.println("September : 30");
                        daysInMonth = 30;
                        break;
                    case 10:
                        System.out.println("October : 31");
                        daysInMonth = 31;
                        break;
                    case 11:
                        System.out.println("November : 30");
                        daysInMonth = 30;
                        break;
                    case 12:
                        System.out.println("December : 31");
                        daysInMonth = 31;
                        break;
                    default:
                        System.out.println("Invalid month and year");
                        daysInMonth = 0;
                        break;
                }

                System.out.println("Return: " + daysInMonth);
                return daysInMonth;
            } else {
                return -1;
            }
        } else {
            System.out.println("Invalid month");
            return -1;
        }
*/
        if (((month<1)||(month>12)) || ((year<1)||(year>9999))){
            return -1;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 2:
                    if (isLeapYear(year)){
                        return 29;
                    } else {
                        return 28;
                    }
                default:
                    return 30;
            }
        }
    }

}

































