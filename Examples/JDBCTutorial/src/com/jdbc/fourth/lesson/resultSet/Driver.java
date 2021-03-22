package com.jdbc.fourth.lesson.resultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dbHelper.getConnection();
            System.out.println("Conneciton is opened");

            statement = connection.createStatement();
            resultSet =  statement.executeQuery("SELECT name, countryCode, district, population FROM city");

            ArrayList<City> cities = new ArrayList<City>();

            while (resultSet.next()){
                cities.add(new City(resultSet.getString("name"),
                                    resultSet.getString("countryCode"),
                                    resultSet.getString("district"),
                                    resultSet.getInt("population")));
            }
            System.out.println(cities.size());

        } catch (SQLException ex) {
            dbHelper.showErrorMessage(ex);

        }finally {

            try {
                connection.close();
                System.out.println("Connection is closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }

}
