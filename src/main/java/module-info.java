module com.example.rectangleui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rectangleui to javafx.fxml;
    exports com.example.rectangleui;

    exports showhide;
    opens showhide to javafx.fxml;

}