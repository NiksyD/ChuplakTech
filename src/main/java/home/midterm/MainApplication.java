package home.midterm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
//            System.out.println(System.getProperty("java.version"));
//            System.out.println(System.getProperty("javafx.version"));
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            stage.setResizable(false);
            stage.setTitle("ChuplakTech | Home");
            stage.setScene(scene);
            stage.show();
            Image icon = new Image(getClass().getResourceAsStream("/icon/confluence.png"));
            stage.getIcons().add(icon);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        launch();
    }
}