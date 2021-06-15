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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author joaop
 */
public class ClientsManagerController implements Initializable {


    @FXML
    private Button btnEditClient;

    @FXML
    private Button btnCreateClient;

    @FXML
    private Button btnReturn;

    @FXML
    private TableView<?> listViewClients;

    @FXML
    private TableColumn<?, ?> clientName;

    @FXML
    private TableColumn<?, ?> clientNif;

    @FXML
    private TableColumn<?, ?> clientContact;

    @FXML
    private TableColumn<?, ?> clientAddress;

    @FXML
    private TableColumn<?, ?> clientAnnotation;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

    @FXML
    private void goReturn(ActionEvent event) throws IOException {

        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/MainMenu/MainMenu.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();

    }

    @FXML
    private void goToEditClient(ActionEvent event) throws IOException {

        Parent edit_client_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/EditClient/EditClient.fxml"));
        Scene edit_client_controller_scene = new Scene(edit_client_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(edit_client_controller_scene);
        app_stage.show();
    }

    @FXML
    private void goToCreateClient(ActionEvent event) throws IOException {

        Parent create_client_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/CreateClient/CreateClient.fxml"));
        Scene create_client_controller_scene = new Scene(create_client_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(create_client_controller_scene);
        app_stage.show();
    }

}
