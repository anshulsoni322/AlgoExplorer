// Polymorphism is the ability of an object to take on many forms. In Java,
// polymorphism allows methods to do different things based on the object
// that calls them. There are two types of polymorphism:
// - Compile Time Polymorphism: Method Overloading
// - Run time Polymorphism: Method Overriding

// Demonstrate polymorphism in Java using method overloading and method overriding.

// Main class to demonstrate polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        // Compile Time Polymorphism (Method Overloading)
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 3)); // Calls the add method with two integers
        System.out.println(calculator.add(2.5, 3.5)); // Calls the add method with two doubles
        System.out.println(calculator.add("Hello", " World")); // Calls the add method with two strings

        // Run Time Polymorphism (Method Overriding)
        Shape shape; // Declare a reference variable of type Shape
        shape = new Circle(5); // Instantiate Circle and assign it to the shape reference variable
        System.out.println("Area of Circle: " + shape.area()); // Calls the area method overridden in Circle

        shape = new Rectangle(4, 6); // Instantiate Rectangle and assign it to the shape reference variable
        System.out.println("Area of Rectangle: " + shape.area()); // Calls the area method overridden in Rectangle
    }
}

// Calculator class demonstrating compile-time polymorphism (Method Overloading)
class Calculator {
    // Method Overloading: add method with different parameter types
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

// Shape class demonstrating run-time polymorphism (Method Overriding)
abstract class Shape {
    abstract double area(); // Abstract method to calculate area
}

// Circle class inheriting from Shape class and overriding area method
class Circle extends Shape {
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method Overriding: area method specific to Circle
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class inheriting from Shape class and overriding area method
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method Overriding: area method specific to Rectangle
    @Override
    double area() {
        return length * width;
    }
}