/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

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

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class CreateOperationController implements Initializable {

    @FXML
    private TextField txtCode;
    @FXML
    private Button btnReturn;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtOrder;
    @FXML
    private TextField txtMachine;
    @FXML
    private Button btnOperation;
    @FXML
    private TextField txtQuantityPerHour;
    @FXML
    private TextField txtComponents;
    @FXML
    private TextField txtInstructions;
    @FXML
    private TextField txtDescription;
    @FXML
    private TextField txtTime;
    @FXML
    private TextField txtOperatorsNeeded;
    @FXML
    private TextField txtType;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void OperationTxtCode(ActionEvent event) {
    }

    @FXML
    private void returnApp(ActionEvent event) throws IOException {

        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/OperationManager/OperationManager.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();

    }

    @FXML
    private void OperationTxtName(ActionEvent event) {
    }

    @FXML
    private void OperationTxtOrder(ActionEvent event) {
    }

    @FXML
    private void OperationTxtMachine(ActionEvent event) {
    }

    @FXML
    private void CreateOperation(ActionEvent event) {
    }

    @FXML
    private void OperationTxtQuantityPerHour(ActionEvent event) {
    }

    @FXML
    private void OperationTxtComponents(ActionEvent event) {
    }

    @FXML
    private void OperationTxtInstructions(ActionEvent event) {
    }

    @FXML
    private void OperationTxtDescription(ActionEvent event) {
    }

    @FXML
    private void OperationTxtTime(ActionEvent event) {
    }

    @FXML
    private void OperationTxtOperatorsNeeded(ActionEvent event) {
    }

    @FXML
    private void OperationTxtType(ActionEvent event) {
    }
    
}
