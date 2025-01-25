package assistedproblems.animalhierarchy;

public class Animal {
    public String name;
    public int age;

    //constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    // superclass method
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
    public void displayAnimal(){
        System.out.println("Name: " + name + " age: " + age);
    }

}
