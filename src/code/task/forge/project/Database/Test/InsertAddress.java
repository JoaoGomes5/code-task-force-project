package code.task.forge.project.Database.Test;

import code.task.forge.project.DAO.AddressDAO;
import code.task.forge.project.DAO.DAO;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;

import java.awt.font.FontRenderContext;
import java.lang.constant.Constable;
import java.util.ArrayList;

public class InsertAddress {

    public static void main(String[] args) {

//        Contact contact = new Contact(
//                "joaopfg.2002@gmail.com",
//                "email",
//                "bla bla bla"
//        );
//
//        Contact primcipalContact = new Contact(
//                "911222000",
//                "telemovel",
//                "bla bla bla"
//        );
//
//        ArrayList<Contact> contacts = new ArrayList<>();
//
//        contacts.add(contact);
//
//        Address address = new Address(
//                "bla bla bla",
//                "4500-202",
//                "Espinho",
//                "Portugal",
//                "principal"
//        );
//
//        ArrayList<Address> addresses = new ArrayList<>();
//
//        addresses.add(address);
//
//        Client client = new Client(
//                242078365,
//                "Joao",
//                addresses,
//                primcipalContact,
//                contacts,
//                "bla bla bla"
//        );


        DAO dao = new DAO();

        String query = "INSERT INTO Address VALUES ( 1, 'sdasda', '3123123', 'sadasda', 'adsasda')";

//        dao.executeQuery(query, 1);
//        dao.executeQuery(query, "bla bla bla");
//        dao.executeQuery(query, "4500-121");
//        dao.executeQuery(query,  "Cesque");
//        dao.executeQuery(query,  "Teste");

        dao.executeQuery(query);


        dao.closeConnection();





    }
}
