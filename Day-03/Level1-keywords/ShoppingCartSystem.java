  public class ShoppingCartSystem{
    public static void main(String[] args) {
        Product product1 = new Product("Charger", 500, 2, "AL106");
        Product product2 = new Product("Smartphone", 5000, 3, "AL102");

        // Display product details using the instanceof check
        System.out.println("\nProduct 1 Details:");
        product1.displayProductDetails(product1);  

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails(product2);  

        // Update the discount
        Product.updateDiscount(15.0);

        System.out.println("\nProduct 1 Details after Discount Update:");
        product1.displayProductDetails(product1);  

        System.out.println("\nProduct 2 Details after Discount Update:");
        product2.displayProductDetails(product2); 
    }
}
  
  class Product {
    private String productName;
    private double price;
    private int quantity;
    private final String productID;  
    private static double discount = 10.0;  

    // Constructor to initialize productName, price, quantity, and productID
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update the discount for all products
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
    }

    // Method to calculate the total price for the product considering the discount
    public double calculateTotalPrice() {
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discount / 100;
        return totalPrice - discountAmount;
    }

    // Method to display product details with instanceof check
    public void displayProductDetails(Object obj) {
        if (obj instanceof Product) {
            System.out.println("Product Name: " + productName);
            System.out.println("Product ID: " + productID);
            System.out.println("Price: INR " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: INR " + calculateTotalPrice());
        } else {
            System.out.println("Invalid object. Not a Product.");
        }
    }
}

