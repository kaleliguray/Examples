import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean doYouWantToPlay = true;

        while (doYouWantToPlay){

            System.out.println("Welcome to Tic Tac Toe! You are about to go against "
                    + "the master of Tic Tac Toe. Are you ready? I hope so!\n BUT FIRST, you"
                    + " must pick what character you want to be and which character I will be");
            System.out.println();
            System.out.println("Enter a single character that will represent you on the board");
            char playerToken = scanner.next().charAt(0);
            System.out.println("Enter a single character that will represent your opponent on the board");
            char opponentToken = scanner.next().charAt(0);
            TicTacToe game = new TicTacToe(playerToken, opponentToken);
            AI ai = new AI();
            System.out.println();
            System.out.println("Now we can start the game. To play, enter a number and your token shall be put "
                    + "in its place.\nThe numbers go from 1-9, left to right. We shall see who will win this round.");
            TicTacToe.printIndexBoard();
            System.out.println();

            while (game.gameOver().equals("notOver")){
                if (game.currentMarker == game.userMarker){
                    System.out.println("It's your turn! Enter a spot for your token");
                    int spot = scanner.nextInt();
                    while (!game.playTurn(spot)){
                        System.out.println("Try again. " + spot + " is invalid. This spot is already taken"
                                + " or it is out of range");
                        spot = scanner.nextInt();
                    }
                    System.out.println("You picked "+ spot + "!");
                }else {
                    System.out.println("It's my turn!");
                    int aiSpot = ai.pickSpot(game);
                    game.playTurn(aiSpot);
                    System.out.println("I picked "+ aiSpot+ "!");
                }
                System.out.println();
                game.printBoard();
            }
            System.out.println(game.gameOver());
            System.out.println();
            System.out.println("Do you want to play again? Enter Y if you do. "
                    + "Enter anything else if you are tired of me.");
            char response = scanner.next().charAt(0);
            doYouWantToPlay = (response == 'Y');
            System.out.println("\n");

        }

    }

}































