/*Ques.1
Create an abstract class Shape that represents different geometric shapes. This class should contain:

A protected attribute shapeName to store the name of the shape.
A constructor that initializes shapeName.
A method getShapeName() that returns the name of the shape.
An abstract method calculateArea() that will be implemented by subclasses.
Next, create two concrete classes, Circle and Rectangle, that extend Shape and implement the calculateArea() method:

The Circle class should have a private attribute radius, a constructor to initialize it, and implement calculateArea() using the formula:
image

The Rectangle class should have private attributes length and width, a constructor to initialize them, and implement calculateArea() using the formula:
image

Finally, write a test program in the main method that:

Creates an object of Circle with a radius of 5.0 and displays the area.
Creates an object of Rectangle with a length of 4.0 and width of 6.0 and displays the area.
Uses polymorphism by referring to objects of Circle and Rectangle using Shape references.
Note: Implement the concepts of abstraction, method overriding, polymorphism, and encapsulation in Java OOP concepts.

 */




// Abstract class representing different geometric shapes
abstract class Shape {
    protected String shapeName;

    // Constructor to initialize shapeName
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Method to get the name of the shape
    public String getShapeName() {
        return shapeName;
    }

    // Abstract method to be implemented by subclasses
    abstract double calculateArea();
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Implementing the calculateArea method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Implementing the calculateArea method
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Test class with main method
public class Q1_ShapeDemo {
    public static void main(String[] args) {
        // Creating Circle object and displaying area
        Shape circle = new Circle(5.0);
        System.out.println("Shape: " + circle.getShapeName());
        System.out.println("Area: " + circle.calculateArea());

        // Creating Rectangle object and displaying area
        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("\nShape: " + rectangle.getShapeName());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}


/*Shape: Circle
Area: 78.53981633974483

Shape: Rectangle       
Area: 24.0 */





