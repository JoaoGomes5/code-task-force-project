package code.task.forge.project.DAO;


import code.task.forge.project.Database.ConnectionFactory;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

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


    public static void read(Contact contact) {

    }


    public static void update(Contact contact) {

    }



    public static void delete(Contact contact) {

    }

}
