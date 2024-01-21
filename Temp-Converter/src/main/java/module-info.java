module com.example.tempconverter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tempconverter to javafx.fxml;
    exports com.example.tempconverter;
}