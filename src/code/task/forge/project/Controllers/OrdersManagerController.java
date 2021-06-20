/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import code.task.forge.project.DAO.ContactDAO;
import code.task.forge.project.DAO.OrderDAO;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;
import code.task.forge.project.Models.Order;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class OrdersManagerController implements Initializable {

    @FXML
    private Button btnCreateOrder;

    @FXML
    private Button btnEditOrder;

    @FXML
    private TableView<?> listViewOrder;

    @FXML
    private TableColumn<?, ?> clDocNum;

    @FXML
    private TableColumn<?, ?> clName;

    @FXML
    private TableColumn<?, ?> clBillingAddress;

    @FXML
    private TableColumn<?, ?> clDeliveryAddress;

    @FXML
    private TableColumn<?, ?> clDocDate;

    @FXML
    private TableColumn<?, ?> clDiscount;

    @FXML
    private TableColumn<?, ?> clTotal;

    @FXML
    private TableColumn<?, ?> clState;

    @FXML
    private Button btnReturn;

    @FXML
    private TextField txtFieldSearch;

    @FXML
    private Button btnRefresh;

    @FXML
    private Button btnSearch;

    private OrderDAO orderDAO = new OrderDAO();

    private Order selectedOrder;
    private List<Order> clients = orderDAO.read();
    private ObservableList<Client> clientsObservableListList = FXCollections.observableArrayList();

    @FXML
    void filterOrders(ActionEvent event) {

    }

    @FXML
    void goToCreateOrder(ActionEvent event) throws IOException {

        Parent create_order_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/OrdersManager/CreateOrder/CreateOrder.fxml"));
        Scene create_order_controller_scene = new Scene(create_order_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(create_order_controller_scene);
        app_stage.show();
    }

    @FXML
    void goToEditOrder(ActionEvent event) throws IOException {
        Parent edit_order_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/OrdersManager/EditOrder/EditOrder.fxml"));
        Scene edit_order_controller_scene = new Scene(edit_order_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(edit_order_controller_scene);
        app_stage.show();
    }

    @FXML
    void returnPage(ActionEvent event) throws IOException {
        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/MainMenu/MainMenu.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }

    @FXML
    void updateOrders(ActionEvent event) {

    }

    public void updateTable() throws SQLException {

//        if(!clientsObservableListList.isEmpty()){
//            clientsObservableListList.clear();
//            System.out.println("Cleaned");
//        }
//
//        ArrayList<Address> addresses = new ArrayList<>();
//        ArrayList<Contact> contacts = new ArrayList<>();
//
//        for(Client client: clients) {
//            Client c = new Client(client.getNif(), client.getName(),addresses, contacts, client.getAnnotation());
//            clientsObservableListList.add(c);
//        }
//
//        clClientNif.setCellValueFactory(new PropertyValueFactory<Client, String>("nif"));
//        clientName.setCellValueFactory(new PropertyValueFactory<Client, String>("name"));
//        clientAnnotation.setCellValueFactory(new PropertyValueFactory<Client, String>("annotation"));
//
//        listViewClients.setItems(clientsObservableListList);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
