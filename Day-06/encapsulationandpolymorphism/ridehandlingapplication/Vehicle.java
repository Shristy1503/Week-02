package encapsulationandpolymorphism.ridehandlingapplication;

public abstract class Vehicle implements GPS{
    private String vehicleId; // Unique ID
    private String driverName; // Driver's name
    double ratePerKm; // Rate per kilometer
    private String currentLocation; // Current location

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate per Km: " + ratePerKm;
    }

    // GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation; // Return current location
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation; // Update location
    }
}
