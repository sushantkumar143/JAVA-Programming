// Question - 11
// Create a Java program to demonstrate the use of inheritance, method overriding, and interfaces using the following requirements:

// 1. Create an abstract class Shape with:
// - An abstract method double calculateArea()
// - A concrete method void displayShape() that prints ""This is a shape.""

// 2.Create two classes, Circle and Rectangle, that extend the Shape class:
// - Circle should have a constructor that takes the radius as a parameter and override calculateArea() to return the area of the circle.
// - Rectangle should have a constructor that takes length and breadth as parameters and override calculateArea() to return the area of the rectangle.
// 3. Implement an interface Drawable with a method void draw(). Both Circle and Rectangle should implement this interface and override draw() to display a message indicating which shape is being drawn.
// 4. In the main method:
// - Create objects of Circle and Rectangle.
// - Call the calculateArea(), draw(), and displayShape() methods on these objects.

// Example Output:

// This is a shape.
// Drawing a Circle.
// Area of Circle: 78.5

// This is a shape.
// Drawing a Rectangle.
// Area of Rectangle: 50.0




// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    abstract double calculateArea();
    
    // Concrete method to display shape
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Interface Drawable with the draw method
interface Drawable {
    void draw();
}

// Circle class extends Shape and implements Drawable
class Circle extends Shape implements Drawable {
    private double radius;

    // Constructor to initialize the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override calculateArea method to return area of the circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius; // Area of circle: πr²
    }

    // Override draw method to indicate that a circle is being drawn
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Rectangle class extends Shape and implements Drawable
class Rectangle extends Shape implements Drawable {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Override calculateArea method to return area of the rectangle
    @Override
    double calculateArea() {
        return length * breadth; // Area of rectangle: length * breadth
    }

    // Override draw method to indicate that a rectangle is being drawn
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Question11 {
    public static void main(String[] args) {
        // Create Circle and Rectangle objects
        Shape circle = new Circle(5); // Circle with radius 5
        Shape rectangle = new Rectangle(5, 10); // Rectangle with length 5 and breadth 10

        // Call methods on Circle object
        circle.displayShape();
        ((Circle) circle).draw();
        System.out.println("Area of Circle: " + circle.calculateArea());

        // Call methods on Rectangle object
        rectangle.displayShape();
        ((Rectangle) rectangle).draw();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
