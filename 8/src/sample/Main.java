package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{
    public void start(Stage primaryStage)
    {
        try
        {
            Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("menu.fxml"));
            primaryStage.setTitle("Notebook");
            primaryStage.setScene(new Scene(root, 788.0D, 589.0D));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception excep)
        {
            excep.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}

