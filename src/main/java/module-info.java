module edu.ifbasaj.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.ifbasaj.demo to javafx.fxml;
    opens edu.ifbasaj.demo.model to javafx.base;
    exports edu.ifbasaj.demo;
}