package firstAndLastDigitSum;

public class FirstLastDigit {
    public static void main(String[] args) {

        sumFirstAndLastDigit(252);
    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit=0;
        int lastDigit=0;
        if (number<0) {
            return -1;
        }
        lastDigit = number % 10;

        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        System.out.println(firstDigit + lastDigit);
        return firstDigit + lastDigit;
    }

}






























