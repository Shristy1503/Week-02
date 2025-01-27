package encapsulationandpolymorphism.employeemanagementsystem;

public class PartTimeEmployee  extends Employee{
    private int workHours;
    private double wagesPerHour;
    //constructor
    public PartTimeEmployee(int employeeId, String name,double baseSalary, int workHours, double wagesPerHour){
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.wagesPerHour = wagesPerHour;
    }

    //override abstract method
    @Override
    public double calculateSalary(){
        return getBaseSalary() + (wagesPerHour * workHours);
    }
}
