package code.task.forge.project;

import java.sql.*;

public class SQLConnection {

    public static Connection getDatabaseConnection(){
        String url= "jdbc:sqlserver://ctespbd.dei.isep.ipp.pt:1433;databaseName=LP2_G3_2021";
        String username= "lp2_g3_2021";
        String password= "LP2_2020_bd_3";
        Connection connect= null;
        try {
            connect = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");
        }
        catch (SQLException e) {
            System.out.println("Error - Connection Failed");
            e.printStackTrace();
        }

        return connect;
    }

    public static void all2you() throws SQLException {

        Connection con = getDatabaseConnection();
        Statement st = con.createStatement();
        String query = "Select * from component";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){

            System.out.println(rs.getString("name"));
        }
    }
}
