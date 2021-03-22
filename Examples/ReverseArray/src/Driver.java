public class Driver {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        reverse(array);

    }

    private static void reverse(int[] array){

        int[] temp = new int[array.length];

        System.out.print("Array = [");
        for (int i=0; i<array.length; i++){
            if (i == (array.length - 1)){
                System.out.print(array[i] + "]");
            }else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println();

        System.out.print("Reversed array = [");
        for (int i = (array.length-1); i>=0; i--){
            if (i==0){
                System.out.print(array[i]+"]");
            } else {
                System.out.print(array[i]+", ");
            }
        }

    }


/*    public static void reverse(int[] array){

        int[] temp = new int[array.length];

        for (int i =array.length -1; i >= 0; i--){

            temp[temp.length - i- 1] = array[i];

        }

        System.out.println("Array = " + Arrays.toString(array));
        System.out.println("Reverse array = " + Arrays.toString(temp));

    }*/
}
