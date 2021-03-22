package com.jdbc.seventh.lesson.prepareStatement.delete.step2;

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

            String sql = "DELETE FROM city WHERE id = ?";

            preparedStatement =  connection.prepareStatement(sql);

            preparedStatement.setInt(1,309);

            preparedStatement.executeUpdate();

            System.out.println("Registration Deleted ");


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
