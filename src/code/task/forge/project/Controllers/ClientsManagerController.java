/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import code.task.forge.project.Models.Client;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author joaop
 */
public class ClientsManagerController implements Initializable {

    @FXML
    private TableView<?> listViewArticles;
    @FXML
    private Button btnReturn;
    @FXML
    private TextField txtFieldSearch;
    @FXML
    private Button btnEditClient;
    @FXML
    private Button btnCreateClient;
    @FXML
    private TableColumn<Client, String> clientName;
    @FXML
    private TableColumn<Client, String> clientNif;
    @FXML
    private TableColumn<Client, ?> clientContact;
    @FXML
    private TableColumn<Client, ArrayList> clientAdress;
    @FXML
    private TableColumn<Client, String> clientAnnotation;

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
    private void goToEditClient(ActionEvent event) {
    }

    @FXML
    private void goToCreateClient(ActionEvent event) {
    }
    
}
