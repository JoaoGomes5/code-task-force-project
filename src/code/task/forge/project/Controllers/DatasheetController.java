/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
    private void goReturn(ActionEvent event)throws IOException {

        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/MainMenu/MainMenu.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }
/*
    private Parent replaceSceneContent(String fxml) throws Exception {
        Parent page = (Parent) FXMLLoader.load(DatasheetController.class.getResource(fxml), null, new JavaFXBuilderFactory());
        Scene scene = stage.getScene();
        
        stage.sizeToScene();
        return page;
        
    }
*/
    @FXML
    private void goToEditArticle(ActionEvent event) throws IOException, Exception {
        //replaceSceneContent("EditArticle.fxml");
            Parent edit_article_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Datasheet/EditArticle/EditArticleController.fxml"));
            Scene edit_article_controller_scene = new Scene(edit_article_controller_parent);
            Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            app_stage.setScene(edit_article_controller_scene);
            app_stage.show();
        }
        


    @FXML
    private void goToCreateArticle(ActionEvent event) throws IOException, Exception {
        //replaceSceneContent("EditArticle.fxml");
        Parent create_article_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Datasheet/CreateArticle/CreateArticleController.fxml"));
        Scene create_article_controller_scene = new Scene(create_article_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(create_article_controller_scene);
        app_stage.show();
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
