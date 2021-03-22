package isLeapYear;

public class LeapYear {
    public static void main(String[] args) {

        isLeapYear(10000);

    }

    public static boolean isLeapYear(int year) {
       /* boolean leapYear = false;

        if (year >= 1 && year <= 9999 ) {
            System.out.println("1.aşama");
            if (year % 4 == 0){
                System.out.println("2.aşama");
                if (year % 100 == 0){
                    System.out.println("3.aşama");
                    if (year % 400 == 0) {
                        System.out.println("4.aşama");
                        leapYear = true;
                    }else {
                        leapYear = false;
                    }
                } else {
                    System.out.println("100' e bölünemiyor");
                    leapYear = true;
                }
            } else {
                System.out.println("4' e bölünemiyor");
                leapYear = false;
            }
        } else {
            System.out.println("Aralıkta değil");
            leapYear = false;
        }

        System.out.println("Leap Year: " + leapYear);
        return leapYear;*/

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

}





























