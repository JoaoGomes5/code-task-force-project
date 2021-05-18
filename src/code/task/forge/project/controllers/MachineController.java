package code.task.forge.project.handlers;

import code.task.forge.project.classes.Component;
import code.task.forge.project.classes.Machine;
import code.task.forge.project.utils.WriteToFile;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * Classe MachineHandler.
 * @author Ricardo Santos
 */

public class MachineHandler {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Machine> machines = new ArrayList<Machine>();

    public static void createMachineFromMenu() throws IOException {
        Machine m = createMachine();
    }

/**
 * Criação da máquina.
 * @return Retorna o objeto máquina.
 * @throws IOException 
 */
    public static Machine createMachine() throws IOException {

        System.out.println("Introduza o código da Máquina");

        String machineCode = reader.readLine();

        System.out.println("Introduza o nome da máquina");

        String machineName = reader.readLine();

        System.out.println("Introduza o horário da máquina");

        String [][] machineSchedule = new String [2][5];
        String [] daysOfWeek = new String[]{"segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira"};

        for(int i = 0;i< daysOfWeek.length;i++){
            System.out.println("Qual o horário da " + daysOfWeek[i] + " ?");
            machineSchedule[0][i] = daysOfWeek[i];
            machineSchedule[1][i] = reader.readLine();
        }

        System.out.println("Introduza o estado da máquina");
        System.out.println("1-Ativo / 2-Inativo");
        int machineStateSelected = reader.read();
        boolean machineState;
        switch (machineStateSelected) {
            case 1:
            machineState = true;
            break;
            case 2:
            machineState = false;
            break;
            default:
                throw new IllegalStateException("Valor introduzido não aceitável");

        }
    Machine machine = new Machine(machineCode,machineName, machineSchedule, machineState);
        machines.add(machine);
        return machine;
    }

    public static void printMachines(){
        for(Machine m : machines){
            WriteToFile.printToFile("Machine", m.toString());
        }
    }

}
