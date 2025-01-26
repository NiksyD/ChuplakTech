module home.midterm {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens home.midterm to javafx.fxml;
    exports home.midterm;
}