package com.examples.abbreviatingOperators;

public class Main {

    public static void main(String[] args) {

        int sum = 10;
        sum ++; // sum + 1 = 11
        System.out.println("sum++ : " + sum);

        sum += 2; // 11 + 2 = 13
        System.out.println("sum += 2 : " + sum);

        sum *= 10; // 13 * 10 = 130
        System.out.println("sum *= 10 : " + sum);

        sum /= 2; // 130 / 2 = 65
        System.out.println("sum /= 2 : " + sum);

        sum -= 1; // 65 - 1 = 64
        System.out.println("sum -= 1 : " + sum);

    }

}
