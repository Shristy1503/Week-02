package encapsulationandpolymorphism.ridehandlingapplication;

public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle car = new Car("C123", "John Doe");
        Vehicle bike = new Bike("B456", "Jane Smith");
        Vehicle auto = new Auto("A789", "Mike Johnson");

        double distance = 15.0; // Distance in Km

        // Calculate and print fares
        System.out.println("Car Fare: " + calculateFare(car, distance));
        System.out.println("Bike Fare: " + calculateFare(bike, distance));
        System.out.println("Auto Fare: " + calculateFare(auto, distance));
    }

    // Method to calculate fare for any vehicle
    public static double calculateFare(Vehicle vehicle, double distance) {
        return vehicle.calculateFare(distance); // Polymorphism in action

    }
}
