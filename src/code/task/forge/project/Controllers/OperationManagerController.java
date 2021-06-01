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
    private void goToEditOperation(ActionEvent event) {
    }

    @FXML
    private void goToCreateOperation(ActionEvent event) {
    }

    @FXML
    private void goReturn(ActionEvent event) {
    }
    
}
