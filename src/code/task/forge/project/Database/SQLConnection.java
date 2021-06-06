package code.task.forge.project.Database;

import java.sql.*;

public class SQLConnection {

    public static Connection getDatabaseConnection(){
        String url= "";
        String username= "";
        String password= "";

        Connection connect = null;
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
        String query = "Select * from teste";
        ResultSet rs = st.executeQuery(query);
        while(rs.next()){

            System.out.println(rs.getString("name"));
        }
    }
}
