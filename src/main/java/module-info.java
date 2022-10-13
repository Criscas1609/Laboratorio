module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;
    exports com.example.laboratorio to javafx.fxml;
    exports com.example.laboratorio.controller to javafx.fxml;
    opens com.example.laboratorio.model to javafx.base;
    opens com.example.laboratorio.controller to javafx.fxml;
    opens com.example.laboratorio to javafx.graphics;



}