package numberPalindromeExample;

public class NumberPalindrome {

    public static void main(String[] args) {

        isPalindrome(121);
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int x = number;
        while (x > 0 || x < 0) {
            lastDigit =  x % 10;
            reverse *= 10;
            reverse += lastDigit;
            x /= 10;
        }
        if (number == reverse) {
            System.out.println(number + " = " + reverse);
            return true;
        } else {
            return false;
        }
    }


}





























