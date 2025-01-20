 public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("Shristy", "AL106", "Manager");
        Employee emp2 = new Employee("Muskan", "AL102", "Intern");
        Employee emp3 = new Employee("Nancy", "AL103", "Designer");

        // Display the total number of employees
        Employee.displayTotalEmployees();

        // Display employee details
        System.out.println("\nEmployee 1 Details:");
        emp1.displayEmployeeDetails(emp1);

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployeeDetails(emp2);
		
		System.out.println("\nEmployee 3 Details:");
        emp3.displayEmployeeDetails(emp3);
    }
}

 
 class Employee {
    private String name;
    private String designation;
    private final String id;  
    private static String companyName = "Tech Solutions"; 
    private static int totalEmployees = 0; 

    // Constructor 
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;  
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total employees in the company: " + totalEmployees);
    }

    // check instance method using instanceof
    public void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Designation: " + designation);
        } else {
            System.out.println("Invalid object. Not an Employee.");
        }
    }
}

