package code.task.forge.project.Controllers;

import code.task.forge.project.DAO.ClientDAO;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Contact;
import code.task.forge.project.utils.AlertBox;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class EditClientController {


    @FXML
    private TextField txtNif;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAnnotation;

    @FXML
    private Button btnEdit;

    private String nif = "";

    @FXML
    void editClient(ActionEvent event) throws SQLException, IOException {

        ClientDAO clientDAO = new ClientDAO();

        ArrayList<Address> addresses = new ArrayList<>();
        ArrayList<Contact> contacts = new ArrayList<>();

        try {

            clientDAO.update(txtNif.getText(), new Client(txtNif.getText(), txtName.getText(), addresses, contacts, txtAnnotation.getText()));

            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Sucesso");
            alert.setHeaderText("Informação atualizada com sucesso!");


            alert.showAndWait();

            ClientsManagerController clientsTable = new ClientsManagerController();

            clientsTable.updateTable();

        } catch (SQLException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);

            alert.setTitle("ERRO");
            alert.setHeaderText("Algo correu mal :(");
            alert.setContentText(e.getMessage());

            alert.showAndWait();
        }



    }


    public void initData(Client client){
        if(client != null){
            txtNif.setText(client.getNif());
            txtName.setText(client.getName());
            txtAnnotation.setText(client.getAnnotation());
        }

    }


}
