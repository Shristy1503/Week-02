package encapsulationandpolymorphism.ridehandlingapplication;

public class Bike extends Vehicle{
    public Bike(String vehicleId, String driverName) {
        super(vehicleId, driverName, 5.0); // $5 per Km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * super.ratePerKm; // Calculate fare
    }
}
