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
public class EditMachineController implements Initializable {

    @FXML
    private Button btnReturn;
    @FXML
    private TextField txtCode;
    @FXML
    private TextField txtSchedule;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtStatus;
    @FXML
    private Button btnEdit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void returnApp(ActionEvent event) throws IOException {
        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/MachineManager/MachineManager.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }

    @FXML
    private void MachineTxtNif(ActionEvent event) {
    }

    @FXML
    private void MachineTxtSchedule(ActionEvent event) {
    }

    @FXML
    private void MachineTxtName(ActionEvent event) {
    }

    @FXML
    private void MachineTxtStatus(ActionEvent event) {
    }

    @FXML
    private void EditMachine(ActionEvent event) {
    }
    
}
