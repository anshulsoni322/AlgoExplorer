import java.util.*;

public class Getters_Setters {
    public static void main(String args[]) {
        // Creating an instance of Pen
        Pen p1 = new Pen();

        // Setting color of pen
        p1.setColor("Blue");
        System.out.println("Color of pen: " + p1.getColor());

        // Setting tip of pen
        p1.setTip(5);
        System.out.println("Tip of pen: " + p1.getTip());

        // Changing color of pen
        p1.setColor("Yellow");
        System.out.print("Changed color of pen: " + p1.getColor());
    }
}

class Pen {
    private String color;
    private int tip;

    // Getter method for color
    public String getColor() {
        return this.color;
    }

    // Getter method for tip
    public int getTip() {
        return this.tip;
    }

    // Setter method for color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // Setter method for tip
    public void setTip(int newTip) {
        this.tip = newTip;
    }
}