package methodAndSimpleExample;

public class Driver {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob",highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy",highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert",highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise",highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Carol",highScorePosition);

        highScorePosition = calculateHighScorePosition(200);
        displayHighScorePosition("Frank",highScorePosition);


    }

    public static void displayHighScorePosition(String nameOfPlayer, int highScorePosition) {

        System.out.println(nameOfPlayer + " manage to get into position " + highScorePosition + " on the high score board");

    }

    public static int calculateHighScorePosition(int scoreOfPlayer) {
//        if (scoreOfPlayer >= 1000) {
//            return 1;
//        } else if (scoreOfPlayer >= 500) {
//            return 2;
//        } else if (scoreOfPlayer >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }

        int positon = 4; // we set up position default

        if (scoreOfPlayer >= 1000){
            positon = 1;
        }else if (scoreOfPlayer >= 500) {
            positon = 2;
        }else if (scoreOfPlayer >= 100) {
            positon = 3;
        }

        return positon;
    }






}
