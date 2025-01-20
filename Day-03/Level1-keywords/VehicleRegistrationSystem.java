  public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        
        Vehicle vehicle1 = new Vehicle("Shristy", "Car", "V1245");
        Vehicle vehicle2 = new Vehicle("Nancy", "Scooty", "V1246");

        // Display initial vehicle registration details
        System.out.println("\nVehicle 1 Registration Details:");
        vehicle1.displayRegistrationDetails(vehicle1);

        System.out.println("\nVehicle 2 Registration Details:");
        vehicle2.displayRegistrationDetails(vehicle2);

        // Update registration fee
        Vehicle.updateRegistrationFee(5000.0);

        // Display vehicle details after fee update
        System.out.println("\nVehicle 1 Registration Details After Fee Update:");
        vehicle1.displayRegistrationDetails(vehicle1);

        System.out.println("\nVehicle 2 Registration Details After Fee Update:");
        vehicle2.displayRegistrationDetails(vehicle2);

    }
}
  
  class Vehicle {
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; 
    private static double registrationFee = 2000.0; 

    // Constructor 
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    // Method to display vehicle registration details
    public void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) { 
            System.out.println("Owner Name: " + this.ownerName);
            System.out.println("Vehicle Type: " + this.vehicleType);
            System.out.println("Registration Number: " + this.registrationNumber);
            System.out.println("Registration Fee: INR " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object");
        }
    }
}

