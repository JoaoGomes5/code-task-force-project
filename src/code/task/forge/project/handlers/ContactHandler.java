package code.task.forge.project.handlers;

import code.task.forge.project.classes.Contact;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ContactHandler {

    static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Contact> contacts = new ArrayList<Contact>();

    public static Contact createContact() throws IOException {

        System.out.println("Introduza o Cotacto");
        String contactContact = reader.readLine();

        System.out.println("Introduza o tipo de contacto");
        String contactType = reader.readLine();

        System.out.println("Introduza alguma observação");
        String contactObservation = reader.readLine();


        Contact contact = new Contact(contactContact, contactType,contactObservation);


        return contact;
    }

}
