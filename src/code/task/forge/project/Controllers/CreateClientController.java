package code.task.forge.project.Controllers;

import code.task.forge.project.DAO.AddressDAO;
import code.task.forge.project.DAO.ClientDAO;
import code.task.forge.project.DAO.ContactDAO;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class CreateClientController {

    @FXML
    private Button btnReturn;

    @FXML
    private TextField txtNif;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtLocal;

    @FXML
    private TextField txtPostalCode;

    @FXML
    private TextField txtCountry;

    @FXML
    private TextField txtContact;

    @FXML
    private TextField txtContactType;

    @FXML
    private TextField txtContactObservation;

    @FXML
    private TextField txtAnnotation;

    @FXML
    private Button btnCreate;

    @FXML
    void createClient(ActionEvent event) throws IOException {

        Parent goToListClients = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/ClientsManager.fxml"));
        Scene tableScene = new Scene(goToListClients);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        app_stage.setScene(go_to_add_address_scene);
        app_stage.show();

        ClientDAO clientDAO = new ClientDAO();
        AddressDAO addressDAO = new AddressDAO();
        ContactDAO contactDAO = new ContactDAO();

        String nif = txtNif.getText();
        String name = txtName.getText();
        String annotation = txtAnnotation.getText();

        ArrayList<Address> addresses = new ArrayList<>();
        Address address = new Address(txtAddress.getText(),txtPostalCode.getText(),txtLocal.getText(), txtCountry.getText(), "principal");
        addresses.add(address);

        ArrayList<Contact> contacts = new ArrayList<>();
        Contact contact = new Contact( txtContact.getText(), txtContactType.getText(), txtContactObservation.getText(), "principal");
        contacts.add(contact);



        Client client = new Client( nif, name, addresses, contacts, annotation);

        try {
            clientDAO.insert(client);
            addressDAO.insert(client);
            contactDAO.insert(client);


            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Sucesso");
            alert.setHeaderText("Cliente criado com sucesso!");


            alert.showAndWait();

            ClientsManagerController clientsTable = new ClientsManagerController();

            clientsTable.updateTable();

        }  catch (SQLException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("ERRO");
            alert.setHeaderText("Algo correu mal :(");
            alert.setContentText(e.getMessage());

            alert.showAndWait();
        }

    }


    @FXML
    void returnToClientManager(ActionEvent event) throws IOException {
        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/ClientsManager.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }

}
