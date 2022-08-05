package com.javafx.javafxprojetc;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class HelloController {
    @FXML
    private TextField tx1;
    @FXML
    private TextField tx2;
    @FXML
    private Button sum;
    @FXML
    private TextField result;

    @FXML
    public void sumAction() {
        Locale.setDefault(Locale.US);
        double number1 = Double.parseDouble(tx1.getText());
        double number2 = Double.parseDouble(tx2.getText());
        double sum = number1 + number2;
        result.setText(String.format("%.2f", sum));
    }


}