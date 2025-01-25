package hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle{
    int charge;
    //constructor
    public ElectricVehicle(int maxSpeed, String model, int charge){
        super(maxSpeed, model);
        this.charge = charge;
    }
    //override method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("charge is: " + charge + " %");
    }

    public void charge(){
        System.out.println("Electric vehicle is charging");
    }

}
