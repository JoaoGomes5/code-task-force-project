package code.task.forge.project.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionFactory.getConnection();

        String query = "CREATE TABLE  teste ("
                + "id INT IDENTITY(1,1) CONSTRAINT PK_teste_id PRIMARY KEY,"
                + "name VARCHAR(55) NOT NULL"
                + ")";

        Statement stmt = connection.createStatement();
        stmt.execute(query);

        System.out.println("Table created!!");
        connection.close();
    }
}
