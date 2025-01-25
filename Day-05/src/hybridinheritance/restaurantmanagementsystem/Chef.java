package hybridinheritance.restaurantmanagementsystem;

public class Chef extends Person implements Worker{
    String specialDish;
    // constructor
    public Chef(String name, String id, String specialDish){
        super(name, id);
        this.specialDish = specialDish;
    }

    // Implementing performDuties method
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing food");
    }
    // Overriding displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialDish);
    }

}
