package encapsulationandpolymorphism.employeemanagementsystem;

public class NewEmployee implements Department{
    private String department;
    //overide the abstract method
    @Override
    public void assignDepartment(String department){
        this.department = department;
    }
    //override the get department
    @Override
    public String getDepartmentDetails(){
        return "Department: " + department;
    }
}
