package assistedproblems.vehicletransportsystem;

public class VehicleTransportSystem {
    public static void main(String[] args) {
        // cretae array of vehicle type
        Vehicle[] vehicle = new Vehicle[3];
        vehicle[0] = new Car(80, "petrol", 5);
        vehicle[1]  = new Truck(60, "diesel", "large");
        vehicle[2] = new Motorcycle(40, "petrol", 100);

        // for loop to display for each object
        for(int i=0;i<vehicle.length;i++){
            vehicle[i].displayInfo();
        }

    }
}
