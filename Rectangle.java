
package VoLamNhatTan_7374.Lec08_ObjectAndClass.Ex2;
import java.util.*;

import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double width = sc.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("Length: Width: Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());

        sc.close();
    }
}

