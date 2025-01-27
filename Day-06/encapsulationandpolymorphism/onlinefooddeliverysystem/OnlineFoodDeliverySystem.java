package encapsulationandpolymorphism.onlinefooddeliverysystem;
import java.util.ArrayList;
import java.util.List;
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();

        // Add food items to the order
        VegItem item1 = new VegItem("Paneer tikka", 10.00, 2);
        NonVegItem item2 = new NonVegItem("Chicken tikka", 8.00, 1, 1.50);

        // Apply discount
        item1.applyDiscount(10);
        item2.applyDiscount(5);

        order.add(item1);
        order.add(item2);

        // Processing the order
        double totalOrderPrice = 0;
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println(((Discountable) item).getDiscountDetails()); // Cast to Discountable
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price: $" + totalPrice);
            totalOrderPrice += totalPrice;
        }

        System.out.println("Total Order Price: $" + totalOrderPrice);
    }
}
