package sample;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class FileController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button createButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button editButton;

    @FXML
    private Button backButton;

    @FXML
    private Button openButton;

    @FXML
    void backMenu(ActionEvent event) throws Exception
    {
        Stage stage = (Stage)this.backButton.getScene().getWindow();
        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("menu.fxml"));
        Parent root = (Parent)fxmlLoader.load();
        Stage stage1 = new Stage();
        stage1.setOpacity(1.0D);
        stage1.setTitle("Notebook");
        stage1.setScene(new Scene(root, 788.0D, 589.0D));
        stage1.setResizable(false);
        stage1.showAndWait();

    }

    @FXML
    void createFile(ActionEvent event)throws Exception
    {

        TextInputDialog window = new TextInputDialog("");
        window.setTitle("Create file");
        window.setHeaderText("New file");
        window.setContentText("Name:");
        Optional<String> file = window.showAndWait();

        if (file.isPresent() && !file.get().isEmpty())
        {
            try
            {
                String nameFile = file.get() + ".txt";
                new PrintWriter(nameFile, "UTF-8");
                Desktop desktop = null;
                if (Desktop.isDesktopSupported())
                {
                    desktop = Desktop.getDesktop();
                }
                File txtFile = new File(nameFile);
                desktop.open(txtFile);
            }
            catch (NullPointerException e)
            {
                System.out.println(e);
            }


        }
        else if (file.isPresent())
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Create file");
            alert.setHeaderText(null);
            alert.setContentText("Enter name of the file!");
            alert.showAndWait();
        }

    }

    @FXML
    void deleteFile(ActionEvent event)throws Exception
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Delete");

        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(filter);

        List<File> file = fileChooser.showOpenMultipleDialog(null);
        if (file != null)
        {
            try
            {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Delete file");
                alert.setHeaderText("Do you want to delete this file?");
                Optional<ButtonType> result = alert.showAndWait();
                if (result.get() == ButtonType.OK)
                {
                    for (File selectedFile : file)
                    {
                        selectedFile.delete();
                    }

                }
            }
            catch (NullPointerException e)
            {
                System.out.println(e);
            }
        }

    }

    @FXML
    void editFile(ActionEvent event) throws Exception
    {
        String path = "";
        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Edit file");

        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(filter);
        File file = fileChooser.showOpenDialog(null);

        if(file != null)
        {
            try
            {
                path = file.getPath();

                Writer writer = new BufferedWriter(new FileWriter(path, true));
                TextInputDialog window = new TextInputDialog("");
                window.setTitle("Edit");
                window.setHeaderText("Enter your record");
                window.setContentText("Record:");
                Optional <String> result = window.showAndWait();
                writer.append("\n");
                if(result.isPresent() && !result.get().isEmpty())
                {
                    writer.append(result.get());
                    writer.close();
                }
                else if (result.isPresent())
                {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Edit");
                    alert.setHeaderText(null);
                    alert.setContentText("Enter the record!");
                    alert.showAndWait();
                }
            }
            catch (IOException e)
            {
                System.out.println(e);
            }

        }

    }


    @FXML
    void openFile(ActionEvent event) throws Exception
    {
        Desktop desktop = null;
        if (Desktop.isDesktopSupported())
        {
            desktop = Desktop.getDesktop();
        }

        final FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open file");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Files", "*.*"));
        File file = fileChooser.showOpenDialog(null);
        if(file != null)
        {
            desktop.open(file);

        }

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

