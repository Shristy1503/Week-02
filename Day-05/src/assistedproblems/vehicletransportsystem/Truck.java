package assistedproblems.vehicletransportsystem;

public class Truck extends Vehicle{
    protected String truckSize;
    //constructor
    public Truck(int maxSpeed, String feulType, String truckSize){
        super(maxSpeed, feulType);
        this.truckSize = truckSize;
    }
    //override method of vehicle
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Truck size: " + truckSize);
    }

}
