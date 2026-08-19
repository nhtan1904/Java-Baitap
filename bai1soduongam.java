
package VoLamNhatTan_7374.Lec04_Condition;

import java.util.Scanner;

public class bai1soduongam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println(n + " la so duong");
        } else if (n < 0) {
            System.out.println(n + " la so am");
        } else {
            System.out.println(n + " bang 0");
        }
    }
}