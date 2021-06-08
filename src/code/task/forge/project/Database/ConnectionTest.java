package code.task.forge.project.Database;

import java.sql.*;

public class ConnectionTest {

    public static void main(String[] args) throws SQLException {

        Connection connection = ConnectionFactory.getConnection();



        Statement stmt = connection.createStatement();
        String query = "SELECT * FROM SYSOBJECTS WHERE xtype = 'U'";

        ResultSet result = stmt.executeQuery(query);

        while(result.next()){

            System.out.println(result.getString("name"));
        }


        connection.close();
    }



}
