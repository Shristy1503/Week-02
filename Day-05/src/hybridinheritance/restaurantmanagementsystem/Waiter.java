package hybridinheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker{
    String workType;
    //constructor
    public Waiter(String name, String id, String workType){
        super(name, id);
        this.workType = workType;
    }
    // Implementing performDuties method
    @Override
    public void performDuties() {
        System.out.println(name + " is " + workType + " to the customers");
    }
    // Overriding displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter");
    }

}
