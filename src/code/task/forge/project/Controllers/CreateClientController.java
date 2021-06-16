/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import code.task.forge.project.DAO.ClientDAO;
import code.task.forge.project.DAO.DAO;
import code.task.forge.project.Database.SQLConnection;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Contact;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class CreateClientController implements Initializable {

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
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void returnToClientManager(ActionEvent event) throws IOException {
        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/ClientsManager.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }

    @FXML
    void createClient(ActionEvent event) {

    }

    @FXML
    void createClientTxtAddress(ActionEvent event) {

    }

    @FXML
    void createClientTxtAnnotation(ActionEvent event) {

    }

    @FXML
    void createClientTxtContact(ActionEvent event) {

    }

    @FXML
    void createClientTxtContactObservation(ActionEvent event) {

    }

    @FXML
    void createClientTxtContactType(ActionEvent event) {

    }

    @FXML
    void createClientTxtCountry(ActionEvent event) {

    }

    @FXML
    void createClientTxtLocal(ActionEvent event) {

    }

    @FXML
    void createClientTxtName(ActionEvent event) {

    }

    @FXML
    void createClientTxtNif(ActionEvent event) {

    }

    @FXML
    void createClientTxtPostalCode(ActionEvent event) {

    }

    PreparedStatement pst;
    Connection con;

    @FXML

    void addClient(ActionEvent event) throws SQLException {
        ClientDAO dao = new ClientDAO();

        String nif = txtNif.getText();
        String name = txtName.getText();

        ArrayList<Address> adresses = new ArrayList<>();

        String address = txtAddress.getText();

        Address morada = new Address(txtAddress.getText(),txtPostalCode.getText(),txtLocal.getText(), txtCountry.getText(), "primaria");
        adresses.add(morada);

        ArrayList<Contact> contacts = new ArrayList<>();

        Contact contact = new Contact( txtContact.getText(), txtContactType.getText(), txtContactObservation.getText(), "primaria");
        String annotation = txtAnnotation.getText();

        Client client = new Client( Integer.parseInt(nif), name, adresses, contacts, annotation);

        dao.insert(client);

    }
}
