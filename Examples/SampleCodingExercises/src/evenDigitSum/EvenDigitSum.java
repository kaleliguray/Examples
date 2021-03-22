package evenDigitSum;

public class EvenDigitSum {
    public static void main(String[] args) {

        getEvenDigitSum(-22);

    }

    public static int getEvenDigitSum (int number){
        int sum=0;
        if (number<0){
            return -1;
        }
        while(number>0){
            for (int i= 0; i <= number; i++) {
                int evenDigit = number % 10;
                number/=10;
                if (evenDigit % 2 ==0) {
                    sum += evenDigit;
                    System.out.println("Even Digit: " + evenDigit);
                }
            }
        }
        System.out.println(sum);
        return sum;
    }

}



























