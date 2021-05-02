package code.task.forge.project.handlers;

import code.task.forge.project.classes.Machine;
import code.task.forge.project.classes.Operation;
import code.task.forge.project.classes.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OperationHandler {

    public static ArrayList<Operation> operations = new ArrayList<Operation>();

    static BufferedReader reader
            = new BufferedReader(new InputStreamReader(System.in));

    /**
     *
     * @throws IOException
     */
    public static Operation createOperation() throws IOException {
        System.out.println("Introduza a ordem da operação!");
        int operationOrder = reader.read();
        System.out.println("Introduza a identificação da operação!");
        String operationName = reader.readLine();


        
        Machine  machine = null;
        try {
            machine = MachineHandler.createMachine();
        } catch (Exception e) {
            System.out.println("Erro: " +  e.getMessage());
        }
            
        System.out.println("Introduza a quantidade de operadores necessários para a operação!");
        int operationOperatorsNeeded = reader.read();
        System.out.println("Introduza o tempo em segundos da operação!");
        int operationExecutionTime = reader.read();
        System.out.println("Introduza quantidade produzida por hora na operação! ");
        int operationQuantityPerHour = reader.read();
        System.out.println("Introduza as instruções técnicas da operação!");
        String operationInstructions = reader.readLine();
        Component component = null;
        try {
            component = ComponentHandler.createComponent();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }


        Operation operation = new Operation(operationOrder, operationName, machine, operationOperatorsNeeded, operationExecutionTime, operationQuantityPerHour, operationInstructions, components);

        operations.add(operation);

        return operation;

    }

}
