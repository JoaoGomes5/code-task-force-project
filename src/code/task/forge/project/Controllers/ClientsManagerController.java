package code.task.forge.project.Controllers;

import code.task.forge.project.DAO.ClientDAO;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;
import com.sun.javafx.property.PropertyReference;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ClientsManagerController implements Initializable {

    @FXML
    private Button btnEditClient;

    @FXML
    private Button btnCreateClient;

    @FXML
    private Button btnReturn;

    @FXML
    private TableView<Client> listViewClients;

    @FXML
    private TextField txtFieldSearch;

    @FXML
    private TableColumn<Client, String> clientNif;

    @FXML
    private TableColumn<Client, String> clientName;

    @FXML
    private TableColumn<Client, String> clientAnnotation;


    @FXML
    private Button btnRefresh;

    @FXML
    private Button btnSearch;

    @FXML
    private MenuItem btnAddAddress;

    @FXML
    private MenuItem btnShowAddresses;

    @FXML
    private Button btnAddContact;





    private ClientDAO clientDAO = new ClientDAO();
    private List<Client> clients = clientDAO.read();
    private ObservableList<Client> clientsObservableListList = FXCollections.observableArrayList();
    private Client selectedClient;
    public ClientsManagerController() throws SQLException {
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        try {
//            updateTable();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }


    @FXML
    private void goReturn(ActionEvent event) throws IOException {

        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/MainMenu/MainMenu.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();

    }


    @FXML
    private void goToEditClient(ActionEvent event) throws IOException {

        if(selectedClient != null ){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/code/task/forge/project/Views/ClientsManager/EditClient/EditClient.fxml"));
            Parent parent = loader.load();

            EditClientController controller = loader.getController();

            controller.initData(selectedClient);
            Stage stage = new Stage();
            stage.setTitle(" Editar Perfil");
            stage.setScene(new Scene(parent));
            stage.show();





        }

    }

    @FXML
    private void goToCreateClient(ActionEvent event) throws IOException {

        Parent create_client_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/CreateClient/CreateClient.fxml"));
        Scene create_client_controller_scene = new Scene(create_client_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(create_client_controller_scene);
        app_stage.show();
    }


    @FXML
    private void returnToMainMenu(ActionEvent event) throws IOException {
        Parent return_to_main_menu_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/MainMenu/MainMenu.fxml"));
        Scene return_to_main_menu_scene = new Scene(return_to_main_menu_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_to_main_menu_scene);
        app_stage.show();
    }

    @FXML
    private void goToAddAddress(ActionEvent event) throws IOException {


        if(selectedClient != null ){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/code/task/forge/project/Views/ClientsManager/AddAddressClient/AddAddressClient.fxml"));
            Parent parent = loader.load();

            Stage stage = new Stage();

            AddAddressClientController controller = loader.getController();

            controller.initData(selectedClient);

            stage.setTitle(" Adicionar Morada");
            stage.setScene(new Scene(parent));
            stage.show();
        }
    }

    @FXML
    private void goToAddContact(ActionEvent event) throws IOException {
        Parent go_to_add_contact_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/AddContactClient/AddContactClient.fxml"));
        Scene go_to_add_contact_scene = new Scene(go_to_add_contact_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(go_to_add_contact_scene);
        app_stage.show();
    }

    public void updateTable() throws SQLException {
        if(!clientsObservableListList.isEmpty()){
            clientsObservableListList.clear();
            System.out.println("Cleaned");
        }

        ArrayList<Address> addresses = new ArrayList<>();
        ArrayList<Contact> contacts = new ArrayList<>();

        for(Client client: clients) {
            Client c = new Client(client.getNif(), client.getName(),addresses, contacts, client.getAnnotation());
            clientsObservableListList.add(c);
        }

        clientNif.setCellValueFactory(new PropertyValueFactory<Client, String>("nif"));
        clientName.setCellValueFactory(new PropertyValueFactory<Client, String>("name"));
        clientAnnotation.setCellValueFactory(new PropertyValueFactory<Client, String>("annotation"));

        listViewClients.setItems(clientsObservableListList);

    }

    @FXML
    void filterClients(ActionEvent event) throws SQLException {
        if(!clientsObservableListList.isEmpty()){
            clientsObservableListList.clear();
            System.out.println("Cleaned");
        }

        clients = clientDAO.filter(txtFieldSearch.getText());

        ArrayList<Address> addresses = new ArrayList<>();
        ArrayList<Contact> contacts = new ArrayList<>();

        for(Client client: clients) {

            Client c = new Client(client.getNif(), client.getName(),addresses, contacts, client.getAnnotation());
            clientsObservableListList.add(c);
        }

        clientNif.setCellValueFactory(new PropertyValueFactory<Client, String>("nif"));
        clientName.setCellValueFactory(new PropertyValueFactory<Client, String>("name"));
        clientAnnotation.setCellValueFactory(new PropertyValueFactory<Client, String>("annotation"));

        listViewClients.setItems(clientsObservableListList);
    }


    @FXML
    void setSelectedClient(MouseEvent event) {

        Client client = listViewClients.getSelectionModel().getSelectedItem();

        if(client==null){
            System.out.println("Nothing Selected");
        } else {
            selectedClient = new Client(client.getNif(), client.getName(), client.getAddresses(), client.getContacts(), client.getAnnotation());
        }
    }

    @FXML
    void updateClients(ActionEvent event) throws SQLException {
        clients = null;
        clients = clientDAO.read();
        updateTable();
    }


}

