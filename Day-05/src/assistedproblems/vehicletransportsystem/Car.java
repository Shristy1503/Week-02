package assistedproblems.vehicletransportsystem;

public class Car extends Vehicle{
    protected int seatCapacity;
    //constructor
    public Car(int maxSpeed, String feulType, int seatCapacity){
        super(maxSpeed, feulType);
        this.seatCapacity = seatCapacity;
    }
    //override method of vehicle
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat capacity of car: " + seatCapacity);
    }

}
