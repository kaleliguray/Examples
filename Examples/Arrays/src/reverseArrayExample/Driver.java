package reverseArrayExample;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};

        System.out.println("array : " + Arrays.toString(array));

        reverse(array);

        System.out.println("reverse : " + Arrays.toString(array));


    }

    private static void reverse(int[] array){

        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++){
            int temporary = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temporary;
        }
    }





}




























