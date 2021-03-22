package sumOdd;

public class OddNumbers {
    public static void main(String[] args) {
        sumOdd(1,100);
    }

    public static boolean isOdd(int number){
        if (number > 0) {
            int unitDigit = (number % 10);
            if ((unitDigit == 1) || (unitDigit == 3 ) || (unitDigit == 5) || (unitDigit == 7) || (unitDigit == 9)) {
                System.out.println(number + " is odd");
                return  true;
             }  else {
                System.out.println(number + " is not odd");
                return false;
            }
        } else {
            System.out.println(number + " not in gap");
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((start>0) && (end>0)){
            if ((end > start) || (end == start)) {
                for (int i = start; i <= end; i++) {
                    boolean odd = isOdd(i);
                    if (odd){
                        sum += i;
                    }
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
        System.out.println("sum = " + sum);

        return sum;
    }



}
































