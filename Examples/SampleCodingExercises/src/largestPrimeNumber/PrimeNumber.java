package largestPrimeNumber;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(21));

    }

    public static int getLargestPrime(int number) {
        int factor = 0;
        if (number <= 1) {
            return -1;
        }
        while (number % 2 == 0) {
            factor = 2;
            number = number / 2;
        }
        int i = 3;
        while (i <= number) {
            if (number % i == 0) {
                factor = i;
                number = number / i;
            } else {
                i++;
            }
        }
        return factor;
    }
}


























