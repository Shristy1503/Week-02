package multilevelinheritance.onlineretailordermanagement;

public class DeliveredOrder extends ShippedOrder{
    String deliveryDate;
    //constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
    //override the baseclass method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Delivery date: " + deliveryDate);
    }
}
