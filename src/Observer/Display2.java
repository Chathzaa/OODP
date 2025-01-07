package Observer;
// Display2.java
public class Display2 implements Observer {
    private float temperature;
    private float pressure;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Display 2: Temperature: " + temperature + "°C, Pressure: " + pressure + " hPa");
    }
}

