package assistedproblems.animalhierarchy;

public class AnimalHierarchy {

    public static void main(String[] args) {
        Animal dog = new Dog("Dog", 4);
        Animal cat = new Cat("cat", 3);
        Animal bird = new Bird("Bird", 6);

        dog.displayAnimal();
        dog.makeSound();
        cat.displayAnimal();
        cat.makeSound();
        bird.displayAnimal();
        bird.makeSound();
    }
}

