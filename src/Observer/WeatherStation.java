package Observer;
// Subject.java
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private List<Observer> observers;  // List to store all observers
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    // Method to register an observer
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Method to notify all observers of the change
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // Method to set the weather data and notify observers
    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();  // Notify all observers of the change
    }
}

