
package VoLamNhatTan_7373.Lec06_ArrayArraylist;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // Nhập các phần tử
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            a[i] = sc.nextInt();
        }

        // Hiển thị mảng
        System.out.print("Array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);

            // Thêm dấu phẩy giữa các phần tử
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        sc.close();
    }
}
