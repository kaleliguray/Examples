package com.jdbc.second.lesson.dbHelper;

import java.sql.Connection;
import java.sql.SQLException;

public class Driver {

    public static void main(String[] args) {

        Connection connection = null;
        DbHelper dbHelper = new DbHelper();

        try{

            connection = dbHelper.getConnection();

            System.out.println("Connection is successful");

        } catch (SQLException exception){

            dbHelper.showErrorMessage(exception);

        } finally {

            try {
                connection.close();

                System.out.println("Connection is closed");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }



}























