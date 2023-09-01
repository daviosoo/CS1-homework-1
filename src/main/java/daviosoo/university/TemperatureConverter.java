package daviosoo.university;

import javax.swing.*;

public class TemperatureConverter {
    public static void main(String[] args) {

        int selectedEntry = JOptionPane.showOptionDialog(null, "Seleccione la unidad de entrada", "Selector de medida", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] { "Celsius", "Fahrenheit" }, "Celsius");
        boolean isCelsius = selectedEntry == 0;

        String inputMessage;

        if ( isCelsius ) {
            inputMessage = "Ingrese la temperatura en Celsius para convertir a Fahrenheit";
        } else {
            inputMessage = "Ingrese la temperatura en Fahrenheit para convertir a Celsius";
        }

        double temperature = Double.parseDouble(JOptionPane.showInputDialog(null, inputMessage, "Ingresar temperatura", JOptionPane.PLAIN_MESSAGE));

        double convertedTemperature;
        String outputMessage;

        if ( isCelsius ) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            outputMessage = temperature + " grados Celsius equivalen a " + convertedTemperature + " grados Fahrenheit";
        } else {
            convertedTemperature = fahrenheitToCelsius(temperature);
            outputMessage = temperature + " grados Fahrenheit equivalen a " + convertedTemperature + " grados Celsius";
        }

        JOptionPane.showMessageDialog(null, outputMessage);
    }

    private static double celsiusToFahrenheit(double temperature) {
        return (temperature * 9/5) +32;
    }

    private static double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5/9;
    }
}
