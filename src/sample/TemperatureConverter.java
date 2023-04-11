package sample;

public class TemperatureConverter {

    public static double convertCelsiusToFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 1.8) + 32;
    }

    public static double convertFahrenheitToCelsius(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) / 1.8;
    }

    public static double convertCelsiusToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    public static double convertKelvinToCelsius(double kelvinTemperature) {
        return kelvinTemperature - 273.15;
    }

    public static double convertFahrenheitToKelvin(double fahrenheitTemperature) {
        return (fahrenheitTemperature - 32) / 1.8 + 273.15;
    }

    public static double convertKelvinToFahrenheit(double kelvinTemperature) {
        return (kelvinTemperature - 273.15) * 1.8 + 32;
    }
}
