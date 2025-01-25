package hierarchicalinheritance.schoolsystemdifferentroles;

public class Staff extends Person{
    String department;

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Overriding displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }

    // Method to display role
    public void displayRole() {
        System.out.println(name + " works in the " + department + " department.");
    }

}
