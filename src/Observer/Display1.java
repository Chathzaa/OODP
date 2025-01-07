package Observer;
// Display1.java
public class Display1 implements Observer {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Display 1: Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
}

