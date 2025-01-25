package hierarchicalinheritance.schoolsystemdifferentroles;

public class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
