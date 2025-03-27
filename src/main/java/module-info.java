module com.example.studentproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentproject to javafx.fxml;
    exports com.example.studentproject;
}