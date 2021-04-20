package code.task.forge.project.classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

    public void Menu() throws IOException {

        int op = 0;
        while (true) {
            System.out.println("Escolha uma opção");
            System.out.println("1-> Criar encomenda");
            System.out.println("2-> Criar produto");
            System.out.println("3-> Criar operador");
            System.out.println("4-> Criar maquina");
            System.out.println("5-> Criar peça");
            System.out.println("6-> Criar operação");
            System.out.println("7-> Criar componente");
            System.out.println("8-> Registar horario de trabalho de um operador");
            System.out.println("9-> Registar horario de trabalho de uma maquina");
            System.out.println("0-> Sair");


            try {
                op = Integer.parseInt(reader.readLine());
                switch (op) {
                    case 0:
                        return;
                    case 1:
                        MenuOptions.createOrder();
                        break;
                    case 2:
                        MenuOptions.createProduct();
                        break;
                    case 3:
                        MenuOptions.createOperator();
                        break;
                    case 4:
                        MenuOptions.createMachine();
                        break;
                    case 5:
                        MenuOptions.createPart();
                        break;
                    case 6:
                        MenuOptions.createOperation();
                        break;
                    case 7:
                        MenuOptions.createComponent();
                        break;
                    case 8:
                        MenuOptions.registerScheduleOperator();
                        break;
                    case 9:
                        MenuOptions.registerScheduleMachine();
                        break;

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Opcão invalida");
            }
        }
    }

}

