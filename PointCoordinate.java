
package VoLamNhatTan_7374.Lec08_ObjectAndClass.Ex2;

import java.util.*;
public class PointCoordinate {
    private double x;
    private double y;

    public PointCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public static void main(String[] args) {
        PointCoordinate point = new PointCoordinate(3, 4);
        
        double distance = point.distanceFromOrigin();
        System.out.printf("Khoảng cách từ điểm (%.2f, %.2f) đến gốc tọa độ là: %.2f%n", point.x, point.y, distance);
    }
}

