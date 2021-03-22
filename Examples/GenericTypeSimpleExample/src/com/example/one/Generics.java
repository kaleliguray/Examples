package com.example.one;

public class Generics {

    public static <T extends Comparable<T>> T findMax(T a, T b){
        int n = a.compareTo(b);
        if (n<0){
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {

        System.out.println(findMax(2,3));
        System.out.println(findMax(3,3));
        System.out.println(findMax(3,2));

        System.out.println(findMax(2.0,3.4));
        System.out.println(findMax(3.5,3.5));
        System.out.println(findMax(3.3,2.1));

        System.out.println(findMax('a','b'));
        System.out.println(findMax("hello","there"));


    }

}
























