package encapsulationandpolymorphism.employeemanagementsystem;

public abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    //constructor
    public Employee(int employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    //abstract methods
    abstract double calculateSalary();

    //getter
    public int getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    //setters
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    // concrete method
    public void displayDetails(){
        System.out.println("Employee name: " + name + " | " + " Employee id: " + employeeId);
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Total salary: " + calculateSalary());
    }
}
