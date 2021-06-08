/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.task.forge.project;

import java.io.IOException;
import java.sql.SQLException;
import code.task.forge.project.Controllers.DatasheetController;

import code.task.forge.project.Database.SQLConnection;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CodeTaskForgeProject extends Application {



    
    public static void main(String[] args) {
        launch(args);
    }
@Override
    public void start(Stage app_stage) throws SQLException, IOException {

       //SQLConnection.all2you();
       Parent root;
       root = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Datasheet/Datasheet.fxml"));
       Scene scene = new Scene(root, 830,500);

       app_stage.setTitle("Code Task Force");
       app_stage.setScene(scene);
       app_stage.setResizable(false);
       app_stage.show();
    }
}
