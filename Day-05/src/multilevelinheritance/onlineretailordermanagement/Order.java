package multilevelinheritance.onlineretailordermanagement;

public class Order {
    String orderId;
    String orderDate;
    //constructor
    public Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
    // method to display order details
    public void displayInfo(){
        System.out.println("Order id: " + orderId + " | " + " Order date: " + orderDate);
    }

}
