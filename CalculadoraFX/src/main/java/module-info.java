module com.example.practicasdisint {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.practicasdisint to javafx.fxml;
    exports com.example.practicasdisint;
}