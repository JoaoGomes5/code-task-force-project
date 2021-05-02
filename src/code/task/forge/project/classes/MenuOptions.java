package code.task.forge.project.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class MenuOptions {

    static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static void createClient() throws IOException {
        System.out.println("Intruduza o NIF");
        String clientNif = reader.readLine();
        System.out.println("Intruduza o nome");
        String clienteName = reader.readLine();
        System.out.println("Intruduza a morada");
        String clientAddress = reader.readLine();
        System.out.println("Intruduza o código postal");
        String clientPostalCode = reader.readLine();
        System.out.println("Intruduza a localidade");
        String clientLocality = reader.readLine();
        System.out.println("Intruduza o país");
        String clientCoutry = reader.readLine();
        System.out.println("Intruduza a Cotacto");
        String clientContact = reader.readLine();
        System.out.println("Intruduza o tipo de contacto");
        String clientContactType = reader.readLine();
        System.out.println("Intruduza alguma observação");
        String clientObservation = reader.readLine();
        System.out.println("Intruduza uma nota do cliente");
        String clientAnnotation = reader.readLine();
    }

    public static void createOrder() throws IOException {
        System.out.println("Intruduza o NIF do cliente");
        String orderClientNif = reader.readLine();
        System.out.println("Intruduza o morada de faturação");
        String orderBillingAddress = reader.readLine();
        System.out.println("Intruduza a morada de entrega");
        String orderDeliveryAddress = reader.readLine();
        System.out.println("Intruduza o numero de documento");
        String orderDocumentNumber = reader.readLine();
        System.out.println("Intruduza o estado da encomenda");
        String orderState = reader.readLine();
        System.out.println("Intruduza o desconto da encomenda");
        String orderDiscount = reader.readLine();
        System.out.println("Intruduza o valor total da encomenda");
        String orderTotalValue = reader.readLine();

        System.out.println("Intruduza linhas");
        String clientContactType = reader.readLine();
    }

/*public static void alterDocumentNumber() throws IOException {
        System.out.println("Intruduza o numero de documento da encomenda");
        String alterOrderDocumentNumber = reader.readLine();
        if (orderDocumentNumber.equals(alterOrderDocumentNumber)){
            getState.equals(sim)
        }
}*/

    public static void createProduct() {


    }

    public static void createOperator() throws IOException {
        System.out.println("Intruduza o codigo da operador");
        String code = reader.readLine();
        System.out.println("Intruduza o nome da operador");
        String nome = reader.readLine();

    }

    public static void createMachine() throws IOException {
        System.out.println("Intruduza o codigo da maquina");
        String code = reader.readLine();
        System.out.println("Intruduza o nome da maquina");
        String nome = reader.readLine();

    }

    public static void createPart() {


    }

    public static void createOperation() {


    }

    public static void createComponent() throws IOException {
        System.out.println("Intruduza a referencia da componente");
        String reference = reader.readLine();
        System.out.println("Intruduza a designação comercial da componente");
        String commercialDesignation = reader.readLine();
        System.out.println("Intruduza a versão da componente");
        String version = reader.readLine();
        System.out.println("Intruduza a unidade de medida da componente");
        String measureUnit = reader.readLine();
        System.out.println("Intruduza a alternativa da componente");
        String alternative = reader.readLine();
    }

    public static void registerScheduleOperator() {


    }

    public static void registerScheduleMachine() {


    }

}
