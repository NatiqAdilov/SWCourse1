package org.example;

import java.sql.*;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws SQLException{
        Connection connection=  DriverManager.getConnection(

                "jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "2005"
        );
        String query = "select * from \"users\" ";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

    }
}