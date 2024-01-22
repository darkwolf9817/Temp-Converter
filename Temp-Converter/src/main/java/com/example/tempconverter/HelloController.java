package com.example.tempconverter;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label lblOut;

    @FXML
    private ComboBox cbxFromTemp;

    @FXML
    private ComboBox cbxToTemp;

    @FXML
    private TextField txtTemp;

    @FXML
    protected void onConvertBtnClick() {
        double tempIn = Double.parseDouble(txtTemp.getText());
        String fromUnit = cbxFromTemp.getValue().toString();
        String toUnit = cbxToTemp.getValue().toString();

        if (fromUnit.equals("Fahrenheit") && toUnit.equals("Celsius")) {
            lblOut.setText(fToC(tempIn) + "Degrees");
        } else if (fromUnit.equals("Celsius") && toUnit.equals("Fahrenheit")) {
            lblOut.setText(cToF(tempIn) + "Degrees");
        } else if (fromUnit.equals("Celsius") && toUnit.equals("Kelvin")) {
            lblOut.setText(cToK(tempIn) + "Degrees");
        } else if (fromUnit.equals("Fahrenheit") && toUnit.equals("Kelvin")) {
            lblOut.setText(fToK(tempIn) + "Degrees");
        } else if (fromUnit.equals("Kelvin") && toUnit.equals("Celsius")) {
            lblOut.setText(kToC(tempIn) + "Degrees");
        } else if (fromUnit.equals("Kelvin") && toUnit.equals("Fahrenheit")) {
            lblOut.setText(kToF(tempIn) + "Degrees");
        }
    }

    private double fToC(double tempF) {
        return (tempF - 32) / 1.8;
    }

    private double cToF(double tempC) {
        return (tempC * 1.8) + 32;
    }

    private double cToK(double tempC) {
        return tempC + 273.15;
    }

    private double fToK(double tempF) {
        return cToK(fToC(tempF));
    }

    private double kToC(double tempK) {
        return tempK - 273.15;
    }

    private double kToF(double tempK) {
        return cToF(kToC(tempK));
    }
}