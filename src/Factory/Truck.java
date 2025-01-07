package Factory;

// Truck.java (Concrete Product)
public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck.");
    }
}