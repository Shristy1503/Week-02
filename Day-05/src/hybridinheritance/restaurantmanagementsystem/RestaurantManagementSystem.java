package hybridinheritance.restaurantmanagementsystem;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Shristy", "AL233", "Pasta");
        Waiter waiter = new Waiter("Arjun", "AL231", "Serving");

        System.out.println("cheft detail: ");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("Waiter detail: ");
        waiter.displayInfo();
        waiter.performDuties();

    }
}
