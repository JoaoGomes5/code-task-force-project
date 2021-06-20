package code.task.forge.project.DAO;

import code.task.forge.project.Database.ConnectionFactory;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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



    public List<Address> read(String nif) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();
        Statement stmt = conn.createStatement();
        List<Address> addresses = new ArrayList();



        String query = "SELECT  \n" +
                "\t*\n" +
                "FROM Client \n" +
                " INNER JOIN Address ON Client.nif = Address.client_id WHERE Client.nif= " + "'" + nif + "';" ;


        ResultSet result = stmt.executeQuery(query);

        while (result.next()) {
//            System.out.println(result.getString("postal_code"));

            addresses.add(new Address(
                                    result.getString("address"),
                                    result.getString("postal_code"),
                                    result.getString("locality"),
                                    result.getString("country") ,
                                    result.getString("importance_type")
            ));


        }

        stmt.close();
        conn.close();

        return addresses;

    }

    public void filter()  {

    }

    public void update()  {
    }
}
