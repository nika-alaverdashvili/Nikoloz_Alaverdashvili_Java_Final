module com.example.nikoloz_alaverdashvili_java_final {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.nikoloz_alaverdashvili_java_final to javafx.fxml;
    exports com.example.nikoloz_alaverdashvili_java_final;
}