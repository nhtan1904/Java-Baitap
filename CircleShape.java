
package VoLamNhatTan_7374.Lec08_ObjectAndClass.Ex2;
import java.util.*;

public class CircleShape {
    private double radius;
    public CircleShape(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public static void main(String[] args) {
      
        CircleShape circle = new CircleShape(4.0);
        
        System.out.printf("Radius: %.1f%n", circle.radius);
        System.out.printf("Area: %.13f%n", circle.calculateArea());
        System.out.printf("Circumference: %.13f%n", circle.calculateCircumference());
    }
}

