import java.util.Scanner;

public class Driver {


    public static void main(String[] args) {

        int[] array = getIntegers(5);

       array = sortIntegers(array);

        printArray(array);


    }

    public static int[] getIntegers(int size) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++){

            numbers[i] = scanner.nextInt();

        }

        scanner.close();

        return numbers;
    }

    public static int[] sortIntegers(int[] unsortedArray){

        int[] num = new int[unsortedArray.length];

        for (int i = 0; i < unsortedArray.length; i++){
            num[i] = unsortedArray[i];
        }

        for (int i = 0; i < unsortedArray.length; i++){

            for (int j = i + 1; j < unsortedArray.length; j++){
                if (num[i] < unsortedArray[j]) {
                    int temp;
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        return num;
    }

    public static void printArray(int[] sortedArray){
        for (int i = 0; i < sortedArray.length; i++){
            System.out.println("Element " + i + " contents " + sortedArray[i]);
        }
    }

}
