package code.task.forge.project.handlers;

import code.task.forge.project.classes.Address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class AddressHandler {

    static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Address> address = new ArrayList<Address>();

    public static Address createAddress() throws IOException {

        System.out.println("Introduza a morada");
        String clientAddress = reader.readLine();

        System.out.println("Introduza o código postal");
        String clientPostalCode = reader.readLine();

        System.out.println("Introduza a localidade");
        String clientLocality = reader.readLine();

        System.out.println("Introduza o país");
        String clientCountry = reader.readLine();

        Address address = new Address(clientAddress, clientPostalCode, clientLocality, clientCountry);



        return address;
    }

}
