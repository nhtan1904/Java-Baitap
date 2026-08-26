
package VoLamNhatTan_7373.Lec06_ArrayArraylist;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int sum = 0;

        // Nhập các phần tử và tính tổng
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            a[i] = sc.nextInt();
            sum += a[i];
        }

        // Tính trung bình cộng
        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}

