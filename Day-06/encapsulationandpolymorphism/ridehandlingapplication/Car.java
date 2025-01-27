package encapsulationandpolymorphism.ridehandlingapplication;

public class Car extends Vehicle{
    public Car(String vehicleId, String driverName) {
        super(vehicleId, driverName, 10.0); // $10 per Km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * super.ratePerKm; // Calculate fare
    }
}
