/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.DAO;

import code.task.forge.project.Models.Client;

/**
 *
 * @author joaop
 */
public class ClientDAO {
    public void insert(Client client) {

        DAO dao = new DAO();

        String query = "INSERT INTO Client " +
                "(code, name, ) " +
                "VALUES (?)";

        dao.executeQuery(query, "Gustavo Reis");
        dao.executeQuery(query, "Daniela Azevedo");
        dao.executeQuery(query, "Diogo Silva");

        System.out.println(dao.executeQuery(query, "Dara Alves"));

        dao.closeConnection();
    }
}
