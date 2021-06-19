/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.DAO;

import code.task.forge.project.Database.ConnectionFactory;
import code.task.forge.project.Models.Client;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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
}
