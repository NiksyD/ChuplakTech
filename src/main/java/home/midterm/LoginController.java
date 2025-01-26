package home.midterm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController extends SceneController {

    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label isValidAlert;
    @FXML
    private Label isInvalidAlert;
    @FXML
    private Label isRequiredAlert;

    public void userLogin(ActionEvent event) throws IOException {
        checkLogin(event);
    }

    private void checkLogin(ActionEvent event) throws IOException {
        if (usernameField.getText().equals("admin") && passwordField.getText().equals("123")) {
            isValidAlert.setVisible(true);
            isInvalidAlert.setVisible(false);
            isRequiredAlert.setVisible(false);
            switchToDashboardScene(event);

        } else if (usernameField.getText().isEmpty() || passwordField.getText().isEmpty()) {
            isRequiredAlert.setVisible(true);
            isValidAlert.setVisible(false);
            isInvalidAlert.setVisible(false);
        } else {
            isValidAlert.setVisible(false);
            isInvalidAlert.setVisible(true);
            isRequiredAlert.setVisible(false);
            usernameField.clear();
            passwordField.clear();
        }

    }
}
