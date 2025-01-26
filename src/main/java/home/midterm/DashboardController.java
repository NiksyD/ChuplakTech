package home.midterm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.AnchorPane;

public class DashboardController extends SceneController {

    @FXML
    private AnchorPane homePane;
    @FXML
    private ToggleButton modeToggler;

    public void homeTogglerAction(ActionEvent e) {

        if (modeToggler.isSelected()) {
            homePane.setStyle("-fx-background-color: #0c242e;");
            modeToggler.setText("Dark Mode");
        } else {
            homePane.setStyle("-fx-background-color: #ECECEC;");
            modeToggler.setText("Light Mode");
        }
    }

}