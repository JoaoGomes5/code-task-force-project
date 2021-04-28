package code.task.forge.project.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;


    public class ClientHandler {

        static BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        public static ArrayList<Client> operators = new ArrayList<Client>();

        public static Client createClient() throws IOException {
            System.out.println("Introduza o NIF");
            String clientNif = reader.readLine();

            System.out.println("Introduza o nome");
            String clienteName = reader.readLine();

            System.out.println("Introduza a morada");
            String clientAddress = reader.readLine();

            System.out.println("Introduza o código postal");
            String clientPostalCode = reader.readLine();

            System.out.println("Introduza a localidade");
            String clientLocality = reader.readLine();

            System.out.println("Introduza o país");
            String clientCoutry = reader.readLine();

            System.out.println("Introduza o Cotacto");
            String clientContact = reader.readLine();

            System.out.println("Introduza alguma observação");
            String clientObservation = reader.readLine();

            System.out.println("Introduza uma nota do cliente");
            String clientAnnotation = reader.readLine();
            }

            Client client = new Client( String clientName, String clientAddress, String clientPostalCode,
                                        String clientLocality, String clientCountry, String clientContact,
                                        String clientContactType, String clientObservation, String clientAnnotation);

            return client;
        }

    }
}
