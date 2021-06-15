/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    private TextField txtCity;
    @FXML
    private TextField txtPostalCode;
    @FXML
    private TextField txtDorNumber;
    @FXML
    private Button btnReturn;
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
    private void addAddressClientTxtAddress(ActionEvent event) {
    }

    @FXML
    private void addAddressClientTxtCity(ActionEvent event) {
    }

    @FXML
    private void addAddressClientTxtPostalCode(ActionEvent event) {
    }

    @FXML
    private void addAddressClientTxtDorNumber(ActionEvent event) {
    }

    @FXML
    private void returnToClientManager(ActionEvent event) throws IOException {
        Parent return_to_client_manager_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/ClientsManager.fxml"));
        Scene return_to_client_manager_scene = new Scene(return_to_client_manager_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_to_client_manager_scene);
        app_stage.show();
    }

    @FXML
    private void addAddressClient(ActionEvent event) {
    }
    
}
