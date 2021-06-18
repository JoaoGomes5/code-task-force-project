package code.task.forge.project.Controllers;

import code.task.forge.project.Models.Article;
import code.task.forge.project.Models.Operation;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class CreateArticleController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }




        @FXML
        private Button btnCreateComp;

        @FXML
        private TextField txtRef;

        @FXML
        private TextField txtVersion;

        @FXML
        private TextField txtCommercialDesignation;

        @FXML
        private TextField txtBatchSize;

        @FXML
        private TextField txtDesignation;

        @FXML
        private TextField txtStatus;

        @FXML
        private TextField txtUnit;

        @FXML
        private Button btnCreateProduct;

        @FXML
        private TextField txtMeasureUnit;

        @FXML
        private TextField txtQuantityNeeded;

        @FXML
        private TextField txtAlternative;

        @FXML
        private TextField txtOperations;

        @FXML
        private Button btnReturn;

        @FXML
        void ArticleAlternative(ActionEvent event) {

        }

        @FXML
        void ArticleBatchSize(ActionEvent event) {

        }

        @FXML
        void ArticleCommercialDesignation(ActionEvent event) {

        }

        @FXML
        void ArticleDesignation(ActionEvent event) {

        }

        @FXML
        void ArticleMeasureUnit(ActionEvent event) {

        }

        @FXML
        void ArticleOperations(ActionEvent event) {

        }

        @FXML
        void ArticleQuantityNeeded(ActionEvent event) {

        }

        @FXML
        void ArticleReference(ActionEvent event) {

        }

        @FXML
        void ArticleStatus(ActionEvent event) {

        }

        @FXML
        void ArticleUnit(ActionEvent event) {

        }

        @FXML
        void ArticleVersion(ActionEvent event) {

        }

        @FXML
        void CreateComp(ActionEvent event) {

        }

        @FXML
        void CreateProduct(ActionEvent event) {

        }

        @FXML
        void returnApp(ActionEvent event) {

        }

    void addArticle(javafx.event.ActionEvent event) throws SQLException {
        String reference = txtRef.getText();
        String commercialDesignation = txtCommercialDesignation.getText();
        String version = txtVersion.getText();
        String batchSize = txtBatchSize.getText();
        String designation = txtDesignation.getText();
        String status = txtStatus.getText();
        String unit = txtUnit.getText();
        String measureUnit = txtMeasureUnit.getText();
        String quantityNeeded = txtQuantityNeeded.getText();
        String alternative = txtAlternative.getText();
        String operations = txtOperations.getText();


        Article article = new Article(reference, commercialDesignation, version, batchSize, designation,
                status, unit, measureUnit, quantityNeeded, alternative, operations);
    }

    }


