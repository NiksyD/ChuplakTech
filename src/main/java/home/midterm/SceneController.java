package home.midterm;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    private void switchScene(String fxml, String title, ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("ChuplakTech | " + title);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDashboardScene(ActionEvent event) throws IOException {
        switchScene("Dashboard.fxml", "Home", event);
    }

    public void switchToNotificationScene(ActionEvent event) throws IOException {
        switchScene("Notifications.fxml", "Notification", event);
    }

    public void switchToSubjectsScene(ActionEvent event) throws IOException {
        switchScene("Subjects.fxml", "Subjects", event);
    }

    public void switchToEnrollmentScene(ActionEvent event) throws IOException {
        switchScene("Enrollment.fxml", "Enrollment", event);
    }

    public void switchToStudyLoadScene(ActionEvent event) throws IOException {
        switchScene("StudyLoad.fxml", "Study Load", event);
    }

    public void switchToProfileScene(ActionEvent event) throws IOException {
        switchScene("Profile.fxml", "Profile", event);
    }

    public void switchToSignOutScene(ActionEvent event) throws IOException {
        switchScene("Login.fxml", "Sign Out", event);
    }
}
