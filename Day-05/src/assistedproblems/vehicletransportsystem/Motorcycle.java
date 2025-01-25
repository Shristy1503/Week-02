package assistedproblems.vehicletransportsystem;

public class Motorcycle extends Vehicle{
    protected int mileage;
    //constructor
    public Motorcycle(int maxSpeed, String feulType, int mileage){
        super(maxSpeed, feulType);
        this.mileage = mileage;
    }
    //
    //override method of vehicle
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Mileage of motorcycle: " + mileage);
    }

}
