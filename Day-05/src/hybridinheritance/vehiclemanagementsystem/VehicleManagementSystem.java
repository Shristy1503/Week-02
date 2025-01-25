package hybridinheritance.vehiclemanagementsystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        PetrolVehicle vehicle1 = new PetrolVehicle(120, "Hero honda", "empty");
        System.out.println("Petrol vehivle details: ");
        vehicle1.displayInfo();
        vehicle1.refuel();


        ElectricVehicle vehicle2 = new ElectricVehicle(60, "Rikshaw", 90);
        System.out.println("Electric vehicle details: ");
        vehicle2.displayInfo();
        vehicle2.charge();

    }
}
