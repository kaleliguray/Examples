package com.jdbc.first.lesson.starter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {

    public static String userName ="root";
    public static String password ="1903kaleliguray";
    public static String dbUrl ="jdbc:mysql://localhost:3306/world";

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try{

            connection = DriverManager.getConnection(dbUrl,userName,password);

            System.out.println("Connection is successful");

        } catch (Exception exception){

            System.err.println(exception.getMessage());

        } finally {

            connection.close();

            System.out.println("Connection is closed");
        }


    }



}























