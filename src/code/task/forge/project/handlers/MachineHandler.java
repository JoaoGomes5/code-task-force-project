package code.task.forge.project.handlers;

import code.task.forge.project.classes.Component;
import code.task.forge.project.classes.Machine;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MachineHandler {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static ArrayList<Machine> machines = new ArrayList<Machine>();

    public static Machine createMachine() throws IOException {
        System.out.println("Introduza o código da Máquina");

        String machineCode = reader.readLine();

        System.out.println("Introduza o nome da máquina");

        String machineName = reader.readLine();

        System.out.println("Introduza o horário da máquina");

        int [] machineSchedule = new int [5];
        String [] daysOfWeek = new String[]{"segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira"};

        for (int i=0; i<=machineSchedule.length; i++)
            for (int j=0; i<=daysOfWeek.length; j++) {
                System.out.println("Qual o horário da " + daysOfWeek[i] + " ?");
                machineSchedule[j] = reader.read();
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

}
