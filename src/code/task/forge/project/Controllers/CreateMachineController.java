package code.task.forge.project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
=======
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
>>>>>>> feat-003-controllers-CM
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateMachineController {

    @FXML
    private TextField txtCode;

    @FXML
    private Button btnReturn;

    @FXML
    private TextField txtName;

    @FXML
    private Button btnCreate;

<<<<<<< HEAD
    @FXML
    void CreateClient(ActionEvent event) {
=======
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void returnApp(ActionEvent event) throws IOException {
        Parent return_controller_parent = FXMLLoader.load(getClass().getResource("/code/task/forge/project/Views/Configurations/MachineManager/MachineManager.fxml"));
        Scene return_controller_scene = new Scene(return_controller_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(return_controller_scene);
        app_stage.show();
    }

    @FXML
    private void CreateMachine(ActionEvent event) {
    }
>>>>>>> feat-003-controllers-CM

    }

    @FXML
    void MachineTxtCode(ActionEvent event) {

    }

    @FXML
    void MachineTxtName(ActionEvent event) {

    }

    @FXML
    void returnApp(ActionEvent event) {

    }

}
