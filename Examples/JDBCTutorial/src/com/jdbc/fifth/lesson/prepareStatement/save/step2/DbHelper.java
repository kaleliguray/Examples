package com.jdbc.fifth.lesson.prepareStatement.save.step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private String url = "jdbc:mysql://localhost:3306/world";
    private String username = "root";
    private String password = "1903kaleliguray";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: " + exception.getErrorCode());
    }

}
