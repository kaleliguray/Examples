package sharedDigitExample;

public class SharedDigit {
    public static void main(String[] args) {

        hasSharedDigit(12,13);

    }

    public static boolean hasSharedDigit(int num1, int num2){
        int a,b,x,y;
        if (((num1>=10) && (num1<=99)) && ((num2>=10) && (num2<=99))) {
            a = num1%10;
            num1 /= 10;
            b = num1%10;

            System.out.println("a: " + a + " b: "+b);

            x = num2%10;
            num2 /= 10;
            y = num2%10;

            System.out.println("x: " + x + " y: "+y);

            if ((a==x) || (b==x) || (a==y) || (b==y)) {
                System.out.println("Shared Digit");
                return true;
            }
        }
        return false;
    }


}


























