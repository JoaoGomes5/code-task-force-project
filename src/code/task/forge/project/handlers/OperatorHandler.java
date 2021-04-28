package code.task.forge.project.handlers;

import code.task.forge.project.classes.Operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class OperatorHandler {

    static BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Operator> operators = new ArrayList<Operator>();

    public static Operator createOperator() throws IOException {
        System.out.println("Introduza o codigo do operador");
        String operatorCode = reader.readLine();
        System.out.println("Introduza o nome do operador");
        String operatorName = reader.readLine();

        System.out.println("Introduza o horário do operador");

        int[] operatorSchedule = new int[5];
        String[] daysOfWeek = new String[]{"segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira"};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Qual o horário da" + daysOfWeek[i] + " ?");
                operatorSchedule[j] = reader.read();
            }
        }

        System.out.println("Introduza o estado do operador");
        System.out.println("1- Ativo /n2- Inativo");
        int operatorStateSelected = reader.read();

        boolean operatorState;
        switch (operatorStateSelected) {
            case 1:
                operatorState = true;
                break;
            case 2:
                operatorState = false;
                break;
            default:
                throw new IllegalStateException("Valor introduzido não aceitavel");
        }

        Operator operator = new Operator(operatorCode, operatorName, operatorSchedule, operatorState);

        return operator;
    }

}
