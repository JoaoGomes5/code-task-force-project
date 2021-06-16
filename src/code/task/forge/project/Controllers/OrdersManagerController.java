/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    private void goToCreateOrder(ActionEvent event) throws IOException {

        Parent create_order_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/OrdersManager/CreateOrder/CreateOrder.fxml"));
        Scene create_order_controller_scene = new Scene(create_order_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(create_order_controller_scene);
        app_stage.show();
    }

    @FXML
    private void returnPage(ActionEvent event) throws IOException {

        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/MainMenu/MainMenu.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }

    @FXML
    private void goToEditOrder(ActionEvent event) throws IOException {
        
        Parent edit_order_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/OrdersManager/EditOrder/EditOrder.fxml"));
        Scene edit_order_controller_scene = new Scene(edit_order_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(edit_order_controller_scene);
        app_stage.show();
    }

}
