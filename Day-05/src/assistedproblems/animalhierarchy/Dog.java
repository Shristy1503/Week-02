package assistedproblems.animalhierarchy;

public class Dog extends Animal{
    // dod class constructor call super class attributes
    public Dog(String name, int age){
        super(name, age);
    }

    // override method of animal class
    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }

}
