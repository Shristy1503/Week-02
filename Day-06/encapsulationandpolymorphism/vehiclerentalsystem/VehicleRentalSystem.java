package encapsulationandpolymorphism.vehiclerentalsystem;
import java.util.List;
import java.util.ArrayList;
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // creating a list for storing vehicle
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("AB01", 50.00, "INS12345"));
        vehicles.add(new Bike("BC01", 20.00, "INS4534"));
        vehicles.add(new Truck("CD01", 100.00, "INS543876"));

        int rentalDays = 5; // Example rental period

        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = ((Insurable) vehicle).calculateInsurance();
            String insuranceDetails = ((Insurable) vehicle).getInsuranceDetails();

            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + rentalCost);
            System.out.println("Insurance Cost: $" + insuranceCost);
            System.out.println(insuranceDetails);
        }
    }
}
