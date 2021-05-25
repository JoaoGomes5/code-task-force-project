/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class ConfigurationsController implements Initializable {

    @FXML
    private Button btn_return;
    @FXML
    private Button btn_manage_machine;
    @FXML
    private Button btn_manage_operator;
    @FXML
    private Button btn_manage_operation;
    @FXML
    private Button btn_manage_order;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void goReturn(ActionEvent event) {
    }

    @FXML
    private void goToConfigManageMachine(ActionEvent event) {
    }

    @FXML
    private void goToConfigManageOperator(ActionEvent event) {
    }

    @FXML
    private void goToConfigManageOperation(ActionEvent event) {
    }

    @FXML
    private void goToConfigManageOrder(ActionEvent event) {
    }
    
}
