package code.task.forge.project.Controllers;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainMenuController {

    @FXML
    private Button btn_clents_manager;

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

    @FXML
    void exitApp(ActionEvent event) {

    }

    @FXML
    void goToClientsManager(ActionEvent event) {

    }

    @FXML
    void goToConfigurations(ActionEvent event) {

    }

    @FXML
    void goToDatasheet(ActionEvent event) {

    }

    @FXML
    void goToOrdersManager(ActionEvent event) {

    }

}