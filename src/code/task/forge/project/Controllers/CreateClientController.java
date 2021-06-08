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
public class CreateClientController implements Initializable {

    @FXML
    private Button btnReturn;
    @FXML
    private TextField txtNif;
    @FXML
    private TextField txtAddress1;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtContact;
    @FXML
    private TextField txtAddress2;
    @FXML
    private TextField txtAnnotation;
    @FXML
    private TextField txtContact2;
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
        Parent edit_client_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/EditClient/EditClient.fxml"));
        Scene edit_client_controller_scene = new Scene(edit_client_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(edit_client_controller_scene);
        app_stage.show();
    }

    @FXML
    private void ClientTxtNif(ActionEvent event) {
    }

    @FXML
    private void ClientTxtAddress1(ActionEvent event) {
    }

    @FXML
    private void ClientTxtName(ActionEvent event) {
    }

    @FXML
    private void ClientTxtContact(ActionEvent event) {
    }

    @FXML
    private void ClientTxtAddress2(ActionEvent event) {
    }

    @FXML
    private void ClientTxtAnnotation(ActionEvent event) {
    }

    @FXML
    private void ClientTxtContact2(ActionEvent event) {
    }

    @FXML
    private void CreateClient(ActionEvent event) {
    }
    
}
