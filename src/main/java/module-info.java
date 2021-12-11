module com.example.module6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.junit.jupiter.api;
    requires org.mockito;
    requires java.sql;

    opens com.example.module6 to javafx.fxml;
    exports com.example.module6;
}