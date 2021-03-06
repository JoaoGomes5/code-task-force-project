package code.task.forge.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;


public class CodeTaskForgeProject extends Application {


    public static void main(String[] args) {
        launch(args);
    }
@Override
    public void start(Stage app_stage) throws SQLException, IOException {

       //SQLConnection.all2you();
       Parent root;
       root = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/MainMenu/MainMenu.fxml"));
       Scene scene = new Scene(root, 900,600);

       app_stage.setTitle("Code Task Force");
       app_stage.setScene(scene);
       app_stage.setResizable(false);
       app_stage.show();
    }
}
