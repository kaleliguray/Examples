package evenNumberOrNot;

public class EvenNumber {
    public static void main(String[] args) {

/*        int number = 3;
        int finishNumber = 21;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }*/

        int number = 3;
        int finishNumber = 21;
        int evenNumberFounded = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumberFounded ++;
            if (evenNumberFounded >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers founded " + evenNumberFounded);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2 == 0)) {
//            System.out.println(number + " is even number");
            return true;
        } else {
            return false;
        }
    }

}
































