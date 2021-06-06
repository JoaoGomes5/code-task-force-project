/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author André Marques
 */
public class DatasheetController implements Initializable {
   
    private Stage stage;

    
    @FXML
    private Button btn_return;
    @FXML
    private Button btn_edit_article;
    @FXML
    private Button btn_create_article;
    @FXML
    private Button btn_remove_article;
    @FXML
    private TableView<?> listViewArtigos;


    @FXML
    private void goReturn(ActionEvent event) {
    }

    private Parent replaceSceneContent(String fxml) throws Exception {
        Parent page = (Parent) FXMLLoader.load(DatasheetController.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Scene scene = stage.getScene();
        
        stage.sizeToScene();
        return page;
        
    }
    
    @FXML
    private void goToEditArticle(ActionEvent event) throws IOException, Exception {
        replaceSceneContent("EditArticle.fxml");
        
        
    }

    @FXML
    private void goToCreateArticle(ActionEvent event) {
    }

    @FXML
    private void goToRemoveArticle(ActionEvent event) {
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
    
}
