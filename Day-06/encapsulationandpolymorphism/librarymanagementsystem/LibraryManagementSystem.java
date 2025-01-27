package encapsulationandpolymorphism.librarymanagementsystem;
import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // using list object to show polymorphism
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("AL101", "Harry Potter", "J.K. Rowling"));
        items.add(new Magazine("AL102", "Verity", "Colleen Hoover"));
        items.add(new DVD("AL103", "Inception", "Christopher Nolan"));

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            System.out.println("---------------------------");
        }

        // Demonstrate reserving items
        for (Reservable reservableItem : items.stream().filter(item -> item instanceof Reservable).map(item -> (Reservable) item).toList()) {
            reservableItem.reserveItem();
            System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            System.out.println("---------------------------");
        }
    }
}
