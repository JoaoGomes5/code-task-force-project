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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class OrdersManagerController implements Initializable {

    @FXML
    private Button btn_create_order;
    @FXML
    private Button btn_return;
    @FXML
    private Label manageOrderLabel;
    @FXML
    private Button btn_edit_order;
    @FXML
    private TableView<?> listViewOrder;
    @FXML
    private TableColumn<?, ?> orderName;
    @FXML
    private TableColumn<?, ?> orderNif;
    @FXML
    private TableColumn<?, ?> orderBillingAddress;
    @FXML
    private TableColumn<?, ?> orderDeliveryAddress;
    @FXML
    private TableColumn<?, ?> orderDocNum;
    @FXML
    private TableColumn<?, ?> orderDocDate;
    @FXML
    private TableColumn<?, ?> orderState;
    @FXML
    private TableColumn<?, ?> orderDiscount;
    @FXML
    private TableColumn<?, ?> orderTotal;
    @FXML
    private TextField txtOrder;

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
    private void returnPage(ActionEvent event) {
    }

    @FXML
    private void goToEditOrder(ActionEvent event) {
    }
    
}
