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
public class EditOrderController implements Initializable {

    @FXML
    private Button btnReturn;
    @FXML
    private Button btnEdit;
    @FXML
    private TextField txtNif1;
    @FXML
    private TextField txtAddressDelivery;
    @FXML
    private TextField txtAddressBill;
    @FXML
    private TextField txtDocDate;
    @FXML
    private TextField txtNumberDoc;
    @FXML
    private TextField txtDescount;
    @FXML
    private TextField txtStatus;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtLine;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void returnOrderApp(ActionEvent event) throws IOException {
            Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/OrdersManager/OrdersManager.fxml"));
            Scene return_controller_scene = new Scene(return_controller_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(return_controller_scene);
            app_stage.show();
        }

    @FXML
    private void EditClient(ActionEvent event) {
    }

    @FXML
    private void OrderTxtNif(ActionEvent event) {
    }

    @FXML
    private void OrderTxtAddressDelivery(ActionEvent event) {
    }

    @FXML
    private void OrderTxtAddressBill(ActionEvent event) {
    }

    @FXML
    private void OrderTxtDocDate(ActionEvent event) {
    }

    @FXML
    private void OrderTxtNumberDoc(ActionEvent event) {
    }

    @FXML
    private void OrderTxtDescount(ActionEvent event) {
    }

    @FXML
    private void OrderTxtStatus(ActionEvent event) {
    }

    @FXML
    private void OrderTxtTotal(ActionEvent event) {
    }

    @FXML
    private void OrderTxtLine(ActionEvent event) {
    }

}
