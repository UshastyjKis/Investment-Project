package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonNext2;

    @FXML
    private Button buttonNext1;

    @FXML
    private Button buttonCount;

    @FXML
    private TextField projectPeriod;

    @FXML
    private TextField cashFlow1;

    @FXML
    private TextArea resultField;

    @FXML
    private Button buttonAddNewFlow;

    @FXML
    private Button buttonNewProject;

    @FXML
    private Button buttonBack1;

    @FXML
    private TextField discontRate;

    @FXML
    private Button buttonBack2;

    @FXML
    private TextField projectIC;

    @FXML
    private TextField projectName;

    @FXML
    private TabPane tabPane;

    @FXML
    void initialize() {

    }
}