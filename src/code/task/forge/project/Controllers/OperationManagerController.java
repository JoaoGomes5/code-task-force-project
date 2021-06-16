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
import javafx.scene.control.TableView;
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
public class OperationManagerController implements Initializable {

    @FXML
    private Button btnEditOperation;
    @FXML
    private Button btnCreateOperation;
    @FXML
    private Button btnReturn;
    @FXML
    private TableView<?> listViewArticles;
    @FXML
    private TextField txtFieldSearch;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void goToEditOperation(ActionEvent event) throws IOException {

        Parent edit_operation_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/OperationManager/EditOperation/EditOperation.fxml"));
        Scene edit_operation_controller_scene = new Scene(edit_operation_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(edit_operation_controller_scene);
        app_stage.show();


    }

    @FXML
    private void goToCreateOperation(ActionEvent event) throws IOException {

        Parent create_operation_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/OperationManager/CreateOperation/CreateOperation.fxml"));
        Scene create_operation_controller_scene = new Scene(create_operation_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(create_operation_controller_scene);
        app_stage.show();


    }

    @FXML
    private void goReturn(ActionEvent event) throws IOException {

        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/Configurations.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();

    }

}
