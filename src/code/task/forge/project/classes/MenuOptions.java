package code.task.forge.project.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class MenuOptions {

    static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static void createOrder() {


    }

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
