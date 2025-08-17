import java.io.FileWriter;
import java.io.IOException;

// Circle class
class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getters
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // To string
    public String toString() {
        return "Circle:\nRadius: " + radius + 
               "\nArea: " + getArea() + 
               "\nPerimeter: " + getPerimeter();
    }
}

// Class to write Circle to file
class CircleToFile extends Circle {

    public CircleToFile(double radius) {
        super(radius);
    }

    // Method to write circle details to a file
    public void writeToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(this.toString());
            System.out.println("✅ Circle details written to file: " + filePath);
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }
}

// Main class
public class CircleFileDemo {
    public static void main(String[] args) {
        // Create circle object with radius 5.5
        CircleToFile circle = new CircleToFile(5.5);

        // File path (Update this path as per your system)
        String filePath = "D:\\circle.txt";

        // Save circle data to file
        circle.writeToFile(filePath);
    }
}
