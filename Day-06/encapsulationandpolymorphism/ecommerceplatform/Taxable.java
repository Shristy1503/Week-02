package encapsulationandpolymorphism.ecommerceplatform;

public interface Taxable {
    // methpd for calculating tax
    abstract double calculateTax();
    //method to get details
    abstract String getTaxDetails();
}
