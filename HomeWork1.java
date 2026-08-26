
package VoLamNhatTan_7373.Lec06_ArrayArraylist;

import java.util.Scanner;

public class HomeWork1 {

    // Cách 1: Đổi chỗ phần tử đầu và cuối
    public static void reverseMethod1(int[] a) {
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }

    // Cách 2: Dùng mảng phụ
    public static int[] reverseMethod2(int[] a) {
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }

        return b;
    }

    // Cách 3: Dùng vòng lặp for và tạo mảng mới
    public static int[] reverseMethod3(int[] a) {
        int[] b = new int[a.length];
        int j = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            b[j] = a[i];
            j++;
        }

        return b;
    }

    // Xuất mảng
    public static void printArray(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Method 1
        int[] a1 = a.clone();
        reverseMethod1(a1);
        System.out.print("Method 1: ");
        printArray(a1);

        // Method 2
        int[] a2 = reverseMethod2(a);
        System.out.print("Method 2: ");
        printArray(a2);

        // Method 3
        int[] a3 = reverseMethod3(a);
        System.out.print("Method 3: ");
        printArray(a3);

        sc.close();
    }
}
