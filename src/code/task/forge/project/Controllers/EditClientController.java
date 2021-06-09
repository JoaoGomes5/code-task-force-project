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
 * @author André Marques
 */
public class EditClientController implements Initializable {

    @FXML
    private Button btnReturn;
    @FXML
    private TextField txtNif;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtContact;
    @FXML
    private TextField txtAnnotation;
    @FXML
    private Button btnCreate;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtDorNumber;
    @FXML
    private TextField txtCity;
    @FXML
    private TextField txtPostalCode;
    @FXML
    private TextField txtContactType;
    @FXML
    private TextField txtContactObservation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returnApp(ActionEvent event) throws IOException {
        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/ClientsManager.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }
    @FXML
    private void editClient(ActionEvent event) {
    }

    @FXML
    private void editClientTxtNif(ActionEvent event) {
    }

    @FXML
    private void editClientTxtName(ActionEvent event) {
    }

    @FXML
    private void editClientTxtAddress(ActionEvent event) {
    }

    @FXML
    private void editClientTxtDorNumber(ActionEvent event) {
    }

    @FXML
    private void editClientTxtCity(ActionEvent event) {
    }

    @FXML
    private void editClientTxtPostalCode(ActionEvent event) {
    }

    @FXML
    private void editClientTxtContact(ActionEvent event) {
    }

    @FXML
    private void editClientTxtContactType(ActionEvent event) {
    }

    @FXML
    private void editClientTxtContactObservation(ActionEvent event) {
    }

    @FXML
    private void editClientTxtAnnotation(ActionEvent event) {
    }
    
}
