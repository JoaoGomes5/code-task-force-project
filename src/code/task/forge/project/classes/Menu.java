package code.task.forge.project.classes;

import code.task.forge.project.handlers.*;

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
            System.out.println("1-> Gestão de Clientes");
            System.out.println("2-> Gestão de Encomendas");
            System.out.println("3-> Gestão de Stock");
            System.out.println("4-> Fichas técnicas");
            System.out.println("5-> Adicionar a base de dados");
            System.out.println("6-> Configuração");
            System.out.println("0-> Sair");


        /*
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
        */

            try {
                op = Integer.parseInt(reader.readLine());
                switch (op) {
                    case 0:
                        return;
                    case 1:
                        menuManageClients();
                        break;
                    case 2:
                        menuManageOrders();
                        break;
                    case 3:
                        menuManageStock();
                        break;
                    case 4:
                        menuDatasheet();
                        break;
                    case 5:
                        menuAddToDatabase();
                        break;
                    case 6:
                        menuConfigurations();
                        break;

                        /*
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
                         */

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Opcão invalida");
            }
        }
    }

    public void menuManageClients() throws IOException {
        int op = 0;
        while (true) {
            System.out.println("1-> Inserir Cliente novo");
            System.out.println("2-> ");
            System.out.println("3-> ");
            System.out.println("4-> ");
            System.out.println("0-> retornar");
            // Read data using readLine

            try {
                op = Integer.parseInt(reader.readLine());
                switch (op) {
                    case 0:
                        return;
                    case 1:
                        ClientHandler.createClient();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Opcão invalida");
            }
        }
    }

    public void menuManageOrders() throws IOException {
        int op = 0;
        while (true) {
            System.out.println("1-> Criar uma encomenda");
            System.out.println("2-> Procurar por numero de documento");
            System.out.println("3-> ");
            System.out.println("4-> ");
            System.out.println("0-> retornar");
            // Read data using readLine

            try {
                op = Integer.parseInt(reader.readLine());
                switch (op) {
                    case 0:
                        return;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Opcão invalida");
            }
        }
    }

    public void menuManageStock() throws IOException {
        int op = 0;
        while (true) {
            System.out.println("1-> Introduzir componente ao stock");
            System.out.println("2-> ");
            System.out.println("3-> ");
            System.out.println("4-> ");
            System.out.println("0-> retornar");
            // Read data using readLine

            try {
                op = Integer.parseInt(reader.readLine());
                switch (op) {
                    case 0:
                        return;
                    case 1:
                        System.out.println("Qual a referencia da componente");
                        String componentReference = reader.readLine();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Opcão invalida");
            }
        }
    }

    public void menuDatasheet() throws IOException {
        int op = 0;
        while (true) {
            System.out.println("1-> ");
            System.out.println("2-> ");
            System.out.println("3-> ");
            System.out.println("4-> ");
            System.out.println("0-> retornar");
            // Read data using readLine

            try {
                op = Integer.parseInt(reader.readLine());
                switch (op) {
                    case 0:
                        return;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;

                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Opcão invalida");
            }
        }
    }

    public void menuAddToDatabase() throws IOException {
        int op = 0;
        while (true) {
            System.out.println("1-> Criar Parte/Produto");
            System.out.println("2-> Criar Componente");
            System.out.println("3-> Criar Operador");
            System.out.println("4-> Criar Maquina");
            System.out.println("5-> Criar Operação");
            System.out.println("0-> retornar");
            // Read data using readLine

            try {
                op = Integer.parseInt(reader.readLine());
                switch (op) {
                    case 0:
                        return;
                    case 1:
                        PartHandler.createPart();
                        break;
                    case 2:
                        ComponentHandler.createComponent();
                        break;
                    case 3:
                        OperatorHandler.createOperator();
                        break;
                    case 4:
                        MachineHandler.createMachine();
                        break;
                    case 5:
                        OperationHandler.createOperation();
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("Opcão invalida");
            }
        }
    }

    public void menuConfigurations() throws IOException {
        int op = 0;
        while (true) {
            System.out.println("1-> Write to file");
            System.out.println("2-> ");
            System.out.println("3-> ");
            System.out.println("4-> ");
            System.out.println("0-> retornar");
            // Read data using readLine

            try {
                op = Integer.parseInt(reader.readLine());
                switch (op) {
                    case 0:
                        return;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

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
