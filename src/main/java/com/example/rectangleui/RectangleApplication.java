package com.example.rectangleui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * written by Solomon Ibrayev on 22/08/2025
 */
public class RectangleApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RectangleApplication.class.getResource("rectangle_view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Rectangle Area & Perimeter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
