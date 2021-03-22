package com.jdbc.sixth.lesson.prepareStatement.update.step1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Driver {

    public static void main(String[] args) {

        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement preparedStatement = null;

        try {

            connection = dbHelper.getConnection();
            System.out.println("Conneciton is opened");
            preparedStatement =  connection.prepareStatement("UPDATE city SET population = 200000, district = 'Turkey' WHERE id = 308");

            int result  = preparedStatement.executeUpdate();
            System.out.println("Registration Updated ");


        } catch (SQLException ex) {
            dbHelper.showErrorMessage(ex);

        }finally {

            try {
                preparedStatement.close();
                connection.close();
                System.out.println("Connection is closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

}
