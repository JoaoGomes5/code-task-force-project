/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import code.task.forge.project.Models.Operation;
import code.task.forge.project.Models.Operator;
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
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class CreateOperatorController implements Initializable {

    @FXML
    private Button btnReturn;
    @FXML
    private TextField txtCod;
    @FXML
    private TextField txtSchedule;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtState;
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
    private void returnApp(ActionEvent event) throws IOException {
        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/OperatorManager/OperatorManager.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }

    @FXML
    private void OperatorTxtCode(ActionEvent event) {
    }

    @FXML
    private void OperatorTxtSchedule(ActionEvent event) {
    }

    @FXML
    private void OperatorTxtName(ActionEvent event) {
    }

    @FXML
    private void OperatorTxtState(ActionEvent event) {
    }

    @FXML
    private void CreateOperator(ActionEvent event) {
    }

    void addOperator(ActionEvent event) throws SQLException {
        String code = txtCod.getText();
        String schedule = txtSchedule.getText();
        String name = txtName.getText();
        String state = txtState.getText();


        Operator operator = new Operator(code, schedule, name, state);
    }
}
