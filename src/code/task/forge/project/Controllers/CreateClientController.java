/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private TextField txtAddress1;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAddress2;
    @FXML
    private Button btnCreate;
    @FXML
    private TextField txtContact;
    @FXML
    private TextField txtAnnotation;
    @FXML
    private TextField txtContact2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returnApp(ActionEvent event) throws IOException {
        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/ClientsManager/ClientsManager.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }

    @FXML
    private void ClientTxtNif(ActionEvent event) {
    }

    @FXML
    private void ClientTxtAddress1(ActionEvent event) {
    }

    @FXML
    private void ClientTxtName(ActionEvent event) {
    }


    @FXML
    private void ClientTxtAddress2(ActionEvent event) {
    }


    @FXML
    private void CreateClient(ActionEvent event) {
    }

    @FXML
    private void ClientTxtContact(ActionEvent event) {
    }

    @FXML
    private void ClientTxtAnnotation(ActionEvent event) {
    }

    @FXML
    private void ClientTxtContact2(ActionEvent event) {
    }

    PreparedStatement pst;

    public static Connection getDatabaseConnection(){
        String url= "jdbc:sqlserver://ctespbd.dei.isep.ipp.pt:1433;databaseName=LP2_G3_2021";
        String username= "lp2_g3_2021";
        String password= "LP2_2020_bd_3";
        Connection connect= null;
        try {
            connect = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful");
        }
        catch (SQLException e) {
            System.out.println("Error - Connection Failed");
            e.printStackTrace();
        }

        return connect;
    }

    @FXML

    void addClient(ActionEvent event) throws SQLException {
        Connection con = getDatabaseConnection();
        String nif = txtNif.getText();
        String address1 = txtAddress1.getText();
        String name = txtName.getText();
        String contact = txtContact.getText();
        String address2 = txtAddress2.getText();
        String annotation = txtAnnotation.getText();
        String contact2 = txtContact2.getText();

        try {
            pst = con.prepareStatement("Insert into records(nif, address1, name, contact, address2, annotation, contact2)values(?,?,?,?,?,?,?)");
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
        }
        /*ResultSet rs = pst.executeQuery(query);
        while(rs.next()) {

            System.out.println(rs.getString("name"));
        }*/
    }
}
