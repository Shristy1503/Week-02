package hybridinheritance.restaurantmanagementsystem;

public class Person {
    String name;
    String id;

    //constructor
    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }
    // method to display
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

}
