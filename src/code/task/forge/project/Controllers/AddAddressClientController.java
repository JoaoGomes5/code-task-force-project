/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import code.task.forge.project.DAO.AddressDAO;
import code.task.forge.project.DAO.ClientDAO;
import code.task.forge.project.DAO.ContactDAO;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;
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
 * @author Ricardo Santos
 */
public class AddAddressClientController implements Initializable {



    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtPostalCode;

    @FXML
    private TextField txtCountry;

    @FXML
    private TextField txtLocality;

    @FXML
    private Button btnAddAddress;

    private String selectedNif = "";
    @FXML
    void addAddressClient(ActionEvent event) throws IOException {

        Parent goToListClients = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/ClientsManager.fxml"));
        Scene tableScene = new Scene(goToListClients);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        app_stage.show();

        AddressDAO addressDAO = new AddressDAO();


        String name = "";
        String annotation = "";

        ArrayList<Address> addresses = new ArrayList<>();

        Address address = new Address(txtAddress.getText(),txtPostalCode.getText(),txtLocality.getText(), txtCountry.getText(), "secundaria");
        addresses.add(address);

        ArrayList<Contact> contacts = new ArrayList<>();

        Client client = new Client( selectedNif, name, addresses, contacts, annotation);
        try {

            addressDAO.insert(client);



            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Sucesso");
            alert.setHeaderText("Morada criada com sucesso!");


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



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void initData(Client client){
        if(client != null){
            selectedNif = client.getNif();
        }

    }
}
