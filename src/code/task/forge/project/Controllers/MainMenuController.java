package code.task.forge.project.Controllers;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenuController {

    @FXML
    private Button btn_clients_manager;

    @FXML
    private Button btn_orders_manager;

    @FXML
    private Button btn_datasheet;

    @FXML
    private Button btn_configurations;

    @FXML
    private Button btn_exit;
    
     /**
     * Initializes the main menu controller
     */

    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  

    void exitApp(ActionEvent event) {

    }

    void goToClientsManager(ActionEvent event) {

    }

    void goToConfigurations(ActionEvent event) {

    }

    void goToDatasheet(ActionEvent event) {

    }

    void goToOrdersManager(ActionEvent event) {

    }

    @FXML
    private void goToClientsManager(javafx.event.ActionEvent event) {
    }

    @FXML
    private void goToOrdersManager(javafx.event.ActionEvent event) {
    }

    @FXML
    private void goToDatasheet(javafx.event.ActionEvent event) {
    }

    @FXML
    private void goToConfigurations(javafx.event.ActionEvent event) {
    }

    @FXML
    private void exitApp(javafx.event.ActionEvent event) {
    }

}