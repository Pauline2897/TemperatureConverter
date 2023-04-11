package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ComboBox<String> inputUnitComboBox;

    @FXML
    private ComboBox<String> outputUnitComboBox;

    @FXML
    private TextField inputTextField;

    @FXML
    private TextField resultTextField;


    public void initialize() {
        inputUnitComboBox.getSelectionModel().select(0);
        outputUnitComboBox.getSelectionModel().select(1);
    }

    public void convertTemperature() {
        String inputUnit = inputUnitComboBox.getSelectionModel().getSelectedItem();
        String outputUnit = outputUnitComboBox.getSelectionModel().getSelectedItem();
        String inputString = inputTextField.getText().trim();

        if (inputString.equals("") || inputString.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Missing input value");
            alert.setContentText("Enter temperature value to convert!");
            alert.showAndWait();
        } else {
            double inputTemperature = Double.parseDouble(inputString);
            if (inputUnit.equals("Celsius") && outputUnit.equals("Fahrenheit")) {

                double result = TemperatureConverter.convertCelsiusToFahrenheit(inputTemperature);
                resultTextField.setText(String.valueOf(result) + getFormattedUnit(outputUnit));

            } else if (inputUnit.equals("Fahrenheit") && outputUnit.equals("Celsius")) {

                double result = TemperatureConverter.convertFahrenheitToCelsius(inputTemperature);
                resultTextField.setText(String.valueOf(result) + getFormattedUnit(outputUnit));

            } else if (inputUnit.equals("Celsius") && outputUnit.equals("Kelvin")) {

                double result = TemperatureConverter.convertCelsiusToKelvin(inputTemperature);
                resultTextField.setText(String.valueOf(result) + getFormattedUnit(outputUnit));

            } else if (inputUnit.equals("Kelvin") && outputUnit.equals("Celsius")) {

                double result = TemperatureConverter.convertKelvinToCelsius(inputTemperature);
                resultTextField.setText(String.valueOf(result) + getFormattedUnit(outputUnit));

            } else if (inputUnit.equals("Fahrenheit") && outputUnit.equals("Kelvin")) {

                double result = TemperatureConverter.convertFahrenheitToKelvin(inputTemperature);
                resultTextField.setText(String.valueOf(result) + getFormattedUnit(outputUnit));

            } else if (inputUnit.equals("Kelvin") && outputUnit.equals("Fahrenheit")) {

                double result = TemperatureConverter.convertKelvinToFahrenheit(inputTemperature);
                resultTextField.setText(String.valueOf(result) + getFormattedUnit(outputUnit));

            } else {
                resultTextField.setText(inputTemperature + getFormattedUnit(inputUnit));
            }
        }


    }

    private String getFormattedUnit(String unitString) {
        return "[" + unitString.substring(0, 1) + "\u00B0" + "]";
    }
}
