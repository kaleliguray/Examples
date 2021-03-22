package com.jdbc.fifth.lesson.prepareStatement.save.step2;

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
            String sql = "INSERT INTO city (name,countryCode,district,population) VALUES (?,?,?,?)";
            preparedStatement =  connection.prepareStatement(sql);

            preparedStatement.setString(1,"ADANA");
            preparedStatement.setString(2,"TUR");
            preparedStatement.setString(3,"TURKEY");
            preparedStatement.setInt(4,1000000);

            int result  = preparedStatement.executeUpdate();
            System.out.println("Registration Added ");


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
