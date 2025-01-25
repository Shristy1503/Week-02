package hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable{
    String tankStatus;
    //constructor
    public PetrolVehicle(int maxSpeed, String model, String tankStatus){
        super(maxSpeed, model);
        this.tankStatus = tankStatus;
    }


    // override display method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("tank status: " + tankStatus);
    }
    //implementation for abstract method
    @Override
    public void refuel(){
        System.out.println("Refilling the tank");
    }

}
