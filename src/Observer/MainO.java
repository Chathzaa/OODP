package Observer;
// Main.java
public class MainO {
    public static void main(String[] args) {
        // Create the WeatherStation (subject)
        WeatherStation weatherStation = new WeatherStation();

        // Create observers (displays)
        Display1 display1 = new Display1();
        Display2 display2 = new Display2();

        // Register the observers with the WeatherStation
        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        // Set new weather data and notify observers
        weatherStation.setWeatherData(25.5f, 65.0f, 1013.25f);  // Weather update 1

        // Set new weather data and notify observers again
        weatherStation.setWeatherData(22.3f, 70.0f, 1012.50f);  // Weather update 2

        // Remove Display1 from the observer list and update again
        weatherStation.removeObserver(display1);
        weatherStation.setWeatherData(20.0f, 75.0f, 1011.80f);  // Weather update 3
    }
}

