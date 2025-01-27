package encapsulationandpolymorphism.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable{
    private double gstBill;
    private double discountPercentage;
     //constructor
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.gstBill = additionalCharge;
        this.discountPercentage = 0; // No discount by default
    }
    //overriding calculate total price method
    @Override
    public double calculateTotalPrice() {
        return (getPrice() + gstBill) * getQuantity() * (1 - discountPercentage / 100);
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
