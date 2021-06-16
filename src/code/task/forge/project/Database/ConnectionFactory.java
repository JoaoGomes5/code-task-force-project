package code.task.forge.project.Database;

import java.io.IOException;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Properties;

public class ConnectionFactory {
    public static Connection getConnection() {

        try {
            Properties prop = getProperties();

            final String url = prop.getProperty("database.url");
            final String user = prop.getProperty("database.user");
            final String password = prop.getProperty("database.password");

            System.out.println("Connection Successful");

            return DriverManager.getConnection(url);


        } catch (SQLException | IOException e) {

            System.out.println("Error - Connection Failed");
            throw new RuntimeException(e);
        }

    }

    private static Properties getProperties() throws IOException {
        Properties prop = new Properties();

        String path = "/connection.properties";
        prop.load(ConnectionFactory.class.getResourceAsStream(path));

        return prop;
    }
}
