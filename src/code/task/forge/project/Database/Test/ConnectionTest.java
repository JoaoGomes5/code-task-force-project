package code.task.forge.project.Database.Test;

import code.task.forge.project.Database.ConnectionFactory;

import java.sql.*;

public class    ConnectionTest {

    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();



        Statement stmt = connection.createStatement();
        String query = "SELECT * FROM dbo.COLUMNS;";

        ResultSet result = stmt.executeQuery(query);

        while(result.next()){

            System.out.println(result.getString("name"));
        }


        connection.close();
    }



}
