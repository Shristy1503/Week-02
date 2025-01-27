package encapsulationandpolymorphism.onlinefooddeliverysystem;

public interface Discountable {
    //abstract methods
   abstract void applyDiscount(double discountPercentage);
    abstract String getDiscountDetails();
}
