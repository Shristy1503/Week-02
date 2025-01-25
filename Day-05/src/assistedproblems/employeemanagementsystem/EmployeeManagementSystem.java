package assistedproblems.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee em1 = new Employee("Arjun", "AL200", 4000);
        em1.displayDetails();
        Manager m1 = new Manager("Shrisy", "Al103", 30222, 3);
        m1.displayDetails();
        Developer developer = new Developer("Nancy", "AL200", 4033, "java");
        developer.displayDetails();
        Intern intern = new Intern("Muskan", "AL201", 20000);
        intern.displayDetails();

    }
}
