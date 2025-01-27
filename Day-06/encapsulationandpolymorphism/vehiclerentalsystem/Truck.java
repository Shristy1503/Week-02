package encapsulationandpolymorphism.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable{
    private String insuranceNumber;
    //constructors
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insuranceNumber = insurancePolicyNumber;
    }
    //overriding rental cost method

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    //overriding calculate insurance method
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // Example: 15% of rental rate
    }
    //overriding get insurance details

    @Override
    public String getInsuranceDetails() {
        return "Insurance Number: " + insuranceNumber;
    }
}
