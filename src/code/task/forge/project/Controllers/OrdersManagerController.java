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
 * @author André Marques
 */
public class OrdersManagerController implements Initializable {

    @FXML
    private Button btn_create_order;
    @FXML
    private Button btn_view_order;
    @FXML
    private Button btn_return;
    @FXML
    private ListView<?> listView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goToCreateOrder(ActionEvent event) {
    }

    @FXML
    private void goToViewOrder(ActionEvent event) {
    }

    @FXML
    private void returnPage(ActionEvent event) {
    }
    
}
