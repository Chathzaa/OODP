package Factory;

// Motorcycle.java (Concrete Product)
public class Motorcycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a motorcycle.");
    }
}

