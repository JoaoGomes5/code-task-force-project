package code.task.forge.project.handlers;

import code.task.forge.project.classes.Address;
import code.task.forge.project.classes.Client;
import code.task.forge.project.classes.Contact;
import code.task.forge.project.classes.Operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ClientHandler {

    static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Client> clients = new ArrayList<Client>();

    public static void createClient() throws IOException {
        System.out.println("Introduza o NIF");
        String clientNif = reader.readLine();

        System.out.println("Introduza o nome");
        String clientName = reader.readLine();

        Address address = AddressHandler.createAddress();

        Contact contact = ContactHandler.createContact();

        System.out.println("Introduza uma nota do cliente");
        String clientAnnotation = reader.readLine();
        
    //      System.out.println("Introduza o numero de operações");
    // int operationsQuantity = reader.read();

    // ArrayList<Address> addresses = new ArrayList<>();

    // for(int i = 0; i < operationsQuantity; i++) {
    //     System.out.println("Operação nº " + i);
    //     Address address = .createOperation();
    //     addresses.add(operation);
    // }


    // Client client = new Client(clientNif, clientName, address, contact,clientAnnotation);


    // return client;
    }

}

