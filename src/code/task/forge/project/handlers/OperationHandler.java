package code.task.forge.project.handlers;

import code.task.forge.project.classes.Machine;
import code.task.forge.project.classes.Operation;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import code.task.forge.project.classes.Component;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OperationHandler {

    ArrayList<Operation> operations = new ArrayList<Operation>();

    static BufferedReader reader
            = new BufferedReader(new InputStreamReader(System.in));

    /**
     *
     * @throws IOException
     */
    public static Operation createOperation() throws IOException {
        System.out.println("Intruduza a ordem da operação!");
        int operationOrder = reader.read();
        System.out.println("Introduza a identificação da operação!");
        String operationName = reader.readLine();
        
              
        
            Machine machine = MachineHandler.createMachine();
    
            
        System.out.println("Introduza a quantidade de operadores necessários para a operação!");
        int operationOperatorsNeeded = reader.read();
        System.out.println("Introduza o tempo em segundos da operação!");
        int operationExecutionTime = reader.read();
        System.out.println("Introduza quantidade produzida por hora na operação! ");
        int operationQuantityPerHour = reader.read();
        System.out.println("Introduza as instruções técnicas da operação!");
        String operationInstructions = reader.readLine();
        
            ArrayList<Component> component;
            ComponentHandler.createComponent();

        Operation operation = new Operation(operationOrder, operationName, machine , operationOperatorsNeeded, operationExecutionTime, operationQuantityPerHour, operationInstructions, component);

        operations.add(operation);

        return operation;

    }

}
