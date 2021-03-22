package teenNumberChecker;

public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 >= 13 && num1 <= 19){
            System.out.println(num1 + " in range");
            return true;
        } else if (num2 >= 13 && num2 <= 19){
            System.out.println(num2 + " in range");
            return true;
        } else if (num3 >= 13 && num3 <= 19){
            System.out.println(num3 + " in range");
            return true;
        } else {
            System.out.println("they are not in range");
            return false;
        }
    }

    public static boolean isTeen(int num) {
        if (num >= 13 && num <= 19) {
            System.out.println("is Teen");
            return true;
        }
        System.out.println("is not Teen");
        return false;
    }

}
































