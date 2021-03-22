package greatestCommonDivisor;

public class GreaterCommonDivisor {
    public static void main(String[] args) {
        getGreatestCommonDivisor(12,30);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first<10) || (second<10)){
            return -1;
        }

        int divisor = first / 2;

        while (true) {

            if (first % divisor == 0 && second % divisor == 0) {
                break;
            } else {
                divisor -= 1;
            }
        }
        return divisor;
    }

}






























