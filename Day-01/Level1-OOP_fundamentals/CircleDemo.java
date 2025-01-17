import java.util.Scanner;
  public class CircleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Create a Circle object
        Circle circle = new Circle(radius);

        // Display the area and circumference
        circle.display();
    }
}

class Circle {
    // Attribute to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius; // πr²
    }

    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius; // 2πr
    }

    // Method to display the area and circumference
    public void display() {
        System.out.println("Radius of the Circle: " + radius);
        System.out.println("Area of the Circle: " + calculateArea());
        System.out.println("Circumference of the Circle: " + calculateCircumference());
    }
}

