package encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee{
    private double fixedSalary;

    //constructor
    public FullTimeEmployee(int employeeId, String name,double baseSalary, double fixedSalary){
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    //getter and setter
    public double getFixedSalary(){
        return fixedSalary;
    }

    //implementing abstarct method
    @Override
    public double calculateSalary(){
        return getBaseSalary() + fixedSalary;
    }
}
