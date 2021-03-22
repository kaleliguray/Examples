package com.jdbc.sixth.lesson.prepareStatement.update.step2;

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
            String sql = "UPDATE city SET population = 300000, district = 'Turkey' WHERE id = ?";

            preparedStatement =  connection.prepareStatement(sql);
            preparedStatement.setInt(1,309);

            preparedStatement.executeUpdate();

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
