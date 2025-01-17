import java.util.Scanner;
  class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input item details
        System.out.println("Enter item details:");
        System.out.print("Enter item code: ");
        int itemCode = input.nextInt();
        input.nextLine(); // Clear the input buffer
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();
        System.out.print("Enter price: ");
        double price = input.nextDouble();

        // Create object of item class
        Item item = new Item(itemCode, itemName, price);

        // Display item details
        System.out.println("\nItem Details:");
        item.displayDetails();

        // Input quantity and calculate total cost
        System.out.print("\nEnter quantity: ");
        int quantity = input.nextInt();
        double totalCost = item.calculateTotalCost(quantity);

        // Display total cost
        System.out.println("Total cost for " + quantity + " " + itemName + "(s): $" + totalCost);
    }
  }
  class Item {
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor to initialize the Item object
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    // Method to calculate the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

 
