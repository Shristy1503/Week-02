package multilevelinheritance.onlineretailordermanagement;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order order = new Order("203", "12/03/2024");
        System.out.println(order.getOrderStatus());
        order.displayInfo();
        System.out.println();

        ShippedOrder shiped = new ShippedOrder("2011", "15/03/2024", "Al3644");
        System.out.println(shiped.getOrderStatus());
        shiped.displayInfo();

        System.out.println();

        DeliveredOrder deliveredorder1 = new DeliveredOrder("AL202", "12/03/2024", "26732", "21/03/2024");
        System.out.println(deliveredorder1.getOrderStatus());
        deliveredorder1.displayInfo();

    }
}
