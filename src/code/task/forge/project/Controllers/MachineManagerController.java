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
<<<<<<< HEAD

import javax.swing.text.TableView;
import java.awt.*;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

=======
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
>>>>>>> feat-003-controllers-CM

/**
 * FXML Controller class
 *
 * @author Gustavo Reis
 */
public class MachineManagerController implements Initializable {

    @FXML
    private Button btnReturn;
    @FXML
    private TableView<?> listViewArticles;
    @FXML
    private TextField txtFieldSearch;
    @FXML
    private Button btnEditMachine;
    @FXML
    private Button btnCreateMachine;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    @FXML
    private void goReturn(ActionEvent event) throws IOException {

        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/Configurations.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();

    }

    @FXML
    private void goToEditMachine(ActionEvent event) throws IOException {

        Parent edit_machine_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/MachineManager/EditMachine/EditMachine.fxml"));
        Scene edit_machine_controller_scene = new Scene(edit_machine_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(edit_machine_controller_scene);
        app_stage.show();


    }


    @FXML
    private void goToCreateMachine(ActionEvent event) throws IOException {
        Parent create_machine_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/MachineManager/CreateMachine/CreateMachine.fxml"));
        Scene create_machine_controller_scene = new Scene(create_machine_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(create_machine_controller_scene);
        app_stage.show();


    }

<<<<<<< HEAD


=======
>>>>>>> feat-003-controllers-CM
}
