package Factory;

// Main.java (Client)
public class MainF {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        // Create different types of vehicles using the factory
        Vehicle car = factory.createVehicle("car");
        car.drive();  // Output: Driving a car.

        Vehicle truck = factory.createVehicle("truck");
        truck.drive();  // Output: Driving a truck.

        Vehicle motorcycle = factory.createVehicle("motorcycle");
        motorcycle.drive();  // Output: Driving a motorcycle.
    }
}

