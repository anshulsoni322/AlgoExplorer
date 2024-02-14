
// Abstraction ->
// Hiding all the unnecessary details and showing only
// the important parts to the user
//  - Abstract Classes
//  - Interfaces

// Abstraction using abstract class and interface

abstract class Vehicle { // Abstract class defining common behaviors for vehicles
    abstract void start(); // Abstract method to start the vehicle
    abstract void stop(); // Abstract method to stop the vehicle
}

interface VehicleInterface { // Interface defining common behaviors for vehicles
    void start(); // Start method for vehicle
    void stop(); // Stop method for vehicle
}

class Bicycle extends Vehicle { // Concrete class Bicycle extending abstract class Vehicle
    void start() { System.out.println("Bicycle started."); } // Implementation of start method for Bicycle
    void stop() { System.out.println("Bicycle stopped."); } // Implementation of stop method for Bicycle
}

class Car implements VehicleInterface { // Concrete class Car implementing VehicleInterface
    public void start() { System.out.println("Car started."); } // Implementation of start method for Car
    public void stop() { System.out.println("Car stopped."); } // Implementation of stop method for Car
}

public class Abstraction { // Main class to demonstrate abstraction
    public static void main(String[] args) {
        Vehicle vehicle1 = new Bicycle(); // Using abstract class
        vehicle1.start(); // Call start method for Bicycle
        vehicle1.stop(); // Call stop method for Bicycle

        VehicleInterface vehicle2 = new Car(); // Using interface
        vehicle2.start(); // Call start method for Car
        vehicle2.stop(); // Call stop method for Car
    }
}
