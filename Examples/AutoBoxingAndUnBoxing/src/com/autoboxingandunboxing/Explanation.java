package com.autoboxingandunboxing;

import java.util.ArrayList;

class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue(){
        return this.myValue;
    }

    public void setMyValue(int myValue){
        this.myValue = myValue;
    }
}

public class Explanation {

    public static void main(String[] args) {

        // these are normal array which we use
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        /* in here we use String because it is not a primitive type it is a class, a object
         below strign arraylist we used int arraylist but we can not type int because it is primitive type
         And ide warn us about this situation So above the main method we created a class to use int let see how
         */
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("John");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54)); // we created a class and used here


        /*
            the difference between Integer and int is that Integer is a class
         */
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.45);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i=0; i<=10; i++){
            //this is autoboxing ---> convert from primitive type to class or object
            intArrayList.add(Integer.valueOf(i)); // valueOf is taking the value of i as the primitive type and convert it to Integers automaticlly
        }

        for (int i=0; i<=10; i++){
            //this is unboxing ---> convert from class or object to primitive type
            System.out.println(i + " --> " + intArrayList.get(i).intValue());// intValue is convert it to int value again
        }

        /*
            we do not need to that conversation by ourselve java do it for us automaticlly
        */
        Integer myIntValue = 58; // java do here Integer.valueOf(58);
        int myInt = myIntValue.intValue();



    }


}




































