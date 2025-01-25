package hybridinheritance.vehiclemanagementsystem;

public class Vehicle {
    int maxSpeed;
    String model;
    //constructor
    public Vehicle(int maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // method to display details
    public void displayInfo(){
        System.out.println("Maximum speed is: " + maxSpeed + " km/hr");
        System.out.println("model: " + model);
    }

}
