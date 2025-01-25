package multilevelinheritance.onlineretailordermanagement;

public class ShippedOrder extends Order{
    String trackingNumber;
    // constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public String getOrderStatus() {
        return "Order tracking number " + trackingNumber;
    }
    //override method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Trcking number is: " + trackingNumber);
    }
}
