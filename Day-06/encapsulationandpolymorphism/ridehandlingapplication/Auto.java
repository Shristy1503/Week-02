package encapsulationandpolymorphism.ridehandlingapplication;

public class Auto extends Vehicle{
    public Auto(String vehicleId, String driverName) {
        super(vehicleId, driverName, 7.0); // $7 per Km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * super.ratePerKm; // Calculate fare
    }
}
