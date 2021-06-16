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
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
    private void goReturn(ActionEvent event) throws IOException {

        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/MainMenu/MainMenu.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();

    }

    @FXML
    private void goToConfigManageMachine(ActionEvent event) throws IOException {

            Parent config_machine_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/MachineManager/MachineManager.fxml"));
            Scene config_machine_controller_scene = new Scene(config_machine_controller_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(config_machine_controller_scene);
            app_stage.show();
        }



    @FXML
    private void goToConfigManageOperator(ActionEvent event) throws IOException {

            Parent config_operator_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/OperatorManager/OperatorManager.fxml"));
            Scene config_operator_controller_scene = new Scene(config_operator_controller_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(config_operator_controller_scene);
            app_stage.show();
        }


    @FXML
    private void goToConfigManageOperation(ActionEvent event) throws IOException {

            Parent config_operation_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/OperationManager/OperationManager.fxml"));
            Scene config_operation_controller_scene = new Scene(config_operation_controller_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(config_operation_controller_scene);
            app_stage.show();
        }


    }
    

