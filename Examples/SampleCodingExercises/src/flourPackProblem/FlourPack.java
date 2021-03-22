package flourPackProblem;

public class FlourPack {
    public static void main(String[] args) {
        canPack(5,0,10);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount<0) || (smallCount<0) || (goal<0)){
            return false;
        }

        int big = 5 * bigCount;
        int small = 1 * smallCount;
        int total = big + small;

        if (total<goal){
            return false;
        }
        if (total == goal) {
            return true;
        }

        if (total % goal == 0) {
            return true;
        }

        int i = 0;

        while (i < goal) {
            i ++;
            if (i % 5 == 0) {
                System.out.println(i);
                if (goal - i <= small) {
                    return true;
                }
            }
        }

        if (big == 0 && small > goal) {
            return true;
        }
        return false;
    }
}




























