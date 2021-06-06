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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author André Marques
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
    private void goReturn(ActionEvent event) {
    }

    @FXML
    private void goToEditMachine(ActionEvent event) {
    }

    @FXML
    private void goToCreateMachine(ActionEvent event) {
    }
    
}
