package perfectNumber;

public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectnumber(5);
    }

    public static boolean isPerfectnumber(int number){
        if (number<1){
            return false;
        }
        boolean isPerfect = false;
        int sum = 0;
        for (int i=1; i<=number; i++){
            int remainder = number % i;
            if (remainder == 0) {
                sum += i;
                if (sum == number){
                    System.out.println(sum);
                    System.out.println("It is Perfect Number");
                    isPerfect = true;
                    break;
                }
            }
        }

        return isPerfect;
    }


}



























