import java.util.Scanner;

// Defining the interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Implementing the interface in Rectangle class
class Rectangle implements Shape {
    double length;
    double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing calculateArea method
    public double calculateArea() {
        return length * width;
    }

    // Implementing calculatePerimeter method
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Implementing the interface in Circle class
class Circle implements Shape {
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing calculateArea method
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing calculatePerimeter method
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class ShapeInterfaceExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating a Rectangle object
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Creating a Circle object
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        sc.close();
    }
}
