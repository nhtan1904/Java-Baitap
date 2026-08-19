
package VoLamNhatTan_7374.Lec04_Condition;

import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap diem tong ket: ");
        double diem = sc.nextDouble();

        if (diem >= 5.0) {
            System.out.println("Dat");
        } else {
            System.out.println("Khong dat");
        }
    }
}
