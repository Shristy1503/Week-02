import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        // create objects of class EmployeeDetail
        EmployeeDetail employee1 = new EmployeeDetail("Shashank", 102, 20000.0);
        EmployeeDetail employee2 = new EmployeeDetail("Aarav", 103, 25000.0);

        // Display details of Employee 1
        System.out.println("Employee 1:");
        employee1.displayResult();

        // Display details of Employee 2
        System.out.println("\nEmployee 2:");
        employee2.displayResult();
    }
}

class EmployeeDetail {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public EmployeeDetail(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display the details
    public void displayResult() {
        System.out.println("Name of employee: " + name);
        System.out.println("ID of employee: " + id);
        System.out.println("Salary of employee: " + salary);
    }
}
