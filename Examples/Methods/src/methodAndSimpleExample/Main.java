package methodAndSimpleExample;

public class Main {

    public static void main(String[] args) {

        pointCalculation();

        System.out.println("***********************");

        scoreCalculation(true, 2000, 5, 300);

    }

    public static void pointCalculation() {
        boolean gameOver = true;
        int score = 1000;
        int levelComplete = 7;
        int bonus = 500;

        if (gameOver) {
            int finalPoint = score + (levelComplete * bonus);
            System.out.println("Your final point is " + finalPoint);
        }
    }

    public static int scoreCalculation(boolean game, int score, int level, int bonus) {
        if(game) {
            int finalScore = score + (level * bonus);
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }
        return -1;  // we use -1 because negative one means that invalid value or a value not found
    }

}





























