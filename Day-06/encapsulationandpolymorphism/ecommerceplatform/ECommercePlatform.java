package encapsulationandpolymorphism.ecommerceplatform;
import java.util.ArrayList;
import java.util.List;
public class ECommercePlatform {
    public static void main(String[] args) {
        // using list object to show polymorphism
        List<Product> product1 = new ArrayList<>();

        // add all the products in the product 1 list
        product1.add(new Electronics(101, "Washing machine", 30000, 0.10, 0.15));
        product1.add(new Clothing(102, "Skirt", 899, 0.07, 0.05));
        product1.add(new Groceries(103, "Milk", 100, 0.00, 0.05));

        // using for loop to iterate through product
        for(Product p1 : product1){
           double discount = p1.calculateDiscount();
           double tax = ((Taxable) p1).calculateTax();
           double finalPrice = (p1.getPrice() + tax - discount);

            System.out.println("Product: " + p1.getName());
            System.out.println("Price: $" + p1.getPrice());
            System.out.println("Discount: $" + discount);
            System.out.println(((Taxable) p1).getTaxDetails());
            System.out.println("Tax: $" + tax);
            System.out.println("Final Price: $" + finalPrice);
        }
    }
}
