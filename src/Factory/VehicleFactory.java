package Factory;

// VehicleFactory.java (Factory)
public class VehicleFactory {

    // Factory method to create a vehicle based on the vehicle type
    public Vehicle createVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }

        switch (vehicleType.toLowerCase()) {
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            case "motorcycle":
                return new Motorcycle();
            default:
                return null;
        }
    }
}

