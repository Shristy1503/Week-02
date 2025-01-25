package assistedproblems.vehicletransportsystem;

public class Vehicle {
    protected int maxSpeed;
    protected String feulType;
    //constructor
    public Vehicle(int maxSpeed, String feulType){
        this.maxSpeed = maxSpeed;
        this.feulType = feulType;
    }

    // method to display information
    public void displayInfo(){
        System.out.println("Maximum speed is: " + maxSpeed + " km/hr " + " | " + "fuel type is: " + feulType);
    }

}
