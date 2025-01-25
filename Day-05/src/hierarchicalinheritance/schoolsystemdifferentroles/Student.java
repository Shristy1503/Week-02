package hierarchicalinheritance.schoolsystemdifferentroles;

public class Student extends Person{
    int grade;

    // Constructor for Student
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overriding displayInfo
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }

    // Method to display role
    public void displayRole() {
        System.out.println(name + " is a student in grade " + grade + ".");
    }

}
