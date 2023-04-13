module com.example.controllerscommunication {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.controllerscommunication to javafx.fxml;
    exports com.example.controllerscommunication;
}