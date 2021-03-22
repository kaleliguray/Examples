package diagonalStart;

public class DiagonalStart {
    public static void main(String[] args) {

        printSquareStar(5);

    }

    public static void printSquareStar(int number) {
        int columnCounter = 0;
        int rowCounter = 0;
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            while (rowCounter < number) {
                if (rowCounter == 0 || rowCounter == number - 1) {
                    while (columnCounter < number) {
                        System.out.print("*");
                        columnCounter++;
                    }
                } else {
                    while (columnCounter < number) {
                        if (columnCounter == 0 || columnCounter == number - 1) {
                            System.out.print("*");
                        } else if (columnCounter == rowCounter) {
                            System.out.print("*");
                        } else if (columnCounter == number - (rowCounter + 1)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                        columnCounter++;
                    }
                }
                System.out.println();
                columnCounter = 0;
                rowCounter++;
            }
        }


    }

}






























