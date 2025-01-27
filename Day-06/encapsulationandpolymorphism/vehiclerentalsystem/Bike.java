package encapsulationandpolymorphism.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable{
    private String insuranceNumber;
    //constructors
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
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
        return getRentalRate() * 0.05; // Example: 5% of rental rate
    }
    //overriding get insurance details

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insuranceNumber;
    }
}
