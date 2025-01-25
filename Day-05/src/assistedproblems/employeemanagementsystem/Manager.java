package assistedproblems.employeemanagementsystem;

public class Manager extends Employee{
    protected int teamSize;

    // constructor
    public Manager(String name, String id, double salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    // override
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team size for manager: " + this.teamSize);
    }

}
