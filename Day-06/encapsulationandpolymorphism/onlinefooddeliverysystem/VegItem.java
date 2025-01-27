package encapsulationandpolymorphism.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable{
    private double discountPercentage;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountPercentage = 0; // No discount by default
    }
    //overriding calculate total price method
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (1 - discountPercentage / 100);
    }
    // overriding apply discount
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    //overriding get discount method
    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "%"; // This method is implemented
    }
}



