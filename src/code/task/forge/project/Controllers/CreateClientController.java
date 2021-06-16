/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import code.task.forge.project.Models.Client;
import code.task.forge.project.Models.Address;
import code.task.forge.project.Models.Contact;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import code.task.forge.project.Models.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class CreateClientController implements Initializable {

    @FXML
    private Button btnReturn;
    @FXML
    private TextField txtNif;
    @FXML
    private TextField txtName;
    @FXML
    private Button btnCreate;
    @FXML
    private TextField txtContact;
    @FXML
    private TextField txtAnnotation;
    @FXML
    private TextField txtAddress;
    @FXML
    private TextField txtCity;
    @FXML
    private TextField txtPostalCode;
    @FXML
    private TextField txtDorNumber;
    @FXML
    private TextField txtContactType;
    @FXML
    private TextField txtContactObservation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void retrunToClientManager(ActionEvent event) throws IOException {
        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/ClientsManager.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }


    @FXML
    private void createClientTxtNif(ActionEvent event) {
    }




    @FXML
    private void createClientTxtAddress(ActionEvent event) {
    }

    @FXML
    private void createClientTxtName(ActionEvent event) {
    }

    @FXML
    private void createClientTxtContact(ActionEvent event) {
    }

    @FXML
    private void createClientTxtCity(ActionEvent event) {
    }

    @FXML
    private void createClientTxtAnnotation(ActionEvent event) {
    }

    @FXML
    private void createClient(ActionEvent event) {
      
    }

    @FXML
    private void createClientTxtPostalCode(ActionEvent event) {
    }

    @FXML
    private void createClientTxtDorNumber(ActionEvent event) {
    }

    @FXML
    private void createClientTxtContactType(ActionEvent event) {
    }

    @FXML
    private void createClientTxtContactObservation(ActionEvent event) {
    }

    PreparedStatement pst;

    @FXML

    void addClient(ActionEvent event) throws SQLException {
        String nif = txtNif.getText();
        String address1 = txtAddress1.getText();
        String name = txtName.getText();
        String contact = txtContact.getText();
        String address2 = txtAddress2.getText();
        String annotation = txtAnnotation.getText();
        String contact2 = txtContact2.getText();

        Client client = new Client(nif, address1, name, contact, address2, annotation, contact2);

        /*try {
            pst = con.prepareStatement("Insert into Clients(nif, address1, name, contact, address2, annotation, contact2)values(?,?,?,?,?,?,?)");
            pst.setString(1, nif);
            pst.setString(2, address1);
            pst.setString(3, name);
            pst.setString(4, contact);
            pst.setString(5, address2);
            pst.setString(6, annotation);
            pst.setString(7, contact2);
            int status = pst.executeUpdate();

            if (status == 1) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Success");
                alert.setHeaderText("Member");
                alert.setContentText("Record Added Successfully");
                alert.showAndWait();

                txtNif.setText("");
                txtAddress1.setText("");
                txtName.setText("");
                txtContact.setText("");
                txtAddress2.setText("");
                txtAnnotation.setText("");
                txtContact2.setText("");
                txtNif.requestFocus();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Fail");
                alert.setHeaderText("Member");
                alert.setContentText("Record Add Failed");
                alert.showAndWait();
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CreateClientController.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
}
