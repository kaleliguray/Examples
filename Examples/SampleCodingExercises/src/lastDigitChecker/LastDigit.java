package lastDigitChecker;

public class LastDigit {
    public static void main(String[] args) {
        hasSameLastDigit(23,32,42);
    }

    public static boolean isValid(int number){
        if ((number>=10) && (number<=1000)){
            System.out.println("Number is valid");
            return true;
        }
        System.out.println("Not valid");
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!(isValid(num1) && (isValid(num2)) && (isValid(num3)))){
            return false;
        }
        int a = num1%10;
        int b = num2%10;
        int c = num3%10;

        if ((a==b)){
            return true;
        } else if((a==c)){
            return true;
        } else if((b==c)) {
            return true;
        } else {
            System.out.println("Not last Digit");
            return false;
        }
    }
}






















