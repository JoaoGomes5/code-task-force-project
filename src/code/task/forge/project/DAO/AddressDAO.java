package code.task.forge.project.DAO;

import code.task.forge.project.Database.ConnectionFactory;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddressDAO {

    public  void insert(Client client) throws SQLException {


        Connection conn = ConnectionFactory.getConnection();

        String query = "INSERT INTO Address VALUES ( ?, ?, ?, ?, ?, ? )";



        ArrayList<Address> addresses = client.getAddresses();

        for (Address address: addresses) {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, client.getNif() );
            stmt.setString(2, address.getAddress());
            stmt.setString(3, address.getPostalCode());
            stmt.setString(4, address.getLocality());
            stmt.setString(5, address.getCountry());
            stmt.setString(6, address.getImportanceType());

            stmt.execute();
        }


        conn.close();
    }


    public static void read(Address address) {

    }


    public static void update(Address address) {

    }



    public static void delete(Address address) {

    }
}
