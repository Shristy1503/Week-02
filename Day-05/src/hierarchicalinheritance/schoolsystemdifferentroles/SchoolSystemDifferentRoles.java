package hierarchicalinheritance.schoolsystemdifferentroles;

public class SchoolSystemDifferentRoles {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Arjun", 35, "Mathematics");
        Student student = new Student("Shristy", 15, 10);
        Staff staff = new Staff("Nancy", 40, "Management");

        // Displaying information
        System.out.println("Teacher Information:");
        teacher.displayInfo();
        teacher.displayRole();

        System.out.println("\nStudent Information:");
        student.displayInfo();
        student.displayRole();

        System.out.println("\nStaff Information:");
        staff.displayInfo();
        staff.displayRole();

    }
}
