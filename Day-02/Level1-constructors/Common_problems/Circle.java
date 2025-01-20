class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0);  // Default radius value of 1.0, calling the parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;  // Setting the user-provided radius value
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to display the radius and area
    public void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
    }

    public static void main(String[] args) {
        // Using the default constructor
        Circle circle1 = new Circle();
        circle1.display();

        // Using the parameterized constructor
        Circle circle2 = new Circle(5.0);
        circle2.display();
    }
}
