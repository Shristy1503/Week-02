package encapsulationandpolymorphism.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable{
    private String insuranceNumber;
    //constructors
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
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
        return getRentalRate() * 0.1; // Example: 10% of rental rate
    }
    //overriding get insurance details

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insuranceNumber;
    }
}
