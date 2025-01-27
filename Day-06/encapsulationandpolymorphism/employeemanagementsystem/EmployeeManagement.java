package encapsulationandpolymorphism.employeemanagementsystem;
import java.util.ArrayList;
import java.util.List;
public class EmployeeManagement {
    public static void main(String[] args) {
      List<Employee> employee = new ArrayList<>();

      FullTimeEmployee employee1 = new FullTimeEmployee(123, "Arjun", 5000, 20000);
      PartTimeEmployee employee2 = new PartTimeEmployee(134, "Shristy", 2000, 9, 50);

      // add in list
        employee.add(employee1);
        employee.add(employee2);

        NewEmployee employee3 = new NewEmployee();
        employee3.assignDepartment("IT");

        for(int i=0;i<employee.size();i++){
            Employee em = employee.get(i);
            em.displayDetails();
            System.out.println(employee3.getDepartmentDetails());
            System.out.println();
        }
    }
}
