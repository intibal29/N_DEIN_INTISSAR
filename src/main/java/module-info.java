module com.example.n {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.n to javafx.fxml;
    exports com.example.n;
}