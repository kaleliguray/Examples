package methodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Jack", 800);
        System.out.println("New Score is " + newScore);
        calculateScore(50);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, No player score");
        return 0;
    }

//    public static void calcualteScore(){
//        System.out.println("No player name and no player score");
//    }







}
























