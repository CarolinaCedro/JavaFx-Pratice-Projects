module com.javafx.javafxprojetc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafx.javafxprojetc to javafx.fxml;
    exports com.javafx.javafxprojetc;
}