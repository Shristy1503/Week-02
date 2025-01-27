package encapsulationandpolymorphism.onlinefooddeliverysystem;

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    //constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();
    // Concrete method to get item details
    public String getItemDetails() {
        return "Item: " + itemName + ", Price: $" + price + ", Quantity: " + quantity;
    }
}
