package assistedproblems.employeemanagementsystem;

public class Developer extends Employee{
    protected String programmingLanguage;
    // constructor
    public Developer(String name, String id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    //override method of Employee
    @Override

    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language is: " + programmingLanguage);
    }

}
