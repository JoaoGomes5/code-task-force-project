package code.task.forge.project.handlers;


import code.task.forge.project.classes.Part;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PartHandler {

    public static ArrayList<Part> parts = new ArrayList<Part>();

    public static void createPart() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.io));

        System.out.println("Introduza a referência");
            String reference = reader.readLine();
        System.out.println("Introduza a designação");
            String designation = reader.readLine();
        System.out.println("Introduza a designação comercial");
            int batchSize = reader.read();
        System.out.println("Introduza a unidade");
            String unit = reader.readLine();
        System.out.println("Introduza a versão");
            String version = reader.readLine();
        System.out.println("Introduza o estado");
        System.out.println("1- Ativo /n2- Inativo");
        int option = reader.read();

        boolean state = switch (option) {
            case 1 -> true;
            case 2 -> false;
            default -> throw new IllegalStateException("Valor invalido: " + option);
        };


        Part part = new Part(
                reference,
                designation,
                batchSize,
                unit,
                version,
                state
        );

        parts.add(part);


    }

}
