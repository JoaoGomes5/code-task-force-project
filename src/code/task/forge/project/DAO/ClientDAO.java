/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.DAO;

import code.task.forge.project.Database.ConnectionFactory;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author joaop
 */

public class ClientDAO {


    public void insert(Client client) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();

        String clientQuery = "INSERT INTO Client " +
                "( nif, name, annotations) " +
                "VALUES ( ?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(clientQuery);

        stmt.setString(1, client.getNif());
        stmt.setString(2, client.getName());
        stmt.setString(3, client.getAnnotation());


        stmt.execute();

        conn.close();

    }

    public List<Client> read() throws SQLException {

        Connection conn = ConnectionFactory.getConnection();
        Statement stmt = conn.createStatement();


        String query = "SELECT * FROM Client";

        List<Client> clients = new ArrayList();


        ResultSet result = stmt.executeQuery(query);

        while (result.next()) {
            ArrayList<Address> addresses = new ArrayList<>();
            ArrayList<Contact> contacts = new ArrayList<>();

            clients.add(new Client(result.getString("nif"), result.getString("name"), addresses, contacts, result.getString("annotations")));
        }

        stmt.close();
        conn.close();

        return clients;

    }

    public List<Client> filter(String search) throws SQLException {
        if (search.length() == 0) {
            return read();
        } else {
            Connection conn = ConnectionFactory.getConnection();
            Statement stmt = conn.createStatement();

            List<Client> clients = new ArrayList();
            String query = "SELECT * FROM Client WHERE Client.name LIKE " + "'" + search + "%'";


            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                ArrayList<Address> addresses = new ArrayList<>();
                ArrayList<Contact> contacts = new ArrayList<>();

                clients.add(new Client(result.getString("nif"), result.getString("name"), addresses, contacts, result.getString("annotations")));
            }

            stmt.close();
            conn.close();

            return clients;
        }


    }

    public void update(String nif, Client client) throws SQLException {
        Connection conn = ConnectionFactory.getConnection();

        String query = "UPDATE  Client " +
                "SET nif=? ,name=? ,annotations=? " +
                "WHERE nif=?";

        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setString(1, client.getNif());
        stmt.setString(2, client.getName());
        stmt.setString(3, client.getAnnotation());
        stmt.setString(4, nif);


        stmt.execute();

        conn.close();

    }
}
