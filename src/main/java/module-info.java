module home.midterm {
    requires javafx.controls;
    requires javafx.fxml;


    opens home.midterm to javafx.fxml;
    exports home.midterm;
}