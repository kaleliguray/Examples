package com.tutorial;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //import Scanner from util package and initialize
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth of date : ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int birhtOfDate = scanner.nextInt();
            // if we want to take number before String stuff we need to use one more nextLine() after what wrote above
            scanner.nextLine();
            // ın there I use a java util package and inside it Calender class for take current time and modified ii as only year
            String currentYear = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());

            int year = Integer.parseInt(currentYear);

            int age = year - birhtOfDate;

            if (age >= 0 && age <= 100) {
                System.out.print("Enter Your Name : ");
                String name = scanner.next();

                boolean a = Character.isDigit(name.charAt(0));
                if (a) {
                    System.out.println("Invalid name character");
                }else {
                    System.out.println("Your name is : " + name + ",\t and you are " + age + " years old.");
                }
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Invalid number type");
        }
        scanner.close();

    }


}






























