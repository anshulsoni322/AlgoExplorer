
// Encapsulation is defined as the wrapping up of data
// and methods under a single unit.
// It also implement data hiding.

public class Encapsulation {
    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student = new Student();

        // Set the student's name and age using public methods
        student.setName("Alice");
        student.setAge(20);

        // Access and display the student's name and age using public methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

class Student {
    // Private variables to store student's name and age
    private String name;
    private int age;

    // Public methods to set and get the name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Public methods to set and get the age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return this.age;
    }
}
