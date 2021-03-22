package com.jdbc.third.lesson.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Driver {

    public static void main(String[] args) {

        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dbHelper.getConnetion();
            System.out.println("Connection is successed");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT name FROM city");

            while(resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }

        } catch (SQLException exception){
            dbHelper.showErrorMessage(exception);

        } finally {
            try {
                connection.close();
                System.out.println("Connection is closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
