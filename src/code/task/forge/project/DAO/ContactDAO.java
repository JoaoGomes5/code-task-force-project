package code.task.forge.project.DAO;


import code.task.forge.project.Database.ConnectionFactory;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDAO {

    public  void insert(Client client) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();

        String query = "INSERT INTO Contact VALUES ( ?, ?, ?, ?, ? )";



        ArrayList<Contact> contacts = client.getContacts();

        for (Contact contact: contacts) {
            PreparedStatement stmt = conn.prepareStatement(query);
            System.out.println(contact.getContact());
            stmt.setString(1, client.getNif() );
            stmt.setString(2, contact.getContact());
            stmt.setString(3, contact.getContactType());
            stmt.setString(4, contact.getObservation());
            stmt.setString(5, contact.getImportanceType());

            stmt.execute();
        }


        conn.close();
    }


    public static List<Contact> read(String nif) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();

        Statement stmt = conn.createStatement();
        List<Contact> contacts = new ArrayList();



        String query = "SELECT  \n" +
                "\t*\n" +
                "FROM Client \n" +
                " INNER JOIN Contact ON Client.nif = Contact.client_id WHERE Client.nif=" + "'" + nif + "';" ;






        ResultSet result = stmt.executeQuery(query);

        while (result.next()) {

            contacts.add(new Contact(
                    result.getString("contact"),
                    result.getString("contact_type") ,
                    result.getString("observation"),
                    result.getString("importance_type")
            ));


        }

        stmt.close();
        conn.close();

        return contacts;
    }


    public static void update(Contact contact) {

    }



    public static void delete(Contact contact) {

    }

}
