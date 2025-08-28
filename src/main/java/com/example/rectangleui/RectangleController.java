package com.example.rectangleui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * written by Solomon Ibrayev on 22/08/2025
 */
public class RectangleController {
    @FXML
    private TextField txt_length;

    @FXML
    private TextField txt_width;

    @FXML
    private Label lbl_length;

    @FXML
    private Label lbl_width;

    @FXML
    private Label lbl_result;
    Rectangle r;
    @FXML
    public void btn_area_click(){
        double length = Double.parseDouble(txt_length.getText());
        double width = Double.parseDouble(txt_width.getText());
        r = new Rectangle(length, width);
        lbl_result.setText("Area: " + r.getArea());
    }
    @FXML
    public void btn_perimeter_click(){
        double length = Double.parseDouble(txt_length.getText());
        double width = Double.parseDouble(txt_width.getText());
        r = new Rectangle(length, width);
        lbl_result.setText("Perimeter: " + r.getPerimeter());
    }
}
