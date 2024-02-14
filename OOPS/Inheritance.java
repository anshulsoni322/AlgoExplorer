
// Inheritance is when properties & methods of base class are 
// passed on to derived class.

// Demonstrates inheritance in Java using Animal and Fish classes.
public class Inheritance {
    public static void main(String[] args) {
        Fish dolphin = new Fish(); // Create a Fish object
        dolphin.eat(); // Invoke eat() from Fish
    }
}

// Represents an animal with color, eat(), and breathe() methods.
class Animal {
    String color; // Animal's color

    // Animal's eating behavior
    void eat() {
        System.out.print("Animal eats");
    }

    // Animal's breathing behavior
    void breathe() {
        System.out.print("Animal breathes");
    }
}

// Represents a fish, extends Animal, with fins and swim() method.
class Fish extends Animal {
    int fins; // Number of fins

    // Fish's swimming behavior
    void swim() {
        System.out.print("Fish swims");
    }
}