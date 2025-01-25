package hierarchicalinheritance.schoolsystemdifferentroles;

public class Teacher extends Person{
    String subject;

    // Constructor for Teacher
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }

    // Method to display role
    public void displayRole() {
        System.out.println(name + " teaches " + subject + ".");
    }
}
