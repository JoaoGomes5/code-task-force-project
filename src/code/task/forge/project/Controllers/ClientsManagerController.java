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
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author joaop
 */
public class ClientsManagerController implements Initializable {

    @FXML
    private ListView<?> listViewArticles;
    @FXML
    private Button btnEditClient;
    @FXML
    private Button btnCreateClient;
    @FXML
    private Button btnReturn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToEditClient(ActionEvent event) {
    }

    @FXML
    private void goToCreateClient(ActionEvent event) {
    }

    @FXML
    private void goReturn(ActionEvent event) {
    }
    
}
