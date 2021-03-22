package arraysExample2;

import java.util.Scanner;

public class Driver {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {

        System.out.print("Enter 10 integers : ");
        getInput();
        printArray(baseData);
        resizeArray();
//        System.out.print("Enter 12 integers : ");
//        getInput();
        baseData[10] = 100;
        baseData[11] = 200;
        printArray(baseData);


    }

    public static void getInput(){
        for (int i = 0; i < baseData.length; i++){
            baseData[i] = scanner.nextInt();
        }
    }

    public static void printArray(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void resizeArray(){
        int[] originalArray = baseData;

        baseData = new int[12];

        for (int i = 0; i < originalArray.length; i++){
            baseData[i] = originalArray[i];
        }

    }

}




































