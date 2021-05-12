package code.task.forge.project.handlers;


import code.task.forge.project.classes.Part;
import code.task.forge.project.classes.Operation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Classe PartHandler. 
 * @author Ricardo Santos
 */
public class PartHandler {

    public static ArrayList<Part> parts = new ArrayList<Part>();

/**
 * Criação da peça.
 * @return Retorna o objeto peça.
 * @throws IOException 
 */
    public static Part createPart() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Introduza a referência");
            String reference = reader.readLine();
        System.out.println("Introduza a designação");
            String designation = reader.readLine();
        System.out.println("Introduza a designação comercial");
            String commercialDesignation = reader.readLine();
        System.out.println("Introduza a designação comercial");
            int batchSize = reader.read();
        System.out.println("Introduza a unidade");
            String unit = reader.readLine();
        System.out.println("Introduza a versão");
            String version = reader.readLine();
        System.out.println("Introduza o estado");
        System.out.println("1- Ativo /n2- Inativo");
        int option = reader.read();

        boolean state;
        switch (option) {
            case 1 : 
                state = true;
                break;
            case 2 : 
                state = false;
                break;
            default:
                throw new IllegalStateException("Valor invalido: " + option);
        }
        
        System.out.println("Introduza o numero de operações");
        int operationsQuantity = reader.read();

        ArrayList<Operation> operations = new ArrayList<Operation>();

        for(int i = 0; i < operationsQuantity; i++) {
            System.out.println("Operação nº " + i);
            Operation operation = OperationHandler.createOperation();
            operations.add(operation);
        }


        Part part = new Part(
                reference,
                designation,
                commercialDesignation,
                batchSize,
                unit,
                version,
                state,
                operations
        );
       
        parts.add(part);
        
        return part;

    }
    
    
    

}
