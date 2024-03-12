module com.example.villamor_fxmlexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.villamor_fxmlexample to javafx.fxml;
    exports com.example.villamor_fxmlexample;
}