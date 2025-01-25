package assistedproblems.employeemanagementsystem;

public class Employee {
    protected String name;
    protected String id;
    protected double salary;

    //constructor
    public Employee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // display employee details
    public void displayDetails() {
        System.out.println("Employee name: " + name + " | " + "Employee id: " + id + " | " + "Employee salary: " + salary);
    }
}
