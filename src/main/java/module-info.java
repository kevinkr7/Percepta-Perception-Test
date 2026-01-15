module com.percepta.percepta {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.percepta.controller to javafx.fxml;
    exports com.percepta;
}
