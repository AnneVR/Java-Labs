package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class MenuController
{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button filesButton;

    @FXML
    private Button exitButton;


    @FXML
    void showFilesMenu(ActionEvent event) throws Exception
    {
        Stage stage = (Stage)this.filesButton.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("filesmenu.fxml"));
        Parent root = (Parent)fxmlLoader.load();
        Stage stage1 = new Stage();
        stage1.setOpacity(1.0D);
        stage1.setTitle("Notebook");
        stage1.setScene(new Scene(root, 788.0D, 589.0D));
        stage1.setResizable(false);
        stage1.showAndWait();
    }

    @FXML
    void closeApp(ActionEvent event) throws Exception
    {
        Stage stage = (Stage)this.exitButton.getScene().getWindow();
        stage.close();
    }


    @FXML
    void initialize(MouseEvent event)
    {

    }

    @FXML
    void initialize()
    {
    }
}
