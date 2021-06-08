package code.task.forge.project.Controllers;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private void goToClientsManager(javafx.event.ActionEvent event) throws IOException {
           
        Parent client_manager_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/ClientsManager.fxml"));
        Scene client_manager_controller_scene = new Scene(client_manager_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(client_manager_controller_scene);
        app_stage.show();
      }

    @FXML
    private void goToOrdersManager(javafx.event.ActionEvent event) throws IOException {
        
        Parent orders_manager_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/OrdersManager/OrdersManager.fxml"));
        Scene orders_manager_controller_scene = new Scene(orders_manager_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(orders_manager_controller_scene);
        app_stage.show();
    }

    @FXML
    private void goToDatasheet(javafx.event.ActionEvent event) {
    }

    @FXML
    private void goToConfigurations(javafx.event.ActionEvent event) throws IOException {
            Parent orders_manager_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/Configurations.fxml"));
            Scene orders_manager_controller_scene = new Scene(orders_manager_controller_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(orders_manager_controller_scene);
            app_stage.show();
        }


    @FXML
    private void exitApp(javafx.event.ActionEvent event) {
    }


}