package encapsulationandpolymorphism.vehiclerentalsystem;

public interface Insurable {
    //abstract method to calculate insurance
    abstract double calculateInsurance();
    //abstract method to get details
    abstract String getInsuranceDetails();
}
