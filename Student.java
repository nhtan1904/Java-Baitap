
package VoLamNhatTan_7374.Lec11_Encapsulation.Exercise1;

import java.util.ArrayList;

class Student {
    private String id;
    private String name;
    private ArrayList<Double> grades;

  
    public Student() {
        this.grades = new ArrayList<>();
    }

    public void addInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addGrade(double grade) {
        if (grade < 0 || grade > 10) {
            System.out.println("Điểm không hợp lệ! Điểm phải nằm trong khoảng 0-10.");
            return;
        }
        grades.add(grade);
        System.out.printf("Đã thêm điểm: %.1f%n", grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) return 0.0;
        double total = 0.0;
        for (double grade : grades) {
            total += grade;
        }
        return Math.round((total / grades.size()) * 100.0) / 100.0; 
    }

    public void display() {
        System.out.println("\n=== Thông tin sinh viên ===");
        System.out.println("Mã sinh viên: " + this.id);
        System.out.println("Họ tên: " + this.name);
        System.out.println("Danh sách điểm: " + this.grades);
        System.out.printf("Điểm trung bình: %.2f%n", getAverage());
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.addInfo("B20DCAT001", "Trần Thị B");
        student1.addGrade(8.5);
        student1.addGrade(7.0);
        student1.addGrade(9.0);
        student1.addGrade(8.0);

        student1.display();
    }
}

