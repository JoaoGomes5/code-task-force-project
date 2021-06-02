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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class CreateMachineController implements Initializable {

    @FXML
    private Button btnReturn;
    @FXML
    private TextField txtName;
    @FXML
    private Button btnCreate;
    @FXML
    private TextField txtCode;
    @FXML
    private TextField txt;
    @FXML
    private TextField txtState;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returnApp(ActionEvent event) {
    }
    @FXML
    private void CreateClient(ActionEvent event) {
    }

    @FXML
    private void MachineTxtCode(ActionEvent event) {
    }

    @FXML
    private void MachineTxtSchedule(ActionEvent event) {
    }

    @FXML
    private void MachineTxtName(ActionEvent event) {
    }

    @FXML
    private void MachineTxtState(ActionEvent event) {
    }
    
}
