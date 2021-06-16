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


        String clientQuery = "INSERT INTO Client " +
                        "(main_contact, nif, name, annotations) " +
                        "VALUES (?, ?, ?, ?)";

        String contactsQuery = "";


        dao.executeQuery(clientQuery, client.getMainContact().getContact()); // Buscar o id do contacto igual ao client.getMainContact().getContact()
        dao.executeQuery(clientQuery, client.getNif());
        dao.executeQuery(clientQuery, client.getName());
        dao.executeQuery(clientQuery, client.getAnnotation());



        dao.closeConnection();
    }
}
